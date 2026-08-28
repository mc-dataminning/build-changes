import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dlb extends dvj {
   public static final MapCodec<dlb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mg.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alf.a(mg.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alf.a(mg.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dlb::new)
   );
   public static final eax<ja> b = dqa.e;
   private static final Map<ja, ffc> c = fez.c(dma.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alf<dma> d;
   private final alf<dma> e;
   private final alf<cyu> f;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   protected dlb(alf<dma> $$0, alf<dma> $$1, alf<cyu> $$2, dzy.d $$3) {
      super($$3);
      this.l(this.B.b().b(b, ja.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dma> $$8 = $$1.F_().f(mg.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(due.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(dmc.cL);
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy((diu)DataFixUtils.orElse($$0.F_().f(mg.K).f(this.f), this));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }
}
