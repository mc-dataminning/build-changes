import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ebv extends ecl {
   public static final Codec<ebv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dny.a.g.fieldOf("heightmap").orElse(dny.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ebv::new)
   );
   private final dny.a b;
   private final int c;

   public ebv(dny.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      dny.a $$6;
      if ($$0 instanceof amp) {
         if (this.b == dny.a.a) {
            $$6 = dny.a.b;
         } else if (this.b == dny.a.c) {
            $$6 = dny.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hv $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eco.c(new hv($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ecn<?> a() {
      return ecn.g;
   }
}
