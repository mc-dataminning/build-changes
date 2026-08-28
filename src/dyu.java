import java.util.List;
import javax.annotation.Nullable;

public class dyu extends dyc implements bux, fhc.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dyu.a h;
   private dzk k;
   private czy l = czy.k;
   @Nullable
   protected alh<fam> i;
   protected long j;

   public dyu(iv $$0, ebe $$1) {
      super(dye.P, $$0, $$1);
      this.k = dzk.a;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.k.equals(dzk.a)) {
         $$0.a("sherds", dzk.b, this.k);
      }

      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", czy.b, $$1.a(un.a), this.l);
      }
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.k = $$0.<dzk>a("sherds", dzk.b).orElse(dzk.a);
      if (!this.b_($$0)) {
         alg<uy> $$2 = $$1.a(un.a);
         this.l = $$0.<czy>a("item", czy.b, $$2).orElse(czy.k);
      } else {
         this.l = czy.k;
      }
   }

   public acc j() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public jb k() {
      return this.m().c(ebu.T);
   }

   public dzk s() {
      return this.k;
   }

   public static czy a(dzk $$0) {
      czy $$1 = dac.eV.m();
      $$1.b(kk.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alh<fam> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alh<fam> $$0) {
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
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.ao, this.k);
      $$0.a(kk.ap, dcq.a(List.of(this.l)));
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.k = $$0.a(kk.ao, dzk.a);
      this.l = $$0.a(kk.ap, dcq.a).a();
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public czy f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public czy c(int $$0) {
      this.d_(null);
      czy $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = czy.k;
      }

      return $$1;
   }

   @Override
   public void b(czy $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dyc t() {
      return this;
   }

   public void a(dyu.a $$0) {
      if (this.n != null && !this.n.A_()) {
         this.n.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dyu.a.values().length) {
         this.g = this.n.ae();
         this.h = dyu.a.values()[$$1];
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
