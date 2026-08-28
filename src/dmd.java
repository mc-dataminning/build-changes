import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dmd extends dwo {
   public static final MapCodec<dmd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alh.a(mh.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alh.a(mh.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alh.a(mh.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dmd::new)
   );
   public static final ecc<jb> b = drd.e;
   private static final Map<jb, fgk> c = fgh.c(dnc.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alh<dnc> d;
   private final alh<dnc> e;
   private final alh<czu> f;

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   protected dmd(alh<dnc> $$0, alh<dnc> $$1, alh<czu> $$2, ebd.d $$3) {
      super($$3);
      this.l(this.C.b().b(b, jb.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dnc> $$8 = $$1.J_().f(mh.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dvi.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(dne.cN);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy((djw)DataFixUtils.orElse($$0.J_().f(mh.K).f(this.f), this));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}
