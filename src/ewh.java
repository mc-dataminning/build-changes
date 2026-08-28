import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewh extends ewa {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dsp.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewh::new)
   );
   private final dsp b;
   private final boolean c;

   ewh(List<exy> $$0, dsp $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwm a(cwm $$0, eun $$1) {
      if (this.c) {
         $$0.a(ku.ai, dsp.a, this.b, ($$0x, $$1x) -> new dsp.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ku.ai, this.b);
      }

      return $$0;
   }

   @Override
   public ewc<ewh> b() {
      return ewd.E;
   }

   public static ewh.a a(boolean $$0) {
      return new ewh.a($$0);
   }

   public static class a extends ewa.a<ewh.a> {
      private final dsp.a a = new dsp.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ewh.a a() {
         return this;
      }

      @Override
      public ewb b() {
         return new ewh(this.g(), this.a.a(), this.b);
      }

      public ewh.a a(jq<dso> $$0, cvj $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
