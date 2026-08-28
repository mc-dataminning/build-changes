import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exn(float b, dbt c, jp<dbm> g) implements exh {
   public static final MapCodec<exn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(exn::c),
               dbt.b.fieldOf("enchanted_chance").forGetter(exn::d),
               dbm.c.fieldOf("enchantment").forGetter(exn::e)
            )
            .apply($$0, exn::new)
   );

   @Override
   public exi b() {
      return exj.e;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.d);
   }

   public boolean a(etw $$0) {
      btz $$1 = $$0.c(ews.d);
      int $$3 = $$1 instanceof buv $$2 ? dbo.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static exh.a a(jr.a $$0, float $$1, float $$2) {
      jr.b<dbm> $$3 = $$0.d(ly.aM);
      return () -> new exn($$1, new dbt.e($$1 + $$2, $$2), $$3.b(dbr.s));
   }

   public float c() {
      return this.b;
   }

   public dbt d() {
      return this.c;
   }

   public jp<dbm> e() {
      return this.g;
   }
}
