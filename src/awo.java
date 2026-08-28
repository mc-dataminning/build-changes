import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class awo {
   private static final Map<csz, Pair<String, String>> a = ImmutableMap.of(
      csz.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      csz.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      csz.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      csz.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<csz, awo.a> b;

   private awo(Map<csz, awo.a> $$0) {
      this.b = $$0;
   }

   public awo() {
      this(ad.a(Maps.newEnumMap(csz.class), $$0 -> {
         for (csz $$1 : csz.values()) {
            $$0.put($$1, new awo.a(false, false));
         }
      }));
   }

   public boolean a(csz $$0) {
      return this.b.get($$0).a;
   }

   public void a(csz $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(csz $$0) {
      return this.b.get($$0).b;
   }

   public void b(csz $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static awo a(we $$0) {
      Map<csz, awo.a> $$1 = Maps.newEnumMap(csz.class);

      for (csz $$2 : csz.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new awo.a($$3, $$4));
      }

      return new awo($$1);
   }

   public void b(we $$0) {
      for (csz $$1 : csz.values()) {
         awo.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static awo a(uj $$0) {
      Map<csz, awo.a> $$1 = Maps.newEnumMap(csz.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new awo.a($$4, $$5));
      });
      return new awo($$1);
   }

   public void b(uj $$0) {
      a.forEach(($$1, $$2) -> {
         awo.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public awo a() {
      Map<csz, awo.a> $$0 = Maps.newEnumMap(csz.class);

      for (csz $$1 : csz.values()) {
         awo.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new awo($$0);
   }

   public void a(awo $$0) {
      this.b.clear();

      for (csz $$1 : csz.values()) {
         awo.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awo && this.b.equals(((awo)$$0).b);
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

      public awo.a a() {
         return new awo.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof awo.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
