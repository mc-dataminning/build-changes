import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehq extends eid {
   public static final MapCodec<ehq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzn.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehq::new)
   );
   private final dzn c;

   private ehq(dzn $$0) {
      this.c = $$0;
   }

   public static ehq a(dzn $$0) {
      return new ehq($$0);
   }

   @Override
   protected boolean a(eic $$0, ayo $$1, ja $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eif<?> b() {
      return eif.a;
   }
}
