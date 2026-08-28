import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyb extends exu {
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dug.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyb::new)
   );
   private final dug b;
   private final boolean c;

   eyb(List<ezs> $$0, dug $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxk a(cxk $$0, ewh $$1) {
      if (this.c) {
         $$0.a(ku.ai, dug.a, this.b, ($$0x, $$1x) -> new dug.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ku.ai, this.b);
      }

      return $$0;
   }

   @Override
   public exw<eyb> b() {
      return exx.E;
   }

   public static eyb.a a(boolean $$0) {
      return new eyb.a($$0);
   }

   public static class a extends exu.a<eyb.a> {
      private final dug.a a = new dug.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eyb.a a() {
         return this;
      }

      @Override
      public exv b() {
         return new eyb(this.g(), this.a.a(), this.b);
      }

      public eyb.a a(jq<duf> $$0, cwh $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
