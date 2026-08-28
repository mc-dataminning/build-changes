import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ews extends ewa {
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyv.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ews::new)
   );
   private final eyu b;
   private final boolean c;

   private ews(List<exy> $$0, eyu $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ewc<ews> b() {
      return ewd.e;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.a();
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static ewa.a<?> a(eyu $$0) {
      return a($$1 -> new ews($$1, $$0, false));
   }

   public static ewa.a<?> a(eyu $$0, boolean $$1) {
      return a($$2 -> new ews($$2, $$0, $$1));
   }
}
