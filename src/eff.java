import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eff extends eeu {
   public static final Codec<eff> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arh.b(jz.C).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eff::new)
   );
   private final arh<ckb> b;

   private eff(List<egh> $$0, arh<ckb> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eew b() {
      return eex.A;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      ckc.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eeu.a<?> a(arh<ckb> $$0) {
      return a($$1 -> new eff($$1, $$0));
   }
}
