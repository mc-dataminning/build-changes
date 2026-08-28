import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awr {
   public static final yw<vu, awr> a = yw.a(awr::b, awr::a);
   private static final Map<cwl, Pair<String, String>> b = ImmutableMap.of(
      cwl.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cwl.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cwl.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cwl.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cwl, awr.a> c;

   private awr(Map<cwl, awr.a> $$0) {
      this.c = $$0;
   }

   public awr() {
      this(new EnumMap<>(cwl.class));
   }

   private awr.a c(cwl $$0) {
      return this.c.getOrDefault($$0, awr.a.a);
   }

   private void a(cwl $$0, UnaryOperator<awr.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awr.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awr.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cwl $$0) {
      return this.c($$0).b;
   }

   public void a(cwl $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cwl $$0) {
      return this.c($$0).c;
   }

   public void b(cwl $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awr a(vu $$0) {
      Map<cwl, awr.a> $$1 = new EnumMap<>(cwl.class);

      for (cwl $$2 : cwl.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awr.a($$3, $$4));
         }
      }

      return new awr($$1);
   }

   private void b(vu $$0) {
      for (cwl $$1 : cwl.values()) {
         awr.a $$2 = this.c.getOrDefault($$1, awr.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awr a(tz $$0) {
      Map<cwl, awr.a> $$1 = new EnumMap<>(cwl.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         if ($$4 || $$5) {
            $$1.put($$2, new awr.a($$4, $$5));
         }
      });
      return new awr($$1);
   }

   public void b(tz $$0) {
      b.forEach(($$1, $$2) -> {
         awr.a $$3 = this.c.getOrDefault($$1, awr.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awr a() {
      return new awr(new EnumMap<>(this.c));
   }

   public void a(awr $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awr && this.c.equals(((awr)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awr.a a = new awr.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awr.a a(boolean $$0) {
         return new awr.a($$0, this.c);
      }

      public awr.a b(boolean $$0) {
         return new awr.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
