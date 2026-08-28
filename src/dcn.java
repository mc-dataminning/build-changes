import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcn(int f, int g, List<dcp> h, dcp i, dcp j) implements dcj {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dcn::b),
               Codec.INT.fieldOf("height").forGetter(dcn::c),
               dcp.a.listOf().fieldOf("ingredients").forGetter(dcn::f),
               dcp.a.fieldOf("result").forGetter(dcn::d),
               dcp.a.fieldOf("crafting_station").forGetter(dcn::e)
            )
            .apply($$0, dcn::new)
   );
   public static final yn<wa, dcn> b = yn.a(yl.h, dcn::b, yl.h, dcn::c, dcp.b.a(yl.a()), dcn::f, dcp.b, dcn::d, dcp.b, dcn::e, dcn::new);
   public static final dcj.a<dcn> c = new dcj.a<>(a, b);

   public dcn(int f, int g, List<dcp> h, dcp i, dcp j) {
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
   public dcj.a<dcn> a() {
      return c;
   }

   @Override
   public boolean a(crt $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dcj.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dcp> f() {
      return this.h;
   }

   @Override
   public dcp d() {
      return this.i;
   }

   @Override
   public dcp e() {
      return this.j;
   }
}
