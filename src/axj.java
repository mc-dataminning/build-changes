import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class axj {
   public static final zt<ws, axj> a = zt.a(axj::b, axj::a);
   private static final Map<cur, Pair<String, String>> b = ImmutableMap.of(
      cur.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cur.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cur.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cur.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cur, axj.a> c;

   private axj(Map<cur, axj.a> $$0) {
      this.c = $$0;
   }

   public axj() {
      this(new EnumMap<>(cur.class));
   }

   private axj.a c(cur $$0) {
      return this.c.getOrDefault($$0, axj.a.a);
   }

   private void a(cur $$0, UnaryOperator<axj.a> $$1) {
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

   public boolean a(cur $$0) {
      return this.c($$0).b;
   }

   public void a(cur $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cur $$0) {
      return this.c($$0).c;
   }

   public void b(cur $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static axj a(ws $$0) {
      Map<cur, axj.a> $$1 = new EnumMap<>(cur.class);

      for (cur $$2 : cur.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new axj.a($$3, $$4));
         }
      }

      return new axj($$1);
   }

   private void b(ws $$0) {
      for (cur $$1 : cur.values()) {
         axj.a $$2 = this.c.getOrDefault($$1, axj.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static axj a(ux $$0) {
      Map<cur, axj.a> $$1 = new EnumMap<>(cur.class);
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
