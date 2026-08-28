import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbt(jn<awc> d, bqn e, bqn f) implements dbn {
   public static final MapCodec<dbt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awc.b.fieldOf("sound").forGetter(dbt::b),
               bqn.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dbt::c),
               bqn.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dbt::d)
            )
            .apply($$0, dbt::new)
   );

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      azk $$5 = $$3.dV();
      if (!$$3.ba()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.di(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   public jn<awc> b() {
      return this.d;
   }

   public bqn c() {
      return this.e;
   }

   public bqn d() {
      return this.f;
   }
}
