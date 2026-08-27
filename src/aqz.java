import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aqz {
   private static final Map<cif, Pair<String, String>> a = ImmutableMap.of(
      cif.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cif.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cif.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cif.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cif, aqz.a> b;

   private aqz(Map<cif, aqz.a> $$0) {
      this.b = $$0;
   }

   public aqz() {
      this(ac.a(Maps.newEnumMap(cif.class), $$0 -> {
         for (cif $$1 : cif.values()) {
            $$0.put($$1, new aqz.a(false, false));
         }
      }));
   }

   public boolean a(cif $$0) {
      return this.b.get($$0).a;
   }

   public void a(cif $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cif $$0) {
      return this.b.get($$0).b;
   }

   public void b(cif $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static aqz a(ty $$0) {
      Map<cif, aqz.a> $$1 = Maps.newEnumMap(cif.class);

      for (cif $$2 : cif.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aqz.a($$3, $$4));
      }

      return new aqz($$1);
   }

   public void b(ty $$0) {
      for (cif $$1 : cif.values()) {
         aqz.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static aqz a(sd $$0) {
      Map<cif, aqz.a> $$1 = Maps.newEnumMap(cif.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aqz.a($$4, $$5));
      });
      return new aqz($$1);
   }

   public void b(sd $$0) {
      a.forEach(($$1, $$2) -> {
         aqz.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aqz a() {
      Map<cif, aqz.a> $$0 = Maps.newEnumMap(cif.class);

      for (cif $$1 : cif.values()) {
         aqz.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aqz($$0);
   }

   public void a(aqz $$0) {
      this.b.clear();

      for (cif $$1 : cif.values()) {
         aqz.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aqz && this.b.equals(((aqz)$$0).b);
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

      public aqz.a a() {
         return new aqz.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof aqz.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
