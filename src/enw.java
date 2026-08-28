import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class enw extends eon {
   public static final MapCodec<enw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzw.a.g.fieldOf("heightmap").orElse(dzw.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, enw::new)
   );
   private final dzw.a b;
   private final int c;

   public enw(dzw.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      dzw.a $$6;
      if ($$0 instanceof arg) {
         if (this.b == dzw.a.a) {
            $$6 = dzw.a.b;
         } else if (this.b == dzw.a.c) {
            $$6 = dzw.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      je $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eoq.c(new je($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eop<?> a() {
      return eop.g;
   }
}
