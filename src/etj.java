import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etj extends etc {
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dpy.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, etj::new)
   );
   private final dpy b;
   private final boolean c;

   etj(List<eva> $$0, dpy $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuq a(cuq $$0, erp $$1) {
      if (this.c) {
         $$0.a(kq.Y, dpy.a, this.b, ($$0x, $$1x) -> new dpy.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kq.Y, this.b);
      }

      return $$0;
   }

   @Override
   public ete<etj> b() {
      return etf.E;
   }

   public static etj.a a(boolean $$0) {
      return new etj.a($$0);
   }

   public static class a extends etc.a<etj.a> {
      private final dpy.a a = new dpy.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected etj.a a() {
         return this;
      }

      @Override
      public etd b() {
         return new etj(this.g(), this.a.a(), this.b);
      }

      public etj.a a(jm<dpx> $$0, cti $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
