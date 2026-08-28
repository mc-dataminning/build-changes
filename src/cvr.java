import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cvr extends cvt {
   private final axp<cvq> a;

   public cvr(axp<cvq> $$0, cvt.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      jr.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jp<cvq>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xv $$6 = $$5.get().a().d().f();
            xk.a($$6, ye.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cvx a(cvt $$0, jp<cvq> $$1) {
      cvx $$2 = new cvx($$0);
      $$2.b(kt.Y, $$1);
      return $$2;
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      Optional<? extends jp<cvq>> $$4 = this.a($$3, $$1.dZ());
      if ($$4.isPresent()) {
         cvq $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gF().a($$3, azj.d($$5.b() * 20.0F));
         $$1.b(awu.c.b(this));
         return bry.c;
      } else {
         return bry.d;
      }
   }

   @Override
   public int a(cvx $$0, buv $$1) {
      Optional<jp<cvq>> $$2 = this.a($$0, $$1.dZ());
      return $$2.<Integer>map($$0x -> azj.d(((cvq)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jp<cvq>> a(cvx $$0, jr.a $$1) {
      jp<cvq> $$2 = $$0.a(kt.Y);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jt.c<cvq>> $$3 = $$1.d(ly.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jp<cvq>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cvz a(cvx $$0) {
      return cvz.i;
   }

   private static void a(dev $$0, coh $$1, cvq $$2) {
      awj $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awl.c, $$4, 1.0F);
      $$0.a(eaa.B, $$1.dv(), eaa.a.a($$1));
   }
}
