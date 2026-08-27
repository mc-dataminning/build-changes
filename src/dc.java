import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class dc extends df<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(aqn $$0, akm $$1, List<cto> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bc> b, akm c, List<ch> d) implements df.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(dc.a::a),
                  akm.a.fieldOf("recipe_id").forGetter(dc.a::b),
                  ch.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dc.a::c)
               )
               .apply($$0, dc.a::new)
      );

      public static an<dc.a> a(akm $$0, List<ch.a> $$1) {
         return am.ac.a(new dc.a(Optional.empty(), $$0, $$1.stream().map(ch.a::b).toList()));
      }

      public static an<dc.a> a(akm $$0) {
         return am.ac.a(new dc.a(Optional.empty(), $$0, List.of()));
      }

      public static an<dc.a> b(akm $$0) {
         return am.ad.a(new dc.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(akm $$0, List<cto> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cto> $$2 = new ArrayList<>($$1);

            for (ch $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cto> $$5 = $$2.iterator();

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

      public akm b() {
         return this.c;
      }

      public List<ch> c() {
         return this.d;
      }
   }
}
