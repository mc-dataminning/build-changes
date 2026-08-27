import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aqv {
   private static final Map<cia, Pair<String, String>> a = ImmutableMap.of(
      cia.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cia.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cia.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cia.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cia, aqv.a> b;

   private aqv(Map<cia, aqv.a> $$0) {
      this.b = $$0;
   }

   public aqv() {
      this(ac.a(Maps.newEnumMap(cia.class), $$0 -> {
         for (cia $$1 : cia.values()) {
            $$0.put($$1, new aqv.a(false, false));
         }
      }));
   }

   public boolean a(cia $$0) {
      return this.b.get($$0).a;
   }

   public void a(cia $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cia $$0) {
      return this.b.get($$0).b;
   }

   public void b(cia $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static aqv a(tu $$0) {
      Map<cia, aqv.a> $$1 = Maps.newEnumMap(cia.class);

      for (cia $$2 : cia.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aqv.a($$3, $$4));
      }

      return new aqv($$1);
   }

   public void b(tu $$0) {
      for (cia $$1 : cia.values()) {
         aqv.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static aqv a(rz $$0) {
      Map<cia, aqv.a> $$1 = Maps.newEnumMap(cia.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aqv.a($$4, $$5));
      });
      return new aqv($$1);
   }

   public void b(rz $$0) {
      a.forEach(($$1, $$2) -> {
         aqv.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aqv a() {
      Map<cia, aqv.a> $$0 = Maps.newEnumMap(cia.class);

      for (cia $$1 : cia.values()) {
         aqv.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aqv($$0);
   }

   public void a(aqv $$0) {
      this.b.clear();

      for (cia $$1 : cia.values()) {
         aqv.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aqv && this.b.equals(((aqv)$$0).b);
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

      public aqv.a a() {
         return new aqv.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof aqv.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
