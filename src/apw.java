import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class apw {
   private static final Codec<apw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqw.o.fieldOf("id").forGetter(apw::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, apw::new)
   );
   public static final Codec<apw> a = Codec.either(aqw.o, b)
      .xmap($$0 -> (apw)$$0.map($$0x -> new apw($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final aep c;
   private final boolean d;
   private final boolean e;

   private apw(aep $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private apw(aqw.d $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private aqw.d a() {
      return new aqw.d(this.c, this.d);
   }

   public static apw a(aep $$0) {
      return new apw($$0, false, true);
   }

   public static apw b(aep $$0) {
      return new apw($$0, false, false);
   }

   public static apw c(aep $$0) {
      return new apw($$0, true, true);
   }

   public static apw d(aep $$0) {
      return new apw($$0, true, false);
   }

   public <T> boolean a(apw.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<aep> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<aep> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<aep> $$0, Predicate<aep> $$1) {
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
      T a(aep var1);

      @Nullable
      Collection<T> b(aep var1);
   }
}
