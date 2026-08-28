import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcm(int f, int g, List<dco> h, dco i, dco j) implements dci {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dcm::b),
               Codec.INT.fieldOf("height").forGetter(dcm::c),
               dco.a.listOf().fieldOf("ingredients").forGetter(dcm::f),
               dco.a.fieldOf("result").forGetter(dcm::d),
               dco.a.fieldOf("crafting_station").forGetter(dcm::e)
            )
            .apply($$0, dcm::new)
   );
   public static final yn<wa, dcm> b = yn.a(yl.h, dcm::b, yl.h, dcm::c, dco.b.a(yl.a()), dcm::f, dco.b, dcm::d, dco.b, dcm::e, dcm::new);
   public static final dci.a<dcm> c = new dci.a<>(a, b);

   public dcm(int f, int g, List<dco> h, dco i, dco j) {
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
   public dci.a<dcm> a() {
      return c;
   }

   @Override
   public boolean a(crs $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dci.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dco> f() {
      return this.h;
   }

   @Override
   public dco d() {
      return this.i;
   }

   @Override
   public dco e() {
      return this.j;
   }
}
