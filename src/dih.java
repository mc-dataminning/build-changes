import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dih(jk<dgx> c, buh d) implements dif {
   public static final MapCodec<dih> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jv.a(mi.aR).fieldOf("enchantments").forGetter(dih::b), buh.c.fieldOf("cost").forGetter(dih::c)).apply($$0, dih::new)
   );

   @Override
   public void a(dak $$0, dhd.a $$1, bai $$2, bva $$3) {
      for (dha $$5 : dgz.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dih> a() {
      return b;
   }

   public jk<dgx> b() {
      return this.c;
   }

   public buh c() {
      return this.d;
   }
}
