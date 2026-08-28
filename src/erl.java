import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class erl extends esc {
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edj.a.g.fieldOf("heightmap").orElse(edj.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, erl::new)
   );
   private final edj.a b;
   private final int c;

   public erl(edj.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      edj.a $$6;
      if ($$0 instanceof arx) {
         if (this.b == edj.a.a) {
            $$6 = edj.a.b;
         } else if (this.b == edj.a.c) {
            $$6 = edj.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jh $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new esf.d(new jh($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ese<?> a() {
      return ese.g;
   }
}
