import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class axj {
   public static final zt<ws, axj> a = zt.a(axj::b, axj::a);
   private static final Map<cus, Pair<String, String>> b = ImmutableMap.of(
      cus.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cus.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cus.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cus.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cus, axj.a> c;

   private axj(Map<cus, axj.a> $$0) {
      this.c = $$0;
   }

   public axj() {
      this(new EnumMap<>(cus.class));
   }

   private axj.a c(cus $$0) {
      return this.c.getOrDefault($$0, axj.a.a);
   }

   private void a(cus $$0, UnaryOperator<axj.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = axj.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(axj.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cus $$0) {
      return this.c($$0).b;
   }

   public void a(cus $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cus $$0) {
      return this.c($$0).c;
   }

   public void b(cus $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static axj a(ws $$0) {
      Map<cus, axj.a> $$1 = new EnumMap<>(cus.class);

      for (cus $$2 : cus.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new axj.a($$3, $$4));
         }
      }

      return new axj($$1);
   }

   private void b(ws $$0) {
      for (cus $$1 : cus.values()) {
         axj.a $$2 = this.c.getOrDefault($$1, axj.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static axj a(ux $$0) {
      Map<cus, axj.a> $$1 = new EnumMap<>(cus.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         if ($$4 || $$5) {
            $$1.put($$2, new axj.a($$4, $$5));
         }
      });
      return new axj($$1);
   }

   public void b(ux $$0) {
      b.forEach(($$1, $$2) -> {
         axj.a $$3 = this.c.getOrDefault($$1, axj.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public axj a() {
      return new axj(new EnumMap<>(this.c));
   }

   public void a(axj $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof axj && this.c.equals(((axj)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final axj.a a = new axj.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public axj.a a(boolean $$0) {
         return new axj.a($$0, this.c);
      }

      public axj.a b(boolean $$0) {
         return new axj.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
