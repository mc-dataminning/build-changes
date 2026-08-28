import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esp extends erw {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euq.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, esp::new)
   );
   private final eup b;
   private final boolean c;

   private esp(List<etu> $$0, eup $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ery<esp> b() {
      return erz.e;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.a();
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      int $$2 = this.c ? $$0.I() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static erw.a<?> a(eup $$0) {
      return a($$1 -> new esp($$1, $$0, false));
   }

   public static erw.a<?> a(eup $$0, boolean $$1) {
      return a($$2 -> new esp($$2, $$0, $$1));
   }
}
