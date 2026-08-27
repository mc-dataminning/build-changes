import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvw extends cwc {
   public static final MapCodec<cvw> a = b(cvw::new);
   public static final dkb b = djx.P;
   public static final djy c = djx.u;

   @Override
   public MapCodec<cvw> a() {
      return a;
   }

   public cvw(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         dgv $$6 = $$1.c_($$2);
         if ($$6 instanceof dgo) {
            $$3.a((dgo)$$6);
            $$3.a(asc.ar);
            cdz.a($$3, true);
         }

         return bkb.b;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      bjx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      dgv $$4 = $$1.c_($$2);
      if ($$4 instanceof dgo) {
         ((dgo)$$4).m();
      }
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgo($$0, $$1);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dgo) {
            ((dgo)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cib.a($$1.c_($$2));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
