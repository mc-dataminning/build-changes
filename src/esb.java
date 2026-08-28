import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esb extends ert {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dox.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, esb::new)
   );
   private final dox b;
   private final boolean c;

   esb(List<etr> $$0, dox $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuo a(cuo $$0, eqh $$1) {
      if (this.c) {
         $$0.a(km.X, dox.a, this.b, ($$0x, $$1x) -> new dox.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(km.X, this.b);
      }

      return $$0;
   }

   @Override
   public erv<esb> b() {
      return erw.E;
   }

   public static esb.a a(boolean $$0) {
      return new esb.a($$0);
   }

   public static class a extends ert.a<esb.a> {
      private final dox.a a = new dox.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected esb.a a() {
         return this;
      }

      @Override
      public eru b() {
         return new esb(this.g(), this.a.a(), this.b);
      }

      public esb.a a(ji<dow> $$0, cth $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
