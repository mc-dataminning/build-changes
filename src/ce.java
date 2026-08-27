import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ce(cj.d b) {
   public static final Codec<ce> a = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a(cj.d.d, "light", cj.d.c).forGetter(ce::a)).apply($$0, ce::new));

   static Optional<ce> a(cj.d $$0) {
      return $$0.c() ? Optional.empty() : Optional.of(new ce($$0));
   }

   public boolean a(akk $$0, gu $$1) {
      return !$$0.o($$1) ? false : this.b.d($$0.z($$1));
   }

   public cj.d a() {
      return this.b;
   }

   public static class a {
      private cj.d a = cj.d.c;

      public static ce.a a() {
         return new ce.a();
      }

      public ce.a a(cj.d $$0) {
         this.a = $$0;
         return this;
      }

      public Optional<ce> b() {
         return ce.a(this.a);
      }
   }
}
