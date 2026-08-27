import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxy extends dyl {
   public static final Codec<dxy> a = RecordCodecBuilder.create($$0 -> $$0.group(dpw.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dxy::new));
   private final dpw c;

   private dxy(dpw $$0) {
      this.c = $$0;
   }

   public static dxy a(dpw $$0) {
      return new dxy($$0);
   }

   @Override
   protected boolean a(dyk $$0, auu $$1, hx $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dyn<?> b() {
      return dyn.a;
   }
}
