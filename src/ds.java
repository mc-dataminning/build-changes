import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ds extends dv<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(aqv $$0, akr $$1, List<cuq> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, akr c, List<cs> d) implements dv.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(ds.a::a),
                  akr.a.fieldOf("recipe_id").forGetter(ds.a::b),
                  cs.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(ds.a::c)
               )
               .apply($$0, ds.a::new)
      );

      public static ao<ds.a> a(akr $$0, List<cs.a> $$1) {
         return an.ac.a(new ds.a(Optional.empty(), $$0, $$1.stream().map(cs.a::b).toList()));
      }

      public static ao<ds.a> a(akr $$0) {
         return an.ac.a(new ds.a(Optional.empty(), $$0, List.of()));
      }

      public static ao<ds.a> b(akr $$0) {
         return an.ad.a(new ds.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(akr $$0, List<cuq> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cuq> $$2 = new ArrayList<>($$1);

            for (cs $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cuq> $$5 = $$2.iterator();

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

      public akr b() {
         return this.c;
      }

      public List<cs> c() {
         return this.d;
      }
   }
}
