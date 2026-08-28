import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cka extends cix {
   private static final String a = "type";
   private static final akj<Integer> b = akn.a(cka.class, akl.b);

   public cka(bwr<? extends cka> $$0, djm $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public czn S_() {
      return new czn(czr.rw);
   }

   @Override
   protected awm u() {
      return awn.wt;
   }

   @Override
   protected awm l_() {
      return awn.wu;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.ww;
   }

   @Override
   protected awm t() {
      return awn.wv;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, cka.a.b.a());
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
      $$0.a("type", cka.a.d, this.gz());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<cka.a>a("type", cka.a.d).orElse(cka.a.b));
   }

   @Override
   public void a_(czn $$0) {
      cjb.a(this, $$0);
      $$0.a(kk.aA, this);
   }

   private void a(cka.a $$0) {
      this.al.a(b, $$0.h);
   }

   public cka.a gz() {
      return cka.a.f.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aA ? c((kj<T>)$$0, this.gz()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aA);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aA) {
         this.a(c(kk.aA, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      bsq.a<cka.a> $$4 = bsq.b();
      $$4.a(cka.a.a, 30);
      $$4.a(cka.a.b, 50);
      $$4.a(cka.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gA() {
      return this.gz().i;
   }

   @Override
   protected bwl e(bxv $$0) {
      return super.e($$0).a(this.gA());
   }

   public static enum a implements bak {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final bak.a<cka.a> d = bak.a(cka.a::values);
      static final IntFunction<cka.a> f = ayc.a(cka.a::a, values(), ayc.a.c);
      public static final yw<ByteBuf, cka.a> e = yu.a(f, cka.a::a);
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
   }
}
