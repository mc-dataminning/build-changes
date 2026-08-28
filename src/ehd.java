import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehd extends ehq {
   public static final MapCodec<ehd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzb.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehd::new)
   );
   private final dzb c;

   private ehd(dzb $$0) {
      this.c = $$0;
   }

   public static ehd a(dzb $$0) {
      return new ehd($$0);
   }

   @Override
   protected boolean a(ehp $$0, azh $$1, iz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ehs<?> b() {
      return ehs.a;
   }
}
