import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class djv extends dle {
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alc.a(me.f).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alc.a(me.f).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alc.a(me.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, djv::new)
   );
   public static final dzk<jo> b = dot.e;
   private static final Map<jo, fdo> c = fdl.c(dku.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alc<dku> d;
   private final alc<dku> e;
   private final alc<cxu> f;

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(alc<dku> $$0, alc<dku> $$1, alc<cxu> $$2, dyl.d $$3) {
      super($$3);
      this.l(this.B.b().b(b, jo.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dku> $$8 = $$1.F_().f(me.f).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dsw.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(dkw.cK);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy((dho)DataFixUtils.orElse($$0.F_().f(me.K).f(this.f), this));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }
}
