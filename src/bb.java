import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class bb extends dy<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(arq $$0, Collection<? extends bul> $$1) {
      List<eun> $$2 = $$1.stream().map($$1x -> bw.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bh> b, List<bh> c) implements dy.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(bb.a::a), bw.b.listOf().optionalFieldOf("victims", List.of()).forGetter(bb.a::b))
               .apply($$0, bb.a::new)
      );

      public static ap<bb.a> a(bw.a... $$0) {
         return ao.F.a(new bb.a(Optional.empty(), bw.a($$0)));
      }

      public boolean a(Collection<? extends eun> $$0) {
         for (bh $$1 : this.c) {
            boolean $$2 = false;

            for (eun $$3 : $$0) {
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
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public List<bh> b() {
         return this.c;
      }
   }
}
