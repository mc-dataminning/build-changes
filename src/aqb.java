import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aqb {
   private static final Codec<aqb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(arb.o.fieldOf("id").forGetter(aqb::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, aqb::new)
   );
   public static final Codec<aqb> a = Codec.either(arb.o, b)
      .xmap($$0 -> (aqb)$$0.map($$0x -> new aqb($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final aeu c;
   private final boolean d;
   private final boolean e;

   private aqb(aeu $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private aqb(arb.f $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private arb.f a() {
      return new arb.f(this.c, this.d);
   }

   public static aqb a(aeu $$0) {
      return new aqb($$0, false, true);
   }

   public static aqb b(aeu $$0) {
      return new aqb($$0, false, false);
   }

   public static aqb c(aeu $$0) {
      return new aqb($$0, true, true);
   }

   public static aqb d(aeu $$0) {
      return new aqb($$0, true, false);
   }

   public <T> boolean a(aqb.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<aeu> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<aeu> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<aeu> $$0, Predicate<aeu> $$1) {
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
      T a(aeu var1);

      @Nullable
      Collection<T> b(aeu var1);
   }
}
