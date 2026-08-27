import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eow extends eoo {
   public static final Codec<eow> a = RecordCodecBuilder.create($$0 -> a($$0).and(jm.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eow::new));
   private final jm b;

   private eow(List<eqc> $$0, jm $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoq b() {
      return eor.h;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eoo.a<?> a(jo<T> $$0, T $$1) {
      return a($$2 -> new eow($$2, jm.a().a($$0, $$1).a()));
   }
}
