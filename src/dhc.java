import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhc(je<dfq> c, bti d) implements dgy {
   public static final MapCodec<dhc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfq.c.fieldOf("enchantment").forGetter(dhc::b), bti.c.fieldOf("level").forGetter(dhc::c)).apply($$0, dhc::new)
   );

   @Override
   public void a(czd $$0, dfw.a $$1, azv $$2, bub $$3) {
      $$1.b(this.c, azm.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dhc> a() {
      return b;
   }

   public je<dfq> b() {
      return this.c;
   }

   public bti c() {
      return this.d;
   }
}
