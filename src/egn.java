import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egn extends efx {
   public static final Codec<egn> a = RecordCodecBuilder.create($$0 -> a($$0).and(sx.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, egn::new));
   private final rz b;

   private egn(List<ehk> $$0, rz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public efz b() {
      return ega.g;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static efx.a<?> a(rz $$0) {
      return a($$1 -> new egn($$1, $$0));
   }
}
