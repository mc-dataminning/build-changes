import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dub extends duo {
   public static final Codec<dub> a = RecordCodecBuilder.create($$0 -> $$0.group(dlz.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dub::new));
   private final dlz c;

   private dub(dlz $$0) {
      this.c = $$0;
   }

   public static dub a(dlz $$0) {
      return new dub($$0);
   }

   @Override
   protected boolean a(dun $$0, asc $$1, gw $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public duq<?> b() {
      return duq.a;
   }
}
