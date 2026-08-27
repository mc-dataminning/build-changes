import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emx extends emg {
   public static final Codec<emx> a = RecordCodecBuilder.create($$0 -> a($$0).and(ki.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, emx::new));
   private final il<csh> b;

   private emx(List<ent> $$0, il<csh> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emi b() {
      return emj.z;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      csj.a($$0, this.b);
      return $$0;
   }

   public static emg.a<?> a(il<csh> $$0) {
      return a($$1 -> new emx($$1, $$0));
   }
}
