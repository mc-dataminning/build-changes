import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class exm extends gpe {
   private static final Logger a = LogUtils.getLogger();
   private static final vu b = vu.c("mco.terms.title");
   private static final vu c = vu.c("mco.terms.sentence.1");
   private static final vu v = vt.a().b(vu.c("mco.terms.sentence.2").c(wr.a.c(true)));
   private final fhh w;
   private final evi x;
   private boolean y;

   public exm(fhh $$0, evi $$1) {
      super(b);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public void aO_() {
      int $$0 = this.g / 4 - 2;
      this.c(fbi.a(vu.c("mco.terms.buttons.agree"), $$0x -> this.E()).a(this.g / 4, g(12), $$0, 20).a());
      this.c(fbi.a(vu.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.w)).a(this.g / 2 + 4, g(12), $$0, 20).a());
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
      eur $$0 = eur.a();

      try {
         $$0.j();
         this.f.a(new ewy(this.w, new eyh(this.w, this.x)));
      } catch (ewe var3) {
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
   public vu i() {
      return vt.a(super.i(), c).b(vt.v).b(v);
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
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
