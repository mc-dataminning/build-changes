import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmz extends dih implements dib {
   public static final MapCodec<dmz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a(ly.aJ).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, dmz::new)
   );
   protected static final float b = 3.0F;
   protected static final fab c = dhy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final alg<edr<?, ?>> d;

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   public dmz(alg<edr<?, ?>> $$0, dvc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (jg $$6 : jg.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         jg $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      dvd $$4 = $$1.a_($$3);
      return $$4.a(awz.bb) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arm $$0, jg $$1, dvd $$2, azr $$3) {
      Optional<? extends jp<edr<?, ?>>> $$4 = $$0.H_().e(ly.aJ).a(this.d);
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
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return true;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
