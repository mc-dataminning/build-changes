import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgx(je<dfl> c, btg d) implements dgt {
   public static final MapCodec<dgx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfl.c.fieldOf("enchantment").forGetter(dgx::b), btg.c.fieldOf("level").forGetter(dgx::c)).apply($$0, dgx::new)
   );

   @Override
   public void a(cyy $$0, dfr.a $$1, azv $$2, btz $$3) {
      $$1.b(this.c, azm.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dgx> a() {
      return b;
   }

   public je<dfl> b() {
      return this.c;
   }

   public btg c() {
      return this.d;
   }
}
