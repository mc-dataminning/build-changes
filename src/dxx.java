import java.util.List;
import javax.annotation.Nullable;

public class dxx extends dxf implements buj, fgc.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dxx.a h;
   private dyn k;
   private czd l = czd.k;
   @Nullable
   protected alf<ezm> i;
   protected long j;

   public dxx(iu $$0, eah $$1) {
      super(dxh.P, $$0, $$1);
      this.k = dyn.a;
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.k.equals(dyn.a)) {
         $$0.a("sherds", dyn.b, this.k);
      }

      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.k = $$0.<dyn>a("sherds", dyn.b).orElse(dyn.a);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = czd.a($$1, (uw)$$0.p("item")).orElse(czd.k);
         } else {
            this.l = czd.k;
         }
      }
   }

   public aca j() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return this.e($$0);
   }

   public ja k() {
      return this.m().c(eax.T);
   }

   public dyn s() {
      return this.k;
   }

   public static czd a(dyn $$0) {
      czd $$1 = czh.eV.m();
      $$1.b(kj.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alf<ezm> at_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alf<ezm> $$0) {
      this.i = $$0;
   }

   @Override
   public long aw_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.ao, this.k);
      $$0.a(kj.ap, dbv.a(List.of(this.l)));
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.k = $$0.a(kj.ao, dyn.a);
      this.l = $$0.a(kj.ap, dbv.a).a();
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public czd f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public czd c(int $$0) {
      this.d_(null);
      czd $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = czd.k;
      }

      return $$1;
   }

   @Override
   public void b(czd $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dxf t() {
      return this;
   }

   public void a(dxx.a $$0) {
      if (this.n != null && !this.n.w_()) {
         this.n.a(this.ax_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dxx.a.values().length) {
         this.g = this.n.ae();
         this.h = dxx.a.values()[$$1];
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
