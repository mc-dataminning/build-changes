import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eis extends eib {
   public static final Codec<eis> a = RecordCodecBuilder.create($$0 -> a($$0).and(kd.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eis::new));
   private final ih<cop> b;

   private eis(List<ejo> $$0, ih<cop> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eid b() {
      return eie.z;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      cor.a($$0, this.b.a());
      return $$0;
   }

   public static eib.a<?> a(cop $$0) {
      return a($$1 -> new eis($$1, $$0.c()));
   }
}
