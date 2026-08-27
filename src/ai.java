import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Predicate;

public record ai(String[][] b) {
   public static final ai a = new ai(new String[0][]);

   public ai(ty $$0) {
      this(b($$0));
   }

   private static String[][] b(ty $$0) {
      String[][] $$1 = new String[$$0.n()][];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = new String[$$0.n()];

         for (int $$3 = 0; $$3 < $$1[$$2].length; $$3++) {
            $$1[$$2][$$3] = $$0.s();
         }
      }

      return $$1;
   }

   public void a(ty $$0) {
      $$0.c(this.b.length);

      for (String[] $$1 : this.b) {
         $$0.c($$1.length);

         for (String $$2 : $$1) {
            $$0.a($$2);
         }
      }
   }

   public static ai a(Collection<String> $$0) {
      return new ai($$0.stream().map($$0x -> new String[]{$$0x}).toArray(String[][]::new));
   }

   public static ai b(Collection<String> $$0) {
      return new ai(new String[][]{$$0.toArray(String[]::new)});
   }

   public int a() {
      return this.b.length;
   }

   public boolean a(Predicate<String> $$0) {
      if (this.b.length == 0) {
         return false;
      } else {
         for (String[] $$1 : this.b) {
            if (!a($$1, $$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public int b(Predicate<String> $$0) {
      int $$1 = 0;

      for (String[] $$2 : this.b) {
         if (a($$2, $$0)) {
            $$1++;
         }
      }

      return $$1;
   }

   private static boolean a(String[] $$0, Predicate<String> $$1) {
      for (String $$2 : $$0) {
         if ($$1.test($$2)) {
            return true;
         }
      }

      return false;
   }

   public static ai a(JsonArray $$0, Set<String> $$1) {
      String[][] $$2 = new String[$$0.size()][];
      Set<String> $$3 = new ObjectOpenHashSet();

      for (int $$4 = 0; $$4 < $$0.size(); $$4++) {
         JsonArray $$5 = atg.n($$0.get($$4), "requirements[" + $$4 + "]");
         if ($$5.isEmpty() && $$1.isEmpty()) {
            throw new JsonSyntaxException("Requirement entry cannot be empty");
         }

         $$2[$$4] = new String[$$5.size()];

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            String $$7 = atg.a($$5.get($$6), "requirements[" + $$4 + "][" + $$6 + "]");
            $$2[$$4][$$6] = $$7;
            $$3.add($$7);
         }
      }

      if (!$$1.equals($$3)) {
         Set<String> $$8 = Sets.difference($$1, $$3);
         Set<String> $$9 = Sets.difference($$3, $$1);
         throw new JsonSyntaxException("Advancement completion requirements did not exactly match specified criteria. Missing: " + $$8 + ". Unknown: " + $$9);
      } else {
         return new ai($$2);
      }
   }

   public JsonArray b() {
      JsonArray $$0 = new JsonArray();

      for (String[] $$1 : this.b) {
         JsonArray $$2 = new JsonArray();
         Arrays.stream($$1).forEach($$2::add);
         $$0.add($$2);
      }

      return $$0;
   }

   public boolean c() {
      return this.b.length == 0;
   }

   @Override
   public String toString() {
      return Arrays.deepToString(this.b);
   }

   public Set<String> d() {
      Set<String> $$0 = new ObjectOpenHashSet();

      for (String[] $$1 : this.b) {
         Collections.addAll($$0, $$1);
      }

      return $$0;
   }

   public String[][] e() {
      return this.b;
   }

   public interface a {
      ai.a a = ai::a;
      ai.a b = ai::b;

      ai create(Collection<String> var1);
   }
}
