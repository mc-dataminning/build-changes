import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eil extends eir {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ela.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eil::new)
   );
   private final ekz b;
   private final boolean c;

   eil(List<eke> $$0, ekz $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eit b() {
      return eiu.d;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.a();
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      auw $$2 = $$1.b();
      return crt.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eil.a a(ekz $$0) {
      return new eil.a($$0);
   }

   public static class a extends eir.a<eil.a> {
      private final ekz a;
      private boolean b;

      public a(ekz $$0) {
         this.a = $$0;
      }

      protected eil.a a() {
         return this;
      }

      public eil.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eis b() {
         return new eil(this.g(), this.a, this.b);
      }
   }
}
