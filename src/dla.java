import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dla extends ddn implements ddh {
   public static final MapCodec<dla> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akg.a(le.f).fieldOf("fruit").forGetter($$0x -> $$0x.f),
               akg.a(le.f).fieldOf("attached_stem").forGetter($$0x -> $$0x.g),
               akg.a(le.G).fieldOf("seed").forGetter($$0x -> $$0x.h),
               u()
            )
            .apply($$0, dla::new)
   );
   public static final int b = 7;
   public static final drh c = dqx.av;
   protected static final float d = 1.0F;
   protected static final eui[] e = new eui[]{
      dde.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final akg<dde> f;
   private final akg<dde> g;
   private final akg<csu> h;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   protected dla(akg<dde> $$0, akg<dde> $$1, akg<csu> $$2, dqg.d $$3) {
      super($$3);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(ddg.cC);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dez.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.a(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               is $$6 = is.c.a.a($$3);
               in $$7 = $$2.a($$6);
               dqh $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(ddg.cC) || $$8.a(avr.af))) {
                  jj<dde> $$9 = $$1.H_().d(le.f);
                  Optional<dde> $$10 = $$9.e(this.f);
                  Optional<dde> $$11 = $$9.e(this.g);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().n());
                     $$1.b($$2, $$11.get().n().a(dha.aE, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz((dac)DataFixUtils.orElse($$0.H_().d(le.G).e(this.h), this));
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      int $$4 = Math.min(7, $$3.c(c) + axz.a($$0.z, 2, 5));
      dqh $$5 = $$3.a(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }
}
