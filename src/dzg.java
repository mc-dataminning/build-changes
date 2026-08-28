import java.util.List;
import javax.annotation.Nullable;

public class dzg extends dyo implements bvi, fho.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dzg.a h;
   private dzw k;
   private dak l;
   @Nullable
   protected alq<fay> i;
   protected long j;

   public dzg(iw $$0, ebq $$1) {
      super(dyq.P, $$0, $$1);
      this.l = dak.l;
      this.k = dzw.a;
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.k.equals(dzw.a)) {
         $$0.a("sherds", dzw.b, this.k);
      }

      if (!this.b($$0) && !this.l.f()) {
         $$0.a("item", dak.b, $$1.a(uo.a), this.l);
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.k = $$0.<dzw>a("sherds", dzw.b).orElse(dzw.a);
      if (!this.b_($$0)) {
         alp<va> $$2 = $$1.a(uo.a);
         this.l = $$0.<dak>a("item", dak.b, $$2).orElse(dak.l);
      } else {
         this.l = dak.l;
      }
   }

   public acl j() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public jc k() {
      return this.m().c(ecg.T);
   }

   public dzw s() {
      return this.k;
   }

   public static dak a(dzw $$0) {
      dak $$1 = dao.eV.m();
      $$1.b(kl.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alq<fay> at_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alq<fay> $$0) {
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
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.ao, this.k);
      $$0.a(kl.ap, ddc.a(List.of(this.l)));
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.k = $$0.a(kl.ao, dzw.a);
      this.l = $$0.a(kl.ap, ddc.a).a();
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public dak f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public dak c(int $$0) {
      this.d_(null);
      dak $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = dak.l;
      }

      return $$1;
   }

   @Override
   public void b(dak $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dyo t() {
      return this;
   }

   public void a(dzg.a $$0) {
      if (this.n != null && !this.n.A_()) {
         this.n.a(this.ax_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dzg.a.values().length) {
         this.g = this.n.ae();
         this.h = dzg.a.values()[$$1];
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
