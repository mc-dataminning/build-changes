import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etf extends esy {
   public static final MapCodec<etf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dpw.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, etf::new)
   );
   private final dpw b;
   private final boolean c;

   etf(List<euw> $$0, dpw $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      if (this.c) {
         $$0.a(kq.Y, dpw.a, this.b, ($$0x, $$1x) -> new dpw.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kq.Y, this.b);
      }

      return $$0;
   }

   @Override
   public eta<etf> b() {
      return etb.E;
   }

   public static etf.a a(boolean $$0) {
      return new etf.a($$0);
   }

   public static class a extends esy.a<etf.a> {
      private final dpw.a a = new dpw.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected etf.a a() {
         return this;
      }

      @Override
      public esz b() {
         return new etf(this.g(), this.a.a(), this.b);
      }

      public etf.a a(jm<dpv> $$0, ctg $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
