import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dkh extends dfo implements dfi {
   public static final MapCodec<dkh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aH).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dkh::new)
   );
   protected static final float b = 3.0F;
   protected static final ews c = dff.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final akj<ear<?, ?>> d;

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public dkh(akj<ear<?, ?>> $$0, dsg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (ja $$6 : ja.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         ja $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsh $$4 = $$1.a_($$3);
      return $$4.a(avu.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aqk $$0, ja $$1, dsh $$2, aym $$3) {
      Optional<? extends jj<ear<?, ?>>> $$4 = $$0.H_().d(lr.aH).b(this.d);
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
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return true;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
