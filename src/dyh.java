import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyh extends dyu {
   public static final Codec<dyh> a = RecordCodecBuilder.create($$0 -> $$0.group(dqf.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dyh::new));
   private final dqf c;

   private dyh(dqf $$0) {
      this.c = $$0;
   }

   public static dyh a(dqf $$0) {
      return new dyh($$0);
   }

   @Override
   protected boolean a(dyt $$0, auw $$1, hx $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dyw<?> b() {
      return dyw.a;
   }
}
