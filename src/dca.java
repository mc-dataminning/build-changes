import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dca(dbu d, dbu e, jo<bsl> f) implements dce {
   public static final MapCodec<dca> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbu.b.fieldOf("min_damage").forGetter(dca::b), dbu.b.fieldOf("max_damage").forGetter(dca::c), bsl.b.fieldOf("damage_type").forGetter(dca::d)
            )
            .apply($$0, dca::new)
   );

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      float $$5 = azf.b($$3.dV(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bsj(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dbu b() {
      return this.d;
   }

   public dbu c() {
      return this.e;
   }

   public jo<bsl> d() {
      return this.f;
   }
}
