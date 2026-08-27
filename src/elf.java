import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elf extends eko {
   public static final Codec<elf> a = RecordCodecBuilder.create($$0 -> a($$0).and(kf.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, elf::new));
   private final ij<cqz> b;

   private elf(List<emb> $$0, ij<cqz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekq b() {
      return ekr.z;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      crb.a($$0, this.b);
      return $$0;
   }

   public static eko.a<?> a(ij<cqz> $$0) {
      return a($$1 -> new elf($$1, $$0));
   }
}
