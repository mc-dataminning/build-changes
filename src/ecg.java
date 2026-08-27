import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ecg extends ecw {
   public static final Codec<ecg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(doj.a.g.fieldOf("heightmap").orElse(doj.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ecg::new)
   );
   private final doj.a b;
   private final int c;

   public ecg(doj.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      doj.a $$6;
      if ($$0 instanceof amz) {
         if (this.b == doj.a.a) {
            $$6 = doj.a.b;
         } else if (this.b == doj.a.c) {
            $$6 = doj.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hx $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ecz.c(new hx($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ecy<?> a() {
      return ecy.g;
   }
}
