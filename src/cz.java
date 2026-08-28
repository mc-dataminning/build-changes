import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cz(de.d b) {
   public static final Codec<cz> a = RecordCodecBuilder.create($$0 -> $$0.group(de.d.d.optionalFieldOf("light", de.d.c).forGetter(cz::a)).apply($$0, cz::new));

   public boolean a(arb $$0, iz $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public de.d a() {
      return this.b;
   }

   public static class a {
      private de.d a = de.d.c;

      public static cz.a a() {
         return new cz.a();
      }

      public cz.a a(de.d $$0) {
         this.a = $$0;
         return this;
      }

      public cz b() {
         return new cz(this.a);
      }
   }
}
