import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anj {
   private static final Codec<anj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aoi.o.fieldOf("id").forGetter(anj::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, anj::new)
   );
   public static final Codec<anj> a = Codec.either(aoi.o, b)
      .xmap($$0 -> (anj)$$0.map($$0x -> new anj($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final acq c;
   private final boolean d;
   private final boolean e;

   private anj(acq $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private anj(aoi.d $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private aoi.d a() {
      return new aoi.d(this.c, this.d);
   }

   public static anj a(acq $$0) {
      return new anj($$0, false, true);
   }

   public static anj b(acq $$0) {
      return new anj($$0, false, false);
   }

   public static anj c(acq $$0) {
      return new anj($$0, true, true);
   }

   public static anj d(acq $$0) {
      return new anj($$0, true, false);
   }

   public <T> boolean a(anj.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<acq> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<acq> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<acq> $$0, Predicate<acq> $$1) {
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
      T a(acq var1);

      @Nullable
      Collection<T> b(acq var1);
   }
}
