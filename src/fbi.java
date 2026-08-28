import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbi extends fbb {
   public static final MapCodec<fbi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dxc.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbi::new)
   );
   private final dxc b;
   private final boolean c;

   fbi(List<fcx> $$0, dxc $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czk a(czk $$0, ezo $$1) {
      if (this.c) {
         $$0.a(kk.am, dxc.a, this.b, ($$0x, $$1x) -> new dxc.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kk.am, this.b);
      }

      return $$0;
   }

   @Override
   public fbd<fbi> b() {
      return fbe.E;
   }

   public static fbi.a a(boolean $$0) {
      return new fbi.a($$0);
   }

   public static class a extends fbb.a<fbi.a> {
      private final dxc.a a = new dxc.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fbi.a a() {
         return this;
      }

      @Override
      public fbc b() {
         return new fbi(this.g(), this.a.a(), this.b);
      }

      public fbi.a a(jf<dxb> $$0, cyi $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
