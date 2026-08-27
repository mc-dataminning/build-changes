import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eul implements euu {
   protected final List<euu> c;
   private final Predicate<erp> a;

   protected eul(List<euu> $$0, Predicate<erp> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eul> Codec<T> a(Function<List<euu>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(euw.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eul> Codec<T> b(Function<List<euu>, T> $$0) {
      return euw.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(erp $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(erv $$0) {
      euu.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements euu.a {
      private final Builder<euu> a = ImmutableList.builder();

      protected a(euu.a... $$0) {
         for (euu.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(euu.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public euu build() {
         return this.a(this.a.build());
      }

      protected abstract euu a(List<euu> var1);
   }
}
