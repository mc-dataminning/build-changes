import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class ca extends dd<ca.a> {
   @Override
   public Codec<ca.a> a() {
      return ca.a.a;
   }

   public void a(aqf $$0, ckk $$1, csd $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         csd $$7 = $$1.a($$6);
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

   private void a(aqf $$0, ckk $$1, csd $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bc> b, ca.a.a c, List<cg> d) implements dd.a {
      public static final Codec<ca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(br.b, "player").forGetter(ca.a::a),
                  axe.a(ca.a.a.a, "slots", ca.a.a.b).forGetter(ca.a::b),
                  axe.a(cg.a.listOf(), "items", List.of()).forGetter(ca.a::c)
               )
               .apply($$0, ca.a::new)
      );

      public static an<ca.a> a(cg.a... $$0) {
         return a(Stream.of($$0).map(cg.a::b).toArray(cg[]::new));
      }

      public static an<ca.a> a(cg... $$0) {
         return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
      }

      public static an<ca.a> a(czt... $$0) {
         cg[] $$1 = new cg[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cg(Optional.of(iz.a($$0[$$2].p().n())), cs.d.c, jx.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(ckk $$0, csd $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cg> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               csd $$8 = $$0.a($$7);
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
      public Optional<bc> a() {
         return this.b;
      }

      public ca.a.a b() {
         return this.c;
      }

      public List<cg> c() {
         return this.d;
      }

      public static record a(cs.d c, cs.d d, cs.d e) {
         public static final Codec<ca.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axe.a(cs.d.d, "occupied", cs.d.c).forGetter(ca.a.a::a),
                     axe.a(cs.d.d, "full", cs.d.c).forGetter(ca.a.a::b),
                     axe.a(cs.d.d, "empty", cs.d.c).forGetter(ca.a.a::c)
                  )
                  .apply($$0, ca.a.a::new)
         );
         public static final ca.a.a b = new ca.a.a(cs.d.c, cs.d.c, cs.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public cs.d a() {
            return this.c;
         }

         public cs.d b() {
            return this.d;
         }

         public cs.d c() {
            return this.e;
         }
      }
   }
}
