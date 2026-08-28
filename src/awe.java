import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awe {
   public static final yn<vl, awe> a = yn.a(awe::b, awe::a);
   private static final Map<cum, Pair<String, String>> b = ImmutableMap.of(
      cum.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cum.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cum.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cum.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cum, awe.a> c;

   private awe(Map<cum, awe.a> $$0) {
      this.c = $$0;
   }

   public awe() {
      this(new EnumMap<>(cum.class));
   }

   private awe.a c(cum $$0) {
      return this.c.getOrDefault($$0, awe.a.a);
   }

   private void a(cum $$0, UnaryOperator<awe.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awe.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awe.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cum $$0) {
      return this.c($$0).b;
   }

   public void a(cum $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cum $$0) {
      return this.c($$0).c;
   }

   public void b(cum $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awe a(vl $$0) {
      Map<cum, awe.a> $$1 = new EnumMap<>(cum.class);

      for (cum $$2 : cum.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awe.a($$3, $$4));
         }
      }

      return new awe($$1);
   }

   private void b(vl $$0) {
      for (cum $$1 : cum.values()) {
         awe.a $$2 = this.c.getOrDefault($$1, awe.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awe a(tq $$0) {
      Map<cum, awe.a> $$1 = new EnumMap<>(cum.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         if ($$4 || $$5) {
            $$1.put($$2, new awe.a($$4, $$5));
         }
      });
      return new awe($$1);
   }

   public void b(tq $$0) {
      b.forEach(($$1, $$2) -> {
         awe.a $$3 = this.c.getOrDefault($$1, awe.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awe a() {
      return new awe(new EnumMap<>(this.c));
   }

   public void a(awe $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awe && this.c.equals(((awe)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awe.a a = new awe.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awe.a a(boolean $$0) {
         return new awe.a($$0, this.c);
      }

      public awe.a b(boolean $$0) {
         return new awe.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
