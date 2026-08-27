import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehe extends ego {
   public static final Codec<ehe> a = RecordCodecBuilder.create($$0 -> a($$0).and(tb.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ehe::new));
   private final sd b;

   private ehe(List<eib> $$0, sd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egq b() {
      return egr.g;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static ego.a<?> a(sd $$0) {
      return a($$1 -> new ehe($$1, $$0));
   }
}
