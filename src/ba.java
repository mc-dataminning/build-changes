import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ba extends dv<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(ari $$0, Collection<? extends bto> $$1) {
      List<eth> $$2 = $$1.stream().map($$1x -> bv.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bg> b, List<bg> c) implements dv.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ba.a::a), bv.b.listOf().optionalFieldOf("victims", List.of()).forGetter(ba.a::b))
               .apply($$0, ba.a::new)
      );

      public static ao<ba.a> a(bv.a... $$0) {
         return an.F.a(new ba.a(Optional.empty(), bv.a($$0)));
      }

      public boolean a(Collection<? extends eth> $$0) {
         for (bg $$1 : this.c) {
            boolean $$2 = false;

            for (eth $$3 : $$0) {
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
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public List<bg> b() {
         return this.c;
      }
   }
}
