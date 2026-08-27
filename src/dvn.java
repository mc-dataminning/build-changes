import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvn extends dvg {
   public static final Codec<dvn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dvn::new)
   );
   private final int c;

   private dvn(int $$0) {
      this.c = $$0;
   }

   public static dvn a(int $$0) {
      return new dvn($$0);
   }

   @Override
   protected boolean a(dvf $$0, ate $$1, ht $$2) {
      int $$3 = $$0.a(dlk.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dlk.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dvi<?> b() {
      return dvi.d;
   }
}
