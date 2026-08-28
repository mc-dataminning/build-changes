import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record def(ddy d, ddy e, jr<btr> f) implements dei {
   public static final MapCodec<def> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddy.b.fieldOf("min_damage").forGetter(def::b), ddy.b.fieldOf("max_damage").forGetter(def::c), btr.b.fieldOf("damage_type").forGetter(def::d)
            )
            .apply($$0, def::new)
   );

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      float $$5 = ayz.b($$3.dX(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new btp(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public ddy b() {
      return this.d;
   }

   public ddy c() {
      return this.e;
   }

   public jr<btr> d() {
      return this.f;
   }
}
