import java.util.EnumSet;
import javax.annotation.Nullable;

public class btm extends bsg {
   private static final int a = 10;
   private final blu b;
   private final int c;
   @Nullable
   private hx d;

   public btm(blu $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bsg.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cP()) {
         return false;
      } else if (this.b.dN().O()) {
         return false;
      } else if (this.b.eh().a(this.c) != 0) {
         return false;
      } else {
         ami $$0 = (ami)this.b.dN();
         hx $$1 = this.b.dn();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ejz $$2 = bwe.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(iy.a($$1x))));
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
         buu $$0 = this.b.N();
         if ($$0.l() && !this.d.a(this.b.dl(), 10.0)) {
            ejz $$1 = ejz.c(this.d);
            ejz $$2 = this.b.dl();
            ejz $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ejz $$4 = $$1.d($$2).d().a(10.0).e($$2);
            hx $$5 = hx.a($$4);
            $$5 = this.b.dN().a(dmw.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      atw $$0 = this.b.eh();
      hx $$1 = this.b.dN().a(dmw.a.f, this.b.dn().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
