import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cl extends dl<cl.a> {
   @Override
   public Codec<cl.a> a() {
      return cl.a.a;
   }

   public void a(asc $$0, csh $$1, dak $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         dak $$7 = $$1.a($$6);
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

   private void a(asc $$0, csh $$1, dak $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bj> b, cl.a.a c, List<cn> d) implements dl.a {
      public static final Codec<cl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(cl.a::a),
                  cl.a.a.a.optionalFieldOf("slots", cl.a.a.b).forGetter(cl.a::b),
                  cn.a.listOf().optionalFieldOf("items", List.of()).forGetter(cl.a::c)
               )
               .apply($$0, cl.a::new)
      );

      public static ar<cl.a> a(cn.a... $$0) {
         return a(Stream.of($$0).map(cn.a::b).toArray(cn[]::new));
      }

      public static ar<cl.a> a(cn... $$0) {
         return aq.f.a(new cl.a(Optional.empty(), cl.a.a.b, List.of($$0)));
      }

      public static ar<cl.a> a(dki... $$0) {
         cn[] $$1 = new cn[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cn(Optional.of(jk.a($$0[$$2].h().e())), cx.d.c, bo.a);
         }

         return a($$1);
      }

      public boolean a(csh $$0, dak $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cn> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               dak $$8 = $$0.a($$7);
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
      public Optional<bj> a() {
         return this.b;
      }

      public cl.a.a b() {
         return this.c;
      }

      public List<cn> c() {
         return this.d;
      }

      public static record a(cx.d c, cx.d d, cx.d e) {
         public static final Codec<cl.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     cx.d.d.optionalFieldOf("occupied", cx.d.c).forGetter(cl.a.a::a),
                     cx.d.d.optionalFieldOf("full", cx.d.c).forGetter(cl.a.a::b),
                     cx.d.d.optionalFieldOf("empty", cx.d.c).forGetter(cl.a.a::c)
                  )
                  .apply($$0, cl.a.a::new)
         );
         public static final cl.a.a b = new cl.a.a(cx.d.c, cx.d.c, cx.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public cx.d a() {
            return this.c;
         }

         public cx.d b() {
            return this.d;
         }

         public cx.d c() {
            return this.e;
         }
      }
   }
}
