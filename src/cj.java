import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class cj extends dj<cj.a> {
   @Override
   public Codec<cj.a> a() {
      return cj.a.a;
   }

   public void a(arp $$0, cqr $$1, cys $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cys $$7 = $$1.a($$6);
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

   private void a(arp $$0, cqr $$1, cys $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bi> b, cj.a.a c, List<cl> d) implements dj.a {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cj.a::a),
                  cj.a.a.a.optionalFieldOf("slots", cj.a.a.b).forGetter(cj.a::b),
                  cl.a.listOf().optionalFieldOf("items", List.of()).forGetter(cj.a::c)
               )
               .apply($$0, cj.a::new)
      );

      public static aq<cj.a> a(cl.a... $$0) {
         return a(Stream.of($$0).map(cl.a::b).toArray(cl[]::new));
      }

      public static aq<cj.a> a(cl... $$0) {
         return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
      }

      public static aq<cj.a> a(dio... $$0) {
         cl[] $$1 = new cl[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cl(Optional.of(ji.a($$0[$$2].h().e())), cv.d.c, kd.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(cqr $$0, cys $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cl> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cys $$8 = $$0.a($$7);
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

      public List<cl> c() {
         return this.d;
      }

      public static record a(cv.d c, cv.d d, cv.d e) {
         public static final Codec<cj.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     cv.d.d.optionalFieldOf("occupied", cv.d.c).forGetter(cj.a.a::a),
                     cv.d.d.optionalFieldOf("full", cv.d.c).forGetter(cj.a.a::b),
                     cv.d.d.optionalFieldOf("empty", cv.d.c).forGetter(cj.a.a::c)
                  )
                  .apply($$0, cj.a.a::new)
         );
         public static final cj.a.a b = new cj.a.a(cv.d.c, cv.d.c, cv.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public cv.d a() {
            return this.c;
         }

         public cv.d b() {
            return this.d;
         }

         public cv.d c() {
            return this.e;
         }
      }
   }
}
