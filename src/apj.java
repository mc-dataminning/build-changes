import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class apj {
   private static final Map<cfy, Pair<String, String>> a = ImmutableMap.of(
      cfy.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cfy.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cfy.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cfy.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cfy, apj.a> b;

   private apj(Map<cfy, apj.a> $$0) {
      this.b = $$0;
   }

   public apj() {
      this(ac.a(Maps.newEnumMap(cfy.class), $$0 -> {
         for (cfy $$1 : cfy.values()) {
            $$0.put($$1, new apj.a(false, false));
         }
      }));
   }

   public boolean a(cfy $$0) {
      return this.b.get($$0).a;
   }

   public void a(cfy $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cfy $$0) {
      return this.b.get($$0).b;
   }

   public void b(cfy $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static apj a(sq $$0) {
      Map<cfy, apj.a> $$1 = Maps.newEnumMap(cfy.class);

      for (cfy $$2 : cfy.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new apj.a($$3, $$4));
      }

      return new apj($$1);
   }

   public void b(sq $$0) {
      for (cfy $$1 : cfy.values()) {
         apj.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static apj a(qy $$0) {
      Map<cfy, apj.a> $$1 = Maps.newEnumMap(cfy.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new apj.a($$4, $$5));
      });
      return new apj($$1);
   }

   public void b(qy $$0) {
      a.forEach(($$1, $$2) -> {
         apj.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public apj a() {
      Map<cfy, apj.a> $$0 = Maps.newEnumMap(cfy.class);

      for (cfy $$1 : cfy.values()) {
         apj.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new apj($$0);
   }

   public void a(apj $$0) {
      this.b.clear();

      for (cfy $$1 : cfy.values()) {
         apj.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof apj && this.b.equals(((apj)$$0).b);
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

      public apj.a a() {
         return new apj.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof apj.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
