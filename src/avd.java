import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class avd {
   private static final Map<cow, Pair<String, String>> a = ImmutableMap.of(
      cow.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cow.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cow.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cow.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cow, avd.a> b;

   private avd(Map<cow, avd.a> $$0) {
      this.b = $$0;
   }

   public avd() {
      this(ac.a(Maps.newEnumMap(cow.class), $$0 -> {
         for (cow $$1 : cow.values()) {
            $$0.put($$1, new avd.a(false, false));
         }
      }));
   }

   public boolean a(cow $$0) {
      return this.b.get($$0).a;
   }

   public void a(cow $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cow $$0) {
      return this.b.get($$0).b;
   }

   public void b(cow $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static avd a(vs $$0) {
      Map<cow, avd.a> $$1 = Maps.newEnumMap(cow.class);

      for (cow $$2 : cow.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new avd.a($$3, $$4));
      }

      return new avd($$1);
   }

   public void b(vs $$0) {
      for (cow $$1 : cow.values()) {
         avd.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static avd a(ty $$0) {
      Map<cow, avd.a> $$1 = Maps.newEnumMap(cow.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new avd.a($$4, $$5));
      });
      return new avd($$1);
   }

   public void b(ty $$0) {
      a.forEach(($$1, $$2) -> {
         avd.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public avd a() {
      Map<cow, avd.a> $$0 = Maps.newEnumMap(cow.class);

      for (cow $$1 : cow.values()) {
         avd.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new avd($$0);
   }

   public void a(avd $$0) {
      this.b.clear();

      for (cow $$1 : cow.values()) {
         avd.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof avd && this.b.equals(((avd)$$0).b);
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

      public avd.a a() {
         return new avd.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof avd.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
