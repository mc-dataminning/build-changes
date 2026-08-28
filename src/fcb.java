import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcb extends fbu {
   public static final MapCodec<fcb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dxs.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fcb::new)
   );
   private final dxs b;
   private final boolean c;

   fcb(List<fdq> $$0, dxs $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czy a(czy $$0, fah $$1) {
      if (this.c) {
         $$0.a(kk.am, dxs.a, this.b, ($$0x, $$1x) -> new dxs.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kk.am, this.b);
      }

      return $$0;
   }

   @Override
   public fbw<fcb> b() {
      return fbx.E;
   }

   public static fcb.a a(boolean $$0) {
      return new fcb.a($$0);
   }

   public static class a extends fbu.a<fcb.a> {
      private final dxs.a a = new dxs.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fcb.a a() {
         return this;
      }

      @Override
      public fbv b() {
         return new fcb(this.g(), this.a.a(), this.b);
      }

      public fcb.a a(jf<dxr> $$0, cyw $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
