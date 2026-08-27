import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class ato {
   private static final Map<clp, Pair<String, String>> a = ImmutableMap.of(
      clp.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      clp.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      clp.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      clp.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<clp, ato.a> b;

   private ato(Map<clp, ato.a> $$0) {
      this.b = $$0;
   }

   public ato() {
      this(ac.a(Maps.newEnumMap(clp.class), $$0 -> {
         for (clp $$1 : clp.values()) {
            $$0.put($$1, new ato.a(false, false));
         }
      }));
   }

   public boolean a(clp $$0) {
      return this.b.get($$0).a;
   }

   public void a(clp $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(clp $$0) {
      return this.b.get($$0).b;
   }

   public void b(clp $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static ato a(uq $$0) {
      Map<clp, ato.a> $$1 = Maps.newEnumMap(clp.class);

      for (clp $$2 : clp.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new ato.a($$3, $$4));
      }

      return new ato($$1);
   }

   public void b(uq $$0) {
      for (clp $$1 : clp.values()) {
         ato.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static ato a(sw $$0) {
      Map<clp, ato.a> $$1 = Maps.newEnumMap(clp.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new ato.a($$4, $$5));
      });
      return new ato($$1);
   }

   public void b(sw $$0) {
      a.forEach(($$1, $$2) -> {
         ato.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public ato a() {
      Map<clp, ato.a> $$0 = Maps.newEnumMap(clp.class);

      for (clp $$1 : clp.values()) {
         ato.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new ato($$0);
   }

   public void a(ato $$0) {
      this.b.clear();

      for (clp $$1 : clp.values()) {
         ato.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof ato && this.b.equals(((ato)$$0).b);
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

      public ato.a a() {
         return new ato.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof ato.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
