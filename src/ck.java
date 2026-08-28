import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class ck extends dk<ck.a> {
   @Override
   public Codec<ck.a> a() {
      return ck.a.a;
   }

   public void a(arr $$0, cri $$1, czk $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         czk $$7 = $$1.a($$6);
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

   private void a(arr $$0, cri $$1, czk $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bj> b, ck.a.a c, List<cm> d) implements dk.a {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(ck.a::a),
                  ck.a.a.a.optionalFieldOf("slots", ck.a.a.b).forGetter(ck.a::b),
                  cm.a.listOf().optionalFieldOf("items", List.of()).forGetter(ck.a::c)
               )
               .apply($$0, ck.a::new)
      );

      public static ar<ck.a> a(cm.a... $$0) {
         return a(Stream.of($$0).map(cm.a::b).toArray(cm[]::new));
      }

      public static ar<ck.a> a(cm... $$0) {
         return aq.f.a(new ck.a(Optional.empty(), ck.a.a.b, List.of($$0)));
      }

      public static ar<ck.a> a(djg... $$0) {
         cm[] $$1 = new cm[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cm(Optional.of(jj.a($$0[$$2].h().e())), cw.d.c, ke.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(cri $$0, czk $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cm> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               czk $$8 = $$0.a($$7);
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

      public ck.a.a b() {
         return this.c;
      }

      public List<cm> c() {
         return this.d;
      }

      public static record a(cw.d c, cw.d d, cw.d e) {
         public static final Codec<ck.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     cw.d.d.optionalFieldOf("occupied", cw.d.c).forGetter(ck.a.a::a),
                     cw.d.d.optionalFieldOf("full", cw.d.c).forGetter(ck.a.a::b),
                     cw.d.d.optionalFieldOf("empty", cw.d.c).forGetter(ck.a.a::c)
                  )
                  .apply($$0, ck.a.a::new)
         );
         public static final ck.a.a b = new ck.a.a(cw.d.c, cw.d.c, cw.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public cw.d a() {
            return this.c;
         }

         public cw.d b() {
            return this.d;
         }

         public cw.d c() {
            return this.e;
         }
      }
   }
}
