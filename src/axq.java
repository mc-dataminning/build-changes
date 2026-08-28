import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class axq {
   private static final Codec<axq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayv.t.fieldOf("id").forGetter(axq::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, axq::new)
   );
   public static final Codec<axq> a = Codec.either(ayv.t, b)
      .xmap($$0 -> (axq)$$0.map($$0x -> new axq($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final alj c;
   private final boolean d;
   private final boolean e;

   private axq(alj $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private axq(ayv.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private ayv.c a() {
      return new ayv.c(this.c, this.d);
   }

   public static axq a(alj $$0) {
      return new axq($$0, false, true);
   }

   public static axq b(alj $$0) {
      return new axq($$0, false, false);
   }

   public static axq c(alj $$0) {
      return new axq($$0, true, true);
   }

   public static axq d(alj $$0) {
      return new axq($$0, true, false);
   }

   public <T> boolean a(axq.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<alj> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<alj> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<alj> $$0, Predicate<alj> $$1) {
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
      T a(alj var1);

      @Nullable
      Collection<T> b(alj var1);
   }
}
