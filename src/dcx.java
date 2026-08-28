import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcx(js<dbn> c, bqx d) implements dcv {
   public static final MapCodec<dcx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.a(lw.aN).fieldOf("enchantments").forGetter(dcx::b), bqx.c.fieldOf("cost").forGetter(dcx::c)).apply($$0, dcx::new)
   );

   @Override
   public void a(cvs $$0, dbt.a $$1, azn $$2, brq $$3) {
      for (dbq $$5 : dbp.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dcx> a() {
      return b;
   }

   public js<dbn> b() {
      return this.c;
   }

   public bqx c() {
      return this.d;
   }
}
