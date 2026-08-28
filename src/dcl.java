import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcl(int f, int g, List<dcn> h, dcn i, dcn j) implements dch {
   public static final MapCodec<dcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dcl::b),
               Codec.INT.fieldOf("height").forGetter(dcl::c),
               dcn.a.listOf().fieldOf("ingredients").forGetter(dcl::f),
               dcn.a.fieldOf("result").forGetter(dcl::d),
               dcn.a.fieldOf("crafting_station").forGetter(dcl::e)
            )
            .apply($$0, dcl::new)
   );
   public static final ym<vz, dcl> b = ym.a(yk.h, dcl::b, yk.h, dcl::c, dcn.b.a(yk.a()), dcl::f, dcn.b, dcl::d, dcn.b, dcl::e, dcl::new);
   public static final dch.a<dcl> c = new dch.a<>(a, b);

   public dcl(int f, int g, List<dcn> h, dcn i, dcn j) {
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
   public dch.a<dcl> a() {
      return c;
   }

   @Override
   public boolean a(crr $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dch.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dcn> f() {
      return this.h;
   }

   @Override
   public dcn d() {
      return this.i;
   }

   @Override
   public dcn e() {
      return this.j;
   }
}
