import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czy(czt d, czt e, jj<brc> f) implements dac {
   public static final MapCodec<czy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czt.b.fieldOf("min_damage").forGetter(czy::b), czt.b.fieldOf("max_damage").forGetter(czy::c), brc.b.fieldOf("damage_type").forGetter(czy::d)
            )
            .apply($$0, czy::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      float $$5 = ayg.b($$3.dU(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bra(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   public czt b() {
      return this.d;
   }

   public czt c() {
      return this.e;
   }

   public jj<brc> d() {
      return this.f;
   }
}
