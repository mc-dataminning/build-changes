import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class axc {
   private static final Codec<axc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayh.t.fieldOf("id").forGetter(axc::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, axc::new)
   );
   public static final Codec<axc> a = Codec.either(ayh.t, b)
      .xmap($$0 -> (axc)$$0.map($$0x -> new axc($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final aku c;
   private final boolean d;
   private final boolean e;

   private axc(aku $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private axc(ayh.d $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private ayh.d a() {
      return new ayh.d(this.c, this.d);
   }

   public static axc a(aku $$0) {
      return new axc($$0, false, true);
   }

   public static axc b(aku $$0) {
      return new axc($$0, false, false);
   }

   public static axc c(aku $$0) {
      return new axc($$0, true, true);
   }

   public static axc d(aku $$0) {
      return new axc($$0, true, false);
   }

   public <T> boolean a(axc.a<T> $$0, Consumer<T> $$1) {
      if (this.d) {
         Collection<T> $$2 = $$0.a(this.c);
         if ($$2 == null) {
            return !this.e;
         }

         $$2.forEach($$1);
      } else {
         T $$3 = $$0.a(this.c, this.e);
         if ($$3 == null) {
            return !this.e;
         }

         $$1.accept($$3);
      }

      return true;
   }

   public void a(Consumer<aku> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<aku> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<aku> $$0, Predicate<aku> $$1) {
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
      T a(aku var1, boolean var2);

      @Nullable
      Collection<T> a(aku var1);
   }
}
