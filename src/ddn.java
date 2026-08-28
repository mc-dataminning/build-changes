import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddn(ddg d, ddg e, jr<btc> f) implements ddq {
   public static final MapCodec<ddn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddg.b.fieldOf("min_damage").forGetter(ddn::b), ddg.b.fieldOf("max_damage").forGetter(ddn::c), btc.b.fieldOf("damage_type").forGetter(ddn::d)
            )
            .apply($$0, ddn::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      float $$5 = ayz.b($$3.dZ(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bta(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   public ddg b() {
      return this.d;
   }

   public ddg c() {
      return this.e;
   }

   public jr<btc> d() {
      return this.f;
   }
}
