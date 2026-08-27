import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctg extends cso {
   public static final MapCodec<ctg> a = b(ctg::new);
   public static final dfu[] b = new dfu[]{dft.k, dft.l, dft.m};
   protected static final eia c = ehx.a(ctc.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), ctc.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<ctg> a() {
      return a;
   }

   public ctg(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$0.B ? null : a($$2, ddb.l, ddc::a);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         dcz $$6 = $$1.c_($$2);
         if ($$6 instanceof ddc) {
            $$3.a((ddc)$$6);
            $$3.a(apq.aa);
         }

         return bhe.b;
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof ddc) {
            ((ddc)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof ddc) {
            bha.a($$1, $$2, (ddc)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
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
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
