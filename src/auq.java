import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class auq {
   private static final Map<cod, Pair<String, String>> a = ImmutableMap.of(
      cod.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cod.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cod.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cod.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cod, auq.a> b;

   private auq(Map<cod, auq.a> $$0) {
      this.b = $$0;
   }

   public auq() {
      this(ac.a(Maps.newEnumMap(cod.class), $$0 -> {
         for (cod $$1 : cod.values()) {
            $$0.put($$1, new auq.a(false, false));
         }
      }));
   }

   public boolean a(cod $$0) {
      return this.b.get($$0).a;
   }

   public void a(cod $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cod $$0) {
      return this.b.get($$0).b;
   }

   public void b(cod $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static auq a(vg $$0) {
      Map<cod, auq.a> $$1 = Maps.newEnumMap(cod.class);

      for (cod $$2 : cod.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new auq.a($$3, $$4));
      }

      return new auq($$1);
   }

   public void b(vg $$0) {
      for (cod $$1 : cod.values()) {
         auq.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static auq a(tm $$0) {
      Map<cod, auq.a> $$1 = Maps.newEnumMap(cod.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new auq.a($$4, $$5));
      });
      return new auq($$1);
   }

   public void b(tm $$0) {
      a.forEach(($$1, $$2) -> {
         auq.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public auq a() {
      Map<cod, auq.a> $$0 = Maps.newEnumMap(cod.class);

      for (cod $$1 : cod.values()) {
         auq.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new auq($$0);
   }

   public void a(auq $$0) {
      this.b.clear();

      for (cod $$1 : cod.values()) {
         auq.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof auq && this.b.equals(((auq)$$0).b);
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

      public auq.a a() {
         return new auq.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof auq.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
