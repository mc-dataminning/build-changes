import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eeo extends eeu {
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ehd.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eeo::new)
   );
   private final ehc b;
   private final boolean c;

   eeo(List<egh> $$0, ehc $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eew b() {
      return eex.d;
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.a();
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      ate $$2 = $$1.b();
      return cov.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eeo.a a(ehc $$0) {
      return new eeo.a($$0);
   }

   public static class a extends eeu.a<eeo.a> {
      private final ehc a;
      private boolean b;

      public a(ehc $$0) {
         this.a = $$0;
      }

      protected eeo.a a() {
         return this;
      }

      public eeo.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eev b() {
         return new eeo(this.g(), this.a, this.b);
      }
   }
}
