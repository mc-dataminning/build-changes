import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efk extends eeu {
   public static final Codec<efk> a = RecordCodecBuilder.create($$0 -> a($$0).and(so.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, efk::new));
   private final rt b;

   private efk(List<egh> $$0, rt $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eew b() {
      return eex.g;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eeu.a<?> a(rt $$0) {
      return a($$1 -> new efk($$1, $$0));
   }
}
