import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.commons.lang3.ArrayUtils;

public abstract class ede extends edc {
   public static final int c = 1;
   public static final int e = 0;
   protected final int f;
   protected final int g;
   protected final edw[] h;
   final BiFunction<ciw, ech, ciw> i;
   private final edb j = new ede.c() {
      @Override
      public void a(Consumer<ciw> $$0, ech $$1) {
         ede.this.a(edw.a(ede.this.i, $$0, $$1), $$1);
      }
   };

   protected ede(int $$0, int $$1, efh[] $$2, edw[] $$3) {
      super($$2);
      this.f = $$0;
      this.g = $$1;
      this.h = $$3;
      this.i = edy.a($$3);
   }

   @Override
   public void a(ecs $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.h.length; $$1++) {
         this.h[$$1].a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<ciw> var1, ech var2);

   @Override
   public boolean expand(ech $$0, Consumer<edb> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ede.a<?> a(ede.d $$0) {
      return new ede.b($$0);
   }

   public abstract static class a<T extends ede.a<T>> extends edc.a<T> implements edt<T> {
      protected int a = 1;
      protected int b = 0;
      private final List<edw> c = Lists.newArrayList();

      public T a(edw.a $$0) {
         this.c.add($$0.b());
         return this.at_();
      }

      protected edw[] a() {
         return this.c.toArray(new edw[0]);
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

   static class b extends ede.a<ede.b> {
      private final ede.d c;

      public b(ede.d $$0) {
         this.c = $$0;
      }

      protected ede.b g() {
         return this;
      }

      @Override
      public edc b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements edb {
      @Override
      public int a(float $$0) {
         return Math.max(aro.d((float)ede.this.f + (float)ede.this.g * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ede build(int var1, int var2, efh[] var3, edw[] var4);
   }

   public abstract static class e<T extends ede> extends edc.b<T> {
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

      public final T a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         int $$3 = arf.a($$0, "weight", 1);
         int $$4 = arf.a($$0, "quality", 0);
         edw[] $$5 = arf.a($$0, "functions", new edw[0], $$1, edw[].class);
         return this.b($$0, $$1, $$3, $$4, $$2, $$5);
      }

      protected abstract T b(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, efh[] var5, edw[] var6);
   }
}
