import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ca(Optional<je<epd>> b, Optional<dn> c) {
   public static final Codec<ca> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(jp.a(li.z), "fluids").forGetter(ca::a), axu.a(dn.a, "state").forGetter(ca::b)).apply($$0, ca::new)
   );

   public boolean a(aqt $$0, ir $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         epe $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<je<epd>> a() {
      return this.b;
   }

   public Optional<dn> b() {
      return this.c;
   }

   public static class a {
      private Optional<je<epd>> a = Optional.empty();
      private Optional<dn> b = Optional.empty();

      private a() {
      }

      public static ca.a a() {
         return new ca.a();
      }

      public ca.a a(epd $$0) {
         this.a = Optional.of(je.a($$0.k()));
         return this;
      }

      public ca.a a(je<epd> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ca.a a(dn $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ca b() {
         return new ca(this.a, this.b);
      }
   }
}
