import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ezd implements eyv {
   protected final List<fbw> e;
   private final Predicate<eyn> a;

   protected ezd(List<fbw> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends ezd> P1<Mu<T>, List<fbw>> a(Instance<T> $$0) {
      return $$0.group(fbw.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eyt $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eyn $$0) {
      return this.a.test($$0);
   }

   public abstract eze a();

   public abstract static class a<T extends ezd.a<T>> implements fbo<T> {
      private final Builder<fbw> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(fbw.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<fbw> f() {
         return this.a.build();
      }

      public eyu.a a(ezd.a<?> $$0) {
         return new eyu.a(this, $$0);
      }

      public eyz.a b(ezd.a<?> $$0) {
         return new eyz.a(this, $$0);
      }

      public ezh.a c(ezd.a<?> $$0) {
         return new ezh.a(this, $$0);
      }

      public abstract ezd b();
   }
}
