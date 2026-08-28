import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehj extends ehw {
   public static final MapCodec<ehj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzg.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehj::new)
   );
   private final dzg c;

   private ehj(dzg $$0) {
      this.c = $$0;
   }

   public static ehj a(dzg $$0) {
      return new ehj($$0);
   }

   @Override
   protected boolean a(ehv $$0, aym $$1, ja $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ehy<?> b() {
      return ehy.a;
   }
}
