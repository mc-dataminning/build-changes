import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esa extends ers {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dow.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, esa::new)
   );
   private final dow b;
   private final boolean c;

   esa(List<etq> $$0, dow $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cun a(cun $$0, eqg $$1) {
      if (this.c) {
         $$0.a(km.W, dow.a, this.b, ($$0x, $$1x) -> new dow.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(km.W, this.b);
      }

      return $$0;
   }

   @Override
   public eru<esa> b() {
      return erv.E;
   }

   public static esa.a a(boolean $$0) {
      return new esa.a($$0);
   }

   public static class a extends ers.a<esa.a> {
      private final dow.a a = new dow.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected esa.a a() {
         return this;
      }

      @Override
      public ert b() {
         return new esa(this.g(), this.a.a(), this.b);
      }

      public esa.a a(ji<dov> $$0, ctg $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
