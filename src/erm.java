import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class erm extends ghw {
   private static final Logger a = LogUtils.getLogger();
   private static final uv b = uv.c("mco.terms.title");
   private static final uv c = uv.c("mco.terms.sentence.1");
   private static final uv v = uu.a().b(uv.c("mco.terms.sentence.2").c(vs.a.c(true)));
   private final faz w;
   private final epi x;
   private boolean y;

   public erm(faz $$0, epi $$1) {
      super(b);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public void aQ_() {
      int $$0 = this.g / 4 - 2;
      this.d(eve.a(uv.c("mco.terms.buttons.agree"), $$0x -> this.C()).a(this.g / 4, h(12), $$0, 20).a());
      this.d(eve.a(uv.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.w)).a(this.g / 2 + 4, h(12), $$0, 20).a());
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
      eor $$0 = eor.a();

      try {
         $$0.j();
         this.f.a(new eqy(this.w, new esh(this.w, this.x)));
      } catch (eqe var3) {
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
   public uv h() {
      return uu.a(super.h(), c).b(uu.u).b(v);
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
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
