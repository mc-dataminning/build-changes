import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddg(ju<dbw> c, brm d) implements dde {
   public static final MapCodec<ddg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(ma.aM).fieldOf("enchantments").forGetter(ddg::b), brm.c.fieldOf("cost").forGetter(ddg::c)).apply($$0, ddg::new)
   );

   @Override
   public void a(cwf $$0, dcc.a $$1, azv $$2, bsf $$3) {
      for (dbz $$5 : dby.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<ddg> a() {
      return b;
   }

   public ju<dbw> b() {
      return this.c;
   }

   public brm c() {
      return this.d;
   }
}
