import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctz extends cuf {
   public static final MapCodec<ctz> a = b(ctz::new);
   public static final dhq b = dhm.P;
   public static final dhn c = dhm.u;

   @Override
   public MapCodec<ctz> a() {
      return a;
   }

   public ctz(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         der $$6 = $$1.c_($$2);
         if ($$6 instanceof dek) {
            $$3.a((dek)$$6);
            $$3.a(aqx.ar);
            ccd.a($$3, true);
         }

         return biq.b;
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      bim.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      der $$4 = $$1.c_($$2);
      if ($$4 instanceof dek) {
         ((dek)$$4).i();
      }
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dek($$0, $$1);
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dek) {
            ((dek)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.a($$1.c_($$2));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
