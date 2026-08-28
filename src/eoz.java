import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eoz extends epq {
   public static final MapCodec<eoz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaz.a.g.fieldOf("heightmap").orElse(eaz.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eoz::new)
   );
   private final eaz.a b;
   private final int c;

   public eoz(eaz.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      eaz.a $$6;
      if ($$0 instanceof arm) {
         if (this.b == eaz.a.a) {
            $$6 = eaz.a.b;
         } else if (this.b == eaz.a.c) {
            $$6 = eaz.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jg $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ept.c(new jg($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eps<?> a() {
      return eps.g;
   }
}
