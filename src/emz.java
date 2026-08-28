import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emz extends enq {
   public static final MapCodec<emz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyy.a.g.fieldOf("heightmap").orElse(dyy.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, emz::new)
   );
   private final dyy.a b;
   private final int c;

   public emz(dyy.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ent.c a(dcz $$0, jd $$1, jd $$2, ent.c $$3, ent.c $$4, enp $$5) {
      dyy.a $$6;
      if ($$0 instanceof aqu) {
         if (this.b == dyy.a.a) {
            $$6 = dyy.a.b;
         } else if (this.b == dyy.a.c) {
            $$6 = dyy.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jd $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ent.c(new jd($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ens<?> a() {
      return ens.g;
   }
}
