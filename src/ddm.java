import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddm(ddf d, ddf e, jr<btc> f) implements ddp {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddf.b.fieldOf("min_damage").forGetter(ddm::b), ddf.b.fieldOf("max_damage").forGetter(ddm::c), btc.b.fieldOf("damage_type").forGetter(ddm::d)
            )
            .apply($$0, ddm::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      float $$5 = ayz.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bta(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public ddf b() {
      return this.d;
   }

   public ddf c() {
      return this.e;
   }

   public jr<btc> d() {
      return this.f;
   }
}
