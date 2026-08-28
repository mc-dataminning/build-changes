import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eav<O, S> {
   public static final String b = "Name";
   public static final String c = "Properties";
   private static final Function<Entry<ebw<?>, Comparable<?>>, String> a = new Function<Entry<ebw<?>, Comparable<?>>, String>() {
      public String a(@Nullable Entry<ebw<?>, Comparable<?>> $$0) {
         if ($$0 == null) {
            return "<NULL>";
         } else {
            ebw<?> $$1 = $$0.getKey();
            return $$1.f() + "=" + this.a($$1, $$0.getValue());
         }
      }

      private <T extends Comparable<T>> String a(ebw<T> $$0, Comparable<?> $$1) {
         return $$0.b((T)$$1);
      }
   };
   protected final O d;
   private final Reference2ObjectArrayMap<ebw<?>, Comparable<?>> f;
   private Map<ebw<?>, S[]> g;
   protected final MapCodec<S> e;

   protected eav(O $$0, Reference2ObjectArrayMap<ebw<?>, Comparable<?>> $$1, MapCodec<S> $$2) {
      this.d = $$0;
      this.f = $$1;
      this.e = $$2;
   }

   public <T extends Comparable<T>> S a(ebw<T> $$0) {
      return this.b($$0, a($$0.a(), this.c($$0)));
   }

   protected static <T> T a(List<T> $$0, T $$1) {
      int $$2 = $$0.indexOf($$1) + 1;
      return $$2 == $$0.size() ? $$0.getFirst() : $$0.get($$2);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append(this.d);
      if (!this.G().isEmpty()) {
         $$0.append('[');
         $$0.append(this.G().entrySet().stream().map(a).collect(Collectors.joining(",")));
         $$0.append(']');
      }

      return $$0.toString();
   }

   @Override
   public final boolean equals(Object $$0) {
      return super.equals($$0);
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   public Collection<ebw<?>> F() {
      return Collections.unmodifiableCollection(this.f.keySet());
   }

   public boolean b(ebw<?> $$0) {
      return this.f.containsKey($$0);
   }

   public <T extends Comparable<T>> T c(ebw<T> $$0) {
      Comparable<?> $$1 = (Comparable<?>)this.f.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Cannot get property " + $$0 + " as it does not exist in " + this.d);
      } else {
         return $$0.g().cast($$1);
      }
   }

   public <T extends Comparable<T>> Optional<T> d(ebw<T> $$0) {
      return Optional.ofNullable(this.e($$0));
   }

   public <T extends Comparable<T>> T a(ebw<T> $$0, T $$1) {
      return Objects.requireNonNullElse(this.e($$0), $$1);
   }

   @Nullable
   private <T extends Comparable<T>> T e(ebw<T> $$0) {
      Comparable<?> $$1 = (Comparable<?>)this.f.get($$0);
      return $$1 == null ? null : $$0.g().cast($$1);
   }

   public <T extends Comparable<T>, V extends T> S b(ebw<T> $$0, V $$1) {
      Comparable<?> $$2 = (Comparable<?>)this.f.get($$0);
      if ($$2 == null) {
         throw new IllegalArgumentException("Cannot set property " + $$0 + " as it does not exist in " + this.d);
      } else {
         return this.a($$0, $$1, $$2);
      }
   }

   public <T extends Comparable<T>, V extends T> S c(ebw<T> $$0, V $$1) {
      Comparable<?> $$2 = (Comparable<?>)this.f.get($$0);
      return (S)($$2 == null ? this : this.a($$0, $$1, $$2));
   }

   private <T extends Comparable<T>, V extends T> S a(ebw<T> $$0, V $$1, Comparable<?> $$2) {
      if ($$2.equals($$1)) {
         return (S)this;
      } else {
         int $$3 = $$0.a((T)$$1);
         if ($$3 < 0) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " to " + $$1 + " on " + this.d + ", it is not an allowed value");
         } else {
            return (S)this.g.get($$0)[$$3];
         }
      }
   }

   public void a(Map<Map<ebw<?>, Comparable<?>>, S> $$0) {
      if (this.g != null) {
         throw new IllegalStateException();
      } else {
         Map<ebw<?>, S[]> $$1 = new Reference2ObjectArrayMap(this.f.size());
         ObjectIterator var3 = this.f.entrySet().iterator();

         while (var3.hasNext()) {
            Entry<ebw<?>, Comparable<?>> $$2 = (Entry<ebw<?>, Comparable<?>>)var3.next();
            ebw<?> $$3 = $$2.getKey();
            $$1.put($$3, $$3.a().stream().map($$2x -> $$0.get(this.d($$3, $$2x))).toArray());
         }

         this.g = $$1;
      }
   }

   private Map<ebw<?>, Comparable<?>> d(ebw<?> $$0, Comparable<?> $$1) {
      Map<ebw<?>, Comparable<?>> $$2 = new Reference2ObjectArrayMap(this.f);
      $$2.put($$0, $$1);
      return $$2;
   }

   public Map<ebw<?>, Comparable<?>> G() {
      return this.f;
   }

   protected static <O, S extends eav<O, S>> Codec<S> a(Codec<O> $$0, Function<O, S> $$1) {
      return $$0.dispatch("Name", $$0x -> $$0x.d, $$1x -> {
         S $$2 = $$1.apply((O)$$1x);
         return $$2.G().isEmpty() ? MapCodec.unit($$2) : $$2.e.codec().lenientOptionalFieldOf("Properties").xmap($$1xx -> $$1xx.orElse($$2), Optional::of);
      });
   }
}
