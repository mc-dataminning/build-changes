import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewh extends evp {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyk.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ewh::new)
   );
   private final eyj b;
   private final boolean c;

   private ewh(List<exn> $$0, eyj $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evr<ewh> b() {
      return evs.e;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.a();
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static evp.a<?> a(eyj $$0) {
      return a($$1 -> new ewh($$1, $$0, false));
   }

   public static evp.a<?> a(eyj $$0, boolean $$1) {
      return a($$2 -> new ewh($$2, $$0, $$1));
   }
}
