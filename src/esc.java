import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esc extends eru {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(doy.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, esc::new)
   );
   private final doy b;
   private final boolean c;

   esc(List<ets> $$0, doy $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cup a(cup $$0, eqi $$1) {
      if (this.c) {
         $$0.a(km.X, doy.a, this.b, ($$0x, $$1x) -> new doy.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(km.X, this.b);
      }

      return $$0;
   }

   @Override
   public erw<esc> b() {
      return erx.E;
   }

   public static esc.a a(boolean $$0) {
      return new esc.a($$0);
   }

   public static class a extends eru.a<esc.a> {
      private final doy.a a = new doy.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected esc.a a() {
         return this;
      }

      @Override
      public erv b() {
         return new esc(this.g(), this.a.a(), this.b);
      }

      public esc.a a(ji<dox> $$0, cti $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
