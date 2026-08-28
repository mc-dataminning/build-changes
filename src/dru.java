import java.util.List;
import javax.annotation.Nullable;

public class dru extends dre implements brq, ezp.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dru.a h;
   private dsk k;
   private cvl l = cvl.k;
   @Nullable
   protected ala<esy> i;
   protected long j;

   public dru(je $$0, dua $$1) {
      super(drg.O, $$0, $$1);
      this.k = dsk.a;
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.k = dsk.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cvl.a($$1, (vc)$$0.p("item")).orElse(cvl.k);
         } else {
            this.l = cvl.k;
         }
      }
   }

   public acg j() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.e($$0);
   }

   public jj k() {
      return this.m().c(duq.R);
   }

   public dsk t() {
      return this.k;
   }

   public void c(cvl $$0) {
      this.a($$0);
   }

   public cvl u() {
      cvl $$0 = cvo.eC.w();
      $$0.b(this.r());
      return $$0;
   }

   public static cvl a(dsk $$0) {
      cvl $$1 = cvo.eC.w();
      $$1.b(kr.ac, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ala<esy> az_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ala<esy> $$0) {
      this.i = $$0;
   }

   @Override
   public long aC_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.ac, this.k);
      $$0.a(kr.ad, cyh.a(List.of(this.l)));
   }

   @Override
   protected void a(dre.b $$0) {
      super.a($$0);
      this.k = $$0.a(kr.ac, dsk.a);
      this.l = $$0.a(kr.ad, cyh.a).a();
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cvl f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cvl c(int $$0) {
      this.e_(null);
      cvl $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cvl.k;
      }

      return $$1;
   }

   @Override
   public void b(cvl $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dre v() {
      return this;
   }

   public void a(dru.a $$0) {
      if (this.o != null && !this.o.w_()) {
         this.o.a(this.aD_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dru.a.values().length) {
         this.g = this.o.aa();
         this.h = dru.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }
}
