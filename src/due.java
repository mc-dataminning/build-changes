import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class due extends dvj implements dmd {
   public static final MapCodec<due> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mg.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alf.a(mg.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alf.a(mg.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, due::new)
   );
   public static final int b = 7;
   public static final eaz c = eap.ay;
   private static final ffc[] d = dma.a(7, $$0 -> dma.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alf<dma> e;
   private final alf<dma> f;
   private final alf<cyu> g;

   @Override
   public MapCodec<due> a() {
      return a;
   }

   protected due(alf<dma> $$0, alf<dma> $$1, alf<cyu> $$2, dzy.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(dmc.cL);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dnw.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ja $$6 = ja.c.a.a($$3);
               iu $$7 = $$2.a($$6);
               dzz $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dmc.cL) || $$8.a(axc.ah))) {
                  jr<dma> $$9 = $$1.F_().f(mg.i);
                  Optional<dma> $$10 = $$9.f(this.e);
                  Optional<dma> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dqa.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy((diu)DataFixUtils.orElse($$0.F_().f(mg.K).f(this.g), this));
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azm.a($$0.A, 2, 5));
      dzz $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }
}
