import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dgb(int f, int g, List<dgd> h, dgd i, dgd j) implements dfx {
   public static final MapCodec<dgb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dgb::b),
               Codec.INT.fieldOf("height").forGetter(dgb::c),
               dgd.a.listOf().fieldOf("ingredients").forGetter(dgb::f),
               dgd.a.fieldOf("result").forGetter(dgb::d),
               dgd.a.fieldOf("crafting_station").forGetter(dgb::e)
            )
            .apply($$0, dgb::new)
   );
   public static final za<wn, dgb> b = za.a(yy.h, dgb::b, yy.h, dgb::c, dgd.b.a(yy.a()), dgb::f, dgd.b, dgb::d, dgd.b, dgb::e, dgb::new);
   public static final dfx.a<dgb> c = new dfx.a<>(a, b);

   public dgb(int f, int g, List<dgd> h, dgd i, dgd j) {
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
   public dfx.a<dgb> a() {
      return c;
   }

   @Override
   public boolean a(cvj $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dfx.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dgd> f() {
      return this.h;
   }

   @Override
   public dgd d() {
      return this.i;
   }

   @Override
   public dgd e() {
      return this.j;
   }
}
