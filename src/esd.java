import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esd extends erv {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(doz.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, esd::new)
   );
   private final doz b;
   private final boolean c;

   esd(List<ett> $$0, doz $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuq a(cuq $$0, eqj $$1) {
      if (this.c) {
         $$0.a(km.X, doz.a, this.b, ($$0x, $$1x) -> new doz.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(km.X, this.b);
      }

      return $$0;
   }

   @Override
   public erx<esd> b() {
      return ery.E;
   }

   public static esd.a a(boolean $$0) {
      return new esd.a($$0);
   }

   public static class a extends erv.a<esd.a> {
      private final doz.a a = new doz.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected esd.a a() {
         return this;
      }

      @Override
      public erw b() {
         return new esd(this.g(), this.a.a(), this.b);
      }

      public esd.a a(ji<doy> $$0, ctj $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
