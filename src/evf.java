import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evf extends euy {
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(drm.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, evf::new)
   );
   private final drm b;
   private final boolean c;

   evf(List<eww> $$0, drm $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvs a(cvs $$0, etl $$1) {
      if (this.c) {
         $$0.a(ks.ad, drm.a, this.b, ($$0x, $$1x) -> new drm.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(ks.ad, this.b);
      }

      return $$0;
   }

   @Override
   public eva<evf> b() {
      return evb.E;
   }

   public static evf.a a(boolean $$0) {
      return new evf.a($$0);
   }

   public static class a extends euy.a<evf.a> {
      private final drm.a a = new drm.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected evf.a a() {
         return this;
      }

      @Override
      public euz b() {
         return new evf(this.g(), this.a.a(), this.b);
      }

      public evf.a a(jo<drl> $$0, cum $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
