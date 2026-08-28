import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbb extends fau {
   public static final MapCodec<fbb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dwv.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbb::new)
   );
   private final dwv b;
   private final boolean c;

   fbb(List<fcq> $$0, dwv $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czd a(czd $$0, ezh $$1) {
      if (this.c) {
         $$0.a(kj.am, dwv.a, this.b, ($$0x, $$1x) -> new dwv.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kj.am, this.b);
      }

      return $$0;
   }

   @Override
   public faw<fbb> b() {
      return fax.E;
   }

   public static fbb.a a(boolean $$0) {
      return new fbb.a($$0);
   }

   public static class a extends fau.a<fbb.a> {
      private final dwv.a a = new dwv.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fbb.a a() {
         return this;
      }

      @Override
      public fav b() {
         return new fbb(this.g(), this.a.a(), this.b);
      }

      public fbb.a a(je<dwu> $$0, cyb $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
