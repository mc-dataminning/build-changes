import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fcy extends fcg {
   public static final MapCodec<fcy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fez.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fcy::new)
   );
   private final fey b;
   private final boolean c;

   private fcy(List<fec> $$0, fey $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fci<fcy> b() {
      return fcj.e;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.a();
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static fcg.a<?> a(fey $$0) {
      return a($$1 -> new fcy($$1, $$0, false));
   }

   public static fcg.a<?> a(fey $$0, boolean $$1) {
      return a($$2 -> new fcy($$2, $$0, $$1));
   }
}
