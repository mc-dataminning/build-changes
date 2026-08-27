import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class csi extends cso {
   public static final MapCodec<csi> a = b(csi::new);
   public static final dfx b = dft.P;
   public static final dfu c = dft.u;

   @Override
   public MapCodec<csi> a() {
      return a;
   }

   public csi(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         dcz $$6 = $$1.c_($$2);
         if ($$6 instanceof dcs) {
            $$3.a((dcs)$$6);
            $$3.a(apq.ar);
            car.a($$3, true);
         }

         return bhe.b;
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof bgx) {
            bha.a($$1, $$2, (bgx)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      dcz $$4 = $$1.c_($$2);
      if ($$4 instanceof dcs) {
         ((dcs)$$4).i();
      }
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dcs($$0, $$1);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof dcs) {
            ((dcs)$$5).a($$4.y());
         }
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
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
