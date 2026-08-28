import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evj extends ewa {
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehd.a.g.fieldOf("heightmap").orElse(ehd.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, evj::new)
   );
   private final ehd.a b;
   private final int c;

   public evj(ehd.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      ehd.a $$6;
      if ($$0 instanceof ars) {
         if (this.b == ehd.a.a) {
            $$6 = ehd.a.b;
         } else if (this.b == ehd.a.c) {
            $$6 = ehd.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iv $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ewd.d(new iv($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ewc<?> a() {
      return ewc.g;
   }
}
