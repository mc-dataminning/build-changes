import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dyt<T extends Comparable<T>> {
   private final Class<T> a;
   private final String b;
   @Nullable
   private Integer c;
   private final Codec<T> d = Codec.STRING
      .comapFlatMap(
         $$0x -> this.b($$0x)
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "Unable to read property: " + this + " with value: " + $$0x)),
         this::b
      );
   private final Codec<dyt.a<T>> e = this.d.xmap(this::c, dyt.a::b);

   protected dyt(String $$0, Class<T> $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   public dyt.a<T> c(T $$0) {
      return new dyt.a<>(this, $$0);
   }

   public dyt.a<T> a(dxs<?, ?> $$0) {
      return new dyt.a<>(this, $$0.c(this));
   }

   public Stream<dyt.a<T>> c() {
      return this.a().stream().map(this::c);
   }

   public Codec<T> d() {
      return this.d;
   }

   public Codec<dyt.a<T>> e() {
      return this.e;
   }

   public String f() {
      return this.b;
   }

   public Class<T> g() {
      return this.a;
   }

   public abstract List<T> a();

   public abstract String b(T var1);

   public abstract Optional<T> b(String var1);

   public abstract int a(T var1);

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.b).add("clazz", this.a).add("values", this.a()).toString();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof dyt<?> $$1) ? false : this.a.equals($$1.a) && this.b.equals($$1.b);
      }
   }

   @Override
   public final int hashCode() {
      if (this.c == null) {
         this.c = this.b();
      }

      return this.c;
   }

   public int b() {
      return 31 * this.a.hashCode() + this.b.hashCode();
   }

   public <U, S extends dxs<?, S>> DataResult<S> a(DynamicOps<U> $$0, S $$1, U $$2) {
      DataResult<T> $$3 = this.d.parse($$0, $$2);
      return $$3.map($$1x -> $$1.b(this, $$1x)).setPartial($$1);
   }

   public static record a<T extends Comparable<T>>(dyt<T> a, T b) {
      public a(dyt<T> a, T b) {
         if (!a.a().contains(b)) {
            throw new IllegalArgumentException("Value " + b + " does not belong to property " + a);
         } else {
            this.a = a;
            this.b = b;
         }
      }

      @Override
      public String toString() {
         return this.a.f() + "=" + this.a.b(this.b);
      }
   }
}
