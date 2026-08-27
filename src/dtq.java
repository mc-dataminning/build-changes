import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtq extends dud {
   public static final Codec<dtq> a = RecordCodecBuilder.create($$0 -> $$0.group(dlo.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dtq::new));
   private final dlo c;

   private dtq(dlo $$0) {
      this.c = $$0;
   }

   public static dtq a(dlo $$0) {
      return new dtq($$0);
   }

   @Override
   protected boolean a(duc $$0, art $$1, gv $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public duf<?> b() {
      return duf.a;
   }
}
