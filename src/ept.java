import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ept implements eqc {
   protected final List<eqc> c;
   private final Predicate<enb> a;

   protected ept(List<eqc> $$0, Predicate<enb> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ept> Codec<T> a(Function<List<eqc>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(eqe.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ept> Codec<T> b(Function<List<eqc>, T> $$0) {
      return eqe.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(enb $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(enk $$0) {
      eqc.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eqc.a {
      private final Builder<eqc> a = ImmutableList.builder();

      protected a(eqc.a... $$0) {
         for (eqc.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eqc.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eqc build() {
         return this.a(this.a.build());
      }

      protected abstract eqc a(List<eqc> var1);
   }
}
