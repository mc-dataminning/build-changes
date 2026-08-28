import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dek(jv<dda> c, brq d) implements dei {
   public static final MapCodec<dek> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.aO).fieldOf("enchantments").forGetter(dek::b), brq.c.fieldOf("cost").forGetter(dek::c)).apply($$0, dek::new)
   );

   @Override
   public void a(cwq $$0, ddg.a $$1, azh $$2, bsj $$3) {
      for (ddd $$5 : ddc.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dek> a() {
      return b;
   }

   public jv<dda> b() {
      return this.c;
   }

   public brq c() {
      return this.d;
   }
}
