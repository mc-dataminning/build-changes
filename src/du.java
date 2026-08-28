import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class du extends dy<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(ary $$0, alo<dbv<?>> $$1, List<cxg> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bh> b, alo<dbv<?>> c, List<cu> d) implements dy.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(du.a::a),
                  alo.a(mb.bk).fieldOf("recipe_id").forGetter(du.a::b),
                  cu.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(du.a::c)
               )
               .apply($$0, du.a::new)
      );

      public static ap<du.a> a(alo<dbv<?>> $$0, List<cu.a> $$1) {
         return ao.ac.a(new du.a(Optional.empty(), $$0, $$1.stream().map(cu.a::b).toList()));
      }

      public static ap<du.a> a(alo<dbv<?>> $$0) {
         return ao.ac.a(new du.a(Optional.empty(), $$0, List.of()));
      }

      public static ap<du.a> b(alo<dbv<?>> $$0) {
         return ao.ad.a(new du.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(alo<dbv<?>> $$0, List<cxg> $$1) {
         if ($$0 != this.c) {
            return false;
         } else {
            List<cxg> $$2 = new ArrayList<>($$1);

            for (cu $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cxg> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  if ($$3.a($$5.next())) {
                     $$5.remove();
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public alo<dbv<?>> b() {
         return this.c;
      }

      public List<cu> c() {
         return this.d;
      }
   }
}
