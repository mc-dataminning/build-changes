import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aur {
   private static final Codec<aur> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.p.fieldOf("id").forGetter(aur::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, aur::new)
   );
   public static final Codec<aur> a = Codec.either(avu.p, b)
      .xmap($$0 -> (aur)$$0.map($$0x -> new aur($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final ajc c;
   private final boolean d;
   private final boolean e;

   private aur(ajc $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private aur(avu.g $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private avu.g a() {
      return new avu.g(this.c, this.d);
   }

   public static aur a(ajc $$0) {
      return new aur($$0, false, true);
   }

   public static aur b(ajc $$0) {
      return new aur($$0, false, false);
   }

   public static aur c(ajc $$0) {
      return new aur($$0, true, true);
   }

   public static aur d(ajc $$0) {
      return new aur($$0, true, false);
   }

   public <T> boolean a(aur.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<ajc> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<ajc> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<ajc> $$0, Predicate<ajc> $$1) {
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
      T a(ajc var1);

      @Nullable
      Collection<T> b(ajc var1);
   }
}
