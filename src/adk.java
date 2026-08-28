import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adk {
   private static final int a = 2097152;
   private final uf b;
   private final byte[] c;
   private final List<adk.a> d;

   public adk(dwu $$0) {
      this.b = new uf();

      for (Entry<eak.a, eak> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new um($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new wa(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<je, drs> $$2 : $$0.F().entrySet()) {
         this.d.add(adk.a.a($$2.getValue()));
      }
   }

   public adk(wo $$0, int $$1, int $$2) {
      this.b = $$0.o();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.l();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = adk.a.b.decode($$0);
         }
      }
   }

   public void a(wo $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adk.a.b.encode($$0, this.d);
   }

   private static int a(dwu $$0) {
      int $$1 = 0;

      for (dwv $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(wa $$0, dwu $$1) {
      for (dwv $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adk.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adk.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      je.a $$5 = new je.a();

      for (adk.a $$6 : this.d) {
         int $$7 = $$3 + kg.b($$6.c >> 4);
         int $$8 = $$4 + kg.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public wa a() {
      return new wa(Unpooled.wrappedBuffer(this.c));
   }

   public uf b() {
      return this.b;
   }

   static class a {
      public static final zb<wo, adk.a> a = zb.a(adk.a::a, adk.a::new);
      public static final zb<wo, List<adk.a>> b = a.a(yz.a());
      final int c;
      final int d;
      final dru<?> e;
      @Nullable
      final uf f;

      private a(int $$0, int $$1, dru<?> $$2, @Nullable uf $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wo $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yz.a(lv.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wo $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yz.a(lv.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adk.a a(drs $$0) {
         uf $$1 = $$0.a($$0.i().F_());
         je $$2 = $$0.aB_();
         int $$3 = kg.b($$2.u()) << 4 | kg.b($$2.w());
         return new adk.a($$3, $$2.v(), $$0.q(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(je var1, dru<?> var2, @Nullable uf var3);
   }
}
