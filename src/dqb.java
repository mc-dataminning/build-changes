import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqb extends dle implements dkx {
   public static final MapCodec<dqb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a(me.aP).fieldOf("feature").forGetter($$0x -> $$0x.c), t()).apply($$0, dqb::new)
   );
   private static final fdo b = dku.b(6.0, 0.0, 6.0);
   private final alc<ehd<?, ?>> c;

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(alc<ehd<?, ?>> $$0, dyl.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (jj $$6 : jj.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         jj $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      dym $$4 = $$1.a_($$3);
      return $$4.a(awz.bc) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arn $$0, jj $$1, dym $$2, azs $$3) {
      Optional<? extends js<ehd<?, ?>>> $$4 = $$0.F_().f(me.aP).a(this.c);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.m().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return true;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
