import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class avl {
   private static final Map<cqh, Pair<String, String>> a = ImmutableMap.of(
      cqh.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cqh.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cqh.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cqh.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cqh, avl.a> b;

   private avl(Map<cqh, avl.a> $$0) {
      this.b = $$0;
   }

   public avl() {
      this(ac.a(Maps.newEnumMap(cqh.class), $$0 -> {
         for (cqh $$1 : cqh.values()) {
            $$0.put($$1, new avl.a(false, false));
         }
      }));
   }

   public boolean a(cqh $$0) {
      return this.b.get($$0).a;
   }

   public void a(cqh $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cqh $$0) {
      return this.b.get($$0).b;
   }

   public void b(cqh $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static avl a(vx $$0) {
      Map<cqh, avl.a> $$1 = Maps.newEnumMap(cqh.class);

      for (cqh $$2 : cqh.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new avl.a($$3, $$4));
      }

      return new avl($$1);
   }

   public void b(vx $$0) {
      for (cqh $$1 : cqh.values()) {
         avl.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static avl a(ud $$0) {
      Map<cqh, avl.a> $$1 = Maps.newEnumMap(cqh.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new avl.a($$4, $$5));
      });
      return new avl($$1);
   }

   public void b(ud $$0) {
      a.forEach(($$1, $$2) -> {
         avl.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public avl a() {
      Map<cqh, avl.a> $$0 = Maps.newEnumMap(cqh.class);

      for (cqh $$1 : cqh.values()) {
         avl.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new avl($$0);
   }

   public void a(avl $$0) {
      this.b.clear();

      for (cqh $$1 : cqh.values()) {
         avl.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof avl && this.b.equals(((avl)$$0).b);
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

      public avl.a a() {
         return new avl.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof avl.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
