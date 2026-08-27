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

   public void a(aow $$0, aiy $$1, List<coz> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bc> b, aiy c, List<cc> d) implements cx.a {
      public static final Codec<cu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avp.a(br.b, "player").forGetter(cu.a::a),
                  aiy.a.fieldOf("recipe_id").forGetter(cu.a::b),
                  avp.a(cc.a.listOf(), "ingredients", List.of()).forGetter(cu.a::c)
               )
               .apply($$0, cu.a::new)
      );

      public static an<cu.a> a(aiy $$0, List<cc.a> $$1) {
         return am.ac.a(new cu.a(Optional.empty(), $$0, $$1.stream().map(cc.a::b).toList()));
      }

      public static an<cu.a> a(aiy $$0) {
         return am.ac.a(new cu.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(aiy $$0, List<coz> $$1) {
         if (!$$0.equals(this.c)) {
            return false;
         } else {
            List<coz> $$2 = new ArrayList<>($$1);

            for (cc $$3 : this.d) {
               boolean $$4 = false;
               Iterator<coz> $$5 = $$2.iterator();

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

      public aiy b() {
         return this.c;
      }

      public List<cc> c() {
         return this.d;
      }
   }
}
