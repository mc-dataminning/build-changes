import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class awr {
   private static final Map<ctp, Pair<String, String>> a = ImmutableMap.of(
      ctp.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      ctp.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      ctp.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      ctp.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<ctp, awr.a> b;

   private awr(Map<ctp, awr.a> $$0) {
      this.b = $$0;
   }

   public awr() {
      this(ae.a(Maps.newEnumMap(ctp.class), $$0 -> {
         for (ctp $$1 : ctp.values()) {
            $$0.put($$1, new awr.a(false, false));
         }
      }));
   }

   public boolean a(ctp $$0) {
      return this.b.get($$0).a;
   }

   public void a(ctp $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(ctp $$0) {
      return this.b.get($$0).b;
   }

   public void b(ctp $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static awr a(wg $$0) {
      Map<ctp, awr.a> $$1 = Maps.newEnumMap(ctp.class);

      for (ctp $$2 : ctp.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new awr.a($$3, $$4));
      }

      return new awr($$1);
   }

   public void b(wg $$0) {
      for (ctp $$1 : ctp.values()) {
         awr.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static awr a(ul $$0) {
      Map<ctp, awr.a> $$1 = Maps.newEnumMap(ctp.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new awr.a($$4, $$5));
      });
      return new awr($$1);
   }

   public void b(ul $$0) {
      a.forEach(($$1, $$2) -> {
         awr.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public awr a() {
      Map<ctp, awr.a> $$0 = Maps.newEnumMap(ctp.class);

      for (ctp $$1 : ctp.values()) {
         awr.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new awr($$0);
   }

   public void a(awr $$0) {
      this.b.clear();

      for (ctp $$1 : ctp.values()) {
         awr.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awr && this.b.equals(((awr)$$0).b);
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

      public awr.a a() {
         return new awr.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof awr.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
