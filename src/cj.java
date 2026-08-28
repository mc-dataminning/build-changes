import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class cj extends dz<cj.a> {
   @Override
   public Codec<cj.a> a() {
      return cj.a.a;
   }

   public void a(are $$0, cox $$1, cwq $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cwq $$7 = $$1.a($$6);
         if ($$7.f()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.M() >= $$7.k()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(are $$0, cox $$1, cwq $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bi> b, cj.a.a c, List<cv> d) implements dz.a {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cj.a::a),
                  cj.a.a.a.optionalFieldOf("slots", cj.a.a.b).forGetter(cj.a::b),
                  cv.a.listOf().optionalFieldOf("items", List.of()).forGetter(cj.a::c)
               )
               .apply($$0, cj.a::new)
      );

      public static aq<cj.a> a(cv.a... $$0) {
         return a(Stream.of($$0).map(cv.a::b).toArray(cv[]::new));
      }

      public static aq<cj.a> a(cv... $$0) {
         return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
      }

      public static aq<cj.a> a(dgi... $$0) {
         cv[] $$1 = new cv[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cv(Optional.of(jv.a($$0[$$2].j().f())), dk.d.c, kt.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(cox $$0, cwq $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cv> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cwq $$8 = $$0.a($$7);
               if (!$$8.f()) {
                  $$5.removeIf($$1x -> $$1x.a($$8));
               }
            }

            return $$5.isEmpty();
         } else {
            return !$$1.f() && this.d.get(0).a($$1);
         }
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public cj.a.a b() {
         return this.c;
      }

      public List<cv> c() {
         return this.d;
      }

      public static record a(dk.d c, dk.d d, dk.d e) {
         public static final Codec<cj.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     dk.d.d.optionalFieldOf("occupied", dk.d.c).forGetter(cj.a.a::a),
                     dk.d.d.optionalFieldOf("full", dk.d.c).forGetter(cj.a.a::b),
                     dk.d.d.optionalFieldOf("empty", dk.d.c).forGetter(cj.a.a::c)
                  )
                  .apply($$0, cj.a.a::new)
         );
         public static final cj.a.a b = new cj.a.a(dk.d.c, dk.d.c, dk.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public dk.d a() {
            return this.c;
         }

         public dk.d b() {
            return this.d;
         }

         public dk.d c() {
            return this.e;
         }
      }
   }
}
