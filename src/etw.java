import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etw extends ete {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evz.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, etw::new)
   );
   private final evy b;
   private final boolean c;

   private etw(List<evc> $$0, evy $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etg<etw> b() {
      return eth.e;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      int $$2 = this.c ? $$0.H() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static ete.a<?> a(evy $$0) {
      return a($$1 -> new etw($$1, $$0, false));
   }

   public static ete.a<?> a(evy $$0, boolean $$1) {
      return a($$2 -> new etw($$2, $$0, $$1));
   }
}
