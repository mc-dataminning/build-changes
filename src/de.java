import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record de(dj.d b) {
   public static final Codec<de> a = RecordCodecBuilder.create($$0 -> $$0.group(dj.d.d.optionalFieldOf("light", dj.d.c).forGetter(de::a)).apply($$0, de::new));

   public boolean a(arx $$0, jh $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public dj.d a() {
      return this.b;
   }

   public static class a {
      private dj.d a = dj.d.c;

      public static de.a a() {
         return new de.a();
      }

      public de.a a(dj.d $$0) {
         this.a = $$0;
         return this;
      }

      public de b() {
         return new de(this.a);
      }
   }
}
