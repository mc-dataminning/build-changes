import java.util.EnumSet;
import javax.annotation.Nullable;

public class cau extends bzo {
   private static final int a = 10;
   private final bsz b;
   private final int c;
   @Nullable
   private io d;

   public cau(bsz $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bzo.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cR()) {
         return false;
      } else if (this.b.dP().Q()) {
         return false;
      } else if (this.b.el().a(this.c) != 0) {
         return false;
      } else {
         aqn $$0 = (aqn)this.b.dP();
         io $$1 = this.b.dp();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            eum $$2 = cdo.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jq.a($$1x))));
            this.d = $$2 == null ? null : io.a($$2);
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
         ccc $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.dn(), 10.0)) {
            eum $$1 = eum.c(this.d);
            eum $$2 = this.b.dn();
            eum $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            eum $$4 = $$1.d($$2).d().a(10.0).e($$2);
            io $$5 = io.a($$4);
            $$5 = this.b.dP().a(dwv.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      aym $$0 = this.b.el();
      io $$1 = this.b.dP().a(dwv.a.f, this.b.dp().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
