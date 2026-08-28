import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class dg extends dk<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(art $$0, alh<dep<?>> $$1, List<czy> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bj> b, alh<dep<?>> c, List<cm> d) implements dk.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(dg.a::a),
                  dep.b.fieldOf("recipe_id").forGetter(dg.a::b),
                  cm.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dg.a::c)
               )
               .apply($$0, dg.a::new)
      );

      public static ar<dg.a> a(alh<dep<?>> $$0, List<cm.a> $$1) {
         return aq.ac.a(new dg.a(Optional.empty(), $$0, $$1.stream().map(cm.a::b).toList()));
      }

      public static ar<dg.a> a(alh<dep<?>> $$0) {
         return aq.ac.a(new dg.a(Optional.empty(), $$0, List.of()));
      }

      public static ar<dg.a> b(alh<dep<?>> $$0) {
         return aq.ad.a(new dg.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(alh<dep<?>> $$0, List<czy> $$1) {
         if ($$0 != this.c) {
            return false;
         } else {
            List<czy> $$2 = new ArrayList<>($$1);

            for (cm $$3 : this.d) {
               boolean $$4 = false;
               Iterator<czy> $$5 = $$2.iterator();

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

      public alh<dep<?>> b() {
         return this.c;
      }

      public List<cm> c() {
         return this.d;
      }
   }
}
