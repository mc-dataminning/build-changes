import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epq extends eqh {
   public static final MapCodec<epq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebq.a.g.fieldOf("heightmap").orElse(ebq.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, epq::new)
   );
   private final ebq.a b;
   private final int c;

   public epq(ebq.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      ebq.a $$6;
      if ($$0 instanceof arp) {
         if (this.b == ebq.a.a) {
            $$6 = ebq.a.b;
         } else if (this.b == ebq.a.c) {
            $$6 = ebq.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jh $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eqk.c(new jh($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eqj<?> a() {
      return eqj.g;
   }
}
