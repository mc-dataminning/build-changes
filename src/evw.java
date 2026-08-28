import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evw extends evp {
   public static final MapCodec<evw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dsd.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, evw::new)
   );
   private final dsd b;
   private final boolean c;

   evw(List<exn> $$0, dsd $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwb a(cwb $$0, euc $$1) {
      if (this.c) {
         $$0.a(ku.ai, dsd.a, this.b, ($$0x, $$1x) -> new dsd.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ku.ai, this.b);
      }

      return $$0;
   }

   @Override
   public evr<evw> b() {
      return evs.E;
   }

   public static evw.a a(boolean $$0) {
      return new evw.a($$0);
   }

   public static class a extends evp.a<evw.a> {
      private final dsd.a a = new dsd.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected evw.a a() {
         return this;
      }

      @Override
      public evq b() {
         return new evw(this.g(), this.a.a(), this.b);
      }

      public evw.a a(jq<dsc> $$0, cuy $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
