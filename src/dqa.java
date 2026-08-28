import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqa extends din implements dih {
   public static final MapCodec<dqa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alh.a(lz.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               alh.a(lz.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               alh.a(lz.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dqa::new)
   );
   public static final int b = 7;
   public static final dwj c = dvz.av;
   protected static final float d = 1.0F;
   protected static final fah[] e = new fah[]{
      die.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final alh<die> f;
   private final alh<die> g;
   private final alh<cvx> h;

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   protected dqa(alh<die> $$0, alh<die> $$1, alh<cvx> $$2, dvi.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(dig.cC);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = djz.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jm $$6 = jm.c.a.a($$3);
               jh $$7 = $$2.a($$6);
               dvj $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dig.cC) || $$8.a(axa.ag))) {
                  kd<die> $$9 = $$1.H_().e(lz.f);
                  Optional<die> $$10 = $$9.f(this.f);
                  Optional<die> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dlz.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb((dfa)DataFixUtils.orElse($$0.H_().e(lz.K).f(this.h), this));
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azk.a($$0.A, 2, 5));
      dvj $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }
}
