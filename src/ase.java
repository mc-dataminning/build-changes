import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ase {
   private static final Codec<ase> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.p.fieldOf("id").forGetter(ase::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, ase::new)
   );
   public static final Codec<ase> a = Codec.either(atg.p, b)
      .xmap($$0 -> (ase)$$0.map($$0x -> new ase($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final agt c;
   private final boolean d;
   private final boolean e;

   private ase(agt $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private ase(atg.f $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private atg.f a() {
      return new atg.f(this.c, this.d);
   }

   public static ase a(agt $$0) {
      return new ase($$0, false, true);
   }

   public static ase b(agt $$0) {
      return new ase($$0, false, false);
   }

   public static ase c(agt $$0) {
      return new ase($$0, true, true);
   }

   public static ase d(agt $$0) {
      return new ase($$0, true, false);
   }

   public <T> boolean a(ase.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<agt> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<agt> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<agt> $$0, Predicate<agt> $$1) {
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
      T a(agt var1);

      @Nullable
      Collection<T> b(agt var1);
   }
}
