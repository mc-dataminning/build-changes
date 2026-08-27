import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqj extends epo {
   public static final Codec<eqj> a = RecordCodecBuilder.create($$0 -> a($$0).and(lc.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eqj::new));
   private final iv<cua> b;

   private eqj(List<erh> $$0, iv<cua> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epq b() {
      return epr.A;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      $$0.a(jz.x, cuc.a, this.b, cuc::b);
      return $$0;
   }

   public static epo.a<?> a(iv<cua> $$0) {
      return a($$1 -> new eqj($$1, $$0));
   }
}
