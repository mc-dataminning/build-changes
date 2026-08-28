import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class dv extends dz<dv.a> {
   @Override
   public Codec<dv.a> a() {
      return dv.a.a;
   }

   public void a(ard $$0, akt<dbe<?>> $$1, List<cwp> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bi> b, akt<dbe<?>> c, List<cv> d) implements dz.a {
      public static final Codec<dv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dv.a::a),
                  akt.a(mc.bk).fieldOf("recipe_id").forGetter(dv.a::b),
                  cv.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dv.a::c)
               )
               .apply($$0, dv.a::new)
      );

      public static aq<dv.a> a(akt<dbe<?>> $$0, List<cv.a> $$1) {
         return ap.ac.a(new dv.a(Optional.empty(), $$0, $$1.stream().map(cv.a::b).toList()));
      }

      public static aq<dv.a> a(akt<dbe<?>> $$0) {
         return ap.ac.a(new dv.a(Optional.empty(), $$0, List.of()));
      }

      public static aq<dv.a> b(akt<dbe<?>> $$0) {
         return ap.ad.a(new dv.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(akt<dbe<?>> $$0, List<cwp> $$1) {
         if ($$0 != this.c) {
            return false;
         } else {
            List<cwp> $$2 = new ArrayList<>($$1);

            for (cv $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cwp> $$5 = $$2.iterator();

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
      public Optional<bi> a() {
         return this.b;
      }

      public akt<dbe<?>> b() {
         return this.c;
      }

      public List<cv> c() {
         return this.d;
      }
   }
}
