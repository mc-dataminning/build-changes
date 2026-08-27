import com.mojang.logging.LogUtils;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;

public class elt extends gan {
   private static final Logger a = LogUtils.getLogger();
   private static final sw b = sw.c("mco.terms.title");
   private static final sw c = sw.c("mco.terms.sentence.1");
   private static final sw G = sv.a().b(sw.c("mco.terms.sentence.2").c(ts.a.c(true)));
   private final euq H;
   private final eiu I;
   private final ejq J;
   private boolean K;

   public elt(euq $$0, eiu $$1, ejq $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void b() {
      int $$0 = this.g / 4 - 2;
      this.d(epi.a(sw.c("mco.terms.buttons.agree"), $$0x -> this.B()).a(this.g / 4, h(12), $$0, 20).a());
      this.d(epi.a(sw.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.H)).a(this.g / 2 + 4, h(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.H);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void B() {
      eiz $$0 = eiz.a();

      try {
         $$0.m();
         this.f.a(new elh(this.H, new emn(this.I, this.H, this.J, new ReentrantLock())));
      } catch (ekm var3) {
         a.error("Couldn't agree to TOS");
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.K) {
         this.f.o.a("https://aka.ms/MinecraftRealmsTerms");
         ac.i().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public sw au_() {
      return sv.a(super.au_(), c).b(sv.t).b(G);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.a(this.i, c, this.g / 2 - 120, h(5), 16777215, false);
      int $$4 = this.i.a(c);
      int $$5 = this.g / 2 - 121 + $$4;
      int $$6 = h(5);
      int $$7 = $$5 + this.i.a(G) + 1;
      int $$8 = $$6 + 1 + 9;
      this.K = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.i, G, this.g / 2 - 120 + $$4, h(5), this.K ? 7107012 : 3368635, false);
      super.a($$0, $$1, $$2, $$3);
   }
}
