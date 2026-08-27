import java.util.EnumSet;
import javax.annotation.Nullable;

public class byw extends bxq {
   private static final int a = 10;
   private final brb b;
   private final int c;
   @Nullable
   private id d;

   public byw(brb $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bxq.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cO()) {
         return false;
      } else if (this.b.dM().Q()) {
         return false;
      } else if (this.b.ei().a(this.c) != 0) {
         return false;
      } else {
         apu $$0 = (apu)this.b.dM();
         id $$1 = this.b.dm();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            esj $$2 = cbq.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jg.a($$1x))));
            this.d = $$2 == null ? null : id.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.K().l() && this.b.K().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         cae $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.dk(), 10.0)) {
            esj $$1 = esj.c(this.d);
            esj $$2 = this.b.dk();
            esj $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            esj $$4 = $$1.d($$2).d().a(10.0).e($$2);
            id $$5 = id.a($$4);
            $$5 = this.b.dM().a(dva.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      axt $$0 = this.b.ei();
      id $$1 = this.b.dM().a(dva.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
