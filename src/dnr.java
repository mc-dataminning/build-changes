import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnr extends diz implements dit {
   public static final MapCodec<dnr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a(ma.aJ).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, dnr::new)
   );
   protected static final float b = 3.0F;
   protected static final fas c = diq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ali<eei<?, ?>> d;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(ali<eei<?, ?>> $$0, dvu.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (jh $$6 : jh.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         jh $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvv $$4 = $$1.a_($$3);
      return $$4.a(axc.bb) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arp $$0, jh $$1, dvv $$2, azu $$3) {
      Optional<? extends jq<eei<?, ?>>> $$4 = $$0.J_().e(ma.aJ).a(this.d);
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
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return true;
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
