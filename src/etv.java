import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etv extends gld {
   private static final Logger a = LogUtils.getLogger();
   private static final vg b = vg.c("mco.terms.title");
   private static final vg c = vg.c("mco.terms.sentence.1");
   private static final vg v = vf.a().b(vg.c("mco.terms.sentence.2").c(wd.a.c(true)));
   private final fdm w;
   private final err x;
   private boolean y;

   public etv(fdm $$0, err $$1) {
      super(b);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public void aP_() {
      int $$0 = this.g / 4 - 2;
      this.d(exr.a(vg.c("mco.terms.buttons.agree"), $$0x -> this.E()).a(this.g / 4, g(12), $$0, 20).a());
      this.d(exr.a(vg.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.w)).a(this.g / 2 + 4, g(12), $$0, 20).a());
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

   private void E() {
      era $$0 = era.a();

      try {
         $$0.j();
         this.f.a(new eth(this.w, new euq(this.w, this.x)));
      } catch (esn var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.y) {
         this.f.o.a("https://aka.ms/MinecraftRealmsTerms");
         ac.j().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public vg i() {
      return vf.a(super.i(), c).b(vf.u).b(v);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
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
