import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqz extends eqs {
   public static final MapCodec<eqz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dnz.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eqz::new)
   );
   private final dnz b;
   private final boolean c;

   eqz(List<esn> $$0, dnz $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      if (this.c) {
         $$0.a(kb.W, dnz.a, this.b, ($$0x, $$1x) -> new dnz.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kb.W, this.b);
      }

      return $$0;
   }

   @Override
   public equ b() {
      return eqv.B;
   }

   public static eqz.a a(boolean $$0) {
      return new eqz.a($$0);
   }

   public static class a extends eqs.a<eqz.a> {
      private final dnz.a a = new dnz.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eqz.a a() {
         return this;
      }

      @Override
      public eqt b() {
         return new eqz(this.g(), this.a.a(), this.b);
      }

      public eqz.a a(ix<dny> $$0, csj $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
