import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class duu<O, S> {
   public static final String b = "Name";
   public static final String c = "Properties";
   private static final Function<Entry<dvv<?>, Comparable<?>>, String> a = new Function<Entry<dvv<?>, Comparable<?>>, String>() {
      public String a(@Nullable Entry<dvv<?>, Comparable<?>> $$0) {
         if ($$0 == null) {
            return "<NULL>";
         } else {
            dvv<?> $$1 = $$0.getKey();
            return $$1.f() + "=" + this.a($$1, $$0.getValue());
         }
      }

      private <T extends Comparable<T>> String a(dvv<T> $$0, Comparable<?> $$1) {
         return $$0.a((T)$$1);
      }
   };
   protected final O d;
   private final Reference2ObjectArrayMap<dvv<?>, Comparable<?>> f;
   private Table<dvv<?>, Comparable<?>, S> g;
   protected final MapCodec<S> e;

   protected duu(O $$0, Reference2ObjectArrayMap<dvv<?>, Comparable<?>> $$1, MapCodec<S> $$2) {
      this.d = $$0;
      this.f = $$1;
      this.e = $$2;
   }

   public <T extends Comparable<T>> S a(dvv<T> $$0) {
      return this.b($$0, a($$0.a(), this.c($$0)));
   }

   protected static <T> T a(Collection<T> $$0, T $$1) {
      Iterator<T> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if ($$2.next().equals($$1)) {
            if ($$2.hasNext()) {
               return $$2.next();
            }

            return $$0.iterator().next();
         }
      }

      return $$2.next();
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

   public Collection<dvv<?>> F() {
      return Collections.unmodifiableCollection(this.f.keySet());
   }

   public <T extends Comparable<T>> boolean b(dvv<T> $$0) {
      return this.f.containsKey($$0);
   }

   public <T extends Comparable<T>> T c(dvv<T> $$0) {
      Comparable<?> $$1 = (Comparable<?>)this.f.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Cannot get property " + $$0 + " as it does not exist in " + this.d);
      } else {
         return $$0.g().cast($$1);
      }
   }

   public <T extends Comparable<T>> Optional<T> d(dvv<T> $$0) {
      return Optional.ofNullable(this.e($$0));
   }

   public <T extends Comparable<T>> T a(dvv<T> $$0, T $$1) {
      return Objects.requireNonNullElse(this.e($$0), $$1);
   }

   @Nullable
   public <T extends Comparable<T>> T e(dvv<T> $$0) {
      Comparable<?> $$1 = (Comparable<?>)this.f.get($$0);
      return $$1 == null ? null : $$0.g().cast($$1);
   }

   public <T extends Comparable<T>, V extends T> S b(dvv<T> $$0, V $$1) {
      Comparable<?> $$2 = (Comparable<?>)this.f.get($$0);
      if ($$2 == null) {
         throw new IllegalArgumentException("Cannot set property " + $$0 + " as it does not exist in " + this.d);
      } else if ($$2.equals($$1)) {
         return (S)this;
      } else {
         S $$3 = (S)this.g.get($$0, $$1);
         if ($$3 == null) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " to " + $$1 + " on " + this.d + ", it is not an allowed value");
         } else {
            return $$3;
         }
      }
   }

   public <T extends Comparable<T>, V extends T> S c(dvv<T> $$0, V $$1) {
      Comparable<?> $$2 = (Comparable<?>)this.f.get($$0);
      if ($$2 != null && !$$2.equals($$1)) {
         S $$3 = (S)this.g.get($$0, $$1);
         if ($$3 == null) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " to " + $$1 + " on " + this.d + ", it is not an allowed value");
         } else {
            return $$3;
         }
      } else {
         return (S)this;
      }
   }

   public void a(Map<Map<dvv<?>, Comparable<?>>, S> $$0) {
      if (this.g != null) {
         throw new IllegalStateException();
      } else {
         Table<dvv<?>, Comparable<?>, S> $$1 = HashBasedTable.create();
         ObjectIterator var3 = this.f.entrySet().iterator();

         while (var3.hasNext()) {
            Entry<dvv<?>, Comparable<?>> $$2 = (Entry<dvv<?>, Comparable<?>>)var3.next();
            dvv<?> $$3 = $$2.getKey();

            for (Comparable<?> $$4 : $$3.a()) {
               if (!$$4.equals($$2.getValue())) {
                  $$1.put($$3, $$4, $$0.get(this.d($$3, $$4)));
               }
            }
         }

         this.g = (Table<dvv<?>, Comparable<?>, S>)($$1.isEmpty() ? $$1 : ArrayTable.create($$1));
      }
   }

   private Map<dvv<?>, Comparable<?>> d(dvv<?> $$0, Comparable<?> $$1) {
      Map<dvv<?>, Comparable<?>> $$2 = new Reference2ObjectArrayMap(this.f);
      $$2.put($$0, $$1);
      return $$2;
   }

   public Map<dvv<?>, Comparable<?>> G() {
      return this.f;
   }

   protected static <O, S extends duu<O, S>> Codec<S> a(Codec<O> $$0, Function<O, S> $$1) {
      return $$0.dispatch("Name", $$0x -> $$0x.d, $$1x -> {
         S $$2 = $$1.apply((O)$$1x);
         return $$2.G().isEmpty() ? MapCodec.unit($$2) : $$2.e.codec().lenientOptionalFieldOf("Properties").xmap($$1xx -> $$1xx.orElse($$2), Optional::of);
      });
   }
}
