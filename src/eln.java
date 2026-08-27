import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eln implements elf {
   protected final List<ent> e;
   private final Predicate<eku> a;

   protected eln(List<ent> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eln> P1<Mu<T>, List<ent>> a(Instance<T> $$0) {
      return $$0.group(awe.a(env.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eld $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eku $$0) {
      return this.a.test($$0);
   }

   public abstract elo a();

   public abstract static class a<T extends eln.a<T>> implements enm<T> {
      private final Builder<ent> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(ent.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<ent> f() {
         return this.a.build();
      }

      public ele.a a(eln.a<?> $$0) {
         return new ele.a(this, $$0);
      }

      public elj.a b(eln.a<?> $$0) {
         return new elj.a(this, $$0);
      }

      public elr.a c(eln.a<?> $$0) {
         return new elr.a(this, $$0);
      }

      public abstract eln b();
   }
}
