import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class avs {
   private static final Map<crh, Pair<String, String>> a = ImmutableMap.of(
      crh.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      crh.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      crh.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      crh.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<crh, avs.a> b;

   private avs(Map<crh, avs.a> $$0) {
      this.b = $$0;
   }

   public avs() {
      this(ad.a(Maps.newEnumMap(crh.class), $$0 -> {
         for (crh $$1 : crh.values()) {
            $$0.put($$1, new avs.a(false, false));
         }
      }));
   }

   public boolean a(crh $$0) {
      return this.b.get($$0).a;
   }

   public void a(crh $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(crh $$0) {
      return this.b.get($$0).b;
   }

   public void b(crh $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static avs a(vv $$0) {
      Map<crh, avs.a> $$1 = Maps.newEnumMap(crh.class);

      for (crh $$2 : crh.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new avs.a($$3, $$4));
      }

      return new avs($$1);
   }

   public void b(vv $$0) {
      for (crh $$1 : crh.values()) {
         avs.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static avs a(ua $$0) {
      Map<crh, avs.a> $$1 = Maps.newEnumMap(crh.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new avs.a($$4, $$5));
      });
      return new avs($$1);
   }

   public void b(ua $$0) {
      a.forEach(($$1, $$2) -> {
         avs.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public avs a() {
      Map<crh, avs.a> $$0 = Maps.newEnumMap(crh.class);

      for (crh $$1 : crh.values()) {
         avs.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new avs($$0);
   }

   public void a(avs $$0) {
      this.b.clear();

      for (crh $$1 : crh.values()) {
         avs.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof avs && this.b.equals(((avs)$$0).b);
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

      public avs.a a() {
         return new avs.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof avs.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
