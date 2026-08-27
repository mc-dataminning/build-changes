import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class db extends de<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(aqi $$0, akh $$1, List<csz> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bc> b, akh c, List<ch> d) implements de.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(db.a::a),
                  akh.a.fieldOf("recipe_id").forGetter(db.a::b),
                  axh.a(ch.a.listOf(), "ingredients", List.of()).forGetter(db.a::c)
               )
               .apply($$0, db.a::new)
      );

      public static an<db.a> a(akh $$0, List<ch.a> $$1) {
         return am.ac.a(new db.a(Optional.empty(), $$0, $$1.stream().map(ch.a::b).toList()));
      }

      public static an<db.a> a(akh $$0) {
         return am.ac.a(new db.a(Optional.empty(), $$0, List.of()));
      }

      public static an<db.a> b(akh $$0) {
         return am.ad.a(new db.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(akh $$0, List<csz> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<csz> $$2 = new ArrayList<>($$1);

            for (ch $$3 : this.d) {
               boolean $$4 = false;
               Iterator<csz> $$5 = $$2.iterator();

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

      public akh b() {
         return this.c;
      }

      public List<ch> c() {
         return this.d;
      }
   }
}
