import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyc extends exv {
   public static final MapCodec<eyc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(duh.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyc::new)
   );
   private final duh b;
   private final boolean c;

   eyc(List<ezr> $$0, duh $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxg a(cxg $$0, ewi $$1) {
      if (this.c) {
         $$0.a(ku.ai, duh.a, this.b, ($$0x, $$1x) -> new duh.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ku.ai, this.b);
      }

      return $$0;
   }

   @Override
   public exx<eyc> b() {
      return exy.E;
   }

   public static eyc.a a(boolean $$0) {
      return new eyc.a($$0);
   }

   public static class a extends exv.a<eyc.a> {
      private final duh.a a = new duh.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eyc.a a() {
         return this;
      }

      @Override
      public exw b() {
         return new eyc(this.g(), this.a.a(), this.b);
      }

      public eyc.a a(jq<dug> $$0, cwd $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
