import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbw extends ctm implements cxg {
   public static final MapCodec<dbw> a = b(dbw::new);
   public static final dgz<dhl> b = dgr.bj;

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   protected dbw(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dhl.b));
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfk($$0, $$1);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ddx $$6 = $$1.c_($$2);
      if ($$6 instanceof dfk) {
         return ((dfk)$$6).a($$3) ? bib.a($$1.B) : bib.d;
      } else {
         return bib.d;
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            ddx $$5 = $$0.c_($$1);
            if ($$5 instanceof dfk) {
               ((dfk)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if ($$1 instanceof alq) {
         if ($$1.c_($$2) instanceof dfk $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((alq)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(alq $$0, dfk $$1) {
      switch ($$1.y()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.a($$0, false);
            break;
         case c:
            $$1.E();
         case d:
      }
   }
}
