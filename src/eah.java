import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.commons.lang3.ArrayUtils;

public abstract class eah extends eaf {
   public static final int c = 1;
   public static final int e = 0;
   protected final int f;
   protected final int g;
   protected final eaz[] h;
   final BiFunction<cfz, dzk, cfz> i;
   private final eae j = new eah.c() {
      @Override
      public void a(Consumer<cfz> $$0, dzk $$1) {
         eah.this.a(eaz.a(eah.this.i, $$0, $$1), $$1);
      }
   };

   protected eah(int $$0, int $$1, eck[] $$2, eaz[] $$3) {
      super($$2);
      this.f = $$0;
      this.g = $$1;
      this.h = $$3;
      this.i = ebb.a($$3);
   }

   @Override
   public void a(dzv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.h.length; $$1++) {
         this.h[$$1].a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cfz> var1, dzk var2);

   @Override
   public boolean expand(dzk $$0, Consumer<eae> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eah.a<?> a(eah.d $$0) {
      return new eah.b($$0);
   }

   public abstract static class a<T extends eah.a<T>> extends eaf.a<T> implements eaw<T> {
      protected int a = 1;
      protected int b = 0;
      private final List<eaz> c = Lists.newArrayList();

      public T a(eaz.a $$0) {
         this.c.add($$0.b());
         return this.at_();
      }

      protected eaz[] a() {
         return this.c.toArray(new eaz[0]);
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.at_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.at_();
      }
   }

   static class b extends eah.a<eah.b> {
      private final eah.d c;

      public b(eah.d $$0) {
         this.c = $$0;
      }

      protected eah.b g() {
         return this;
      }

      @Override
      public eaf b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eae {
      @Override
      public int a(float $$0) {
         return Math.max(apa.d((float)eah.this.f + (float)eah.this.g * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eah build(int var1, int var2, eck[] var3, eaz[] var4);
   }

   public abstract static class e<T extends eah> extends eaf.b<T> {
      public void a(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
         if ($$1.f != 1) {
            $$0.addProperty("weight", $$1.f);
         }

         if ($$1.g != 0) {
            $$0.addProperty("quality", $$1.g);
         }

         if (!ArrayUtils.isEmpty($$1.h)) {
            $$0.add("functions", $$2.serialize($$1.h));
         }
      }

      public final T a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         int $$3 = aor.a($$0, "weight", 1);
         int $$4 = aor.a($$0, "quality", 0);
         eaz[] $$5 = aor.a($$0, "functions", new eaz[0], $$1, eaz[].class);
         return this.b($$0, $$1, $$3, $$4, $$2, $$5);
      }

      protected abstract T b(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, eck[] var5, eaz[] var6);
   }
}
