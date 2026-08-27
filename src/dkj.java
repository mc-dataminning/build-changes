import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dkj extends dfl implements dff {
   public static final MapCodec<dkj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aks.a(li.aC).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dkj::new)
   );
   protected static final float b = 3.0F;
   protected static final exn c = dfc.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final aks<ebm<?, ?>> d;

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   public dkj(aks<ebm<?, ?>> $$0, dtb.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (ir $$6 : ir.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         ir $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.u($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.u($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      return $$4.a(awe.bc) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aqt $$0, ir $$1, dtc $$2, ayt $$3) {
      Optional<? extends ja<ebm<?, ?>>> $$4 = $$0.I_().d(li.aC).b(this.d);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.l().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
