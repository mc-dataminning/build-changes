import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fel extends gwj {
   private static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.terms.title");
   private static final wy c = wy.c("mco.terms.sentence.1");
   private static final wy A = wx.a().b(wy.c("mco.terms.sentence.2").c(xv.a.c(true)));
   private final fnx B;
   private final fcj C;
   private boolean D;

   public fel(fnx $$0, fcj $$1) {
      super(b);
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aP_() {
      int $$0 = this.m / 4 - 2;
      this.c(fig.a(wy.c("mco.terms.buttons.agree"), $$0x -> this.D()).a(this.m / 4, g(12), $$0, 20).a());
      this.c(fig.a(wy.c("mco.terms.buttons.disagree"), $$0x -> this.l.a(this.B)).a(this.m / 2 + 4, g(12), $$0, 20).a());
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

   private void D() {
      fbs $$0 = fbs.a();

      try {
         $$0.j();
         this.l.a(new fdx(this.B, new ffg(this.B, this.C)));
      } catch (fdd var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.D) {
         this.l.o.a("https://aka.ms/MinecraftRealmsTerms");
         ad.k().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public wy i() {
      return wx.a(super.i(), c).b(wx.v).b(A);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
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
