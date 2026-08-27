import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhe extends dgo implements bkc, emx {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dhe.b i;
   private dhe.a l;
   private cmr m = cmr.f;
   @Nullable
   protected ahd j;
   protected long k;

   public dhe(hx $$0, dja $$1) {
      super(dgq.O, $$0, $$1);
      this.l = dhe.a.a;
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      this.l.a($$0);
      if (!this.d_($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new sl()));
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.l = dhe.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = cmr.a($$0.p("item"));
         } else {
            this.m = cmr.f;
         }
      }
   }

   public ze k() {
      return ze.a(this);
   }

   @Override
   public sl ax_() {
      return this.q();
   }

   public ic l() {
      return this.r().c(djq.R);
   }

   public dhe.a m() {
      return this.l;
   }

   public void a(cmr $$0) {
      this.l = dhe.a.b(ckk.a($$0));
   }

   public cmr w() {
      return a(this.l);
   }

   public static cmr a(dhe.a $$0) {
      cmr $$1 = cmu.eB.am_();
      sl $$2 = $$0.a(new sl());
      ckk.a($$1, dgq.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public ahd az_() {
      return this.j;
   }

   @Override
   public void a(@Nullable ahd $$0) {
      this.j = $$0;
   }

   @Override
   public long aA_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public cmr x() {
      this.e_(null);
      return this.m;
   }

   @Override
   public cmr c(int $$0) {
      this.e_(null);
      cmr $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = cmr.f;
      }

      return $$1;
   }

   @Override
   public void b(cmr $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dgo y() {
      return this;
   }

   public void a(dhe.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aB_(), this.r().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dhe.b.values().length) {
         this.h = this.o.X();
         this.i = dhe.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cmm b, cmm c, cmm d, cmm e) {
      public static final dhe.a a = new dhe.a(cmu.qI, cmu.qI, cmu.qI, cmu.qI);

      public sl a(sl $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            sr $$1 = new sr();
            this.a().forEach($$1x -> $$1.add(tg.a(kd.h.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cmm> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dhe.a b(@Nullable sl $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            sr $$1 = $$0.c("sherds", 8);
            return new dhe.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cmm a(sr $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cmu.qI;
         } else {
            ti $$2 = $$0.k($$1);
            return kd.h.a(ahd.a($$2.t_()));
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
