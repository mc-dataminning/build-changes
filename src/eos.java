import com.mojang.logging.LogUtils;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;

public class eos extends ged {
   private static final Logger a = LogUtils.getLogger();
   private static final te b = te.c("mco.terms.title");
   private static final te c = te.c("mco.terms.sentence.1");
   private static final te y = td.a().b(te.c("mco.terms.sentence.2").c(ua.a.c(true)));
   private final exv z;
   private final els A;
   private final emo B;
   private boolean C;

   public eos(exv $$0, els $$1, emo $$2) {
      super(b);
      this.z = $$0;
      this.A = $$1;
      this.B = $$2;
   }

   @Override
   public void aE_() {
      int $$0 = this.g / 4 - 2;
      this.d(esi.a(te.c("mco.terms.buttons.agree"), $$0x -> this.B()).a(this.g / 4, h(12), $$0, 20).a());
      this.d(esi.a(te.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.z)).a(this.g / 2 + 4, h(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.z);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void B() {
      elx $$0 = elx.a();

      try {
         $$0.i();
         this.f.a(new eof(this.z, new epm(this.A, this.z, this.B, new ReentrantLock())));
      } catch (enk var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.C) {
         this.f.o.a("https://aka.ms/MinecraftRealmsTerms");
         ac.i().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public te e() {
      return td.a(super.e(), c).b(td.u).b(y);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, c, this.g / 2 - 120, h(5), -1, false);
      int $$4 = this.i.a(c);
      int $$5 = this.g / 2 - 121 + $$4;
      int $$6 = h(5);
      int $$7 = $$5 + this.i.a(y) + 1;
      int $$8 = $$6 + 1 + 9;
      this.C = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.i, y, this.g / 2 - 120 + $$4, h(5), this.C ? 7107012 : 3368635, false);
   }
}
