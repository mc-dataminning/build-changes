import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dda extends cua implements dcz {
   public static final MapCodec<dda> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcz.a.e.fieldOf("weathering_state").forGetter(cvb::c), t()).apply($$0, dda::new)
   );
   private final dcz.a e;

   @Override
   public MapCodec<dda> a() {
      return d;
   }

   public dda(dcz.a $$0, dga.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dgb $$0) {
      return dcz.c($$0.b()).isPresent();
   }

   public dcz.a g() {
      return this.e;
   }
}
