import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eil extends eiz {
   public static final Codec<eil> a = RecordCodecBuilder.create($$0 -> $$0.group(eab.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eil::new));
   private final eab c;

   private eil(eab $$0) {
      this.c = $$0;
   }

   public static eil a(eab $$0) {
      return new eil($$0);
   }

   @Override
   protected boolean a(eiy $$0, ayt $$1, ir $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ejb<?> b() {
      return ejb.a;
   }
}
