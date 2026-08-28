import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyj extends eyc {
   public static final MapCodec<eyj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(duo.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyj::new)
   );
   private final duo b;
   private final boolean c;

   eyj(List<ezy> $$0, duo $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxp a(cxp $$0, ewp $$1) {
      if (this.c) {
         $$0.a(ku.ai, duo.a, this.b, ($$0x, $$1x) -> new duo.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ku.ai, this.b);
      }

      return $$0;
   }

   @Override
   public eye<eyj> b() {
      return eyf.E;
   }

   public static eyj.a a(boolean $$0) {
      return new eyj.a($$0);
   }

   public static class a extends eyc.a<eyj.a> {
      private final duo.a a = new duo.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eyj.a a() {
         return this;
      }

      @Override
      public eyd b() {
         return new eyj(this.g(), this.a.a(), this.b);
      }

      public eyj.a a(jq<dun> $$0, cwm $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
