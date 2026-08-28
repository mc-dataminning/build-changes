import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsv extends dmf {
   public static final MapCodec<dsv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebi.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dsv::new)
   );
   public static final ebk d = ebj.A;

   @Override
   public MapCodec<dsv> a() {
      return c;
   }

   protected dsv(ebi $$0, eas.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(eat $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected eat a(eat $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(djm $$0, iv $$1) {
      Class<? extends bwi> $$2 = switch (this.b.f()) {
         case a -> bwi.class;
         case b -> bxj.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d);
   }
}
