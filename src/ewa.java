import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewa extends evt {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dsi.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewa::new)
   );
   private final dsi b;
   private final boolean c;

   ewa(List<exr> $$0, dsi $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwf a(cwf $$0, eug $$1) {
      if (this.c) {
         $$0.a(ku.ai, dsi.a, this.b, ($$0x, $$1x) -> new dsi.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ku.ai, this.b);
      }

      return $$0;
   }

   @Override
   public evv<ewa> b() {
      return evw.E;
   }

   public static ewa.a a(boolean $$0) {
      return new ewa.a($$0);
   }

   public static class a extends evt.a<ewa.a> {
      private final dsi.a a = new dsi.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ewa.a a() {
         return this;
      }

      @Override
      public evu b() {
         return new ewa(this.g(), this.a.a(), this.b);
      }

      public ewa.a a(jq<dsh> $$0, cvc $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
