import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class ce extends ds<ce.a> {
   @Override
   public Codec<ce.a> a() {
      return ce.a.a;
   }

   public void a(aqn $$0, cmj $$1, cuc $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cuc $$7 = $$1.a($$6);
         if ($$7.e()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.H() >= $$7.j()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(aqn $$0, cmj $$1, cuc $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bf> b, ce.a.a c, List<cp> d) implements ds.a {
      public static final Codec<ce.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(ce.a::a),
                  ce.a.a.a.optionalFieldOf("slots", ce.a.a.b).forGetter(ce.a::b),
                  cp.a.listOf().optionalFieldOf("items", List.of()).forGetter(ce.a::c)
               )
               .apply($$0, ce.a::new)
      );

      public static an<ce.a> a(cp.a... $$0) {
         return a(Stream.of($$0).map(cp.a::b).toArray(cp[]::new));
      }

      public static an<ce.a> a(cp... $$0) {
         return am.f.a(new ce.a(Optional.empty(), ce.a.a.b, List.of($$0)));
      }

      public static an<ce.a> a(dce... $$0) {
         cp[] $$1 = new cp[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cp(Optional.of(jn.a($$0[$$2].r().o())), de.d.c, kl.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(cmj $$0, cuc $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cp> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cuc $$8 = $$0.a($$7);
               if (!$$8.e()) {
                  $$5.removeIf($$1x -> $$1x.a($$8));
               }
            }

            return $$5.isEmpty();
         } else {
            return !$$1.e() && this.d.get(0).a($$1);
         }
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public ce.a.a b() {
         return this.c;
      }

      public List<cp> c() {
         return this.d;
      }

      public static record a(de.d c, de.d d, de.d e) {
         public static final Codec<ce.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     de.d.d.optionalFieldOf("occupied", de.d.c).forGetter(ce.a.a::a),
                     de.d.d.optionalFieldOf("full", de.d.c).forGetter(ce.a.a::b),
                     de.d.d.optionalFieldOf("empty", de.d.c).forGetter(ce.a.a::c)
                  )
                  .apply($$0, ce.a.a::new)
         );
         public static final ce.a.a b = new ce.a.a(de.d.c, de.d.c, de.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public de.d a() {
            return this.c;
         }

         public de.d b() {
            return this.d;
         }

         public de.d c() {
            return this.e;
         }
      }
   }
}
