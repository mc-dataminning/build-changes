import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ele extends eko {
   public static final Codec<ele> a = RecordCodecBuilder.create($$0 -> a($$0).and(tu.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ele::new));
   private final sw b;

   private ele(List<emb> $$0, sw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekq b() {
      return ekr.g;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      $$0.x().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eko.a<?> a(sw $$0) {
      return a($$1 -> new ele($$1, $$0));
   }
}
