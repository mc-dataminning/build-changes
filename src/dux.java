import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dux extends dwd implements dmu {
   public static final MapCodec<dux> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mh.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alf.a(mh.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alf.a(mh.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dux::new)
   );
   public static final int b = 7;
   public static final ebt c = ebj.ay;
   private static final ffw[] d = dmr.a(7, $$0 -> dmr.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alf<dmr> e;
   private final alf<dmr> f;
   private final alf<czj> g;

   @Override
   public MapCodec<dux> a() {
      return a;
   }

   protected dux(alf<dmr> $$0, alf<dmr> $$1, alf<czj> $$2, eas.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(dmt.cN);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = doo.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jb $$6 = jb.c.a.a($$3);
               iv $$7 = $$2.a($$6);
               eat $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dmt.cN) || $$8.a(axc.ah))) {
                  js<dmr> $$9 = $$1.F_().f(mh.i);
                  Optional<dmr> $$10 = $$9.f(this.e);
                  Optional<dmr> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dqs.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn((djl)DataFixUtils.orElse($$0.F_().f(mh.K).f(this.g), this));
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azm.a($$0.A, 2, 5));
      eat $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }
}
