import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class bc extends dj<bc.a> {
   @Override
   public Codec<bc.a> a() {
      return bc.a.a;
   }

   public void a(arp $$0, Collection<? extends bwa> $$1) {
      List<eyn> $$2 = $$1.stream().map($$1x -> bx.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bi> b, List<bi> c) implements dj.a {
      public static final Codec<bc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(bc.a::a), bx.b.listOf().optionalFieldOf("victims", List.of()).forGetter(bc.a::b))
               .apply($$0, bc.a::new)
      );

      public static aq<bc.a> a(bx.a... $$0) {
         return ap.F.a(new bc.a(Optional.empty(), bx.a($$0)));
      }

      public boolean a(Collection<? extends eyn> $$0) {
         for (bi $$1 : this.c) {
            boolean $$2 = false;

            for (eyn $$3 : $$0) {
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
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public List<bi> b() {
         return this.c;
      }
   }
}
