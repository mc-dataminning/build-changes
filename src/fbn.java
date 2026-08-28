import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbn extends fbg {
   public static final MapCodec<fbn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dxh.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbn::new)
   );
   private final dxh b;
   private final boolean c;

   fbn(List<fdc> $$0, dxh $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czn a(czn $$0, ezt $$1) {
      if (this.c) {
         $$0.a(kk.am, dxh.a, this.b, ($$0x, $$1x) -> new dxh.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kk.am, this.b);
      }

      return $$0;
   }

   @Override
   public fbi<fbn> b() {
      return fbj.E;
   }

   public static fbn.a a(boolean $$0) {
      return new fbn.a($$0);
   }

   public static class a extends fbg.a<fbn.a> {
      private final dxh.a a = new dxh.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fbn.a a() {
         return this;
      }

      @Override
      public fbh b() {
         return new fbn(this.g(), this.a.a(), this.b);
      }

      public fbn.a a(jf<dxg> $$0, cyl $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
