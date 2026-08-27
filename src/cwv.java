import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwv extends cso {
   public static final MapCodec<cwv> a = b(cwv::new);
   public static final dfx b = dft.Q;
   public static final dfu c = dft.f;
   private static final eia d = ctc.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia e = ctc.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eia f = ehx.a(e, d);
   private static final eia g = ehx.a(f, ddw.c, ehl.e);
   private static final eia h = ehx.a(g, ctc.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eia i = ehx.a(g, ctc.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eia j = ehx.a(g, ctc.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eia k = ehx.a(g, ctc.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eia l = ehx.a(g, ctc.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eia m = ddw.c;
   private static final eia n = ehx.a(ddw.c, ctc.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eia o = ehx.a(ddw.c, ctc.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eia F = ehx.a(ddw.c, ctc.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eia G = ehx.a(ddw.c, ctc.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<cwv> a() {
      return a;
   }

   public cwv(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha)$$0.c(b)) {
         case a:
            return h;
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         case f:
            return i;
         default:
            return g;
      }
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2) {
      switch ((ha)$$0.c(b)) {
         case a:
            return m;
         case c:
            return o;
         case d:
            return F;
         case e:
            return G;
         case f:
            return n;
         default:
            return ddw.c;
      }
   }

   @Override
   public dfd a(clt $$0) {
      ha $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ha.a.b ? ha.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$0.B ? null : a($$2, ddb.r, ddx::a);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof ddx) {
            ((ddx)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         dcz $$6 = $$1.c_($$2);
         if ($$6 instanceof ddx) {
            $$3.a((ddx)$$6);
            $$3.a(apq.ad);
         }

         return bhe.b;
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cqb $$0, gw $$1, dfd $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof ddx) {
            bha.a($$1, $$2, (ddx)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return cer.a($$1.c_($$2));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      dcz $$4 = $$1.c_($$2);
      if ($$4 instanceof ddx) {
         ddx.a($$1, $$2, $$0, $$3, (ddx)$$4);
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
