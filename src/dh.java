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

   public void a(asc $$0, alq<dfb<?>> $$1, List<dak> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bj> b, alq<dfb<?>> c, List<cn> d) implements dl.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(dh.a::a),
                  dfb.b.fieldOf("recipe_id").forGetter(dh.a::b),
                  cn.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dh.a::c)
               )
               .apply($$0, dh.a::new)
      );

      public static ar<dh.a> a(alq<dfb<?>> $$0, List<cn.a> $$1) {
         return aq.ac.a(new dh.a(Optional.empty(), $$0, $$1.stream().map(cn.a::b).toList()));
      }

      public static ar<dh.a> a(alq<dfb<?>> $$0) {
         return aq.ac.a(new dh.a(Optional.empty(), $$0, List.of()));
      }

      public static ar<dh.a> b(alq<dfb<?>> $$0) {
         return aq.ad.a(new dh.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(alq<dfb<?>> $$0, List<dak> $$1) {
         if ($$0 != this.c) {
            return false;
         } else {
            List<dak> $$2 = new ArrayList<>($$1);

            for (cn $$3 : this.d) {
               boolean $$4 = false;
               Iterator<dak> $$5 = $$2.iterator();

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

      public alq<dfb<?>> b() {
         return this.c;
      }

      public List<cn> c() {
         return this.d;
      }
   }
}
