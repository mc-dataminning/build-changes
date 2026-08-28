import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etu extends etc {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evx.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, etu::new)
   );
   private final evw b;
   private final boolean c;

   private etu(List<eva> $$0, evw $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ete<etu> b() {
      return etf.e;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      int $$2 = this.c ? $$0.H() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static etc.a<?> a(evw $$0) {
      return a($$1 -> new etu($$1, $$0, false));
   }

   public static etc.a<?> a(evw $$0, boolean $$1) {
      return a($$2 -> new etu($$2, $$0, $$1));
   }
}
