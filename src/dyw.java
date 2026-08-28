import java.util.List;
import javax.annotation.Nullable;

public class dyw extends dye implements buz, fhe.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dyw.a h;
   private dzm k;
   private daa l = daa.k;
   @Nullable
   protected alj<fao> i;
   protected long j;

   public dyw(iw $$0, ebg $$1) {
      super(dyg.P, $$0, $$1);
      this.k = dzm.a;
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.k.equals(dzm.a)) {
         $$0.a("sherds", dzm.b, this.k);
      }

      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", daa.b, $$1.a(uo.a), this.l);
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.k = $$0.<dzm>a("sherds", dzm.b).orElse(dzm.a);
      if (!this.b_($$0)) {
         ali<va> $$2 = $$1.a(uo.a);
         this.l = $$0.<daa>a("item", daa.b, $$2).orElse(daa.k);
      } else {
         this.l = daa.k;
      }
   }

   public ace j() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public jc k() {
      return this.m().c(ebw.T);
   }

   public dzm s() {
      return this.k;
   }

   public static daa a(dzm $$0) {
      daa $$1 = dae.eV.m();
      $$1.b(kl.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alj<fao> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alj<fao> $$0) {
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
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.ao, this.k);
      $$0.a(kl.ap, dcs.a(List.of(this.l)));
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.k = $$0.a(kl.ao, dzm.a);
      this.l = $$0.a(kl.ap, dcs.a).a();
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public daa f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public daa c(int $$0) {
      this.d_(null);
      daa $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = daa.k;
      }

      return $$1;
   }

   @Override
   public void b(daa $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dye t() {
      return this;
   }

   public void a(dyw.a $$0) {
      if (this.n != null && !this.n.A_()) {
         this.n.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dyw.a.values().length) {
         this.g = this.n.ae();
         this.h = dyw.a.values()[$$1];
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
