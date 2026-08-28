import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class ci extends dy<ci.a> {
   @Override
   public Codec<ci.a> a() {
      return ci.a.a;
   }

   public void a(asi $$0, cpr $$1, cxk $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cxk $$7 = $$1.a($$6);
         if ($$7.f()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.L() >= $$7.k()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(asi $$0, cpr $$1, cxk $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bh> b, ci.a.a c, List<cu> d) implements dy.a {
      public static final Codec<ci.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(ci.a::a),
                  ci.a.a.a.optionalFieldOf("slots", ci.a.a.b).forGetter(ci.a::b),
                  cu.a.listOf().optionalFieldOf("items", List.of()).forGetter(ci.a::c)
               )
               .apply($$0, ci.a::new)
      );

      public static ap<ci.a> a(cu.a... $$0) {
         return a(Stream.of($$0).map(cu.a::b).toArray(cu[]::new));
      }

      public static ap<ci.a> a(cu... $$0) {
         return ao.f.a(new ci.a(Optional.empty(), ci.a.a.b, List.of($$0)));
      }

      public static ap<ci.a> a(dgz... $$0) {
         cu[] $$1 = new cu[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cu(Optional.of(ju.a($$0[$$2].j().f())), dj.d.c, ks.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(cpr $$0, cxk $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cu> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cxk $$8 = $$0.a($$7);
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
      public Optional<bh> a() {
         return this.b;
      }

      public ci.a.a b() {
         return this.c;
      }

      public List<cu> c() {
         return this.d;
      }

      public static record a(dj.d c, dj.d d, dj.d e) {
         public static final Codec<ci.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     dj.d.d.optionalFieldOf("occupied", dj.d.c).forGetter(ci.a.a::a),
                     dj.d.d.optionalFieldOf("full", dj.d.c).forGetter(ci.a.a::b),
                     dj.d.d.optionalFieldOf("empty", dj.d.c).forGetter(ci.a.a::c)
                  )
                  .apply($$0, ci.a.a::new)
         );
         public static final ci.a.a b = new ci.a.a(dj.d.c, dj.d.c, dj.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public dj.d a() {
            return this.c;
         }

         public dj.d b() {
            return this.d;
         }

         public dj.d c() {
            return this.e;
         }
      }
   }
}
