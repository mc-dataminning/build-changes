import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class axh {
   private static final Codec<axh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aym.s.fieldOf("id").forGetter(axh::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, axh::new)
   );
   public static final Codec<axh> a = Codec.either(aym.s, b)
      .xmap($$0 -> (axh)$$0.map($$0x -> new axh($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final alc c;
   private final boolean d;
   private final boolean e;

   private axh(alc $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private axh(aym.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private aym.c a() {
      return new aym.c(this.c, this.d);
   }

   public static axh a(alc $$0) {
      return new axh($$0, false, true);
   }

   public static axh b(alc $$0) {
      return new axh($$0, false, false);
   }

   public static axh c(alc $$0) {
      return new axh($$0, true, true);
   }

   public static axh d(alc $$0) {
      return new axh($$0, true, false);
   }

   public <T> boolean a(axh.a<T> $$0, Consumer<T> $$1) {
      if (this.d) {
         Collection<T> $$2 = $$0.b(this.c);
         if ($$2 == null) {
            return !this.e;
         }

         $$2.forEach($$1);
      } else {
         T $$3 = $$0.a(this.c);
         if ($$3 == null) {
            return !this.e;
         }

         $$1.accept($$3);
      }

      return true;
   }

   public void a(Consumer<alc> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<alc> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<alc> $$0, Predicate<alc> $$1) {
      return !this.e || (this.d ? $$1 : $$0).test(this.c);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      if (this.d) {
         $$0.append('#');
      }

      $$0.append(this.c);
      if (!this.e) {
         $$0.append('?');
      }

      return $$0.toString();
   }

   public interface a<T> {
      @Nullable
      T a(alc var1);

      @Nullable
      Collection<T> b(alc var1);
   }
}
