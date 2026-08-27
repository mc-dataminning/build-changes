import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqx extends eqq {
   public static final MapCodec<eqx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dnx.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eqx::new)
   );
   private final dnx b;
   private final boolean c;

   eqx(List<esl> $$0, dnx $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cto a(cto $$0, epf $$1) {
      if (this.c) {
         $$0.a(kb.W, dnx.a, this.b, ($$0x, $$1x) -> new dnx.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kb.W, this.b);
      }

      return $$0;
   }

   @Override
   public eqs b() {
      return eqt.B;
   }

   public static eqx.a a(boolean $$0) {
      return new eqx.a($$0);
   }

   public static class a extends eqq.a<eqx.a> {
      private final dnx.a a = new dnx.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eqx.a a() {
         return this;
      }

      @Override
      public eqr b() {
         return new eqx(this.g(), this.a.a(), this.b);
      }

      public eqx.a a(ix<dnw> $$0, csh $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
