import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcn extends fcg {
   public static final MapCodec<fcn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dye.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fcn::new)
   );
   private final dye b;
   private final boolean c;

   fcn(List<fec> $$0, dye $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected dak a(dak $$0, fat $$1) {
      if (this.c) {
         $$0.a(kl.am, dye.a, this.b, ($$0x, $$1x) -> new dye.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kl.am, this.b);
      }

      return $$0;
   }

   @Override
   public fci<fcn> b() {
      return fcj.E;
   }

   public static fcn.a a(boolean $$0) {
      return new fcn.a($$0);
   }

   public static class a extends fcg.a<fcn.a> {
      private final dye.a a = new dye.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fcn.a a() {
         return this;
      }

      @Override
      public fch b() {
         return new fcn(this.g(), this.a.a(), this.b);
      }

      public fcn.a a(jg<dyd> $$0, czi $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
