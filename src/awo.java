import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public final class awo {
   public static final yt<vr, awo> a = yt.a(awo::b, awo::a);
   private static final Map<cvd, Pair<String, String>> b = ImmutableMap.of(
      cvd.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      cvd.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      cvd.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      cvd.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<cvd, awo.a> c;

   private awo(Map<cvd, awo.a> $$0) {
      this.c = $$0;
   }

   public awo() {
      this(new EnumMap<>(cvd.class));
   }

   private awo.a c(cvd $$0) {
      return this.c.getOrDefault($$0, awo.a.a);
   }

   private void a(cvd $$0, UnaryOperator<awo.a> $$1) {
      this.c.compute($$0, ($$1x, $$2) -> {
         if ($$2 == null) {
            $$2 = awo.a.a;
         }

         $$2 = $$1.apply($$2);
         if ($$2.equals(awo.a.a)) {
            $$2 = null;
         }

         return $$2;
      });
   }

   public boolean a(cvd $$0) {
      return this.c($$0).b;
   }

   public void a(cvd $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public boolean b(cvd $$0) {
      return this.c($$0).c;
   }

   public void b(cvd $$0, boolean $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   private static awo a(vr $$0) {
      Map<cvd, awo.a> $$1 = new EnumMap<>(cvd.class);

      for (cvd $$2 : cvd.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         if ($$3 || $$4) {
            $$1.put($$2, new awo.a($$3, $$4));
         }
      }

      return new awo($$1);
   }

   private void b(vr $$0) {
      for (cvd $$1 : cvd.values()) {
         awo.a $$2 = this.c.getOrDefault($$1, awo.a.a);
         $$0.a($$2.b);
         $$0.a($$2.c);
      }
   }

   public static awo a(tw $$0) {
      Map<cvd, awo.a> $$1 = new EnumMap<>(cvd.class);
      b.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         if ($$4 || $$5) {
            $$1.put($$2, new awo.a($$4, $$5));
         }
      });
      return new awo($$1);
   }

   public void b(tw $$0) {
      b.forEach(($$1, $$2) -> {
         awo.a $$3 = this.c.getOrDefault($$1, awo.a.a);
         $$0.a((String)$$2.getFirst(), $$3.b);
         $$0.a((String)$$2.getSecond(), $$3.c);
      });
   }

   public awo a() {
      return new awo(new EnumMap<>(this.c));
   }

   public void a(awo $$0) {
      this.c.clear();
      this.c.putAll($$0.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awo && this.c.equals(((awo)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   static record a(boolean b, boolean c) {
      public static final awo.a a = new awo.a(false, false);

      @Override
      public String toString() {
         return "[open=" + this.b + ", filtering=" + this.c + "]";
      }

      public awo.a a(boolean $$0) {
         return new awo.a($$0, this.c);
      }

      public awo.a b(boolean $$0) {
         return new awo.a(this.b, $$0);
      }

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }
   }
}
