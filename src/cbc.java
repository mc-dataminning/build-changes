import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbc extends bzw {
   private static final int a = 10;
   private final bth b;
   private final int c;
   @Nullable
   private ja d;

   public cbc(bth $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bzw.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cR()) {
         return false;
      } else if (this.b.dP().R()) {
         return false;
      } else if (this.b.dS().a(this.c) != 0) {
         return false;
      } else {
         aqk $$0 = (aqk)this.b.dP();
         ja $$1 = this.b.dp();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            evz $$2 = cdw.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kc.a($$1x))));
            this.d = $$2 == null ? null : ja.a($$2);
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
         cck $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.dn(), 10.0)) {
            evz $$1 = evz.c(this.d);
            evz $$2 = this.b.dn();
            evz $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            evz $$4 = $$1.d($$2).d().a(10.0).e($$2);
            ja $$5 = ja.a($$4);
            $$5 = this.b.dP().a(dxz.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      aym $$0 = this.b.dS();
      ja $$1 = this.b.dP().a(dxz.a.f, this.b.dp().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
