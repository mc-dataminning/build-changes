import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daw extends cuo {
   public static final MapCodec<daw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, daw::new)
   );
   public static final dhz f = dhy.w;

   @Override
   public MapCodec<daw> a() {
      return e;
   }

   protected daw(dhx $$0, dhh.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dhi $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dhi a(dhi $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(csa $$0, ht $$1) {
      Class<? extends bkq> $$2 = switch (this.d.e()) {
         case a -> bkq.class;
         case b -> blg.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f);
   }
}
