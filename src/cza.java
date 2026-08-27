import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cza extends cuj implements cud {
   public static final MapCodec<cza> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(afv.a(jz.at).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, cza::new)
   );
   protected static final float b = 3.0F;
   protected static final eiy c = cua.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final afv<dob<?, ?>> d;

   @Override
   public MapCodec<cza> a() {
      return a;
   }

   public cza(afv<dob<?, ?>> $$0, dga.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (ht $$6 : ht.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         ht $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.t($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.t($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgb $$4 = $$1.a_($$3);
      return $$4.a(aqs.aZ) ? true : $$1.b($$2, 0) < 13 && this.d($$4, $$1, $$3);
   }

   public boolean a(alq $$0, ht $$1, dgb $$2, ate $$3) {
      Optional<? extends ib<dob<?, ?>>> $$4 = $$0.H_().d(jz.at).b(this.d);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.k().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return true;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
