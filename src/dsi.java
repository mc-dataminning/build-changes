import java.util.List;
import javax.annotation.Nullable;

public class dsi extends drs implements brv, fae.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dsi.a h;
   private dsy k;
   private cvp l = cvp.k;
   @Nullable
   protected alb<etm> i;
   protected long j;

   public dsi(je $$0, duo $$1) {
      super(dru.O, $$0, $$1);
      this.k = dsy.a;
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
      this.k = dsy.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cvp.a($$1, (vc)$$0.p("item")).orElse(cvp.k);
         } else {
            this.l = cvp.k;
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
      return this.m().c(dve.R);
   }

   public dsy t() {
      return this.k;
   }

   public void c(cvp $$0) {
      this.a($$0);
   }

   public cvp u() {
      cvp $$0 = cvt.eC.v();
      $$0.b(this.r());
      return $$0;
   }

   public static cvp a(dsy $$0) {
      cvp $$1 = cvt.eC.v();
      $$1.b(kr.af, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alb<etm> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alb<etm> $$0) {
      this.i = $$0;
   }

   @Override
   public long aA_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.af, this.k);
      $$0.a(kr.ag, cyl.a(List.of(this.l)));
   }

   @Override
   protected void a(drs.b $$0) {
      super.a($$0);
      this.k = $$0.a(kr.af, dsy.a);
      this.l = $$0.a(kr.ag, cyl.a).a();
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cvp f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cvp c(int $$0) {
      this.e_(null);
      cvp $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cvp.k;
      }

      return $$1;
   }

   @Override
   public void b(cvp $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public drs v() {
      return this;
   }

   public void a(dsi.a $$0) {
      if (this.o != null && !this.o.w_()) {
         this.o.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dsi.a.values().length) {
         this.g = this.o.aa();
         this.h = dsi.a.values()[$$1];
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
