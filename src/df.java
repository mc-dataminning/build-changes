import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record df(dk.d b) {
   public static final Codec<df> a = RecordCodecBuilder.create($$0 -> $$0.group(dk.d.d.optionalFieldOf("light", dk.d.c).forGetter(df::a)).apply($$0, df::new));

   public boolean a(arc $$0, ji $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public dk.d a() {
      return this.b;
   }

   public static class a {
      private dk.d a = dk.d.c;

      public static df.a a() {
         return new df.a();
      }

      public df.a a(dk.d $$0) {
         this.a = $$0;
         return this;
      }

      public df b() {
         return new df(this.a);
      }
   }
}
