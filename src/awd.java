import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class awd {
   private static final Map<crg, Pair<String, String>> a = ImmutableMap.of(
      crg.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      crg.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      crg.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      crg.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<crg, awd.a> b;

   private awd(Map<crg, awd.a> $$0) {
      this.b = $$0;
   }

   public awd() {
      this(ac.a(Maps.newEnumMap(crg.class), $$0 -> {
         for (crg $$1 : crg.values()) {
            $$0.put($$1, new awd.a(false, false));
         }
      }));
   }

   public boolean a(crg $$0) {
      return this.b.get($$0).a;
   }

   public void a(crg $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(crg $$0) {
      return this.b.get($$0).b;
   }

   public void b(crg $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static awd a(wl $$0) {
      Map<crg, awd.a> $$1 = Maps.newEnumMap(crg.class);

      for (crg $$2 : crg.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new awd.a($$3, $$4));
      }

      return new awd($$1);
   }

   public void b(wl $$0) {
      for (crg $$1 : crg.values()) {
         awd.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static awd a(ur $$0) {
      Map<crg, awd.a> $$1 = Maps.newEnumMap(crg.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new awd.a($$4, $$5));
      });
      return new awd($$1);
   }

   public void b(ur $$0) {
      a.forEach(($$1, $$2) -> {
         awd.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public awd a() {
      Map<crg, awd.a> $$0 = Maps.newEnumMap(crg.class);

      for (crg $$1 : crg.values()) {
         awd.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new awd($$0);
   }

   public void a(awd $$0) {
      this.b.clear();

      for (crg $$1 : crg.values()) {
         awd.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awd && this.b.equals(((awd)$$0).b);
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

      public awd.a a() {
         return new awd.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof awd.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
