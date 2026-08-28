import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class awi {
   private static final Map<csm, Pair<String, String>> a = ImmutableMap.of(
      csm.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      csm.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      csm.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      csm.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<csm, awi.a> b;

   private awi(Map<csm, awi.a> $$0) {
      this.b = $$0;
   }

   public awi() {
      this(ad.a(Maps.newEnumMap(csm.class), $$0 -> {
         for (csm $$1 : csm.values()) {
            $$0.put($$1, new awi.a(false, false));
         }
      }));
   }

   public boolean a(csm $$0) {
      return this.b.get($$0).a;
   }

   public void a(csm $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(csm $$0) {
      return this.b.get($$0).b;
   }

   public void b(csm $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static awi a(wa $$0) {
      Map<csm, awi.a> $$1 = Maps.newEnumMap(csm.class);

      for (csm $$2 : csm.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new awi.a($$3, $$4));
      }

      return new awi($$1);
   }

   public void b(wa $$0) {
      for (csm $$1 : csm.values()) {
         awi.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static awi a(uf $$0) {
      Map<csm, awi.a> $$1 = Maps.newEnumMap(csm.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new awi.a($$4, $$5));
      });
      return new awi($$1);
   }

   public void b(uf $$0) {
      a.forEach(($$1, $$2) -> {
         awi.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public awi a() {
      Map<csm, awi.a> $$0 = Maps.newEnumMap(csm.class);

      for (csm $$1 : csm.values()) {
         awi.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new awi($$0);
   }

   public void a(awi $$0) {
      this.b.clear();

      for (csm $$1 : csm.values()) {
         awi.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awi && this.b.equals(((awi)$$0).b);
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

      public awi.a a() {
         return new awi.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof awi.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
