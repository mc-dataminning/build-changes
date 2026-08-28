import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgk(dge d) implements dgo {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dge.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dgk::new));

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      czk $$5 = $$2.a();
      if ($$5.c(kk.d) && $$5.c(kk.e)) {
         arr $$7 = $$2.c() instanceof arr $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dge b() {
      return this.d;
   }
}
