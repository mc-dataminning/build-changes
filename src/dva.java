import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dva extends dvq {
   public static final Codec<dva> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhk.a.g.fieldOf("heightmap").orElse(dhk.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dva::new)
   );
   private final dhk.a b;
   private final int c;

   public dva(dhk.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
      dhk.a $$6;
      if ($$0 instanceof aif) {
         if (this.b == dhk.a.a) {
            $$6 = dhk.a.b;
         } else if (this.b == dhk.a.c) {
            $$6 = dhk.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gu $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dvt.c(new gu($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dvs<?> a() {
      return dvs.g;
   }
}
