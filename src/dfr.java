import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfr(ji<bvc> d, dfm e, dfm f, dfm g, dfm h) implements dfw {
   public static final MapCodec<dfr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.W).fieldOf("to_apply").forGetter(dfr::b),
               dfm.b.fieldOf("min_duration").forGetter(dfr::c),
               dfm.b.fieldOf("max_duration").forGetter(dfr::d),
               dfm.b.fieldOf("min_amplifier").forGetter(dfr::e),
               dfm.b.fieldOf("max_amplifier").forGetter(dfr::f)
            )
            .apply($$0, dfr::new)
   );

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      if ($$3 instanceof bwz $$5) {
         azt $$6 = $$5.dY();
         Optional<je<bvc>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azk.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azk.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bve($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   public ji<bvc> b() {
      return this.d;
   }

   public dfm c() {
      return this.e;
   }

   public dfm d() {
      return this.f;
   }

   public dfm e() {
      return this.g;
   }

   public dfm f() {
      return this.h;
   }
}
