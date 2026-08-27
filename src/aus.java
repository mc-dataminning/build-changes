import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aus {
   private static final Map<cok, Pair<String, String>> a = ImmutableMap.of(
      cok.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cok.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cok.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cok.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cok, aus.a> b;

   private aus(Map<cok, aus.a> $$0) {
      this.b = $$0;
   }

   public aus() {
      this(ac.a(Maps.newEnumMap(cok.class), $$0 -> {
         for (cok $$1 : cok.values()) {
            $$0.put($$1, new aus.a(false, false));
         }
      }));
   }

   public boolean a(cok $$0) {
      return this.b.get($$0).a;
   }

   public void a(cok $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cok $$0) {
      return this.b.get($$0).b;
   }

   public void b(cok $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static aus a(vi $$0) {
      Map<cok, aus.a> $$1 = Maps.newEnumMap(cok.class);

      for (cok $$2 : cok.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aus.a($$3, $$4));
      }

      return new aus($$1);
   }

   public void b(vi $$0) {
      for (cok $$1 : cok.values()) {
         aus.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static aus a(to $$0) {
      Map<cok, aus.a> $$1 = Maps.newEnumMap(cok.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aus.a($$4, $$5));
      });
      return new aus($$1);
   }

   public void b(to $$0) {
      a.forEach(($$1, $$2) -> {
         aus.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aus a() {
      Map<cok, aus.a> $$0 = Maps.newEnumMap(cok.class);

      for (cok $$1 : cok.values()) {
         aus.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aus($$0);
   }

   public void a(aus $$0) {
      this.b.clear();

      for (cok $$1 : cok.values()) {
         aus.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aus && this.b.equals(((aus)$$0).b);
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   static final class a {
      boolean a;
      boolean b;

      public a(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aus.a a() {
         return new aus.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof aus.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a ? 1 : 0;
         return 31 * $$0 + (this.b ? 1 : 0);
      }

      @Override
      public String toString() {
         return "[open=" + this.a + ", filtering=" + this.b + "]";
      }
   }
}
