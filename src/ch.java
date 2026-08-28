import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class ch extends dx<ch.a> {
   @Override
   public Codec<ch.a> a() {
      return ch.a.a;
   }

   public void a(arn $$0, cog $$1, cvx $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cvx $$7 = $$1.a($$6);
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

   private void a(arn $$0, cog $$1, cvx $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bg> b, ch.a.a c, List<ct> d) implements dx.a {
      public static final Codec<ch.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(ch.a::a),
                  ch.a.a.a.optionalFieldOf("slots", ch.a.a.b).forGetter(ch.a::b),
                  ct.a.listOf().optionalFieldOf("items", List.of()).forGetter(ch.a::c)
               )
               .apply($$0, ch.a::new)
      );

      public static ao<ch.a> a(ct.a... $$0) {
         return a(Stream.of($$0).map(ct.a::b).toArray(ct[]::new));
      }

      public static ao<ch.a> a(ct... $$0) {
         return an.f.a(new ch.a(Optional.empty(), ch.a.a.b, List.of($$0)));
      }

      public static ao<ch.a> a(deu... $$0) {
         ct[] $$1 = new ct[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new ct(Optional.of(jt.a($$0[$$2].j().f())), di.d.c, kr.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(cog $$0, cvx $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<ct> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cvx $$8 = $$0.a($$7);
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
      public Optional<bg> a() {
         return this.b;
      }

      public ch.a.a b() {
         return this.c;
      }

      public List<ct> c() {
         return this.d;
      }

      public static record a(di.d c, di.d d, di.d e) {
         public static final Codec<ch.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     di.d.d.optionalFieldOf("occupied", di.d.c).forGetter(ch.a.a::a),
                     di.d.d.optionalFieldOf("full", di.d.c).forGetter(ch.a.a::b),
                     di.d.d.optionalFieldOf("empty", di.d.c).forGetter(ch.a.a::c)
                  )
                  .apply($$0, ch.a.a::new)
         );
         public static final ch.a.a b = new ch.a.a(di.d.c, di.d.c, di.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public di.d a() {
            return this.c;
         }

         public di.d b() {
            return this.d;
         }

         public di.d c() {
            return this.e;
         }
      }
   }
}
