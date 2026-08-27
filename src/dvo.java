import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvo extends dwb {
   public static final Codec<dvo> a = RecordCodecBuilder.create($$0 -> $$0.group(dnm.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dvo::new));
   private final dnm c;

   private dvo(dnm $$0) {
      this.c = $$0;
   }

   public static dvo a(dnm $$0) {
      return new dvo($$0);
   }

   @Override
   protected boolean a(dwa $$0, ato $$1, ht $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dwd<?> b() {
      return dwd.a;
   }
}
