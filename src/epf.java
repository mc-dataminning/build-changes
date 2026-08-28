import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epf extends epw {
   public static final MapCodec<epf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebf.a.g.fieldOf("heightmap").orElse(ebf.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, epf::new)
   );
   private final ebf.a b;
   private final int c;

   public epf(ebf.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      ebf.a $$6;
      if ($$0 instanceof arn) {
         if (this.b == ebf.a.a) {
            $$6 = ebf.a.b;
         } else if (this.b == ebf.a.c) {
            $$6 = ebf.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jh $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new epz.c(new jh($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected epy<?> a() {
      return epy.g;
   }
}
