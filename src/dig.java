import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dig extends ddn implements ddh {
   public static final MapCodec<dig> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akg.a(le.aC).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dig::new)
   );
   protected static final float b = 3.0F;
   protected static final eui c = dde.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final akg<dyq<?, ?>> d;

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   public dig(akg<dyq<?, ?>> $$0, dqg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (in $$6 : in.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         in $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      dqh $$4 = $$1.a_($$3);
      return $$4.a(avr.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aqh $$0, in $$1, dqh $$2, ayg $$3) {
      Optional<? extends iw<dyq<?, ?>>> $$4 = $$0.H_().d(le.aC).b(this.d);
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
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return true;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
