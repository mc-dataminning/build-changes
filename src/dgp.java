import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgp(ji<dff> c, btd d) implements dgn {
   public static final MapCodec<dgp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jt.a(mg.aP).fieldOf("enchantments").forGetter(dgp::b), btd.c.fieldOf("cost").forGetter(dgp::c)).apply($$0, dgp::new)
   );

   @Override
   public void a(cys $$0, dfl.a $$1, azt $$2, btw $$3) {
      for (dfi $$5 : dfh.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dgp> a() {
      return b;
   }

   public ji<dff> b() {
      return this.c;
   }

   public btd c() {
      return this.d;
   }
}
