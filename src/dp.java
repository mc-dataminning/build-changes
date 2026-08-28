import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class dp extends ds<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(aqn $$0, akk $$1, List<cuc> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bf> b, akk c, List<cp> d) implements ds.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(dp.a::a),
                  akk.a.fieldOf("recipe_id").forGetter(dp.a::b),
                  cp.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dp.a::c)
               )
               .apply($$0, dp.a::new)
      );

      public static an<dp.a> a(akk $$0, List<cp.a> $$1) {
         return am.ac.a(new dp.a(Optional.empty(), $$0, $$1.stream().map(cp.a::b).toList()));
      }

      public static an<dp.a> a(akk $$0) {
         return am.ac.a(new dp.a(Optional.empty(), $$0, List.of()));
      }

      public static an<dp.a> b(akk $$0) {
         return am.ad.a(new dp.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(akk $$0, List<cuc> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cuc> $$2 = new ArrayList<>($$1);

            for (cp $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cuc> $$5 = $$2.iterator();

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
      public Optional<bf> a() {
         return this.b;
      }

      public akk b() {
         return this.c;
      }

      public List<cp> c() {
         return this.d;
      }
   }
}
