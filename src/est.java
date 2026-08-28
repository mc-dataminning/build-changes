import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class est extends esb {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euw.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, est::new)
   );
   private final euv b;
   private final boolean c;

   private est(List<etz> $$0, euv $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esd<est> b() {
      return ese.e;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.a();
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      int $$2 = this.c ? $$0.H() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static esb.a<?> a(euv $$0) {
      return a($$1 -> new est($$1, $$0, false));
   }

   public static esb.a<?> a(euv $$0, boolean $$1) {
      return a($$2 -> new est($$2, $$0, $$1));
   }
}
