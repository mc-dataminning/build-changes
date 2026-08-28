import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class bd extends dk<bd.a> {
   @Override
   public Codec<bd.a> a() {
      return bd.a.a;
   }

   public void a(arr $$0, Collection<? extends bwi> $$1) {
      List<ezt> $$2 = $$1.stream().map($$1x -> by.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bj> b, List<bj> c) implements dk.a {
      public static final Codec<bd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(bd.a::a), by.b.listOf().optionalFieldOf("victims", List.of()).forGetter(bd.a::b))
               .apply($$0, bd.a::new)
      );

      public static ar<bd.a> a(by.a... $$0) {
         return aq.F.a(new bd.a(Optional.empty(), by.a($$0)));
      }

      public boolean a(Collection<? extends ezt> $$0) {
         for (bj $$1 : this.c) {
            boolean $$2 = false;

            for (ezt $$3 : $$0) {
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
         dk.a.super.a($$0);
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
