import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class arq {
   private static final Map<cji, Pair<String, String>> a = ImmutableMap.of(
      cji.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cji.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cji.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cji.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cji, arq.a> b;

   private arq(Map<cji, arq.a> $$0) {
      this.b = $$0;
   }

   public arq() {
      this(ac.a(Maps.newEnumMap(cji.class), $$0 -> {
         for (cji $$1 : cji.values()) {
            $$0.put($$1, new arq.a(false, false));
         }
      }));
   }

   public boolean a(cji $$0) {
      return this.b.get($$0).a;
   }

   public void a(cji $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cji $$0) {
      return this.b.get($$0).b;
   }

   public void b(cji $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static arq a(ug $$0) {
      Map<cji, arq.a> $$1 = Maps.newEnumMap(cji.class);

      for (cji $$2 : cji.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new arq.a($$3, $$4));
      }

      return new arq($$1);
   }

   public void b(ug $$0) {
      for (cji $$1 : cji.values()) {
         arq.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static arq a(sl $$0) {
      Map<cji, arq.a> $$1 = Maps.newEnumMap(cji.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new arq.a($$4, $$5));
      });
      return new arq($$1);
   }

   public void b(sl $$0) {
      a.forEach(($$1, $$2) -> {
         arq.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public arq a() {
      Map<cji, arq.a> $$0 = Maps.newEnumMap(cji.class);

      for (cji $$1 : cji.values()) {
         arq.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new arq($$0);
   }

   public void a(arq $$0) {
      this.b.clear();

      for (cji $$1 : cji.values()) {
         arq.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof arq && this.b.equals(((arq)$$0).b);
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

      public arq.a a() {
         return new arq.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof arq.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
