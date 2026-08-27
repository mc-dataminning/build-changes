import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfh extends der implements eko {
   public static final String c = "sherds";
   public static final String d = "item";
   public static final int e = 1;
   public long f;
   @Nullable
   public dfh.b g;
   private dfh.a h;
   private clb i = clb.b;

   public dfh(ht $$0, dgw $$1) {
      super(det.O, $$0, $$1);
      this.h = dfh.a.a;
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.h.a($$0);
      if (!this.i.b()) {
         $$0.a("item", this.i.b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.h = dfh.a.b($$0);
      if ($$0.b("item", 10)) {
         this.i = clb.a($$0.p("item"));
      } else {
         this.i = clb.b;
      }
   }

   public yk f() {
      return yk.a(this);
   }

   @Override
   public rz av_() {
      return this.o();
   }

   public hx g() {
      return this.q().c(dhm.R);
   }

   public dfh.a i() {
      return this.h;
   }

   public void a(clb $$0) {
      this.h = dfh.a.b(ciu.a($$0));
   }

   public clb j() {
      return a(this.h);
   }

   public static clb a(dfh.a $$0) {
      clb $$1 = cle.eg.al_();
      rz $$2 = $$0.a(new rz());
      ciu.a($$1, det.O, $$2);
      return $$1;
   }

   @Override
   public clb v() {
      return this.i;
   }

   @Override
   public clb c(int $$0) {
      clb $$1 = this.i.a($$0);
      if (this.i.b()) {
         this.i = clb.b;
      }

      return $$1;
   }

   @Override
   public void b(clb $$0) {
      this.i = $$0;
   }

   @Override
   public der w() {
      return this;
   }

   public void a(dfh.b $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.p(), this.q().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dfh.b.values().length) {
         this.f = this.o.V();
         this.g = dfh.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(ckw b, ckw c, ckw d, ckw e) {
      public static final dfh.a a = new dfh.a(cle.pX, cle.pX, cle.pX, cle.pX);

      public rz a(rz $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            sf $$1 = new sf();
            this.a().forEach($$1x -> $$1.add(su.a(jy.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<ckw> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dfh.a b(@Nullable rz $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            sf $$1 = $$0.c("sherds", 8);
            return new dfh.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static ckw a(sf $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cle.pX;
         } else {
            sw $$2 = $$0.k($$1);
            return jy.i.a(agg.a($$2.s_()));
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
