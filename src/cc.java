import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class cc extends dh<cc.a> {
   @Override
   public Codec<cc.a> a() {
      return cc.a.a;
   }

   public void a(aqu $$0, clx $$1, cuh $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cuh $$7 = $$1.a($$6);
         if ($$7.d()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.G() >= $$7.i()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(aqu $$0, clx $$1, cuh $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bd> b, cc.a.a c, List<ci> d) implements dh.a {
      public static final Codec<cc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(cc.a::a),
                  axu.a(cc.a.a.a, "slots", cc.a.a.b).forGetter(cc.a::b),
                  axu.a(ci.a.listOf(), "items", List.of()).forGetter(cc.a::c)
               )
               .apply($$0, cc.a::new)
      );

      public static ao<cc.a> a(ci.a... $$0) {
         return a(Stream.of($$0).map(ci.a::b).toArray(ci[]::new));
      }

      public static ao<cc.a> a(ci... $$0) {
         return an.f.a(new cc.a(Optional.empty(), cc.a.a.b, List.of($$0)));
      }

      public static ao<cc.a> a(dbz... $$0) {
         ci[] $$1 = new ci[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new ci(Optional.of(je.a($$0[$$2].q().n())), cu.d.c, kc.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(clx $$0, cuh $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<ci> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cuh $$8 = $$0.a($$7);
               if (!$$8.d()) {
                  $$5.removeIf($$1x -> $$1x.a($$8));
               }
            }

            return $$5.isEmpty();
         } else {
            return !$$1.d() && this.d.get(0).a($$1);
         }
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public cc.a.a b() {
         return this.c;
      }

      public List<ci> c() {
         return this.d;
      }

      public static record a(cu.d c, cu.d d, cu.d e) {
         public static final Codec<cc.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axu.a(cu.d.d, "occupied", cu.d.c).forGetter(cc.a.a::a),
                     axu.a(cu.d.d, "full", cu.d.c).forGetter(cc.a.a::b),
                     axu.a(cu.d.d, "empty", cu.d.c).forGetter(cc.a.a::c)
                  )
                  .apply($$0, cc.a.a::new)
         );
         public static final cc.a.a b = new cc.a.a(cu.d.c, cu.d.c, cu.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public cu.d a() {
            return this.c;
         }

         public cu.d b() {
            return this.d;
         }

         public cu.d c() {
            return this.e;
         }
      }
   }
}
