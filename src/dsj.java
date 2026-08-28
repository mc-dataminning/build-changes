import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsj extends dlt {
   public static final MapCodec<dsj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dsj::new)
   );
   public static final eay d = eax.A;

   @Override
   public MapCodec<dsj> a() {
      return c;
   }

   protected dsj(eaw $$0, eag.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(eah $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected eah a(eah $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dja $$0, iu $$1) {
      Class<? extends bwf> $$2 = switch (this.b.f()) {
         case a -> bwf.class;
         case b -> bxe.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d);
   }
}
