import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class df extends dj<df.a> {
   @Override
   public Codec<df.a> a() {
      return df.a.a;
   }

   public void a(arp $$0, ald<ddj<?>> $$1, List<cys> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bi> b, ald<ddj<?>> c, List<cl> d) implements dj.a {
      public static final Codec<df.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(df.a::a),
                  ald.a(mg.bs).fieldOf("recipe_id").forGetter(df.a::b),
                  cl.a.listOf().optionalFieldOf("ingredients", List.of()).forGetter(df.a::c)
               )
               .apply($$0, df.a::new)
      );

      public static aq<df.a> a(ald<ddj<?>> $$0, List<cl.a> $$1) {
         return ap.ac.a(new df.a(Optional.empty(), $$0, $$1.stream().map(cl.a::b).toList()));
      }

      public static aq<df.a> a(ald<ddj<?>> $$0) {
         return ap.ac.a(new df.a(Optional.empty(), $$0, List.of()));
      }

      public static aq<df.a> b(ald<ddj<?>> $$0) {
         return ap.ad.a(new df.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(ald<ddj<?>> $$0, List<cys> $$1) {
         if ($$0 != this.c) {
            return false;
         } else {
            List<cys> $$2 = new ArrayList<>($$1);

            for (cl $$3 : this.d) {
               boolean $$4 = false;
               Iterator<cys> $$5 = $$2.iterator();

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

      public ald<ddj<?>> b() {
         return this.c;
      }

      public List<cl> c() {
         return this.d;
      }
   }
}
