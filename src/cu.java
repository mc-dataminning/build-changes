import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cu extends cx<cu.a> {
   @Override
   public Codec<cu.a> a() {
      return cu.a.a;
   }

   public void a(apb $$0, ajc $$1, List<cpq> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bc> b, ajc c, List<cc> d) implements cx.a {
      public static final Codec<cu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avu.a(br.b, "player").forGetter(cu.a::a),
                  ajc.a.fieldOf("recipe_id").forGetter(cu.a::b),
                  avu.a(cc.a.listOf(), "ingredients", List.of()).forGetter(cu.a::c)
               )
               .apply($$0, cu.a::new)
      );

      public static an<cu.a> a(ajc $$0, List<cc.a> $$1) {
         return am.ac.a(new cu.a(Optional.empty(), $$0, $$1.stream().map(cc.a::b).toList()));
      }

      public static an<cu.a> a(ajc $$0) {
         return am.ac.a(new cu.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(ajc $$0, List<cpq> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<cpq> $$2 = new ArrayList<>($$1);

            for (cc $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cpq> $$5 = $$2.iterator();

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

      public ajc b() {
         return this.c;
      }

      public List<cc> c() {
         return this.d;
      }
   }
}
