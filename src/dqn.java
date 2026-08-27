import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class dqn {
   private static final Joiner a = Joiner.on(",");
   private final List<String[]> b = Lists.newArrayList();
   private final Map<Character, Predicate<dql>> c = Maps.newHashMap();
   private int d;
   private int e;

   private dqn() {
      this.c.put(' ', $$0 -> true);
   }

   public dqn a(String... $$0) {
      if (!ArrayUtils.isEmpty($$0) && !StringUtils.isEmpty($$0[0])) {
         if (this.b.isEmpty()) {
            this.d = $$0.length;
            this.e = $$0[0].length();
         }

         if ($$0.length != this.d) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + $$0.length + ")");
         } else {
            for (String $$1 : $$0) {
               if ($$1.length() != this.e) {
                  throw new IllegalArgumentException(
                     "Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + $$1.length() + ")"
                  );
               }

               for (char $$2 : $$1.toCharArray()) {
                  if (!this.c.containsKey($$2)) {
                     this.c.put($$2, null);
                  }
               }
            }

            this.b.add($$0);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static dqn a() {
      return new dqn();
   }

   public dqn a(char $$0, Predicate<dql> $$1) {
      this.c.put($$0, $$1);
      return this;
   }

   public dqm b() {
      return new dqm(this.c());
   }

   private Predicate<dql>[][][] c() {
      this.d();
      Predicate<dql>[][][] $$0 = (Predicate<dql>[][][])Array.newInstance(Predicate.class, this.b.size(), this.d, this.e);

      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         for (int $$2 = 0; $$2 < this.d; $$2++) {
            for (int $$3 = 0; $$3 < this.e; $$3++) {
               $$0[$$1][$$2][$$3] = this.c.get(this.b.get($$1)[$$2].charAt($$3));
            }
         }
      }

      return $$0;
   }

   private void d() {
      List<Character> $$0 = Lists.newArrayList();

      for (Entry<Character, Predicate<dql>> $$1 : this.c.entrySet()) {
         if ($$1.getValue() == null) {
            $$0.add($$1.getKey());
         }
      }

      if (!$$0.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + a.join($$0) + " are missing");
      }
   }
}
