import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dco(int f, int g, List<dcq> h, dcq i, dcq j) implements dck {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dco::b),
               Codec.INT.fieldOf("height").forGetter(dco::c),
               dcq.a.listOf().fieldOf("ingredients").forGetter(dco::f),
               dcq.a.fieldOf("result").forGetter(dco::d),
               dcq.a.fieldOf("crafting_station").forGetter(dco::e)
            )
            .apply($$0, dco::new)
   );
   public static final yn<wa, dco> b = yn.a(yl.h, dco::b, yl.h, dco::c, dcq.b.a(yl.a()), dco::f, dcq.b, dco::d, dcq.b, dco::e, dco::new);
   public static final dck.a<dco> c = new dck.a<>(a, b);

   public dco(int f, int g, List<dcq> h, dcq i, dcq j) {
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
   public dck.a<dco> a() {
      return c;
   }

   @Override
   public boolean a(cru $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dck.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dcq> f() {
      return this.h;
   }

   @Override
   public dcq d() {
      return this.i;
   }

   @Override
   public dcq e() {
      return this.j;
   }
}
