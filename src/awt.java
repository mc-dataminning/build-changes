import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awt {
   public static final yy<vw, awt> a = yy.a(awt::b, awt::a);
   private static final Map<cxg, Pair<String, String>> b = ImmutableMap.of(
      cxg.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cxg.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cxg.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cxg.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cxg, awt.a> c;

   private awt(Map<cxg, awt.a> $$0) {
      this.c = $$0;
   }

   public awt() {
      this(new EnumMap<>(cxg.class));
   }

   private awt.a c(cxg $$0) {
      return this.c.getOrDefault($$0, awt.a.a);
   }

   private void a(cxg $$0, UnaryOperator<awt.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awt.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awt.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cxg $$0) {
      return this.c($$0).b;
   }

   public void a(cxg $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cxg $$0) {
      return this.c($$0).c;
   }

   public void b(cxg $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awt a(vw $$0) {
      Map<cxg, awt.a> $$1 = new EnumMap<>(cxg.class);

      for (cxg $$2 : cxg.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awt.a($$3, $$4));
         }
      }

      return new awt($$1);
   }

   private void b(vw $$0) {
      for (cxg $$1 : cxg.values()) {
         awt.a $$2 = this.c.getOrDefault($$1, awt.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awt a(tz $$0) {
      Map<cxg, awt.a> $$1 = new EnumMap<>(cxg.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.b((String)$$3.getFirst(), awt.a.a.a());
         boolean $$5 = $$0.b((String)$$3.getSecond(), awt.a.a.b());
         if ($$4 || $$5) {
            $$1.put($$2, new awt.a($$4, $$5));
         }
      });
      return new awt($$1);
   }

   public void b(tz $$0) {
      b.forEach(($$1, $$2) -> {
         awt.a $$3 = this.c.getOrDefault($$1, awt.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awt a() {
      return new awt(new EnumMap<>(this.c));
   }

   public void a(awt $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awt && this.c.equals(((awt)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awt.a a = new awt.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awt.a a(boolean $$0) {
         return new awt.a($$0, this.c);
      }

      public awt.a b(boolean $$0) {
         return new awt.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
