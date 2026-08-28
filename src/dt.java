import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class dt extends dx<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(arn $$0, alh $$1, List<cvx> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, alh c, List<ct> d) implements dx.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dt.a::a),
                  alh.a.fieldOf("recipe_id").forGetter(dt.a::b),
                  ct.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dt.a::c)
               )
               .apply($$0, dt.a::new)
      );

      public static ao<dt.a> a(alh $$0, List<ct.a> $$1) {
         return an.ac.a(new dt.a(Optional.empty(), $$0, $$1.stream().map(ct.a::b).toList()));
      }

      public static ao<dt.a> a(alh $$0) {
         return an.ac.a(new dt.a(Optional.empty(), $$0, List.of()));
      }

      public static ao<dt.a> b(alh $$0) {
         return an.ad.a(new dt.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(alh $$0, List<cvx> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cvx> $$2 = new ArrayList<>($$1);

            for (ct $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cvx> $$5 = $$2.iterator();

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
      public Optional<bg> a() {
         return this.b;
      }

      public alh b() {
         return this.c;
      }

      public List<ct> c() {
         return this.d;
      }
   }
}
