import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dmg<O, S> {
   public static final String c = "Name";
   public static final String d = "Properties";
   private static final Function<Entry<dnh<?>, Comparable<?>>, String> a = new Function<Entry<dnh<?>, Comparable<?>>, String>() {
      public String a(@Nullable Entry<dnh<?>, Comparable<?>> $$0) {
         if ($$0 == null) {
            return "<NULL>";
         } else {
            dnh<?> $$1 = $$0.getKey();
            return $$1.f() + "=" + this.a($$1, $$0.getValue());
         }
      }

      private <T extends Comparable<T>> String a(dnh<T> $$0, Comparable<?> $$1) {
         return $$0.a((T)$$1);
      }
   };
   protected final O e;
   private final ImmutableMap<dnh<?>, Comparable<?>> b;
   private Table<dnh<?>, Comparable<?>, S> g;
   protected final MapCodec<S> f;

   protected dmg(O $$0, ImmutableMap<dnh<?>, Comparable<?>> $$1, MapCodec<S> $$2) {
      this.e = $$0;
      this.b = $$1;
      this.f = $$2;
   }

   public <T extends Comparable<T>> S a(dnh<T> $$0) {
      return this.a($$0, a($$0.a(), this.c($$0)));
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
      $$0.append(this.e);
      if (!this.C().isEmpty()) {
         $$0.append('[');
         $$0.append(this.C().entrySet().stream().map(a).collect(Collectors.joining(",")));
         $$0.append(']');
      }

      return $$0.toString();
   }

   public Collection<dnh<?>> B() {
      return Collections.unmodifiableCollection(this.b.keySet());
   }

   public <T extends Comparable<T>> boolean b(dnh<T> $$0) {
      return this.b.containsKey($$0);
   }

   public <T extends Comparable<T>> T c(dnh<T> $$0) {
      Comparable<?> $$1 = (Comparable<?>)this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Cannot get property " + $$0 + " as it does not exist in " + this.e);
      } else {
         return $$0.g().cast($$1);
      }
   }

   public <T extends Comparable<T>> Optional<T> d(dnh<T> $$0) {
      Comparable<?> $$1 = (Comparable<?>)this.b.get($$0);
      return $$1 == null ? Optional.empty() : Optional.of($$0.g().cast($$1));
   }

   public <T extends Comparable<T>, V extends T> S a(dnh<T> $$0, V $$1) {
      Comparable<?> $$2 = (Comparable<?>)this.b.get($$0);
      if ($$2 == null) {
         throw new IllegalArgumentException("Cannot set property " + $$0 + " as it does not exist in " + this.e);
      } else if ($$2.equals($$1)) {
         return (S)this;
      } else {
         S $$3 = (S)this.g.get($$0, $$1);
         if ($$3 == null) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " to " + $$1 + " on " + this.e + ", it is not an allowed value");
         } else {
            return $$3;
         }
      }
   }

   public <T extends Comparable<T>, V extends T> S b(dnh<T> $$0, V $$1) {
      Comparable<?> $$2 = (Comparable<?>)this.b.get($$0);
      if ($$2 != null && !$$2.equals($$1)) {
         S $$3 = (S)this.g.get($$0, $$1);
         if ($$3 == null) {
            throw new IllegalArgumentException("Cannot set property " + $$0 + " to " + $$1 + " on " + this.e + ", it is not an allowed value");
         } else {
            return $$3;
         }
      } else {
         return (S)this;
      }
   }

   public void a(Map<Map<dnh<?>, Comparable<?>>, S> $$0) {
      if (this.g != null) {
         throw new IllegalStateException();
      } else {
         Table<dnh<?>, Comparable<?>, S> $$1 = HashBasedTable.create();
         UnmodifiableIterator var3 = this.b.entrySet().iterator();

         while (var3.hasNext()) {
            Entry<dnh<?>, Comparable<?>> $$2 = (Entry<dnh<?>, Comparable<?>>)var3.next();
            dnh<?> $$3 = $$2.getKey();

            for (Comparable<?> $$4 : $$3.a()) {
               if (!$$4.equals($$2.getValue())) {
                  $$1.put($$3, $$4, $$0.get(this.c($$3, $$4)));
               }
            }
         }

         this.g = (Table<dnh<?>, Comparable<?>, S>)($$1.isEmpty() ? $$1 : ArrayTable.create($$1));
      }
   }

   private Map<dnh<?>, Comparable<?>> c(dnh<?> $$0, Comparable<?> $$1) {
      Map<dnh<?>, Comparable<?>> $$2 = Maps.newHashMap(this.b);
      $$2.put($$0, $$1);
      return $$2;
   }

   public ImmutableMap<dnh<?>, Comparable<?>> C() {
      return this.b;
   }

   protected static <O, S extends dmg<O, S>> Codec<S> a(Codec<O> $$0, Function<O, S> $$1) {
      return $$0.dispatch("Name", $$0x -> $$0x.e, $$1x -> {
         S $$2 = $$1.apply((O)$$1x);
         return $$2.C().isEmpty() ? Codec.unit($$2) : $$2.f.codec().optionalFieldOf("Properties").xmap($$1xx -> $$1xx.orElse($$2), Optional::of).codec();
      });
   }
}
