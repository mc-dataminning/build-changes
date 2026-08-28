import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exj extends exc {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dto.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, exj::new)
   );
   private final dto b;
   private final boolean c;

   exj(List<eyy> $$0, dto $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwn a(cwn $$0, evp $$1) {
      if (this.c) {
         $$0.a(kv.ai, dto.a, this.b, ($$0x, $$1x) -> new dto.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kv.ai, this.b);
      }

      return $$0;
   }

   @Override
   public exe<exj> b() {
      return exf.E;
   }

   public static exj.a a(boolean $$0) {
      return new exj.a($$0);
   }

   public static class a extends exc.a<exj.a> {
      private final dto.a a = new dto.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected exj.a a() {
         return this;
      }

      @Override
      public exd b() {
         return new exj(this.g(), this.a.a(), this.b);
      }

      public exj.a a(jr<dtn> $$0, cvk $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
