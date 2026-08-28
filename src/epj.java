import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epj extends eqa {
   public static final MapCodec<epj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebj.a.g.fieldOf("heightmap").orElse(ebj.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, epj::new)
   );
   private final ebj.a b;
   private final int c;

   public epj(ebj.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      ebj.a $$6;
      if ($$0 instanceof arq) {
         if (this.b == ebj.a.a) {
            $$6 = ebj.a.b;
         } else if (this.b == ebj.a.c) {
            $$6 = ebj.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jh $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eqd.c(new jh($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eqc<?> a() {
      return eqc.g;
   }
}
