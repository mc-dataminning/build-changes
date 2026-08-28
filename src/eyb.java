import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eyb implements ext {
   protected final List<fau> e;
   private final Predicate<exl> a;

   protected eyb(List<fau> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends eyb> P1<Mu<T>, List<fau>> a(Instance<T> $$0) {
      return $$0.group(fau.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(exr $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(exl $$0) {
      return this.a.test($$0);
   }

   public abstract eyc a();

   public abstract static class a<T extends eyb.a<T>> implements fam<T> {
      private final Builder<fau> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(fau.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<fau> f() {
         return this.a.build();
      }

      public exs.a a(eyb.a<?> $$0) {
         return new exs.a(this, $$0);
      }

      public exx.a b(eyb.a<?> $$0) {
         return new exx.a(this, $$0);
      }

      public eyf.a c(eyb.a<?> $$0) {
         return new eyf.a(this, $$0);
      }

      public abstract eyb b();
   }
}
