import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dgz extends dch implements dcb {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ajs.a(ks.ay).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dgz::new)
   );
   protected static final float b = 3.0F;
   protected static final est c = dby.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ajs<dxi<?, ?>> d;

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgz(ajs<dxi<?, ?>> $$0, doy.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (ib $$6 : ib.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         ib $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      doz $$4 = $$1.a_($$3);
      return $$4.a(avc.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aps $$0, ib $$1, doz $$2, axr $$3) {
      Optional<? extends il<dxi<?, ?>>> $$4 = $$0.H_().d(ks.ay).b(this.d);
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
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
