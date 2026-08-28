import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class etq extends euh {
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efn.a.g.fieldOf("heightmap").orElse(efn.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, etq::new)
   );
   private final efn.a b;
   private final int c;

   public etq(efn.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      efn.a $$6;
      if ($$0 instanceof aro) {
         if (this.b == efn.a.a) {
            $$6 = efn.a.b;
         } else if (this.b == efn.a.c) {
            $$6 = efn.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iu $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new euk.d(new iu($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected euj<?> a() {
      return euj.g;
   }
}
