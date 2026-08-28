import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fah extends faa {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dwd.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fah::new)
   );
   private final dwd b;
   private final boolean c;

   fah(List<fbw> $$0, dwd $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      if (this.c) {
         $$0.a(kj.am, dwd.a, this.b, ($$0x, $$1x) -> new dwd.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kj.am, this.b);
      }

      return $$0;
   }

   @Override
   public fac<fah> b() {
      return fad.E;
   }

   public static fah.a a(boolean $$0) {
      return new fah.a($$0);
   }

   public static class a extends faa.a<fah.a> {
      private final dwd.a a = new dwd.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fah.a a() {
         return this;
      }

      @Override
      public fab b() {
         return new fah(this.g(), this.a.a(), this.b);
      }

      public fah.a a(je<dwc> $$0, cxq $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
