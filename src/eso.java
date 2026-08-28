import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eso extends erv {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eup.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eso::new)
   );
   private final euo b;
   private final boolean c;

   private eso(List<ett> $$0, euo $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erx<eso> b() {
      return ery.e;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      int $$2 = this.c ? $$0.I() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static erv.a<?> a(euo $$0) {
      return a($$1 -> new eso($$1, $$0, false));
   }

   public static erv.a<?> a(euo $$0, boolean $$1) {
      return a($$2 -> new eso($$2, $$0, $$1));
   }
}
