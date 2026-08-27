import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface btl<F extends K1, Value> {
   bxh<Value> a();

   bxi b();

   @Nullable
   btk<F, Value> a(bpf<?> var1, Optional<Value> var2);

   public static record a<Value>(bxh<Value> a) implements btl<Mu<Unit>, Value> {
      @Override
      public bxi b() {
         return bxi.b;
      }

      @Override
      public btk<Mu<Unit>, Value> a(bpf<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new btk<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bxh<Value> a) implements btl<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bxi b() {
         return bxi.a;
      }

      @Override
      public btk<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bpf<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new btk<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bxh<Value> a) implements btl<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bxi b() {
         return bxi.c;
      }

      @Override
      public btk<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bpf<?> $$0, Optional<Value> $$1) {
         return new btk<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
