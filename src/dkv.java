import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dkv extends dme {
   public static final MapCodec<dkv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a(mg.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               ald.a(mg.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               ald.a(mg.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dkv::new)
   );
   public static final eam<ja> b = dpt.e;
   private static final Map<ja, feq> c = fen.c(dlu.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final ald<dlu> d;
   private final ald<dlu> e;
   private final ald<cyo> f;

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   protected dkv(ald<dlu> $$0, ald<dlu> $$1, ald<cyo> $$2, dzn.d $$3) {
      super($$3);
      this.l(this.B.b().b(b, ja.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dlu> $$8 = $$1.F_().f(mg.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dtw.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(dlw.cK);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys((dio)DataFixUtils.orElse($$0.F_().f(mg.K).f(this.f), this));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}
