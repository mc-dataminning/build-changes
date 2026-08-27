import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efb implements efk {
   protected final List<efk> c;
   private final Predicate<ecl> a;

   protected efb(List<efk> $$0, Predicate<ecl> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends efb> Codec<T> a(Function<List<efk>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(efm.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends efb> Codec<T> b(Function<List<efk>, T> $$0) {
      return efm.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ecl $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ecu $$0) {
      efk.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements efk.a {
      private final Builder<efk> a = ImmutableList.builder();

      protected a(efk.a... $$0) {
         for (efk.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(efk.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public efk build() {
         return this.a(this.a.build());
      }

      protected abstract efk a(List<efk> var1);
   }
}
