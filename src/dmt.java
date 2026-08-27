import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dmt extends czo {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dnv b = dmv.a;
   public static final dnz<dod> c = dmv.c;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dod.a));
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return null;
   }

   public static dki a(ib $$0, dnb $$1, dnb $$2, ih $$3, boolean $$4, boolean $$5) {
      return new dmx($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.k, dmx::a);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dmx) {
            ((dmx)$$5).k();
         }
      }
   }

   @Override
   public void a(cxc $$0, ib $$1, dnb $$2) {
      ib $$3 = $$1.a($$2.c(b).g());
      dnb $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dmu && $$4.c(dmu.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bnd.b;
      } else {
         return bnd.d;
      }
   }

   @Override
   protected List<cqm> a(dnb $$0, elc.a $$1) {
      dmx $$2 = this.a($$1.a(), ib.a($$1.a(enh.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return eqj.a();
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      dmx $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eqj.a();
   }

   @Nullable
   private dmx a(cwh $$0, ib $$1) {
      dki $$2 = $$0.c_($$1);
      return $$2 instanceof dmx ? (dmx)$$2 : null;
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return cqm.h;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
