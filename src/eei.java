import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eei extends eds {
   public static final Codec<eei> a = RecordCodecBuilder.create($$0 -> a($$0).and(rl.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eei::new));
   private final qr b;

   private eei(List<eff> $$0, qr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edu b() {
      return edv.g;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eds.a<?> a(qr $$0) {
      return a($$1 -> new eei($$1, $$0));
   }
}
