import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eao extends ebe {
   public static final Codec<eao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmr.a.g.fieldOf("heightmap").orElse(dmr.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eao::new)
   );
   private final dmr.a b;
   private final int c;

   public eao(dmr.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      dmr.a $$6;
      if ($$0 instanceof ame) {
         if (this.b == dmr.a.a) {
            $$6 = dmr.a.b;
         } else if (this.b == dmr.a.c) {
            $$6 = dmr.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ht $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ebh.c(new ht($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ebg<?> a() {
      return ebg.g;
   }
}
