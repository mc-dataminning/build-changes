import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwh extends bvb {
   private static final int a = 10;
   private final boo b;
   private final int c;
   @Nullable
   private hz d;

   public bwh(boo $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bvb.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cO()) {
         return false;
      } else if (this.b.dM().P()) {
         return false;
      } else if (this.b.eh().a(this.c) != 0) {
         return false;
      } else {
         aov $$0 = (aov)this.b.dM();
         hz $$1 = this.b.dm();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ens $$2 = bzb.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jb.a($$1x))));
            this.d = $$2 == null ? null : hz.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.N().l() && this.b.N().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         bxp $$0 = this.b.N();
         if ($$0.l() && !this.d.a(this.b.dk(), 10.0)) {
            ens $$1 = ens.c(this.d);
            ens $$2 = this.b.dk();
            ens $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ens $$4 = $$1.d($$2).d().a(10.0).e($$2);
            hz $$5 = hz.a($$4);
            $$5 = this.b.dM().a(dqo.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      awo $$0 = this.b.eh();
      hz $$1 = this.b.dM().a(dqo.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
