import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eoz extends eoo {
   public static final Codec<eoz> a = RecordCodecBuilder.create($$0 -> a($$0).and(uk.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eoz::new));
   private final tm b;

   private eoz(List<eqc> $$0, tm $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoq b() {
      return eor.g;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      ctt.a(jp.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eoo.a<?> a(tm $$0) {
      return a($$1 -> new eoz($$1, $$0));
   }
}
