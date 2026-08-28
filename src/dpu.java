import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpu extends dih implements dib {
   public static final MapCodec<dpu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a(ly.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               alg.a(ly.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               alg.a(ly.K).fieldOf("seed").forGetter($$0x -> $$0x.h),
               t()
            )
            .apply($$0, dpu::new)
   );
   public static final int b = 7;
   public static final dwd c = dvt.av;
   protected static final float d = 1.0F;
   protected static final fab[] e = new fab[]{
      dhy.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final alg<dhy> f;
   private final alg<dhy> g;
   private final alg<cvt> h;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   protected dpu(alg<dhy> $$0, alg<dhy> $$1, alg<cvt> $$2, dvc.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(dia.cC);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = djt.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jl $$6 = jl.c.a.a($$3);
               jg $$7 = $$2.a($$6);
               dvd $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dia.cC) || $$8.a(awz.ag))) {
                  kc<dhy> $$9 = $$1.H_().e(ly.f);
                  Optional<dhy> $$10 = $$9.f(this.f);
                  Optional<dhy> $$11 = $$9.f(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dlt.aF, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx((deu)DataFixUtils.orElse($$0.H_().e(ly.K).f(this.h), this));
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azj.a($$0.A, 2, 5));
      dvd $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }
}
