import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egz extends egj {
   public static final Codec<egz> a = RecordCodecBuilder.create($$0 -> a($$0).and(sx.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, egz::new));
   private final rz b;

   private egz(List<ehw> $$0, rz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egl b() {
      return egm.g;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static egj.a<?> a(rz $$0) {
      return a($$1 -> new egz($$1, $$0));
   }
}
