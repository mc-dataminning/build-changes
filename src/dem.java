import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dem(jr<dda> c, brq d) implements dei {
   public static final MapCodec<dem> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dda.c.fieldOf("enchantment").forGetter(dem::b), brq.c.fieldOf("level").forGetter(dem::c)).apply($$0, dem::new)
   );

   @Override
   public void a(cwq $$0, ddg.a $$1, azh $$2, bsj $$3) {
      $$1.b(this.c, ayz.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dem> a() {
      return b;
   }

   public jr<dda> b() {
      return this.c;
   }

   public brq c() {
      return this.d;
   }
}
