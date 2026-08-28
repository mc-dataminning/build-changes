import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exl extends exe {
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dtq.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, exl::new)
   );
   private final dtq b;
   private final boolean c;

   exl(List<eza> $$0, dtq $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwp a(cwp $$0, evr $$1) {
      if (this.c) {
         $$0.a(kv.ai, dtq.a, this.b, ($$0x, $$1x) -> new dtq.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kv.ai, this.b);
      }

      return $$0;
   }

   @Override
   public exg<exl> b() {
      return exh.E;
   }

   public static exl.a a(boolean $$0) {
      return new exl.a($$0);
   }

   public static class a extends exe.a<exl.a> {
      private final dtq.a a = new dtq.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected exl.a a() {
         return this;
      }

      @Override
      public exf b() {
         return new exl(this.g(), this.a.a(), this.b);
      }

      public exl.a a(jr<dtp> $$0, cvm $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
