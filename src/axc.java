import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class axc {
   public static final ze<vy, axc> a = ze.a(axc::b, axc::a);
   private static final Map<cxr, Pair<String, String>> b = ImmutableMap.of(
      cxr.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cxr.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cxr.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cxr.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cxr, axc.a> c;

   private axc(Map<cxr, axc.a> $$0) {
      this.c = $$0;
   }

   public axc() {
      this(new EnumMap<>(cxr.class));
   }

   private axc.a c(cxr $$0) {
      return this.c.getOrDefault($$0, axc.a.a);
   }

   private void a(cxr $$0, UnaryOperator<axc.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = axc.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(axc.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cxr $$0) {
      return this.c($$0).b;
   }

   public void a(cxr $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cxr $$0) {
      return this.c($$0).c;
   }

   public void b(cxr $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static axc a(vy $$0) {
      Map<cxr, axc.a> $$1 = new EnumMap<>(cxr.class);

      for (cxr $$2 : cxr.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new axc.a($$3, $$4));
         }
      }

      return new axc($$1);
   }

   private void b(vy $$0) {
      for (cxr $$1 : cxr.values()) {
         axc.a $$2 = this.c.getOrDefault($$1, axc.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static axc a(ua $$0) {
      Map<cxr, axc.a> $$1 = new EnumMap<>(cxr.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.b((String)$$3.getFirst(), axc.a.a.a());
         boolean $$5 = $$0.b((String)$$3.getSecond(), axc.a.a.b());
         if ($$4 || $$5) {
            $$1.put($$2, new axc.a($$4, $$5));
         }
      });
      return new axc($$1);
   }

   public void b(ua $$0) {
      b.forEach(($$1, $$2) -> {
         axc.a $$3 = this.c.getOrDefault($$1, axc.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public axc a() {
      return new axc(new EnumMap<>(this.c));
   }

   public void a(axc $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof axc && this.c.equals(((axc)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final axc.a a = new axc.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public axc.a a(boolean $$0) {
         return new axc.a($$0, this.c);
      }

      public axc.a b(boolean $$0) {
         return new axc.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
