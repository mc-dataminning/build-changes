import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.ListBuilder;
import java.util.function.UnaryOperator;

abstract class ayj<T, B> implements ListBuilder<T> {
   private final DynamicOps<T> b;
   protected DataResult<B> a = DataResult.success(this.a(), Lifecycle.stable());

   protected ayj(DynamicOps<T> $$0) {
      this.b = $$0;
   }

   public DynamicOps<T> ops() {
      return this.b;
   }

   protected abstract B a();

   protected abstract B a(B var1, T var2);

   protected abstract DataResult<T> b(B var1, T var2);

   public ListBuilder<T> add(T $$0) {
      this.a = this.a.map($$1 -> this.a((B)$$1, $$0));
      return this;
   }

   public ListBuilder<T> add(DataResult<T> $$0) {
      this.a = this.a.apply2stable(this::a, $$0);
      return this;
   }

   public ListBuilder<T> withErrorsFrom(DataResult<?> $$0) {
      this.a = this.a.flatMap($$1 -> $$0.map($$1x -> $$1));
      return this;
   }

   public ListBuilder<T> mapError(UnaryOperator<String> $$0) {
      this.a = this.a.mapError($$0);
      return this;
   }

   public DataResult<T> build(T $$0) {
      DataResult<T> $$1 = this.a.flatMap($$1x -> this.b((B)$$1x, $$0));
      this.a = DataResult.success(this.a(), Lifecycle.stable());
      return $$1;
   }
}
