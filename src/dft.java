import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dft extends dfd implements ela {
   public static final String c = "sherds";
   public static final String d = "item";
   public static final int e = 1;
   public long f;
   @Nullable
   public dft.b g;
   private dft.a h;
   private clj i = clj.b;

   public dft(ht $$0, dhi $$1) {
      super(dff.O, $$0, $$1);
      this.h = dft.a.a;
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
      this.h = dft.a.b($$0);
      if ($$0.b("item", 10)) {
         this.i = clj.a($$0.p("item"));
      } else {
         this.i = clj.b;
      }
   }

   public yk f() {
      return yk.a(this);
   }

   @Override
   public rz aw_() {
      return this.o();
   }

   public hx g() {
      return this.q().c(dhy.R);
   }

   public dft.a i() {
      return this.h;
   }

   public void a(clj $$0) {
      this.h = dft.a.b(cjc.a($$0));
   }

   public clj j() {
      return a(this.h);
   }

   public static clj a(dft.a $$0) {
      clj $$1 = clm.eB.al_();
      rz $$2 = $$0.a(new rz());
      cjc.a($$1, dff.O, $$2);
      return $$1;
   }

   @Override
   public clj v() {
      return this.i;
   }

   @Override
   public clj c(int $$0) {
      clj $$1 = this.i.a($$0);
      if (this.i.b()) {
         this.i = clj.b;
      }

      return $$1;
   }

   @Override
   public void b(clj $$0) {
      this.i = $$0;
   }

   @Override
   public dfd w() {
      return this;
   }

   public void a(dft.b $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.p(), this.q().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dft.b.values().length) {
         this.f = this.o.W();
         this.g = dft.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cle b, cle c, cle d, cle e) {
      public static final dft.a a = new dft.a(clm.qI, clm.qI, clm.qI, clm.qI);

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

      public Stream<cle> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dft.a b(@Nullable rz $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            sf $$1 = $$0.c("sherds", 8);
            return new dft.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cle a(sf $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return clm.qI;
         } else {
            sw $$2 = $$0.k($$1);
            return jy.i.a(agi.a($$2.s_()));
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
