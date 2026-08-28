import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awv {
   public static final za<vy, awv> a = za.a(awv::b, awv::a);
   private static final Map<cxi, Pair<String, String>> b = ImmutableMap.of(
      cxi.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cxi.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cxi.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cxi.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cxi, awv.a> c;

   private awv(Map<cxi, awv.a> $$0) {
      this.c = $$0;
   }

   public awv() {
      this(new EnumMap<>(cxi.class));
   }

   private awv.a c(cxi $$0) {
      return this.c.getOrDefault($$0, awv.a.a);
   }

   private void a(cxi $$0, UnaryOperator<awv.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awv.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awv.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cxi $$0) {
      return this.c($$0).b;
   }

   public void a(cxi $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cxi $$0) {
      return this.c($$0).c;
   }

   public void b(cxi $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awv a(vy $$0) {
      Map<cxi, awv.a> $$1 = new EnumMap<>(cxi.class);

      for (cxi $$2 : cxi.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awv.a($$3, $$4));
         }
      }

      return new awv($$1);
   }

   private void b(vy $$0) {
      for (cxi $$1 : cxi.values()) {
         awv.a $$2 = this.c.getOrDefault($$1, awv.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awv a(ua $$0) {
      Map<cxi, awv.a> $$1 = new EnumMap<>(cxi.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.b((String)$$3.getFirst(), awv.a.a.a());
         boolean $$5 = $$0.b((String)$$3.getSecond(), awv.a.a.b());
         if ($$4 || $$5) {
            $$1.put($$2, new awv.a($$4, $$5));
         }
      });
      return new awv($$1);
   }

   public void b(ua $$0) {
      b.forEach(($$1, $$2) -> {
         awv.a $$3 = this.c.getOrDefault($$1, awv.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awv a() {
      return new awv(new EnumMap<>(this.c));
   }

   public void a(awv $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awv && this.c.equals(((awv)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awv.a a = new awv.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awv.a a(boolean $$0) {
         return new awv.a($$0, this.c);
      }

      public awv.a b(boolean $$0) {
         return new awv.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
