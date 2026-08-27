import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class arw {
   private static final Map<cjp, Pair<String, String>> a = ImmutableMap.of(
      cjp.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cjp.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cjp.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cjp.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cjp, arw.a> b;

   private arw(Map<cjp, arw.a> $$0) {
      this.b = $$0;
   }

   public arw() {
      this(ac.a(Maps.newEnumMap(cjp.class), $$0 -> {
         for (cjp $$1 : cjp.values()) {
            $$0.put($$1, new arw.a(false, false));
         }
      }));
   }

   public boolean a(cjp $$0) {
      return this.b.get($$0).a;
   }

   public void a(cjp $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cjp $$0) {
      return this.b.get($$0).b;
   }

   public void b(cjp $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static arw a(ui $$0) {
      Map<cjp, arw.a> $$1 = Maps.newEnumMap(cjp.class);

      for (cjp $$2 : cjp.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new arw.a($$3, $$4));
      }

      return new arw($$1);
   }

   public void b(ui $$0) {
      for (cjp $$1 : cjp.values()) {
         arw.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static arw a(sn $$0) {
      Map<cjp, arw.a> $$1 = Maps.newEnumMap(cjp.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new arw.a($$4, $$5));
      });
      return new arw($$1);
   }

   public void b(sn $$0) {
      a.forEach(($$1, $$2) -> {
         arw.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public arw a() {
      Map<cjp, arw.a> $$0 = Maps.newEnumMap(cjp.class);

      for (cjp $$1 : cjp.values()) {
         arw.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new arw($$0);
   }

   public void a(arw $$0) {
      this.b.clear();

      for (cjp $$1 : cjp.values()) {
         arw.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof arw && this.b.equals(((arw)$$0).b);
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

      public arw.a a() {
         return new arw.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof arw.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
