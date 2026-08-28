import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class awh {
   private static final Map<csg, Pair<String, String>> a = ImmutableMap.of(
      csg.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      csg.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      csg.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      csg.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<csg, awh.a> b;

   private awh(Map<csg, awh.a> $$0) {
      this.b = $$0;
   }

   public awh() {
      this(ad.a(Maps.newEnumMap(csg.class), $$0 -> {
         for (csg $$1 : csg.values()) {
            $$0.put($$1, new awh.a(false, false));
         }
      }));
   }

   public boolean a(csg $$0) {
      return this.b.get($$0).a;
   }

   public void a(csg $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(csg $$0) {
      return this.b.get($$0).b;
   }

   public void b(csg $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static awh a(wa $$0) {
      Map<csg, awh.a> $$1 = Maps.newEnumMap(csg.class);

      for (csg $$2 : csg.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new awh.a($$3, $$4));
      }

      return new awh($$1);
   }

   public void b(wa $$0) {
      for (csg $$1 : csg.values()) {
         awh.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static awh a(uf $$0) {
      Map<csg, awh.a> $$1 = Maps.newEnumMap(csg.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new awh.a($$4, $$5));
      });
      return new awh($$1);
   }

   public void b(uf $$0) {
      a.forEach(($$1, $$2) -> {
         awh.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public awh a() {
      Map<csg, awh.a> $$0 = Maps.newEnumMap(csg.class);

      for (csg $$1 : csg.values()) {
         awh.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new awh($$0);
   }

   public void a(awh $$0) {
      this.b.clear();

      for (csg $$1 : csg.values()) {
         awh.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awh && this.b.equals(((awh)$$0).b);
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

      public awh.a a() {
         return new awh.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof awh.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
