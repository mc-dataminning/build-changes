import java.util.EnumSet;
import javax.annotation.Nullable;

public class buh extends btb {
   private static final int a = 10;
   private final bmo b;
   private final int c;
   @Nullable
   private hx d;

   public buh(bmo $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(btb.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cO()) {
         return false;
      } else if (this.b.dM().P()) {
         return false;
      } else if (this.b.eg().a(this.c) != 0) {
         return false;
      } else {
         amz $$0 = (amz)this.b.dM();
         hx $$1 = this.b.dm();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            elm $$2 = bxa.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(iz.a($$1x))));
            this.d = $$2 == null ? null : hx.a($$2);
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
         bvp $$0 = this.b.N();
         if ($$0.l() && !this.d.a(this.b.dk(), 10.0)) {
            elm $$1 = elm.c(this.d);
            elm $$2 = this.b.dk();
            elm $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            elm $$4 = $$1.d($$2).d().a(10.0).e($$2);
            hx $$5 = hx.a($$4);
            $$5 = this.b.dM().a(doj.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      aup $$0 = this.b.eg();
      hx $$1 = this.b.dM().a(doj.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
