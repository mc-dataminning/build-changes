import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dul extends dvr implements dmi {
   public static final MapCodec<dul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mg.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alf.a(mg.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alf.a(mg.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dul::new)
   );
   public static final int b = 7;
   public static final ebh c = eax.ay;
   private static final ffk[] d = dmf.a(7, $$0 -> dmf.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alf<dmf> e;
   private final alf<dmf> f;
   private final alf<cyz> g;

   @Override
   public MapCodec<dul> a() {
      return a;
   }

   protected dul(alf<dmf> $$0, alf<dmf> $$1, alf<cyz> $$2, eag.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(dmh.cN);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = doc.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ja $$6 = ja.c.a.a($$3);
               iu $$7 = $$2.a($$6);
               eah $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dmh.cN) || $$8.a(axc.ah))) {
                  jr<dmf> $$9 = $$1.F_().f(mg.i);
                  Optional<dmf> $$10 = $$9.f(this.e);
                  Optional<dmf> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dqg.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd((diz)DataFixUtils.orElse($$0.F_().f(mg.K).f(this.g), this));
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azm.a($$0.A, 2, 5));
      eah $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }
}
