import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class dn extends dr<dn.a> {
   @Override
   public Codec<dn.a> a() {
      return dn.a.a;
   }

   public void a(arc $$0, alb $$1, List<cuk> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bf> b, alb c, List<cp> d) implements dr.a {
      public static final Codec<dn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(dn.a::a),
                  alb.a.fieldOf("recipe_id").forGetter(dn.a::b),
                  cp.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(dn.a::c)
               )
               .apply($$0, dn.a::new)
      );

      public static an<dn.a> a(alb $$0, List<cp.a> $$1) {
         return am.ac.a(new dn.a(Optional.empty(), $$0, $$1.stream().map(cp.a::b).toList()));
      }

      public static an<dn.a> a(alb $$0) {
         return am.ac.a(new dn.a(Optional.empty(), $$0, List.of()));
      }

      public static an<dn.a> b(alb $$0) {
         return am.ad.a(new dn.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(alb $$0, List<cuk> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cuk> $$2 = new ArrayList<>($$1);

            for (cp $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cuk> $$5 = $$2.iterator();

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

      public alb b() {
         return this.c;
      }

      public List<cp> c() {
         return this.d;
      }
   }
}
