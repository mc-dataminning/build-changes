import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emw extends emg {
   public static final Codec<emw> a = RecordCodecBuilder.create($$0 -> a($$0).and(ty.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, emw::new));
   private final ta b;

   private emw(List<ent> $$0, ta $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emi b() {
      return emj.g;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      $$0.x().a(this.b);
      return $$0;
   }

   @Deprecated
   public static emg.a<?> a(ta $$0) {
      return a($$1 -> new emw($$1, $$0));
   }
}
