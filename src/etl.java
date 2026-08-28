import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etl extends ete {
   public static final MapCodec<etl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dpy.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, etl::new)
   );
   private final dpy b;
   private final boolean c;

   etl(List<evc> $$0, dpy $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuq a(cuq $$0, err $$1) {
      if (this.c) {
         $$0.a(kq.Y, dpy.a, this.b, ($$0x, $$1x) -> new dpy.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kq.Y, this.b);
      }

      return $$0;
   }

   @Override
   public etg<etl> b() {
      return eth.E;
   }

   public static etl.a a(boolean $$0) {
      return new etl.a($$0);
   }

   public static class a extends ete.a<etl.a> {
      private final dpy.a a = new dpy.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected etl.a a() {
         return this;
      }

      @Override
      public etf b() {
         return new etl(this.g(), this.a.a(), this.b);
      }

      public etl.a a(jm<dpx> $$0, cti $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
