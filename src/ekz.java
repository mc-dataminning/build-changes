import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekz extends eko {
   public static final Codec<ekz> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aup.b(kg.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ekz::new)
   );
   private final aup<cov> b;

   private ekz(List<emb> $$0, aup<cov> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekq b() {
      return ekr.A;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      cow.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eko.a<?> a(aup<cov> $$0) {
      return a($$1 -> new ekz($$1, $$0));
   }
}
