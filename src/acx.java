import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class acx {
   private static final int a = 2097152;
   private final tq b;
   private final byte[] c;
   private final List<acx.a> d;

   public acx(dzb $$0) {
      this.b = new tq();

      for (Entry<ecr.a, ecr> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new tx($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vl(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<ji, dty> $$2 : $$0.I().entrySet()) {
         this.d.add(acx.a.a($$2.getValue()));
      }
   }

   public acx(wa $$0, int $$1, int $$2) {
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
            this.d = acx.a.b.decode($$0);
         }
      }
   }

   public void a(wa $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      acx.a.b.encode($$0, this.d);
   }

   private static int a(dzb $$0) {
      int $$1 = 0;

      for (dzc $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vl $$0, dzb $$1) {
      for (dzc $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<acx.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(acx.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      ji.a $$5 = new ji.a();

      for (acx.a $$6 : this.d) {
         int $$7 = $$3 + kk.b($$6.c >> 4);
         int $$8 = $$4 + kk.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vl a() {
      return new vl(Unpooled.wrappedBuffer(this.c));
   }

   public tq b() {
      return this.b;
   }

   static class a {
      public static final yn<wa, acx.a> a = yn.a(acx.a::a, acx.a::new);
      public static final yn<wa, List<acx.a>> b = a.a(yl.a());
      final int c;
      final int d;
      final dua<?> e;
      @Nullable
      final tq f;

      private a(int $$0, int $$1, dua<?> $$2, @Nullable tq $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wa $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yl.a(mc.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wa $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yl.a(mc.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static acx.a a(dty $$0) {
         tq $$1 = $$0.a($$0.i().K_());
         ji $$2 = $$0.aA_();
         int $$3 = kk.b($$2.u()) << 4 | kk.b($$2.w());
         return new acx.a($$3, $$2.v(), $$0.p(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(ji var1, dua<?> var2, @Nullable tq var3);
   }
}
