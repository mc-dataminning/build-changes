import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class een extends edx {
   public static final Codec<een> a = RecordCodecBuilder.create($$0 -> a($$0).and(ro.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, een::new));
   private final qu b;

   private een(List<efk> $$0, qu $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edz b() {
      return eea.g;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static edx.a<?> a(qu $$0) {
      return a($$1 -> new een($$1, $$0));
   }
}
