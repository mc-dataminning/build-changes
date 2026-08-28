import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgr(dgn f, dgn g, dgn h) implements dgh {
   public static final MapCodec<dgr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgn.a.fieldOf("input").forGetter(dgr::b), dgn.a.fieldOf("result").forGetter(dgr::d), dgn.a.fieldOf("crafting_station").forGetter(dgr::e))
            .apply($$0, dgr::new)
   );
   public static final ze<wp, dgr> b = ze.a(dgn.b, dgr::b, dgn.b, dgr::d, dgn.b, dgr::e, dgr::new);
   public static final dgh.a<dgr> c = new dgh.a<>(a, b);

   @Override
   public dgh.a<dgr> a() {
      return c;
   }

   public dgn b() {
      return this.f;
   }

   @Override
   public dgn d() {
      return this.g;
   }

   @Override
   public dgn e() {
      return this.h;
   }
}
