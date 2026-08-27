import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class cb extends de<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(aqi $$0, clg $$1, csz $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         csz $$7 = $$1.a($$6);
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

   private void a(aqi $$0, clg $$1, csz $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bc> b, cb.a.a c, List<ch> d) implements de.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(cb.a::a),
                  axh.a(cb.a.a.a, "slots", cb.a.a.b).forGetter(cb.a::b),
                  axh.a(ch.a.listOf(), "items", List.of()).forGetter(cb.a::c)
               )
               .apply($$0, cb.a::new)
      );

      public static an<cb.a> a(ch.a... $$0) {
         return a(Stream.of($$0).map(ch.a::b).toArray(ch[]::new));
      }

      public static an<cb.a> a(ch... $$0) {
         return am.f.a(new cb.a(Optional.empty(), cb.a.a.b, List.of($$0)));
      }

      public static an<cb.a> a(dac... $$0) {
         ch[] $$1 = new ch[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new ch(Optional.of(ja.a($$0[$$2].q().n())), ct.d.c, jy.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(clg $$0, csz $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<ch> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               csz $$8 = $$0.a($$7);
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

      public cb.a.a b() {
         return this.c;
      }

      public List<ch> c() {
         return this.d;
      }

      public static record a(ct.d c, ct.d d, ct.d e) {
         public static final Codec<cb.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axh.a(ct.d.d, "occupied", ct.d.c).forGetter(cb.a.a::a),
                     axh.a(ct.d.d, "full", ct.d.c).forGetter(cb.a.a::b),
                     axh.a(ct.d.d, "empty", ct.d.c).forGetter(cb.a.a::c)
                  )
                  .apply($$0, cb.a.a::new)
         );
         public static final cb.a.a b = new cb.a.a(ct.d.c, ct.d.c, ct.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public ct.d a() {
            return this.c;
         }

         public ct.d b() {
            return this.d;
         }

         public ct.d c() {
            return this.e;
         }
      }
   }
}
