import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class erk extends esb {
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edi.a.g.fieldOf("heightmap").orElse(edi.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, erk::new)
   );
   private final edi.a b;
   private final int c;

   public erk(edi.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      edi.a $$6;
      if ($$0 instanceof ash) {
         if (this.b == edi.a.a) {
            $$6 = edi.a.b;
         } else if (this.b == edi.a.c) {
            $$6 = edi.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jh $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ese.d(new jh($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected esd<?> a() {
      return esd.g;
   }
}
