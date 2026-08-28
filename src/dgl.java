import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dgl(int f, int g, List<dgn> h, dgn i, dgn j) implements dgh {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dgl::b),
               Codec.INT.fieldOf("height").forGetter(dgl::c),
               dgn.a.listOf().fieldOf("ingredients").forGetter(dgl::f),
               dgn.a.fieldOf("result").forGetter(dgl::d),
               dgn.a.fieldOf("crafting_station").forGetter(dgl::e)
            )
            .apply($$0, dgl::new)
   );
   public static final ze<wp, dgl> b = ze.a(zc.h, dgl::b, zc.h, dgl::c, dgn.b.a(zc.a()), dgl::f, dgn.b, dgl::d, dgn.b, dgl::e, dgl::new);
   public static final dgh.a<dgl> c = new dgh.a<>(a, b);

   public dgl(int f, int g, List<dgn> h, dgn i, dgn j) {
      if (h.size() != f * g) {
         throw new IllegalArgumentException("Invalid shaped recipe display contents");
      } else {
         this.f = f;
         this.g = g;
         this.h = h;
         this.i = i;
         this.j = j;
      }
   }

   @Override
   public dgh.a<dgl> a() {
      return c;
   }

   @Override
   public boolean a(cvs $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dgh.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dgn> f() {
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
