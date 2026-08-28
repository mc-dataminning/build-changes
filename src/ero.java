import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ero extends erw {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euq.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ero::new)
   );
   private final eup b;
   private final boolean c;

   ero(List<etu> $$0, eup $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ery<ero> b() {
      return erz.g;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.a();
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      azh $$2 = $$1.b();
      return dad.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static ero.a a(eup $$0) {
      return new ero.a($$0);
   }

   public static class a extends erw.a<ero.a> {
      private final eup a;
      private boolean b;

      public a(eup $$0) {
         this.a = $$0;
      }

      protected ero.a a() {
         return this;
      }

      public ero.a e() {
         this.b = true;
         return this;
      }

      @Override
      public erx b() {
         return new ero(this.g(), this.a, this.b);
      }
   }
}
