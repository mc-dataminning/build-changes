import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqa extends epo {
   public static final Codec<eqa> a = RecordCodecBuilder.create($$0 -> a($$0).and(uw.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eqa::new));
   private final ty b;

   private eqa(List<erh> $$0, ty $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epq b() {
      return epr.g;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      cuq.a(jz.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static epo.a<?> a(ty $$0) {
      return a($$1 -> new eqa($$1, $$0));
   }
}
