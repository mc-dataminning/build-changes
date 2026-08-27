import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ete extends gkc {
   private static final Logger a = LogUtils.getLogger();
   private static final vd b = vd.c("mco.terms.title");
   private static final vd c = vd.c("mco.terms.sentence.1");
   private static final vd v = vc.a().b(vd.c("mco.terms.sentence.2").c(wa.a.c(true)));
   private final fct w;
   private final era x;
   private boolean y;

   public ete(fct $$0, era $$1) {
      super(b);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public void aN_() {
      int $$0 = this.g / 4 - 2;
      this.d(ewy.a(vd.c("mco.terms.buttons.agree"), $$0x -> this.C()).a(this.g / 4, g(12), $$0, 20).a());
      this.d(ewy.a(vd.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.w)).a(this.g / 2 + 4, g(12), $$0, 20).a());
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
      eqj $$0 = eqj.a();

      try {
         $$0.j();
         this.f.a(new esq(this.w, new etz(this.w, this.x)));
      } catch (erw var3) {
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
   public vd h() {
      return vc.a(super.h(), c).b(vc.u).b(v);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, c, this.g / 2 - 120, g(5), -1, false);
      int $$4 = this.i.a(c);
      int $$5 = this.g / 2 - 121 + $$4;
      int $$6 = g(5);
      int $$7 = $$5 + this.i.a(v) + 1;
      int $$8 = $$6 + 1 + 9;
      this.y = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.i, v, this.g / 2 - 120 + $$4, g(5), this.y ? 7107012 : 3368635, false);
   }
}
