import java.util.List;
import javax.annotation.Nullable;

public class dye extends dxm implements bum, fgj.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dye.a h;
   private dyu k;
   private czk l = czk.k;
   @Nullable
   protected alf<ezt> i;
   protected long j;

   public dye(iv $$0, eao $$1) {
      super(dxo.P, $$0, $$1);
      this.k = dyu.a;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.k.equals(dyu.a)) {
         $$0.a("sherds", dyu.b, this.k);
      }

      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", czk.b, $$1.a(un.a), this.l);
      }
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.k = $$0.<dyu>a("sherds", dyu.b).orElse(dyu.a);
      if (!this.b_($$0)) {
         ale<uw> $$2 = $$1.a(un.a);
         this.l = $$0.<czk>a("item", czk.b, $$2).orElse(czk.k);
      } else {
         this.l = czk.k;
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
      return this.m().c(ebe.T);
   }

   public dyu s() {
      return this.k;
   }

   public static czk a(dyu $$0) {
      czk $$1 = czo.eV.m();
      $$1.b(kk.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alf<ezt> at_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alf<ezt> $$0) {
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
      $$0.a(kk.ap, dcc.a(List.of(this.l)));
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.k = $$0.a(kk.ao, dyu.a);
      this.l = $$0.a(kk.ap, dcc.a).a();
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.p("sherds");
      $$0.p("item");
   }

   @Override
   public czk f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public czk c(int $$0) {
      this.d_(null);
      czk $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = czk.k;
      }

      return $$1;
   }

   @Override
   public void b(czk $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dxm t() {
      return this;
   }

   public void a(dye.a $$0) {
      if (this.n != null && !this.n.w_()) {
         this.n.a(this.ax_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dye.a.values().length) {
         this.g = this.n.ae();
         this.h = dye.a.values()[$$1];
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
