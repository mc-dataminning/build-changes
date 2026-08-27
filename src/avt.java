import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class avt {
   private static final Map<cqx, Pair<String, String>> a = ImmutableMap.of(
      cqx.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cqx.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cqx.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cqx.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cqx, avt.a> b;

   private avt(Map<cqx, avt.a> $$0) {
      this.b = $$0;
   }

   public avt() {
      this(ad.a(Maps.newEnumMap(cqx.class), $$0 -> {
         for (cqx $$1 : cqx.values()) {
            $$0.put($$1, new avt.a(false, false));
         }
      }));
   }

   public boolean a(cqx $$0) {
      return this.b.get($$0).a;
   }

   public void a(cqx $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cqx $$0) {
      return this.b.get($$0).b;
   }

   public void b(cqx $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static avt a(we $$0) {
      Map<cqx, avt.a> $$1 = Maps.newEnumMap(cqx.class);

      for (cqx $$2 : cqx.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new avt.a($$3, $$4));
      }

      return new avt($$1);
   }

   public void b(we $$0) {
      for (cqx $$1 : cqx.values()) {
         avt.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static avt a(uk $$0) {
      Map<cqx, avt.a> $$1 = Maps.newEnumMap(cqx.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new avt.a($$4, $$5));
      });
      return new avt($$1);
   }

   public void b(uk $$0) {
      a.forEach(($$1, $$2) -> {
         avt.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public avt a() {
      Map<cqx, avt.a> $$0 = Maps.newEnumMap(cqx.class);

      for (cqx $$1 : cqx.values()) {
         avt.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new avt($$0);
   }

   public void a(avt $$0) {
      this.b.clear();

      for (cqx $$1 : cqx.values()) {
         avt.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof avt && this.b.equals(((avt)$$0).b);
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

      public avt.a a() {
         return new avt.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof avt.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
