import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emz extends emi {
   public static final Codec<emz> a = RecordCodecBuilder.create($$0 -> a($$0).and(ki.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, emz::new));
   private final il<csj> b;

   private emz(List<env> $$0, il<csj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emk b() {
      return eml.z;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      csl.a($$0, this.b);
      return $$0;
   }

   public static emi.a<?> a(il<csj> $$0) {
      return a($$1 -> new emz($$1, $$0));
   }
}
