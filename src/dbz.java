import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbz(dbt d, dbt e, jp<bsr> f) implements dcd {
   public static final MapCodec<dbz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbt.b.fieldOf("min_damage").forGetter(dbz::b), dbt.b.fieldOf("max_damage").forGetter(dbz::c), bsr.b.fieldOf("damage_type").forGetter(dbz::d)
            )
            .apply($$0, dbz::new)
   );

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      float $$5 = azj.b($$3.ea(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bsp(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbt b() {
      return this.d;
   }

   public dbt c() {
      return this.e;
   }

   public jp<bsr> d() {
      return this.f;
   }
}
