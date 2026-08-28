import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erx extends erp {
   public static final MapCodec<erx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dot.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, erx::new)
   );
   private final dot b;
   private final boolean c;

   erx(List<etn> $$0, dot $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuk a(cuk $$0, eqd $$1) {
      if (this.c) {
         $$0.a(km.W, dot.a, this.b, ($$0x, $$1x) -> new dot.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(km.W, this.b);
      }

      return $$0;
   }

   @Override
   public err<erx> b() {
      return ers.E;
   }

   public static erx.a a(boolean $$0) {
      return new erx.a($$0);
   }

   public static class a extends erp.a<erx.a> {
      private final dot.a a = new dot.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected erx.a a() {
         return this;
      }

      @Override
      public erq b() {
         return new erx(this.g(), this.a.a(), this.b);
      }

      public erx.a a(ji<dos> $$0, ctd $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
