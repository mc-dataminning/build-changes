import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class atp {
   private static final Map<clt, Pair<String, String>> a = ImmutableMap.of(
      clt.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      clt.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      clt.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      clt.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<clt, atp.a> b;

   private atp(Map<clt, atp.a> $$0) {
      this.b = $$0;
   }

   public atp() {
      this(ac.a(Maps.newEnumMap(clt.class), $$0 -> {
         for (clt $$1 : clt.values()) {
            $$0.put($$1, new atp.a(false, false));
         }
      }));
   }

   public boolean a(clt $$0) {
      return this.b.get($$0).a;
   }

   public void a(clt $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(clt $$0) {
      return this.b.get($$0).b;
   }

   public void b(clt $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static atp a(uq $$0) {
      Map<clt, atp.a> $$1 = Maps.newEnumMap(clt.class);

      for (clt $$2 : clt.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new atp.a($$3, $$4));
      }

      return new atp($$1);
   }

   public void b(uq $$0) {
      for (clt $$1 : clt.values()) {
         atp.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static atp a(sw $$0) {
      Map<clt, atp.a> $$1 = Maps.newEnumMap(clt.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new atp.a($$4, $$5));
      });
      return new atp($$1);
   }

   public void b(sw $$0) {
      a.forEach(($$1, $$2) -> {
         atp.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public atp a() {
      Map<clt, atp.a> $$0 = Maps.newEnumMap(clt.class);

      for (clt $$1 : clt.values()) {
         atp.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new atp($$0);
   }

   public void a(atp $$0) {
      this.b.clear();

      for (clt $$1 : clt.values()) {
         atp.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof atp && this.b.equals(((atp)$$0).b);
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

      public atp.a a() {
         return new atp.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof atp.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
