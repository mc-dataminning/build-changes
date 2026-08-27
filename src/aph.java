import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aph {
   private static final Map<cfw, Pair<String, String>> a = ImmutableMap.of(
      cfw.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cfw.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cfw.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cfw.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cfw, aph.a> b;

   private aph(Map<cfw, aph.a> $$0) {
      this.b = $$0;
   }

   public aph() {
      this(ac.a(Maps.newEnumMap(cfw.class), $$0 -> {
         for (cfw $$1 : cfw.values()) {
            $$0.put($$1, new aph.a(false, false));
         }
      }));
   }

   public boolean a(cfw $$0) {
      return this.b.get($$0).a;
   }

   public void a(cfw $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cfw $$0) {
      return this.b.get($$0).b;
   }

   public void b(cfw $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static aph a(so $$0) {
      Map<cfw, aph.a> $$1 = Maps.newEnumMap(cfw.class);

      for (cfw $$2 : cfw.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aph.a($$3, $$4));
      }

      return new aph($$1);
   }

   public void b(so $$0) {
      for (cfw $$1 : cfw.values()) {
         aph.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static aph a(qw $$0) {
      Map<cfw, aph.a> $$1 = Maps.newEnumMap(cfw.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aph.a($$4, $$5));
      });
      return new aph($$1);
   }

   public void b(qw $$0) {
      a.forEach(($$1, $$2) -> {
         aph.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aph a() {
      Map<cfw, aph.a> $$0 = Maps.newEnumMap(cfw.class);

      for (cfw $$1 : cfw.values()) {
         aph.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aph($$0);
   }

   public void a(aph $$0) {
      this.b.clear();

      for (cfw $$1 : cfw.values()) {
         aph.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aph && this.b.equals(((aph)$$0).b);
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

      public aph.a a() {
         return new aph.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof aph.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
