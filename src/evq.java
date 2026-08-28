import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evq extends evj {
   public static final MapCodec<evq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(drx.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, evq::new)
   );
   private final drx b;
   private final boolean c;

   evq(List<exh> $$0, drx $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvx a(cvx $$0, etw $$1) {
      if (this.c) {
         $$0.a(kt.ah, drx.a, this.b, ($$0x, $$1x) -> new drx.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kt.ah, this.b);
      }

      return $$0;
   }

   @Override
   public evl<evq> b() {
      return evm.E;
   }

   public static evq.a a(boolean $$0) {
      return new evq.a($$0);
   }

   public static class a extends evj.a<evq.a> {
      private final drx.a a = new drx.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected evq.a a() {
         return this;
      }

      @Override
      public evk b() {
         return new evq(this.g(), this.a.a(), this.b);
      }

      public evq.a a(jp<drw> $$0, cuu $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
