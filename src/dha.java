import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dha(ji<dfq> c, bti d) implements dgy {
   public static final MapCodec<dha> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jt.a(mg.aR).fieldOf("enchantments").forGetter(dha::b), bti.c.fieldOf("cost").forGetter(dha::c)).apply($$0, dha::new)
   );

   @Override
   public void a(czd $$0, dfw.a $$1, azv $$2, bub $$3) {
      for (dft $$5 : dfs.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dha> a() {
      return b;
   }

   public ji<dfq> b() {
      return this.c;
   }

   public bti c() {
      return this.d;
   }
}
