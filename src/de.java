import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class de extends dh<de.a> {
   @Override
   public Codec<de.a> a() {
      return de.a.a;
   }

   public void a(aqu $$0, akt $$1, List<cuh> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bd> b, akt c, List<ci> d) implements dh.a {
      public static final Codec<de.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(de.a::a),
                  akt.a.fieldOf("recipe_id").forGetter(de.a::b),
                  axu.a(ci.a.listOf(), "ingredients", List.of()).forGetter(de.a::c)
               )
               .apply($$0, de.a::new)
      );

      public static ao<de.a> a(akt $$0, List<ci.a> $$1) {
         return an.ac.a(new de.a(Optional.empty(), $$0, $$1.stream().map(ci.a::b).toList()));
      }

      public static ao<de.a> a(akt $$0) {
         return an.ac.a(new de.a(Optional.empty(), $$0, List.of()));
      }

      public static ao<de.a> b(akt $$0) {
         return an.ad.a(new de.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(akt $$0, List<cuh> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cuh> $$2 = new ArrayList<>($$1);

            for (ci $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cuh> $$5 = $$2.iterator();

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
      public Optional<bd> a() {
         return this.b;
      }

      public akt b() {
         return this.c;
      }

      public List<ci> c() {
         return this.d;
      }
   }
}
