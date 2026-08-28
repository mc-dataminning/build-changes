import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dln extends dvy {
   public static final MapCodec<dln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mh.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alf.a(mh.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alf.a(mh.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dln::new)
   );
   public static final ebm<jb> b = dqn.e;
   private static final Map<jb, ffr> c = ffo.c(dmm.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alf<dmm> d;
   private final alf<dmm> e;
   private final alf<czg> f;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   protected dln(alf<dmm> $$0, alf<dmm> $$1, alf<czg> $$2, ean.d $$3) {
      super($$3);
      this.l(this.C.b().b(b, jb.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dmm> $$8 = $$1.F_().f(mh.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dus.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(dmo.cN);
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk((djg)DataFixUtils.orElse($$0.F_().f(mh.K).f(this.f), this));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }
}
