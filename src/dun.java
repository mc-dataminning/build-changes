import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dun extends dlr implements dpr {
   public static final MapCodec<dun> a = b(dun::new);
   public static final ebf<ebr> b = eax.bm;

   @Override
   public MapCodec<dun> a() {
      return a;
   }

   protected dun(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebr.b));
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyy($$0, $$1);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      dxf $$5 = $$1.c_($$2);
      if ($$5 instanceof dyy) {
         return (bud)(((dyy)$$5).a($$3) ? bud.a : bud.e);
      } else {
         return bud.e;
      }
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, @Nullable bxe $$3, czd $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dxf $$5 = $$0.c_($$1);
            if ($$5 instanceof dyy) {
               ((dyy)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if ($$1 instanceof arq) {
         if ($$1.c_($$2) instanceof dyy $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((arq)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(arq $$0, dyy $$1) {
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
