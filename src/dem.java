import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dem extends ddx implements ejl {
   public static final String c = "sherds";
   public static final String d = "item";
   public static final int e = 1;
   public long f;
   @Nullable
   public dem.b g;
   private dem.a h;
   private ckj i = ckj.b;

   public dem(ht $$0, dgb $$1) {
      super(ddz.O, $$0, $$1);
      this.h = dem.a.a;
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      this.h.a($$0);
      if (!this.i.b()) {
         $$0.a("item", this.i.b(new rt()));
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.h = dem.a.b($$0);
      if ($$0.b("item", 10)) {
         this.i = ckj.a($$0.p("item"));
      } else {
         this.i = ckj.b;
      }
   }

   public yb f() {
      return yb.a(this);
   }

   @Override
   public rt av_() {
      return this.o();
   }

   public hx g() {
      return this.q().c(dgr.R);
   }

   public dem.a i() {
      return this.h;
   }

   public void a(ckj $$0) {
      this.h = dem.a.b(cic.a($$0));
   }

   public ckj j() {
      return a(this.h);
   }

   public static ckj a(dem.a $$0) {
      ckj $$1 = ckm.eg.al_();
      rt $$2 = $$0.a(new rt());
      cic.a($$1, ddz.O, $$2);
      return $$1;
   }

   @Override
   public ckj v() {
      return this.i;
   }

   @Override
   public ckj c(int $$0) {
      ckj $$1 = this.i.a($$0);
      if (this.i.b()) {
         this.i = ckj.b;
      }

      return $$1;
   }

   @Override
   public void b(ckj $$0) {
      this.i = $$0;
   }

   @Override
   public ddx w() {
      return this;
   }

   public void a(dem.b $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.p(), this.q().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dem.b.values().length) {
         this.f = this.o.V();
         this.g = dem.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cke b, cke c, cke d, cke e) {
      public static final dem.a a = new dem.a(ckm.pX, ckm.pX, ckm.pX, ckm.pX);

      public rt a(rt $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            rz $$1 = new rz();
            this.a().forEach($$1x -> $$1.add(sl.a(jy.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cke> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dem.a b(@Nullable rt $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            rz $$1 = $$0.c("sherds", 8);
            return new dem.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cke a(rz $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return ckm.pX;
         } else {
            sn $$2 = $$0.k($$1);
            return jy.i.a(afw.a($$2.s_()));
         }
      }
   }

   public static enum b {
      a(7),
      b(10);

      public final int c;

      private b(int $$0) {
         this.c = $$0;
      }
   }
}
