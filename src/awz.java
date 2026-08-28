import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awz {
   public static final zi<wh, awz> a = zi.a(awz::b, awz::a);
   private static final Map<cuj, Pair<String, String>> b = ImmutableMap.of(
      cuj.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cuj.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cuj.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cuj.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cuj, awz.a> c;

   private awz(Map<cuj, awz.a> $$0) {
      this.c = $$0;
   }

   public awz() {
      this(new EnumMap<>(cuj.class));
   }

   private awz.a c(cuj $$0) {
      return this.c.getOrDefault($$0, awz.a.a);
   }

   private void a(cuj $$0, UnaryOperator<awz.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awz.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awz.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cuj $$0) {
      return this.c($$0).b;
   }

   public void a(cuj $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cuj $$0) {
      return this.c($$0).c;
   }

   public void b(cuj $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awz a(wh $$0) {
      Map<cuj, awz.a> $$1 = new EnumMap<>(cuj.class);

      for (cuj $$2 : cuj.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awz.a($$3, $$4));
         }
      }

      return new awz($$1);
   }

   private void b(wh $$0) {
      for (cuj $$1 : cuj.values()) {
         awz.a $$2 = this.c.getOrDefault($$1, awz.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awz a(um $$0) {
      Map<cuj, awz.a> $$1 = new EnumMap<>(cuj.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         if ($$4 || $$5) {
            $$1.put($$2, new awz.a($$4, $$5));
         }
      });
      return new awz($$1);
   }

   public void b(um $$0) {
      b.forEach(($$1, $$2) -> {
         awz.a $$3 = this.c.getOrDefault($$1, awz.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awz a() {
      return new awz(new EnumMap<>(this.c));
   }

   public void a(awz $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awz && this.c.equals(((awz)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awz.a a = new awz.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awz.a a(boolean $$0) {
         return new awz.a($$0, this.c);
      }

      public awz.a b(boolean $$0) {
         return new awz.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
