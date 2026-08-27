import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deo extends cyg {
   public static final MapCodec<deo> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dly.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, deo::new)
   );
   public static final dma f = dlz.w;

   @Override
   public MapCodec<deo> a() {
      return e;
   }

   protected deo(dly $$0, dli.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dlj $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dlj a(dlj $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cvr $$0, hz $$1) {
      Class<? extends bnq> $$2 = switch (this.d.f()) {
         case a -> bnq.class;
         case b -> boi.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f);
   }
}
