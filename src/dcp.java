import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcp(List<dcq> f, dcq g, dcq h) implements dck {
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcq.a.listOf().fieldOf("ingredients").forGetter(dcp::b),
               dcq.a.fieldOf("result").forGetter(dcp::d),
               dcq.a.fieldOf("crafting_station").forGetter(dcp::e)
            )
            .apply($$0, dcp::new)
   );
   public static final yn<wa, dcp> b = yn.a(dcq.b.a(yl.a()), dcp::b, dcq.b, dcp::d, dcq.b, dcp::e, dcp::new);
   public static final dck.a<dcp> c = new dck.a<>(a, b);

   @Override
   public dck.a<dcp> a() {
      return c;
   }

   @Override
   public boolean a(cru $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dck.super.a($$0);
   }

   public List<dcq> b() {
      return this.f;
   }

   @Override
   public dcq d() {
      return this.g;
   }

   @Override
   public dcq e() {
      return this.h;
   }
}
