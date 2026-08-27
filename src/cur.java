import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class cur {
   public static <T> List<cur.b> a(List<T> $$0, Function<T, List<il<dyd>>> $$1, boolean $$2) {
      Object2IntMap<dyd> $$3 = new Object2IntOpenHashMap();
      MutableInt $$4 = new MutableInt(0);

      record a(int a, int b, dyd c) {
      }

      Comparator<a> $$5 = Comparator.comparingInt(a::b).thenComparingInt(a::a);
      Map<a, Set<a>> $$6 = new TreeMap<>($$5);
      int $$7 = 0;

      for (T $$8 : $$0) {
         List<a> $$9 = Lists.newArrayList();
         List<il<dyd>> $$10 = $$1.apply($$8);
         $$7 = Math.max($$7, $$10.size());

         for (int $$11 = 0; $$11 < $$10.size(); $$11++) {
            for (ih<dyd> $$12 : $$10.get($$11)) {
               dyd $$13 = $$12.a();
               $$9.add(new a($$3.computeIfAbsent($$13, $$1x -> $$4.getAndIncrement()), $$11, $$13));
            }
         }

         for (int $$14 = 0; $$14 < $$9.size(); $$14++) {
            Set<a> $$15 = $$6.computeIfAbsent($$9.get($$14), $$1x -> new TreeSet<>($$5));
            if ($$14 < $$9.size() - 1) {
               $$15.add($$9.get($$14 + 1));
            }
         }
      }

      Set<a> $$16 = new TreeSet<>($$5);
      Set<a> $$17 = new TreeSet<>($$5);
      List<a> $$18 = Lists.newArrayList();

      for (a $$19 : $$6.keySet()) {
         if (!$$17.isEmpty()) {
            throw new IllegalStateException("You somehow broke the universe; DFS bork (iteration finished with non-empty in-progress vertex set");
         }

         if (!$$16.contains($$19) && atx.a($$6, $$16, $$17, $$18::add, $$19)) {
            if (!$$2) {
               throw new IllegalStateException("Feature order cycle found");
            }

            List<T> $$20 = new ArrayList<>($$0);

            int $$21;
            do {
               $$21 = $$20.size();
               ListIterator<T> $$22 = $$20.listIterator();

               while ($$22.hasNext()) {
                  T $$23 = $$22.next();
                  $$22.remove();

                  try {
                     a($$20, $$1, false);
                  } catch (IllegalStateException var18) {
                     continue;
                  }

                  $$22.add($$23);
               }
            } while ($$21 != $$20.size());

            throw new IllegalStateException("Feature order cycle found, involved sources: " + $$20);
         }
      }

      Collections.reverse($$18);
      Builder<cur.b> $$25 = ImmutableList.builder();

      for (int $$26 = 0; $$26 < $$7; $$26++) {
         int $$27 = $$26;
         List<dyd> $$28 = $$18.stream().filter($$1x -> $$1x.b() == $$27).map(a::c).collect(Collectors.toList());
         $$25.add(new cur.b($$28));
      }

      return $$25.build();
   }

   public static record b(List<dyd> a, ToIntFunction<dyd> b) {
      b(List<dyd> $$0) {
         this($$0, ac.f($$0));
      }
   }
}
