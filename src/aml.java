import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aml {
   private static final Map<ccq, Pair<String, String>> a = ImmutableMap.of(
      ccq.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      ccq.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      ccq.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      ccq.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<ccq, aml.a> b;

   private aml(Map<ccq, aml.a> $$0) {
      this.b = $$0;
   }

   public aml() {
      this(ac.a(Maps.newEnumMap(ccq.class), $$0 -> {
         for (ccq $$1 : ccq.values()) {
            $$0.put($$1, new aml.a(false, false));
         }
      }));
   }

   public boolean a(ccq $$0) {
      return this.b.get($$0).a;
   }

   public void a(ccq $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(ccq $$0) {
      return this.b.get($$0).b;
   }

   public void b(ccq $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static aml a(sf $$0) {
      Map<ccq, aml.a> $$1 = Maps.newEnumMap(ccq.class);

      for (ccq $$2 : ccq.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aml.a($$3, $$4));
      }

      return new aml($$1);
   }

   public void b(sf $$0) {
      for (ccq $$1 : ccq.values()) {
         aml.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.writeBoolean(false);
            $$0.writeBoolean(false);
         } else {
            $$0.writeBoolean($$2.a);
            $$0.writeBoolean($$2.b);
         }
      }
   }

   public static aml a(qr $$0) {
      Map<ccq, aml.a> $$1 = Maps.newEnumMap(ccq.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aml.a($$4, $$5));
      });
      return new aml($$1);
   }

   public void b(qr $$0) {
      a.forEach(($$1, $$2) -> {
         aml.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aml a() {
      Map<ccq, aml.a> $$0 = Maps.newEnumMap(ccq.class);

      for (ccq $$1 : ccq.values()) {
         aml.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aml($$0);
   }

   public void a(aml $$0) {
      this.b.clear();

      for (ccq $$1 : ccq.values()) {
         aml.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aml && this.b.equals(((aml)$$0).b);
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

      public aml.a a() {
         return new aml.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof aml.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
