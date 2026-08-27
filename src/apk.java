import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class apk {
   private static final Map<cgc, Pair<String, String>> a = ImmutableMap.of(
      cgc.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cgc.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cgc.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cgc.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cgc, apk.a> b;

   private apk(Map<cgc, apk.a> $$0) {
      this.b = $$0;
   }

   public apk() {
      this(ac.a(Maps.newEnumMap(cgc.class), $$0 -> {
         for (cgc $$1 : cgc.values()) {
            $$0.put($$1, new apk.a(false, false));
         }
      }));
   }

   public boolean a(cgc $$0) {
      return this.b.get($$0).a;
   }

   public void a(cgc $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(cgc $$0) {
      return this.b.get($$0).b;
   }

   public void b(cgc $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static apk a(so $$0) {
      Map<cgc, apk.a> $$1 = Maps.newEnumMap(cgc.class);

      for (cgc $$2 : cgc.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new apk.a($$3, $$4));
      }

      return new apk($$1);
   }

   public void b(so $$0) {
      for (cgc $$1 : cgc.values()) {
         apk.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static apk a(qw $$0) {
      Map<cgc, apk.a> $$1 = Maps.newEnumMap(cgc.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new apk.a($$4, $$5));
      });
      return new apk($$1);
   }

   public void b(qw $$0) {
      a.forEach(($$1, $$2) -> {
         apk.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public apk a() {
      Map<cgc, apk.a> $$0 = Maps.newEnumMap(cgc.class);

      for (cgc $$1 : cgc.values()) {
         apk.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new apk($$0);
   }

   public void a(apk $$0) {
      this.b.clear();

      for (cgc $$1 : cgc.values()) {
         apk.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof apk && this.b.equals(((apk)$$0).b);
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

      public apk.a a() {
         return new apk.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof apk.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
