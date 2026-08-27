import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class arx {
   private static final Map<cjx, Pair<String, String>> a = ImmutableMap.of(
      cjx.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cjx.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cjx.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cjx.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cjx, arx.a> b;

   private arx(Map<cjx, arx.a> $$0) {
      this.b = $$0;
   }

   public arx() {
      this(ac.a(Maps.newEnumMap(cjx.class), $$0 -> {
         for (cjx $$1 : cjx.values()) {
            $$0.put($$1, new arx.a(false, false));
         }
      }));
   }

   public boolean a(cjx $$0) {
      return this.b.get($$0).a;
   }

   public void a(cjx $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cjx $$0) {
      return this.b.get($$0).b;
   }

   public void b(cjx $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static arx a(uj $$0) {
      Map<cjx, arx.a> $$1 = Maps.newEnumMap(cjx.class);

      for (cjx $$2 : cjx.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new arx.a($$3, $$4));
      }

      return new arx($$1);
   }

   public void b(uj $$0) {
      for (cjx $$1 : cjx.values()) {
         arx.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static arx a(so $$0) {
      Map<cjx, arx.a> $$1 = Maps.newEnumMap(cjx.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new arx.a($$4, $$5));
      });
      return new arx($$1);
   }

   public void b(so $$0) {
      a.forEach(($$1, $$2) -> {
         arx.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public arx a() {
      Map<cjx, arx.a> $$0 = Maps.newEnumMap(cjx.class);

      for (cjx $$1 : cjx.values()) {
         arx.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new arx($$0);
   }

   public void a(arx $$0) {
      this.b.clear();

      for (cjx $$1 : cjx.values()) {
         arx.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof arx && this.b.equals(((arx)$$0).b);
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

      public arx.a a() {
         return new arx.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof arx.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
