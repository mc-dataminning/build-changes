import java.util.List;
import javax.annotation.Nullable;

public class dqs extends dqc implements bqi, eyf.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dqs.a h;
   private drj k;
   private cuh l = cuh.i;
   @Nullable
   protected aks<eru> i;
   protected long j;

   public dqs(ir $$0, dtc $$1) {
      super(dqe.P, $$0, $$1);
      this.k = drj.a;
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.d()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.k = drj.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cuh.a($$1, (vh)$$0.p("item")).orElse(cuh.i);
         } else {
            this.l = cuh.i;
         }
      }
   }

   public ace j() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return this.d($$0);
   }

   public iw k() {
      return this.n().c(dts.R);
   }

   public drj l() {
      return this.k;
   }

   public void c(cuh $$0) {
      this.a($$0.a());
   }

   public cuh t() {
      cuh $$0 = cuk.fK.v();
      $$0.a(this.s());
      return $$0;
   }

   public static cuh a(drj $$0) {
      cuh $$1 = cuk.fK.v();
      $$1.b(ke.Y, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public aks<eru> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable aks<eru> $$0) {
      this.i = $$0;
   }

   @Override
   public long ay_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   public void a(ka.a $$0) {
      $$0.a(ke.Y, this.k);
      $$0.a(ke.Z, cxm.a(List.of(this.l)));
   }

   @Override
   public void a(ka $$0) {
      this.k = $$0.a(ke.Y, drj.a);
      this.l = $$0.a(ke.Z, cxm.a).a();
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cuh f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cuh c(int $$0) {
      this.e_(null);
      cuh $$1 = this.l.a($$0);
      if (this.l.d()) {
         this.l = cuh.i;
      }

      return $$1;
   }

   @Override
   public void b(cuh $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dqc u() {
      return this;
   }

   public void a(dqs.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean b_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dqs.a.values().length) {
         this.g = this.n.Z();
         this.h = dqs.a.values()[$$1];
         return true;
      } else {
         return super.b_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }
}
