import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class bd extends dl<bd.a> {
   @Override
   public Codec<bd.a> a() {
      return bd.a.a;
   }

   public void a(arv $$0, Collection<? extends bwv> $$1) {
      List<faj> $$2 = $$1.stream().map($$1x -> bz.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bj> b, List<bj> c) implements dl.a {
      public static final Codec<bd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(bd.a::a), bz.b.listOf().optionalFieldOf("victims", List.of()).forGetter(bd.a::b))
               .apply($$0, bd.a::new)
      );

      public static ar<bd.a> a(bz.a... $$0) {
         return aq.F.a(new bd.a(Optional.empty(), bz.a($$0)));
      }

      public boolean a(Collection<? extends faj> $$0) {
         for (bj $$1 : this.c) {
            boolean $$2 = false;

            for (faj $$3 : $$0) {
               if ($$1.a($$3)) {
                  $$2 = true;
                  break;
               }
            }

            if (!$$2) {
               return false;
            }
         }

         return true;
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public List<bj> b() {
         return this.c;
      }
   }
}
