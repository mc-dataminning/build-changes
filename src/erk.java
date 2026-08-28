import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erk extends ers {
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eum.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, erk::new)
   );
   private final eul b;
   private final boolean c;

   erk(List<etq> $$0, eul $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eru<erk> b() {
      return erv.g;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.a();
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      azf $$2 = $$1.b();
      return czz.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static erk.a a(eul $$0) {
      return new erk.a($$0);
   }

   public static class a extends ers.a<erk.a> {
      private final eul a;
      private boolean b;

      public a(eul $$0) {
         this.a = $$0;
      }

      protected erk.a a() {
         return this;
      }

      public erk.a e() {
         this.b = true;
         return this;
      }

      @Override
      public ert b() {
         return new erk(this.g(), this.a, this.b);
      }
   }
}
