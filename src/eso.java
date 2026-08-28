import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eso extends etf {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eel.a.g.fieldOf("heightmap").orElse(eel.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eso::new)
   );
   private final eel.a b;
   private final int c;

   public eso(eel.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      eel.a $$6;
      if ($$0 instanceof arn) {
         if (this.b == eel.a.a) {
            $$6 = eel.a.b;
         } else if (this.b == eel.a.c) {
            $$6 = eel.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jj $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eti.d(new jj($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eth<?> a() {
      return eth.g;
   }
}
