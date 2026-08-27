import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class apd {
   private static final Map<cfr, Pair<String, String>> a = ImmutableMap.of(
      cfr.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cfr.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cfr.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cfr.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cfr, apd.a> b;

   private apd(Map<cfr, apd.a> $$0) {
      this.b = $$0;
   }

   public apd() {
      this(ac.a(Maps.newEnumMap(cfr.class), $$0 -> {
         for (cfr $$1 : cfr.values()) {
            $$0.put($$1, new apd.a(false, false));
         }
      }));
   }

   public boolean a(cfr $$0) {
      return this.b.get($$0).a;
   }

   public void a(cfr $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cfr $$0) {
      return this.b.get($$0).b;
   }

   public void b(cfr $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static apd a(sl $$0) {
      Map<cfr, apd.a> $$1 = Maps.newEnumMap(cfr.class);

      for (cfr $$2 : cfr.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new apd.a($$3, $$4));
      }

      return new apd($$1);
   }

   public void b(sl $$0) {
      for (cfr $$1 : cfr.values()) {
         apd.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static apd a(qu $$0) {
      Map<cfr, apd.a> $$1 = Maps.newEnumMap(cfr.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new apd.a($$4, $$5));
      });
      return new apd($$1);
   }

   public void b(qu $$0) {
      a.forEach(($$1, $$2) -> {
         apd.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public apd a() {
      Map<cfr, apd.a> $$0 = Maps.newEnumMap(cfr.class);

      for (cfr $$1 : cfr.values()) {
         apd.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new apd($$0);
   }

   public void a(apd $$0) {
      this.b.clear();

      for (cfr $$1 : cfr.values()) {
         apd.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof apd && this.b.equals(((apd)$$0).b);
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

      public apd.a a() {
         return new apd.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof apd.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
