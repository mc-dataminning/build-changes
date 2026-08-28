import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esi extends erp {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euj.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, esi::new)
   );
   private final eui b;
   private final boolean c;

   private esi(List<etn> $$0, eui $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public err<esi> b() {
      return ers.e;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.a();
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      int $$2 = this.c ? $$0.I() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static erp.a<?> a(eui $$0) {
      return a($$1 -> new esi($$1, $$0, false));
   }

   public static erp.a<?> a(eui $$0, boolean $$1) {
      return a($$2 -> new esi($$2, $$0, $$1));
   }
}
