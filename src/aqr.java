import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aqr {
   private static final Map<chs, Pair<String, String>> a = ImmutableMap.of(
      chs.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      chs.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      chs.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      chs.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<chs, aqr.a> b;

   private aqr(Map<chs, aqr.a> $$0) {
      this.b = $$0;
   }

   public aqr() {
      this(ac.a(Maps.newEnumMap(chs.class), $$0 -> {
         for (chs $$1 : chs.values()) {
            $$0.put($$1, new aqr.a(false, false));
         }
      }));
   }

   public boolean a(chs $$0) {
      return this.b.get($$0).a;
   }

   public void a(chs $$0, boolean $$1) {
      this.b.get($$0).a = $$1;
   }

   public boolean b(chs $$0) {
      return this.b.get($$0).b;
   }

   public void b(chs $$0, boolean $$1) {
      this.b.get($$0).b = $$1;
   }

   public static aqr a(tu $$0) {
      Map<chs, aqr.a> $$1 = Maps.newEnumMap(chs.class);

      for (chs $$2 : chs.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aqr.a($$3, $$4));
      }

      return new aqr($$1);
   }

   public void b(tu $$0) {
      for (chs $$1 : chs.values()) {
         aqr.a $$2 = this.b.get($$1);
         if ($$2 == null) {
            $$0.a(false);
            $$0.a(false);
         } else {
            $$0.a($$2.a);
            $$0.a($$2.b);
         }
      }
   }

   public static aqr a(rz $$0) {
      Map<chs, aqr.a> $$1 = Maps.newEnumMap(chs.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aqr.a($$4, $$5));
      });
      return new aqr($$1);
   }

   public void b(rz $$0) {
      a.forEach(($$1, $$2) -> {
         aqr.a $$3 = this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aqr a() {
      Map<chs, aqr.a> $$0 = Maps.newEnumMap(chs.class);

      for (chs $$1 : chs.values()) {
         aqr.a $$2 = this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aqr($$0);
   }

   public void a(aqr $$0) {
      this.b.clear();

      for (chs $$1 : chs.values()) {
         aqr.a $$2 = $$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aqr && this.b.equals(((aqr)$$0).b);
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

      public aqr.a a() {
         return new aqr.a(this.a, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof aqr.a $$1) ? false : this.a == $$1.a && this.b == $$1.b;
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
