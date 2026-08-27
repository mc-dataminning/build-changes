import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bnk {
   private final Map<bng, bnh> a;

   public bnk(Map<bng, bnh> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bnh d(bng $$0) {
      bnh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + kd.u.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bng $$0) {
      return this.d($$0).f();
   }

   public double b(bng $$0) {
      return this.d($$0).b();
   }

   public double a(bng $$0, UUID $$1) {
      bnj $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + kd.u.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bnh a(Consumer<bnh> $$0, bng $$1) {
      bnh $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bnh $$3 = new bnh($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bnk.a a() {
      return new bnk.a();
   }

   public boolean c(bng $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bng $$0, UUID $$1) {
      bnh $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bng, bnh> a = Maps.newHashMap();
      private boolean b;

      private bnh b(bng $$0) {
         bnh $$1 = new bnh($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + kd.u.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bnk.a a(bng $$0) {
         this.b($$0);
         return this;
      }

      public bnk.a a(bng $$0, double $$1) {
         bnh $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bnk a() {
         this.b = true;
         return new bnk(this.a);
      }
   }
}
