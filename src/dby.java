import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dby(jt<btc> d, dbt e, dbt f, dbt g, dbt h) implements dcd {
   public static final MapCodec<dby> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ke.a(ly.W).fieldOf("to_apply").forGetter(dby::b),
               dbt.b.fieldOf("min_duration").forGetter(dby::c),
               dbt.b.fieldOf("max_duration").forGetter(dby::d),
               dbt.b.fieldOf("min_amplifier").forGetter(dby::e),
               dbt.b.fieldOf("max_amplifier").forGetter(dby::f)
            )
            .apply($$0, dby::new)
   );

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      if ($$3 instanceof buv $$5) {
         azr $$6 = $$5.ea();
         Optional<jp<btc>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azj.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azj.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bte($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public jt<btc> b() {
      return this.d;
   }

   public dbt c() {
      return this.e;
   }

   public dbt d() {
      return this.f;
   }

   public dbt e() {
      return this.g;
   }

   public dbt f() {
      return this.h;
   }
}
