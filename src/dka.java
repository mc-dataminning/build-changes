import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dka extends dfh implements dfb {
   public static final MapCodec<dka> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dka::new)
   );
   protected static final float b = 3.0F;
   protected static final ewj c = dey.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ald<eak<?, ?>> d;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(ald<eak<?, ?>> $$0, dsa.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (iz $$6 : iz.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         iz $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsb $$4 = $$1.a_($$3);
      return $$4.a(awo.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(are $$0, iz $$1, dsb $$2, azg $$3) {
      Optional<? extends ji<eak<?, ?>>> $$4 = $$0.H_().d(lq.aC).b(this.d);
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
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
