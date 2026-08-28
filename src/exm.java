import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exm extends exf {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dtr.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, exm::new)
   );
   private final dtr b;
   private final boolean c;

   exm(List<ezb> $$0, dtr $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwq a(cwq $$0, evs $$1) {
      if (this.c) {
         $$0.a(kv.ai, dtr.a, this.b, ($$0x, $$1x) -> new dtr.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kv.ai, this.b);
      }

      return $$0;
   }

   @Override
   public exh<exm> b() {
      return exi.E;
   }

   public static exm.a a(boolean $$0) {
      return new exm.a($$0);
   }

   public static class a extends exf.a<exm.a> {
      private final dtr.a a = new dtr.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected exm.a a() {
         return this;
      }

      @Override
      public exg b() {
         return new exm(this.g(), this.a.a(), this.b);
      }

      public exm.a a(jr<dtq> $$0, cvn $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
