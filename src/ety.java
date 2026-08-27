import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public class ety extends eta {
   public static final Codec<xe> a = axu.b(xg.a, (Function<xe, DataResult<xe>>)($$0 -> cya.h.encodeStart(ayf.a, $$0).map($$1 -> $$0)));
   public static final Codec<ety> b = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(cya.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), esz.a(100).forGetter($$0x -> $$0x.d))).apply($$0, ety::new)
   );
   private final List<ark<xe>> c;
   private final esz d;

   protected ety(List<euu> $$0, List<ark<xe>> $$1, esz $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.H, cya.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cya a(cya $$0) {
      List<ark<xe>> $$1 = this.d.a($$0.a(), this.c, 100);
      return $$0.b($$1);
   }

   @Override
   public etc b() {
      return etd.K;
   }
}
