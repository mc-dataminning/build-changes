import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dao(daj d, daj e, jm<brm> f) implements das {
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               daj.b.fieldOf("min_damage").forGetter(dao::b), daj.b.fieldOf("max_damage").forGetter(dao::c), brm.b.fieldOf("damage_type").forGetter(dao::d)
            )
            .apply($$0, dao::new)
   );

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exa $$4) {
      float $$5 = ayo.b($$3.dS(), this.d.a($$1), this.e.a($$1));
      $$3.a(new brk(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   public daj b() {
      return this.d;
   }

   public daj c() {
      return this.e;
   }

   public jm<brm> d() {
      return this.f;
   }
}
