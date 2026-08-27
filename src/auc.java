import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class auc {
   private static final Map<cnc, Pair<String, String>> a = ImmutableMap.of(
      cnc.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cnc.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cnc.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cnc.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cnc, auc.a> b;

   private auc(Map<cnc, auc.a> $$0) {
      this.b = $$0;
   }

   public auc() {
      this(ac.a(Maps.newEnumMap(cnc.class), $$0 -> {
         for (cnc $$1 : cnc.values()) {
            $$0.put($$1, new auc.a(false, false));
         }
      }));
   }

   public boolean a(cnc $$0) {
      return this.b.get($$0).a;
   }

   public void a(cnc $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cnc $$0) {
      return this.b.get($$0).b;
   }

   public void b(cnc $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static auc a(uu $$0) {
      Map<cnc, auc.a> $$1 = Maps.newEnumMap(cnc.class);

      for (cnc $$2 : cnc.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new auc.a($$3, $$4));
      }

      return new auc($$1);
   }

   public void b(uu $$0) {
      for (cnc $$1 : cnc.values()) {
         auc.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static auc a(ta $$0) {
      Map<cnc, auc.a> $$1 = Maps.newEnumMap(cnc.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new auc.a($$4, $$5));
      });
      return new auc($$1);
   }

   public void b(ta $$0) {
      a.forEach(($$1, $$2) -> {
         auc.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public auc a() {
      Map<cnc, auc.a> $$0 = Maps.newEnumMap(cnc.class);

      for (cnc $$1 : cnc.values()) {
         auc.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new auc($$0);
   }

   public void a(auc $$0) {
      this.b.clear();

      for (cnc $$1 : cnc.values()) {
         auc.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof auc && this.b.equals(((auc)$$0).b);
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

      public auc.a a() {
         return new auc.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof auc.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
