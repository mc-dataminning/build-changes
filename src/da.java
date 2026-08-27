import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class da extends dd<da.a> {
   @Override
   public Codec<da.a> a() {
      return da.a.a;
   }

   public void a(aqf $$0, akf $$1, List<csd> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bc> b, akf c, List<cg> d) implements dd.a {
      public static final Codec<da.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(br.b, "player").forGetter(da.a::a),
                  akf.a.fieldOf("recipe_id").forGetter(da.a::b),
                  axe.a(cg.a.listOf(), "ingredients", List.of()).forGetter(da.a::c)
               )
               .apply($$0, da.a::new)
      );

      public static an<da.a> a(akf $$0, List<cg.a> $$1) {
         return am.ac.a(new da.a(Optional.empty(), $$0, $$1.stream().map(cg.a::b).toList()));
      }

      public static an<da.a> a(akf $$0) {
         return am.ac.a(new da.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(akf $$0, List<csd> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<csd> $$2 = new ArrayList<>($$1);

            for (cg $$3 : this.d) {
               boolean $$4 = false;
               Iterator<csd> $$5 = $$2.iterator();

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
      public Optional<bc> a() {
         return this.b;
      }

      public akf b() {
         return this.c;
      }

      public List<cg> c() {
         return this.d;
      }
   }
}
