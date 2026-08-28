import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awp {
   public static final yu<vs, awp> a = yu.a(awp::b, awp::a);
   private static final Map<cwa, Pair<String, String>> b = ImmutableMap.of(
      cwa.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cwa.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cwa.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cwa.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cwa, awp.a> c;

   private awp(Map<cwa, awp.a> $$0) {
      this.c = $$0;
   }

   public awp() {
      this(new EnumMap<>(cwa.class));
   }

   private awp.a c(cwa $$0) {
      return this.c.getOrDefault($$0, awp.a.a);
   }

   private void a(cwa $$0, UnaryOperator<awp.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awp.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awp.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cwa $$0) {
      return this.c($$0).b;
   }

   public void a(cwa $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cwa $$0) {
      return this.c($$0).c;
   }

   public void b(cwa $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awp a(vs $$0) {
      Map<cwa, awp.a> $$1 = new EnumMap<>(cwa.class);

      for (cwa $$2 : cwa.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awp.a($$3, $$4));
         }
      }

      return new awp($$1);
   }

   private void b(vs $$0) {
      for (cwa $$1 : cwa.values()) {
         awp.a $$2 = this.c.getOrDefault($$1, awp.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awp a(tx $$0) {
      Map<cwa, awp.a> $$1 = new EnumMap<>(cwa.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         if ($$4 || $$5) {
            $$1.put($$2, new awp.a($$4, $$5));
         }
      });
      return new awp($$1);
   }

   public void b(tx $$0) {
      b.forEach(($$1, $$2) -> {
         awp.a $$3 = this.c.getOrDefault($$1, awp.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awp a() {
      return new awp(new EnumMap<>(this.c));
   }

   public void a(awp $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awp && this.c.equals(((awp)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awp.a a = new awp.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awp.a a(boolean $$0) {
         return new awp.a($$0, this.c);
      }

      public awp.a b(boolean $$0) {
         return new awp.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
