import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eso extends esh {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dpg.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eso::new)
   );
   private final dpg b;
   private final boolean c;

   eso(List<euf> $$0, dpg $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cuc a(cuc $$0, equ $$1) {
      if (this.c) {
         $$0.a(kn.X, dpg.a, this.b, ($$0x, $$1x) -> new dpg.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kn.X, this.b);
      }

      return $$0;
   }

   @Override
   public esj<eso> b() {
      return esk.E;
   }

   public static eso.a a(boolean $$0) {
      return new eso.a($$0);
   }

   public static class a extends esh.a<eso.a> {
      private final dpg.a a = new dpg.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eso.a a() {
         return this;
      }

      @Override
      public esi b() {
         return new eso(this.g(), this.a.a(), this.b);
      }

      public eso.a a(jj<dpf> $$0, csv $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
