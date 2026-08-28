import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfx(ji<bvf> d, dfs e, dfs f, dfs g, dfs h) implements dgc {
   public static final MapCodec<dfx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.W).fieldOf("to_apply").forGetter(dfx::b),
               dfs.b.fieldOf("min_duration").forGetter(dfx::c),
               dfs.b.fieldOf("max_duration").forGetter(dfx::d),
               dfs.b.fieldOf("min_amplifier").forGetter(dfx::e),
               dfs.b.fieldOf("max_amplifier").forGetter(dfx::f)
            )
            .apply($$0, dfx::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      if ($$3 instanceof bxc $$5) {
         azv $$6 = $$5.dY();
         Optional<je<bvf>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azm.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azm.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bvh($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   public ji<bvf> b() {
      return this.d;
   }

   public dfs c() {
      return this.e;
   }

   public dfs d() {
      return this.f;
   }

   public dfs e() {
      return this.g;
   }

   public dfs f() {
      return this.h;
   }
}
