import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class avg {
   private static final Map<cps, Pair<String, String>> a = ImmutableMap.of(
      cps.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cps.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cps.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cps.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cps, avg.a> b;

   private avg(Map<cps, avg.a> $$0) {
      this.b = $$0;
   }

   public avg() {
      this(ac.a(Maps.newEnumMap(cps.class), $$0 -> {
         for (cps $$1 : cps.values()) {
            $$0.put($$1, new avg.a(false, false));
         }
      }));
   }

   public boolean a(cps $$0) {
      return this.b.get($$0).a;
   }

   public void a(cps $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cps $$0) {
      return this.b.get($$0).b;
   }

   public void b(cps $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static avg a(vu $$0) {
      Map<cps, avg.a> $$1 = Maps.newEnumMap(cps.class);

      for (cps $$2 : cps.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new avg.a($$3, $$4));
      }

      return new avg($$1);
   }

   public void b(vu $$0) {
      for (cps $$1 : cps.values()) {
         avg.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static avg a(ua $$0) {
      Map<cps, avg.a> $$1 = Maps.newEnumMap(cps.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new avg.a($$4, $$5));
      });
      return new avg($$1);
   }

   public void b(ua $$0) {
      a.forEach(($$1, $$2) -> {
         avg.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public avg a() {
      Map<cps, avg.a> $$0 = Maps.newEnumMap(cps.class);

      for (cps $$1 : cps.values()) {
         avg.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new avg($$0);
   }

   public void a(avg $$0) {
      this.b.clear();

      for (cps $$1 : cps.values()) {
         avg.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof avg && this.b.equals(((avg)$$0).b);
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

      public avg.a a() {
         return new avg.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof avg.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
