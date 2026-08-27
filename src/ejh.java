import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejh extends eir {
   public static final Codec<ejh> a = RecordCodecBuilder.create($$0 -> a($$0).and(tm.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ejh::new));
   private final so b;

   private ejh(List<eke> $$0, so $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eit b() {
      return eiu.g;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eir.a<?> a(so $$0) {
      return a($$1 -> new ejh($$1, $$0));
   }
}
