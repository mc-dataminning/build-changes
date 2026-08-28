import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdr extends gvm {
   private static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.terms.title");
   private static final wu c = wu.c("mco.terms.sentence.1");
   private static final wu A = wt.a().b(wu.c("mco.terms.sentence.2").c(xr.a.c(true)));
   private final fnd B;
   private final fbn C;
   private boolean D;

   public fdr(fnd $$0, fbn $$1) {
      super(b);
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aO_() {
      int $$0 = this.m / 4 - 2;
      this.c(fhm.a(wu.c("mco.terms.buttons.agree"), $$0x -> this.E()).a(this.m / 4, g(12), $$0, 20).a());
      this.c(fhm.a(wu.c("mco.terms.buttons.disagree"), $$0x -> this.l.a(this.B)).a(this.m / 2 + 4, g(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l.a(this.B);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      faw $$0 = faw.a();

      try {
         $$0.j();
         this.l.a(new fdd(this.B, new fem(this.B, this.C)));
      } catch (fcj var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.D) {
         this.l.o.a("https://aka.ms/MinecraftRealmsTerms");
         ac.k().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public wu i() {
      return wt.a(super.i(), c).b(wt.v).b(A);
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);
      $$0.a(this.o, c, this.m / 2 - 120, g(5), -1, false);
      int $$4 = this.o.a(c);
      int $$5 = this.m / 2 - 121 + $$4;
      int $$6 = g(5);
      int $$7 = $$5 + this.o.a(A) + 1;
      int $$8 = $$6 + 1 + 9;
      this.D = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.o, A, this.m / 2 - 120 + $$4, g(5), this.D ? 7107012 : 3368635, false);
   }
}
