import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ecv extends edl {
   public static final Codec<ecv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(doy.a.g.fieldOf("heightmap").orElse(doy.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ecv::new)
   );
   private final doy.a b;
   private final int c;

   public ecv(doy.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      doy.a $$6;
      if ($$0 instanceof ane) {
         if (this.b == doy.a.a) {
            $$6 = doy.a.b;
         } else if (this.b == doy.a.c) {
            $$6 = doy.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hx $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new edo.c(new hx($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected edn<?> a() {
      return edn.g;
   }
}
