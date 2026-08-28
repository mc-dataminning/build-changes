import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcd extends fbw {
   public static final MapCodec<fcd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dxu.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fcd::new)
   );
   private final dxu b;
   private final boolean c;

   fcd(List<fds> $$0, dxu $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected daa a(daa $$0, faj $$1) {
      if (this.c) {
         $$0.a(kl.am, dxu.a, this.b, ($$0x, $$1x) -> new dxu.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kl.am, this.b);
      }

      return $$0;
   }

   @Override
   public fby<fcd> b() {
      return fbz.E;
   }

   public static fcd.a a(boolean $$0) {
      return new fcd.a($$0);
   }

   public static class a extends fbw.a<fcd.a> {
      private final dxu.a a = new dxu.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fcd.a a() {
         return this;
      }

      @Override
      public fbx b() {
         return new fcd(this.g(), this.a.a(), this.b);
      }

      public fcd.a a(jg<dxt> $$0, cyy $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
