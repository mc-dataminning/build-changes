import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwt extends cwb {
   public static final MapCodec<cwt> a = b(cwt::new);
   public static final djx[] b = new djx[]{djw.k, djw.l, djw.m};
   protected static final eml c = emi.a(cwp.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cwp.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cwt> a() {
      return a;
   }

   public cwt(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? null : a($$2, dgw.l, dgx::a);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         dgu $$6 = $$1.c_($$2);
         if ($$6 instanceof dgx) {
            $$3.a((dgx)$$6);
            $$3.a(asb.aa);
         }

         return bka.b;
      }
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dgx) {
            ((dgx)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      bjw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.a($$1.c_($$2));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
