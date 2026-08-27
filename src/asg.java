import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class asg<T> extends AbstractCollection<T> {
   private final Map<Class<?>, List<T>> a = Maps.newHashMap();
   private final Class<T> b;
   private final List<T> c = Lists.newArrayList();

   public asg(Class<T> $$0) {
      this.b = $$0;
      this.a.put($$0, this.c);
   }

   @Override
   public boolean add(T $$0) {
      boolean $$1 = false;

      for (Entry<Class<?>, List<T>> $$2 : this.a.entrySet()) {
         if ($$2.getKey().isInstance($$0)) {
            $$1 |= $$2.getValue().add($$0);
         }
      }

      return $$1;
   }

   @Override
   public boolean remove(Object $$0) {
      boolean $$1 = false;

      for (Entry<Class<?>, List<T>> $$2 : this.a.entrySet()) {
         if ($$2.getKey().isInstance($$0)) {
            List<T> $$3 = $$2.getValue();
            $$1 |= $$3.remove($$0);
         }
      }

      return $$1;
   }

   @Override
   public boolean contains(Object $$0) {
      return this.a($$0.getClass()).contains($$0);
   }

   public <S> Collection<S> a(Class<S> $$0) {
      if (!this.b.isAssignableFrom($$0)) {
         throw new IllegalArgumentException("Don't know how to search for " + $$0);
      } else {
         List<? extends T> $$1 = this.a.computeIfAbsent($$0, $$0x -> this.c.stream().filter($$0x::isInstance).collect(Collectors.toList()));
         return (Collection<S>)Collections.unmodifiableCollection($$1);
      }
   }

   @Override
   public Iterator<T> iterator() {
      return (Iterator<T>)(this.c.isEmpty() ? Collections.emptyIterator() : Iterators.unmodifiableIterator(this.c.iterator()));
   }

   public List<T> a() {
      return ImmutableList.copyOf(this.c);
   }

   @Override
   public int size() {
      return this.c.size();
   }
}
