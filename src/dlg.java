import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dlg extends dvr {
   public static final MapCodec<dlg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mg.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alf.a(mg.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alf.a(mg.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dlg::new)
   );
   public static final ebf<ja> b = dqg.e;
   private static final Map<ja, ffk> c = ffh.c(dmf.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alf<dmf> d;
   private final alf<dmf> e;
   private final alf<cyz> f;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   protected dlg(alf<dmf> $$0, alf<dmf> $$1, alf<cyz> $$2, eag.d $$3) {
      super($$3);
      this.l(this.C.b().b(b, ja.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dmf> $$8 = $$1.F_().f(mg.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dul.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(dmh.cN);
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd((diz)DataFixUtils.orElse($$0.F_().f(mg.K).f(this.f), this));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }
}
