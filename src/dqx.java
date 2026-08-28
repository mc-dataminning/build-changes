import java.util.List;
import javax.annotation.Nullable;

public class dqx extends dqh implements bqz, eyl.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dqx.a h;
   private drm k;
   private cuq l;
   @Nullable
   protected akq<eru> i;
   protected long j;

   public dqx(jd $$0, dtc $$1) {
      super(dqj.O, $$0, $$1);
      this.l = cuq.l;
      this.k = drm.a;
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.k = drm.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cuq.a($$1, (uy)$$0.p("item")).orElse(cuq.l);
         } else {
            this.l = cuq.l;
         }
      }
   }

   public acb j() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      return this.e($$0);
   }

   public ji k() {
      return this.n().c(dts.R);
   }

   public drm l() {
      return this.k;
   }

   public void c(cuq $$0) {
      this.a($$0);
   }

   public cuq u() {
      cuq $$0 = cut.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cuq a(drm $$0) {
      cuq $$1 = cut.eC.w();
      $$1.b(kq.aa, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akq<eru> aB_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akq<eru> $$0) {
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
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.aa, this.k);
      $$0.a(kq.ab, cxo.a(List.of(this.l)));
   }

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      this.k = $$0.a(kq.aa, drm.a);
      this.l = $$0.a(kq.ab, cxo.a).a();
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cuq f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cuq c(int $$0) {
      this.e_(null);
      cuq $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cuq.l;
      }

      return $$1;
   }

   @Override
   public void b(cuq $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dqh v() {
      return this;
   }

   public void a(dqx.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.aD_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dqx.a.values().length) {
         this.g = this.n.Z();
         this.h = dqx.a.values()[$$1];
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
