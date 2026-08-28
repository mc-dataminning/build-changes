import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class awe {
   private static final Map<cri, Pair<String, String>> a = ImmutableMap.of(
      cri.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cri.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cri.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cri.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cri, awe.a> b;

   private awe(Map<cri, awe.a> $$0) {
      this.b = $$0;
   }

   public awe() {
      this(ac.a(Maps.newEnumMap(cri.class), $$0 -> {
         for (cri $$1 : cri.values()) {
            $$0.put($$1, new awe.a(false, false));
         }
      }));
   }

   public boolean a(cri $$0) {
      return this.b.get($$0).a;
   }

   public void a(cri $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cri $$0) {
      return this.b.get($$0).b;
   }

   public void b(cri $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static awe a(wm $$0) {
      Map<cri, awe.a> $$1 = Maps.newEnumMap(cri.class);

      for (cri $$2 : cri.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new awe.a($$3, $$4));
      }

      return new awe($$1);
   }

   public void b(wm $$0) {
      for (cri $$1 : cri.values()) {
         awe.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static awe a(us $$0) {
      Map<cri, awe.a> $$1 = Maps.newEnumMap(cri.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new awe.a($$4, $$5));
      });
      return new awe($$1);
   }

   public void b(us $$0) {
      a.forEach(($$1, $$2) -> {
         awe.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public awe a() {
      Map<cri, awe.a> $$0 = Maps.newEnumMap(cri.class);

      for (cri $$1 : cri.values()) {
         awe.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new awe($$0);
   }

   public void a(awe $$0) {
      this.b.clear();

      for (cri $$1 : cri.values()) {
         awe.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awe && this.b.equals(((awe)$$0).b);
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

      public awe.a a() {
         return new awe.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof awe.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
