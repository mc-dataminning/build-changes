import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqb extends eqo {
   public static final MapCodec<eqb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehu.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eqb::new)
   );
   private final ehu c;

   private eqb(ehu $$0) {
      this.c = $$0;
   }

   public static eqb a(ehu $$0) {
      return new eqb($$0);
   }

   @Override
   protected boolean a(eqn $$0, azv $$1, iv $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eqq<?> b() {
      return eqq.a;
   }
}
