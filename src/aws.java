import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aws {
   private static final Codec<aws> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(axw.r.fieldOf("id").forGetter(aws::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, aws::new)
   );
   public static final Codec<aws> a = Codec.either(axw.r, b)
      .xmap($$0 -> (aws)$$0.map($$0x -> new aws($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final akr c;
   private final boolean d;
   private final boolean e;

   private aws(akr $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private aws(axw.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private axw.c a() {
      return new axw.c(this.c, this.d);
   }

   public static aws a(akr $$0) {
      return new aws($$0, false, true);
   }

   public static aws b(akr $$0) {
      return new aws($$0, false, false);
   }

   public static aws c(akr $$0) {
      return new aws($$0, true, true);
   }

   public static aws d(akr $$0) {
      return new aws($$0, true, false);
   }

   public <T> boolean a(aws.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<akr> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<akr> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<akr> $$0, Predicate<akr> $$1) {
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
      T a(akr var1);

      @Nullable
      Collection<T> b(akr var1);
   }
}
