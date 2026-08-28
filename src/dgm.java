import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dgm(List<dgn> f, dgn g, dgn h) implements dgh {
   public static final MapCodec<dgm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgn.a.listOf().fieldOf("ingredients").forGetter(dgm::b),
               dgn.a.fieldOf("result").forGetter(dgm::d),
               dgn.a.fieldOf("crafting_station").forGetter(dgm::e)
            )
            .apply($$0, dgm::new)
   );
   public static final ze<wp, dgm> b = ze.a(dgn.b.a(zc.a()), dgm::b, dgn.b, dgm::d, dgn.b, dgm::e, dgm::new);
   public static final dgh.a<dgm> c = new dgh.a<>(a, b);

   @Override
   public dgh.a<dgm> a() {
      return c;
   }

   @Override
   public boolean a(cvs $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dgh.super.a($$0);
   }

   public List<dgn> b() {
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
