import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfz(int f, int g, List<dgb> h, dgb i, dgb j) implements dfv {
   public static final MapCodec<dfz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dfz::b),
               Codec.INT.fieldOf("height").forGetter(dfz::c),
               dgb.a.listOf().fieldOf("ingredients").forGetter(dfz::f),
               dgb.a.fieldOf("result").forGetter(dfz::d),
               dgb.a.fieldOf("crafting_station").forGetter(dfz::e)
            )
            .apply($$0, dfz::new)
   );
   public static final yy<wl, dfz> b = yy.a(yw.h, dfz::b, yw.h, dfz::c, dgb.b.a(yw.a()), dfz::f, dgb.b, dfz::d, dgb.b, dfz::e, dfz::new);
   public static final dfv.a<dfz> c = new dfv.a<>(a, b);

   public dfz(int f, int g, List<dgb> h, dgb i, dgb j) {
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
   public dfv.a<dfz> a() {
      return c;
   }

   @Override
   public boolean a(cvh $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dfv.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dgb> f() {
      return this.h;
   }

   @Override
   public dgb d() {
      return this.i;
   }

   @Override
   public dgb e() {
      return this.j;
   }
}
