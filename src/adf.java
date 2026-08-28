import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adf {
   private static final int a = 2097152;
   private final ub b;
   private final byte[] c;
   private final List<adf.a> d;

   public adf(dvi $$0) {
      this.b = new ub();

      for (Entry<dyy.a, dyy> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new ui($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vw(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<jd, dqh> $$2 : $$0.G().entrySet()) {
         this.d.add(adf.a.a($$2.getValue()));
      }
   }

   public adf(wk $$0, int $$1, int $$2) {
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
            this.d = adf.a.b.decode($$0);
         }
      }
   }

   public void a(wk $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adf.a.b.encode($$0, this.d);
   }

   private static int a(dvi $$0) {
      int $$1 = 0;

      for (dvj $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vw $$0, dvi $$1) {
      for (dvj $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adf.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adf.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      jd.a $$5 = new jd.a();

      for (adf.a $$6 : this.d) {
         int $$7 = $$3 + kf.b($$6.c >> 4);
         int $$8 = $$4 + kf.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vw a() {
      return new vw(Unpooled.wrappedBuffer(this.c));
   }

   public ub b() {
      return this.b;
   }

   static class a {
      public static final yx<wk, adf.a> a = yx.a(adf.a::a, adf.a::new);
      public static final yx<wk, List<adf.a>> b = a.a(yv.a());
      final int c;
      final int d;
      final dqj<?> e;
      @Nullable
      final ub f;

      private a(int $$0, int $$1, dqj<?> $$2, @Nullable ub $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wk $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yv.a(lu.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wk $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         yv.a(lu.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adf.a a(dqh $$0) {
         ub $$1 = $$0.a($$0.i().H_());
         jd $$2 = $$0.aD_();
         int $$3 = kf.b($$2.u()) << 4 | kf.b($$2.w());
         return new adf.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(jd var1, dqj<?> var2, @Nullable ub var3);
   }
}
