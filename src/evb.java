import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evb extends euu {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(drj.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, evb::new)
   );
   private final drj b;
   private final boolean c;

   evb(List<ews> $$0, drj $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      if (this.c) {
         $$0.a(kr.ad, drj.a, this.b, ($$0x, $$1x) -> new drj.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kr.ad, this.b);
      }

      return $$0;
   }

   @Override
   public euw<evb> b() {
      return eux.E;
   }

   public static evb.a a(boolean $$0) {
      return new evb.a($$0);
   }

   public static class a extends euu.a<evb.a> {
      private final drj.a a = new drj.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected evb.a a() {
         return this;
      }

      @Override
      public euv b() {
         return new evb(this.g(), this.a.a(), this.b);
      }

      public evb.a a(jn<dri> $$0, cuj $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
