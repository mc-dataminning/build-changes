import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elx extends emn {
   public static final MapCodec<elx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxz.a.g.fieldOf("heightmap").orElse(dxz.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, elx::new)
   );
   private final dxz.a b;
   private final int c;

   public elx(dxz.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      dxz.a $$6;
      if ($$0 instanceof aqk) {
         if (this.b == dxz.a.a) {
            $$6 = dxz.a.b;
         } else if (this.b == dxz.a.c) {
            $$6 = dxz.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ja $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emq.c(new ja($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected emp<?> a() {
      return emp.g;
   }
}
