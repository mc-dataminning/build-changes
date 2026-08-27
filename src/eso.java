import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eso extends gjl {
   private static final Logger a = LogUtils.getLogger();
   private static final vb b = vb.c("mco.terms.title");
   private static final vb c = vb.c("mco.terms.sentence.1");
   private static final vb v = va.a().b(vb.c("mco.terms.sentence.2").c(vy.a.c(true)));
   private final fcc w;
   private final eqk x;
   private boolean y;

   public eso(fcc $$0, eqk $$1) {
      super(b);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public void aP_() {
      int $$0 = this.g / 4 - 2;
      this.d(ewh.a(vb.c("mco.terms.buttons.agree"), $$0x -> this.C()).a(this.g / 4, h(12), $$0, 20).a());
      this.d(ewh.a(vb.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.w)).a(this.g / 2 + 4, h(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.w);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      ept $$0 = ept.a();

      try {
         $$0.j();
         this.f.a(new esa(this.w, new etj(this.w, this.x)));
      } catch (erg var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.y) {
         this.f.o.a("https://aka.ms/MinecraftRealmsTerms");
         ac.i().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public vb h() {
      return va.a(super.h(), c).b(va.u).b(v);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, c, this.g / 2 - 120, h(5), -1, false);
      int $$4 = this.i.a(c);
      int $$5 = this.g / 2 - 121 + $$4;
      int $$6 = h(5);
      int $$7 = $$5 + this.i.a(v) + 1;
      int $$8 = $$6 + 1 + 9;
      this.y = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.i, v, this.g / 2 - 120 + $$4, h(5), this.y ? 7107012 : 3368635, false);
   }
}
