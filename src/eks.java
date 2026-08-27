import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eks extends ekh {
   public static final Codec<eks> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(auo.b(kg.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eks::new)
   );
   private final auo<cor> b;

   private eks(List<elu> $$0, auo<cor> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekj b() {
      return ekk.A;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      cos.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static ekh.a<?> a(auo<cor> $$0) {
      return a($$1 -> new eks($$1, $$0));
   }
}
