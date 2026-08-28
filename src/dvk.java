import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvk extends dwq implements dnh {
   public static final MapCodec<dvk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alj.a(mi.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alj.a(mi.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               alj.a(mi.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dvk::new)
   );
   public static final int b = 7;
   public static final ecg c = ebw.ay;
   private static final fgm[] d = dne.a(7, $$0 -> dne.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final alj<dne> e;
   private final alj<dne> f;
   private final alj<czw> g;

   @Override
   public MapCodec<dvk> a() {
      return a;
   }

   protected dvk(alj<dne> $$0, alj<dne> $$1, alj<czw> $$2, ebf.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(dng.cN);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dpb.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               jc $$6 = jc.c.a.a($$3);
               iw $$7 = $$2.a($$6);
               ebg $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dng.cN) || $$8.a(axg.ah))) {
                  jt<dne> $$9 = $$1.J_().f(mi.i);
                  Optional<dne> $$10 = $$9.f(this.e);
                  Optional<dne> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(drf.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa((djy)DataFixUtils.orElse($$0.J_().f(mi.K).f(this.g), this));
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azq.a($$0.A, 2, 5));
      ebg $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }
}
