import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class epb implements eot {
   protected final List<erq> e;
   private final Predicate<eol> a;

   protected epb(List<erq> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends epb> P1<Mu<T>, List<erq>> a(Instance<T> $$0) {
      return $$0.group(axh.a(ers.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eor $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eol $$0) {
      return this.a.test($$0);
   }

   public abstract epc a();

   public abstract static class a<T extends epb.a<T>> implements erj<T> {
      private final Builder<erq> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(erq.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<erq> f() {
         return this.a.build();
      }

      public eos.a a(epb.a<?> $$0) {
         return new eos.a(this, $$0);
      }

      public eox.a b(epb.a<?> $$0) {
         return new eox.a(this, $$0);
      }

      public epf.a c(epb.a<?> $$0) {
         return new epf.a(this, $$0);
      }

      public abstract epb b();
   }
}
