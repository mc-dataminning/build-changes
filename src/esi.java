import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esi extends esb {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dpe.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, esi::new)
   );
   private final dpe b;
   private final boolean c;

   esi(List<etz> $$0, dpe $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      if (this.c) {
         $$0.a(kn.X, dpe.a, this.b, ($$0x, $$1x) -> new dpe.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kn.X, this.b);
      }

      return $$0;
   }

   @Override
   public esd<esi> b() {
      return ese.E;
   }

   public static esi.a a(boolean $$0) {
      return new esi.a($$0);
   }

   public static class a extends esb.a<esi.a> {
      private final dpe.a a = new dpe.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected esi.a a() {
         return this;
      }

      @Override
      public esc b() {
         return new esi(this.g(), this.a.a(), this.b);
      }

      public esi.a a(jj<dpd> $$0, cst $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
