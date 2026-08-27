import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aqh {
   private static final Map<cha, Pair<String, String>> a = ImmutableMap.of(
      cha.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cha.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cha.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cha.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cha, aqh.a> b;

   private aqh(Map<cha, aqh.a> $$0) {
      this.b = $$0;
   }

   public aqh() {
      this(ac.a(Maps.newEnumMap(cha.class), $$0 -> {
         for (cha $$1 : cha.values()) {
            $$0.put($$1, new aqh.a(false, false));
         }
      }));
   }

   public boolean a(cha $$0) {
      return this.b.get($$0).a;
   }

   public void a(cha $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cha $$0) {
      return this.b.get($$0).b;
   }

   public void b(cha $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static aqh a(tl $$0) {
      Map<cha, aqh.a> $$1 = Maps.newEnumMap(cha.class);

      for (cha $$2 : cha.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aqh.a($$3, $$4));
      }

      return new aqh($$1);
   }

   public void b(tl $$0) {
      for (cha $$1 : cha.values()) {
         aqh.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static aqh a(rt $$0) {
      Map<cha, aqh.a> $$1 = Maps.newEnumMap(cha.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aqh.a($$4, $$5));
      });
      return new aqh($$1);
   }

   public void b(rt $$0) {
      a.forEach(($$1, $$2) -> {
         aqh.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aqh a() {
      Map<cha, aqh.a> $$0 = Maps.newEnumMap(cha.class);

      for (cha $$1 : cha.values()) {
         aqh.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aqh($$0);
   }

   public void a(aqh $$0) {
      this.b.clear();

      for (cha $$1 : cha.values()) {
         aqh.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aqh && this.b.equals(((aqh)$$0).b);
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

      public aqh.a a() {
         return new aqh.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof aqh.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
