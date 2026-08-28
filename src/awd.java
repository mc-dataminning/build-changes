import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awd {
   public static final ym<vl, awd> a = ym.a(awd::b, awd::a);
   private static final Map<ctq, Pair<String, String>> b = ImmutableMap.of(
      ctq.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      ctq.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      ctq.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      ctq.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<ctq, awd.a> c;

   private awd(Map<ctq, awd.a> $$0) {
      this.c = $$0;
   }

   public awd() {
      this(new EnumMap<>(ctq.class));
   }

   private awd.a c(ctq $$0) {
      return this.c.getOrDefault($$0, awd.a.a);
   }

   private void a(ctq $$0, UnaryOperator<awd.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awd.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awd.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(ctq $$0) {
      return this.c($$0).b;
   }

   public void a(ctq $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(ctq $$0) {
      return this.c($$0).c;
   }

   public void b(ctq $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awd a(vl $$0) {
      Map<ctq, awd.a> $$1 = new EnumMap<>(ctq.class);

      for (ctq $$2 : ctq.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awd.a($$3, $$4));
         }
      }

      return new awd($$1);
   }

   private void b(vl $$0) {
      for (ctq $$1 : ctq.values()) {
         awd.a $$2 = this.c.getOrDefault($$1, awd.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awd a(tq $$0) {
      Map<ctq, awd.a> $$1 = new EnumMap<>(ctq.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         if ($$4 || $$5) {
            $$1.put($$2, new awd.a($$4, $$5));
         }
      });
      return new awd($$1);
   }

   public void b(tq $$0) {
      b.forEach(($$1, $$2) -> {
         awd.a $$3 = this.c.getOrDefault($$1, awd.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awd a() {
      return new awd(new EnumMap<>(this.c));
   }

   public void a(awd $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awd && this.c.equals(((awd)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awd.a a = new awd.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awd.a a(boolean $$0) {
         return new awd.a($$0, this.c);
      }

      public awd.a b(boolean $$0) {
         return new awd.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
