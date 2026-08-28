import java.util.List;
import javax.annotation.Nullable;

public class dyj extends dxr implements bum, fgo.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dyj.a h;
   private dyz k;
   private czn l = czn.k;
   @Nullable
   protected alf<ezy> i;
   protected long j;

   public dyj(iv $$0, eat $$1) {
      super(dxt.P, $$0, $$1);
      this.k = dyz.a;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.k.equals(dyz.a)) {
         $$0.a("sherds", dyz.b, this.k);
      }

      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", czn.b, $$1.a(un.a), this.l);
      }
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.k = $$0.<dyz>a("sherds", dyz.b).orElse(dyz.a);
      if (!this.b_($$0)) {
         ale<uw> $$2 = $$1.a(un.a);
         this.l = $$0.<czn>a("item", czn.b, $$2).orElse(czn.k);
      } else {
         this.l = czn.k;
      }
   }

   public aca j() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public jb k() {
      return this.m().c(ebj.T);
   }

   public dyz s() {
      return this.k;
   }

   public static czn a(dyz $$0) {
      czn $$1 = czr.eV.m();
      $$1.b(kk.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alf<ezy> at_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alf<ezy> $$0) {
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
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.ao, this.k);
      $$0.a(kk.ap, dcf.a(List.of(this.l)));
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.k = $$0.a(kk.ao, dyz.a);
      this.l = $$0.a(kk.ap, dcf.a).a();
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.p("sherds");
      $$0.p("item");
   }

   @Override
   public czn f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public czn c(int $$0) {
      this.d_(null);
      czn $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = czn.k;
      }

      return $$1;
   }

   @Override
   public void b(czn $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dxr t() {
      return this;
   }

   public void a(dyj.a $$0) {
      if (this.n != null && !this.n.w_()) {
         this.n.a(this.ax_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dyj.a.values().length) {
         this.g = this.n.ae();
         this.h = dyj.a.values()[$$1];
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
