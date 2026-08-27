import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cs extends cv<cs.a> {
   @Override
   public Codec<cs.a> a() {
      return cs.a.a;
   }

   public void a(amq $$0, agt $$1, List<cmh> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bb> b, agt c, List<ca> d) implements cv.a {
      public static final Codec<cs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atg.a(bp.b, "player").forGetter(cs.a::a),
                  agt.a.fieldOf("recipe_id").forGetter(cs.a::b),
                  atg.a(ca.a.listOf(), "ingredients", List.of()).forGetter(cs.a::c)
               )
               .apply($$0, cs.a::new)
      );

      public static an<cs.a> a(agt $$0, List<ca.a> $$1) {
         return am.aa.a(new cs.a(Optional.empty(), $$0, $$1.stream().map(ca.a::b).toList()));
      }

      public static an<cs.a> a(agt $$0) {
         return am.aa.a(new cs.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(agt $$0, List<cmh> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cmh> $$2 = new ArrayList<>($$1);

            for (ca $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cmh> $$5 = $$2.iterator();

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
      public Optional<bb> a() {
         return this.b;
      }

      public agt b() {
         return this.c;
      }

      public List<ca> c() {
         return this.d;
      }
   }
}
