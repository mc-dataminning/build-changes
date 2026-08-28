import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ern extends erv {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eup.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ern::new)
   );
   private final euo b;
   private final boolean c;

   ern(List<ett> $$0, euo $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erx<ern> b() {
      return ery.g;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      azh $$2 = $$1.b();
      return dac.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static ern.a a(euo $$0) {
      return new ern.a($$0);
   }

   public static class a extends erv.a<ern.a> {
      private final euo a;
      private boolean b;

      public a(euo $$0) {
         this.a = $$0;
      }

      protected ern.a a() {
         return this;
      }

      public ern.a e() {
         this.b = true;
         return this;
      }

      @Override
      public erw b() {
         return new ern(this.g(), this.a, this.b);
      }
   }
}
