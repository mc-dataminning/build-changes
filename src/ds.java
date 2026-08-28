import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ds extends dw<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(ark $$0, ale $$1, List<cvs> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, ale c, List<cs> d) implements dw.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(ds.a::a),
                  ale.a.fieldOf("recipe_id").forGetter(ds.a::b),
                  cs.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(ds.a::c)
               )
               .apply($$0, ds.a::new)
      );

      public static ao<ds.a> a(ale $$0, List<cs.a> $$1) {
         return an.ac.a(new ds.a(Optional.empty(), $$0, $$1.stream().map(cs.a::b).toList()));
      }

      public static ao<ds.a> a(ale $$0) {
         return an.ac.a(new ds.a(Optional.empty(), $$0, List.of()));
      }

      public static ao<ds.a> b(ale $$0) {
         return an.ad.a(new ds.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(ale $$0, List<cvs> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cvs> $$2 = new ArrayList<>($$1);

            for (cs $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cvs> $$5 = $$2.iterator();

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

      public ale b() {
         return this.c;
      }

      public List<cs> c() {
         return this.d;
      }
   }
}
