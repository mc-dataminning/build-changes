import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eks extends eli {
   public static final MapCodec<eks> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwv.a.g.fieldOf("heightmap").orElse(dwv.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eks::new)
   );
   private final dwv.a b;
   private final int c;

   public eks(dwv.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      dwv.a $$6;
      if ($$0 instanceof aqn) {
         if (this.b == dwv.a.a) {
            $$6 = dwv.a.b;
         } else if (this.b == dwv.a.c) {
            $$6 = dwv.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      io $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ell.c(new io($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected elk<?> a() {
      return elk.g;
   }
}
