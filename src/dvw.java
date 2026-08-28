import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvw extends dna implements dra {
   public static final MapCodec<dvw> a = b(dvw::new);
   public static final eco<eda> b = ecg.bm;

   @Override
   public MapCodec<dvw> a() {
      return a;
   }

   protected dvw(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eda.b));
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eah($$0, $$1);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      dyo $$5 = $$1.c_($$2);
      if ($$5 instanceof eah) {
         return (bvc)(((eah)$$5).a($$3) ? bvc.a : bvc.e);
      } else {
         return bvc.e;
      }
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, @Nullable byf $$3, dak $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dyo $$5 = $$0.c_($$1);
            if ($$5 instanceof eah) {
               ((eah)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if ($$1 instanceof asb) {
         if ($$1.c_($$2) instanceof eah $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((asb)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(asb $$0, eah $$1) {
      switch ($$1.v()) {
         case a:
            $$1.c(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.C();
         case d:
      }
   }
}
