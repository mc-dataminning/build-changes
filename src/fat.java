import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fat extends fam {
   public static final MapCodec<fat> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dwn.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, fat::new)
   );
   private final dwn b;
   private final boolean c;

   fat(List<fci> $$0, dwn $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cyy a(cyy $$0, eyz $$1) {
      if (this.c) {
         $$0.a(kj.am, dwn.a, this.b, ($$0x, $$1x) -> new dwn.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kj.am, this.b);
      }

      return $$0;
   }

   @Override
   public fao<fat> b() {
      return fap.E;
   }

   public static fat.a a(boolean $$0) {
      return new fat.a($$0);
   }

   public static class a extends fam.a<fat.a> {
      private final dwn.a a = new dwn.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected fat.a a() {
         return this;
      }

      @Override
      public fan b() {
         return new fat(this.g(), this.a.a(), this.b);
      }

      public fat.a a(je<dwm> $$0, cxw $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
