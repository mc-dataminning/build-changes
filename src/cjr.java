import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjr extends ciq {
   private static final String a = "type";
   private static final akj<Integer> b = akn.a(cjr.class, akl.b);

   public cjr(bwm<? extends cjr> $$0, div $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public cyy R_() {
      return new cyy(czc.rt);
   }

   @Override
   protected awm u() {
      return awn.wq;
   }

   @Override
   protected awm l_() {
      return awn.wr;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.wt;
   }

   @Override
   protected awm t() {
      return awn.ws;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, cjr.a.b.a());
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("type", this.gw().c());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjr.a.a($$0.l("type")));
   }

   @Override
   public void a_(cyy $$0) {
      ciu.a(this, $$0);
      $$0.a(kj.az, this);
   }

   private void a(cjr.a $$0) {
      this.al.a(b, $$0.h);
   }

   public cjr.a gw() {
      return cjr.a.f.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.az ? c((ki<T>)$$0, this.gw()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.az);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.az) {
         this.a(c(kj.az, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      bsm.a<cjr.a> $$4 = bsm.b();
      $$4.a(cjr.a.a, 30);
      $$4.a(cjr.a.b, 50);
      $$4.a(cjr.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gx() {
      return this.gw().i;
   }

   @Override
   protected bwg e(bxo $$0) {
      return super.e($$0).a(this.gx());
   }

   public static enum a implements bak {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final bak.a<cjr.a> d = bak.a(cjr.a::values);
      static final IntFunction<cjr.a> f = ayc.a(cjr.a::a, values(), ayc.a.c);
      public static final yw<ByteBuf, cjr.a> e = yu.a(f, cjr.a::a);
      private final String g;
      final int h;
      final float i;

      private a(final String $$0, final int $$1, final float $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      @Override
      public String c() {
         return this.g;
      }

      int a() {
         return this.h;
      }

      static cjr.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
