import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class czu extends cvc implements cuw {
   public static final MapCodec<czu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(agf.a(jz.au).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, czu::new)
   );
   protected static final float b = 3.0F;
   protected static final ekb c = cut.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final agf<dow<?, ?>> d;

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public czu(agf<dow<?, ?>> $$0, dgv.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
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
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgw $$4 = $$1.a_($$3);
      return $$4.a(arc.aZ) ? true : $$1.b($$2, 0) < 13 && this.d($$4, $$1, $$3);
   }

   public boolean a(ama $$0, ht $$1, dgw $$2, ato $$3) {
      Optional<? extends ib<dow<?, ?>>> $$4 = $$0.H_().d(jz.au).b(this.d);
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
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return true;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
