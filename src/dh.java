import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class dh extends dl<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(arv $$0, alj<der<?>> $$1, List<daa> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bj> b, alj<der<?>> c, List<cn> d) implements dl.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(dh.a::a),
                  der.b.fieldOf("recipe_id").forGetter(dh.a::b),
                  cn.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dh.a::c)
               )
               .apply($$0, dh.a::new)
      );

      public static ar<dh.a> a(alj<der<?>> $$0, List<cn.a> $$1) {
         return aq.ac.a(new dh.a(Optional.empty(), $$0, $$1.stream().map(cn.a::b).toList()));
      }

      public static ar<dh.a> a(alj<der<?>> $$0) {
         return aq.ac.a(new dh.a(Optional.empty(), $$0, List.of()));
      }

      public static ar<dh.a> b(alj<der<?>> $$0) {
         return aq.ad.a(new dh.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(alj<der<?>> $$0, List<daa> $$1) {
         if ($$0 != this.c) {
            return false;
         } else {
            List<daa> $$2 = new ArrayList<>($$1);

            for (cn $$3 : this.d) {
               boolean $$4 = false;
               Iterator<daa> $$5 = $$2.iterator();

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
      public Optional<bj> a() {
         return this.b;
      }

      public alj<der<?>> b() {
         return this.c;
      }

      public List<cn> c() {
         return this.d;
      }
   }
}
