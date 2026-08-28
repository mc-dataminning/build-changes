import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgq(dgn f, dgn g, dgn h, dgn i, dgn j) implements dgh {
   public static final MapCodec<dgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgn.a.fieldOf("template").forGetter(dgq::b),
               dgn.a.fieldOf("base").forGetter(dgq::c),
               dgn.a.fieldOf("addition").forGetter(dgq::f),
               dgn.a.fieldOf("result").forGetter(dgq::d),
               dgn.a.fieldOf("crafting_station").forGetter(dgq::e)
            )
            .apply($$0, dgq::new)
   );
   public static final ze<wp, dgq> b = ze.a(dgn.b, dgq::b, dgn.b, dgq::c, dgn.b, dgq::f, dgn.b, dgq::d, dgn.b, dgq::e, dgq::new);
   public static final dgh.a<dgq> c = new dgh.a<>(a, b);

   @Override
   public dgh.a<dgq> a() {
      return c;
   }

   public dgn b() {
      return this.f;
   }

   public dgn c() {
      return this.g;
   }

   public dgn f() {
      return this.h;
   }

   @Override
   public dgn d() {
      return this.i;
   }

   @Override
   public dgn e() {
      return this.j;
   }
}
