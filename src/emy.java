import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emy extends emi {
   public static final Codec<emy> a = RecordCodecBuilder.create($$0 -> a($$0).and(ty.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, emy::new));
   private final ta b;

   private emy(List<env> $$0, ta $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emk b() {
      return eml.g;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      $$0.x().a(this.b);
      return $$0;
   }

   @Deprecated
   public static emi.a<?> a(ta $$0) {
      return a($$1 -> new emy($$1, $$0));
   }
}
