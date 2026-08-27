import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class az extends cx<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(apb $$0, Collection<? extends bof> $$1) {
      List<ejy> $$2 = $$1.stream().map($$1x -> br.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, List<bc> c) implements cx.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(az.a::a), avu.a(br.b.listOf(), "victims", List.of()).forGetter(az.a::b)).apply($$0, az.a::new)
      );

      public static an<az.a> a(br.a... $$0) {
         return am.F.a(new az.a(Optional.empty(), br.a($$0)));
      }

      public boolean a(Collection<? extends ejy> $$0) {
         for (bc $$1 : this.c) {
            boolean $$2 = false;

            for (ejy $$3 : $$0) {
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
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public List<bc> b() {
         return this.c;
      }
   }
}
