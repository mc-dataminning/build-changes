import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eku extends elh {
   public static final MapCodec<eku> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecq.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eku::new)
   );
   private final ecq c;

   private eku(ecq $$0) {
      this.c = $$0;
   }

   public static eku a(ecq $$0) {
      return new eku($$0);
   }

   @Override
   protected boolean a(elg $$0, azv $$1, jh $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public elj<?> b() {
      return elj.a;
   }
}
