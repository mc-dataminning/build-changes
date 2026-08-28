import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class buf {
   private final Map<jj<bub>, buc> a;

   buf(Map<jj<bub>, buc> $$0) {
      this.a = $$0;
   }

   private buc d(jj<bub> $$0) {
      buc $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jj<bub> $$0) {
      return this.d($$0).f();
   }

   public double b(jj<bub> $$0) {
      return this.d($$0).b();
   }

   public double a(jj<bub> $$0, UUID $$1) {
      bue $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public buc a(Consumer<buc> $$0, jj<bub> $$1) {
      buc $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         buc $$3 = new buc($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static buf.a a() {
      return new buf.a();
   }

   public boolean c(jj<bub> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jj<bub> $$0, UUID $$1) {
      buc $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jj<bub>, buc> a = ImmutableMap.builder();
      private boolean b;

      private buc b(jj<bub> $$0) {
         buc $$1 = new buc($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public buf.a a(jj<bub> $$0) {
         this.b($$0);
         return this;
      }

      public buf.a a(jj<bub> $$0, double $$1) {
         buc $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public buf a() {
         this.b = true;
         return new buf(this.a.buildKeepingLast());
      }
   }
}
