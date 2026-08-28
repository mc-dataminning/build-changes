import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgv(ji<dfl> c, btg d) implements dgt {
   public static final MapCodec<dgv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jt.a(mg.aQ).fieldOf("enchantments").forGetter(dgv::b), btg.c.fieldOf("cost").forGetter(dgv::c)).apply($$0, dgv::new)
   );

   @Override
   public void a(cyy $$0, dfr.a $$1, azv $$2, btz $$3) {
      for (dfo $$5 : dfn.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dgv> a() {
      return b;
   }

   public ji<dfl> b() {
      return this.c;
   }

   public btg c() {
      return this.d;
   }
}
