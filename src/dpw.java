import java.util.List;
import javax.annotation.Nullable;

public class dpw extends dpg implements brb, exb.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dpw.a h;
   private dqk k;
   private cuo l;
   @Nullable
   protected ald<eqm> i;
   protected long j;

   public dpw(iz $$0, dsb $$1) {
      super(dpi.O, $$0, $$1);
      this.l = cuo.l;
      this.k = dqk.a;
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.k = dqk.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cuo.a($$1, (vo)$$0.p("item")).orElse(cuo.l);
         } else {
            this.l = cuo.l;
         }
      }
   }

   public aco j() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.e($$0);
   }

   public je k() {
      return this.n().c(dsr.R);
   }

   public dqk l() {
      return this.k;
   }

   public void c(cuo $$0) {
      this.a($$0);
   }

   public cuo u() {
      cuo $$0 = cur.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cuo a(dqk $$0) {
      cuo $$1 = cur.eC.w();
      $$1.b(km.Z, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ald<eqm> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ald<eqm> $$0) {
      this.i = $$0;
   }

   @Override
   public long ax_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.Z, this.k);
      $$0.a(km.aa, cxk.a(List.of(this.l)));
   }

   @Override
   protected void a(dpg.b $$0) {
      super.a($$0);
      this.k = $$0.a(km.Z, dqk.a);
      this.l = $$0.a(km.aa, cxk.a).a();
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cuo f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cuo c(int $$0) {
      this.e_(null);
      cuo $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cuo.l;
      }

      return $$1;
   }

   @Override
   public void b(cuo $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dpg v() {
      return this;
   }

   public void a(dpw.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.ay_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dpw.a.values().length) {
         this.g = this.n.Z();
         this.h = dpw.a.values()[$$1];
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
