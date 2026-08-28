import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ese extends erw {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dpa.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, ese::new)
   );
   private final dpa b;
   private final boolean c;

   ese(List<etu> $$0, dpa $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cur a(cur $$0, eqk $$1) {
      if (this.c) {
         $$0.a(km.X, dpa.a, this.b, ($$0x, $$1x) -> new dpa.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(km.X, this.b);
      }

      return $$0;
   }

   @Override
   public ery<ese> b() {
      return erz.E;
   }

   public static ese.a a(boolean $$0) {
      return new ese.a($$0);
   }

   public static class a extends erw.a<ese.a> {
      private final dpa.a a = new dpa.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ese.a a() {
         return this;
      }

      @Override
      public erx b() {
         return new ese(this.g(), this.a.a(), this.b);
      }

      public ese.a a(ji<doz> $$0, ctk $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
