import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class est extends eta {
   public static final Codec<est> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(evr.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, est::new)
   );
   private final evq b;
   private final boolean c;

   est(List<euu> $$0, evq $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etc b() {
      return etd.f;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.a();
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      ayt $$2 = $$1.b();
      return dae.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static est.a a(evq $$0) {
      return new est.a($$0);
   }

   public static class a extends eta.a<est.a> {
      private final evq a;
      private boolean b;

      public a(evq $$0) {
         this.a = $$0;
      }

      protected est.a a() {
         return this;
      }

      public est.a e() {
         this.b = true;
         return this;
      }

      @Override
      public etb b() {
         return new est(this.g(), this.a, this.b);
      }
   }
}
