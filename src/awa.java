import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class awa {
   private static final Map<crd, Pair<String, String>> a = ImmutableMap.of(
      crd.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      crd.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      crd.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      crd.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<crd, awa.a> b;

   private awa(Map<crd, awa.a> $$0) {
      this.b = $$0;
   }

   public awa() {
      this(ac.a(Maps.newEnumMap(crd.class), $$0 -> {
         for (crd $$1 : crd.values()) {
            $$0.put($$1, new awa.a(false, false));
         }
      }));
   }

   public boolean a(crd $$0) {
      return this.b.get($$0).a;
   }

   public void a(crd $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(crd $$0) {
      return this.b.get($$0).b;
   }

   public void b(crd $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static awa a(wl $$0) {
      Map<crd, awa.a> $$1 = Maps.newEnumMap(crd.class);

      for (crd $$2 : crd.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new awa.a($$3, $$4));
      }

      return new awa($$1);
   }

   public void b(wl $$0) {
      for (crd $$1 : crd.values()) {
         awa.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static awa a(ur $$0) {
      Map<crd, awa.a> $$1 = Maps.newEnumMap(crd.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new awa.a($$4, $$5));
      });
      return new awa($$1);
   }

   public void b(ur $$0) {
      a.forEach(($$1, $$2) -> {
         awa.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public awa a() {
      Map<crd, awa.a> $$0 = Maps.newEnumMap(crd.class);

      for (crd $$1 : crd.values()) {
         awa.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new awa($$0);
   }

   public void a(awa $$0) {
      this.b.clear();

      for (crd $$1 : crd.values()) {
         awa.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awa && this.b.equals(((awa)$$0).b);
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

      public awa.a a() {
         return new awa.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof awa.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
