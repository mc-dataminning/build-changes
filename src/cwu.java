import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwu extends cwc {
   public static final MapCodec<cwu> a = b(cwu::new);
   public static final djy[] b = new djy[]{djx.k, djx.l, djx.m};
   protected static final emm c = emj.a(cwq.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cwq.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cwu> a() {
      return a;
   }

   public cwu(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? null : a($$2, dgx.l, dgy::a);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         dgv $$6 = $$1.c_($$2);
         if ($$6 instanceof dgy) {
            $$3.a((dgy)$$6);
            $$3.a(asc.aa);
         }

         return bkb.b;
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dgy) {
            ((dgy)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      bjx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
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
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
