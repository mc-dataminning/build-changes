import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyk extends dza {
   public static final Codec<dyk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dku.a.g.fieldOf("heightmap").orElse(dku.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dyk::new)
   );
   private final dku.a b;
   private final int c;

   public dyk(dku.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      dku.a $$6;
      if ($$0 instanceof aks) {
         if (this.b == dku.a.a) {
            $$6 = dku.a.b;
         } else if (this.b == dku.a.c) {
            $$6 = dku.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gw $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dzd.c(new gw($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dzc<?> a() {
      return dzc.g;
   }
}
