import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class abt {
   private static final int a = 2097152;
   private final sy b;
   private final byte[] c;
   private final List<abt.a> d;

   public abt(dol $$0) {
      this.b = new sy();

      for (Entry<drq.a, drq> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new tf($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new us(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<ib, djl> $$2 : $$0.G().entrySet()) {
         this.d.add(abt.a.a($$2.getValue()));
      }
   }

   public abt(vd $$0, int $$1, int $$2) {
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
            this.d = abt.a.b.decode($$0);
         }
      }
   }

   public void a(vd $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      abt.a.b.encode($$0, this.d);
   }

   private static int a(dol $$0) {
      int $$1 = 0;

      for (dom $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(us $$0, dol $$1) {
      for (dom $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<abt.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(abt.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      ib.a $$5 = new ib.a();

      for (abt.a $$6 : this.d) {
         int $$7 = $$3 + jd.b($$6.c >> 4);
         int $$8 = $$4 + jd.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public us a() {
      return new us(Unpooled.wrappedBuffer(this.c));
   }

   public sy b() {
      return this.b;
   }

   static class a {
      public static final xq<vd, abt.a> a = xq.a(abt.a::a, abt.a::new);
      public static final xq<vd, List<abt.a>> b = a.a(xo.a());
      final int c;
      final int d;
      final djn<?> e;
      @Nullable
      final sy f;

      private a(int $$0, int $$1, djn<?> $$2, @Nullable sy $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(vd $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = xo.a(ki.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(vd $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         xo.a(ki.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static abt.a a(djl $$0) {
         sy $$1 = $$0.a($$0.i().I_());
         ib $$2 = $$0.aD_();
         int $$3 = jd.b($$2.u()) << 4 | jd.b($$2.w());
         return new abt.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(ib var1, djn<?> var2, @Nullable sy var3);
   }
}
