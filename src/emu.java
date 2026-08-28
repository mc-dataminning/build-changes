import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emu extends enk {
   public static final MapCodec<emu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyv.a.g.fieldOf("heightmap").orElse(dyv.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, emu::new)
   );
   private final dyv.a b;
   private final int c;

   public emu(dyv.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      dyv.a $$6;
      if ($$0 instanceof aqt) {
         if (this.b == dyv.a.a) {
            $$6 = dyv.a.b;
         } else if (this.b == dyv.a.c) {
            $$6 = dyv.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jd $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new enn.c(new jd($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected enm<?> a() {
      return enm.g;
   }
}
