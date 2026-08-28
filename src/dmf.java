import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dmf extends dwq {
   public static final MapCodec<dmf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alj.a(mi.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alj.a(mi.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alj.a(mi.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dmf::new)
   );
   public static final ece<jc> b = drf.e;
   private static final Map<jc, fgm> c = fgj.c(dne.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alj<dne> d;
   private final alj<dne> e;
   private final alj<czw> f;

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(alj<dne> $$0, alj<dne> $$1, alj<czw> $$2, ebf.d $$3) {
      super($$3);
      this.l(this.C.b().b(b, jc.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dne> $$8 = $$1.J_().f(mi.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dvk.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(dng.cN);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa((djy)DataFixUtils.orElse($$0.J_().f(mi.K).f(this.f), this));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }
}
