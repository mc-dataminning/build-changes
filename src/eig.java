import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eig extends ehq {
   public static final Codec<eig> a = RecordCodecBuilder.create($$0 -> a($$0).and(th.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eig::new));
   private final sj b;

   private eig(List<ejd> $$0, sj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ehs b() {
      return eht.g;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static ehq.a<?> a(sj $$0) {
      return a($$1 -> new eig($$1, $$0));
   }
}
