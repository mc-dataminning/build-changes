import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class cg extends dv<cg.a> {
   @Override
   public Codec<cg.a> a() {
      return cg.a.a;
   }

   public void a(arh $$0, cno $$1, cvl $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cvl $$7 = $$1.a($$6);
         if ($$7.f()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.J() >= $$7.k()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(arh $$0, cno $$1, cvl $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bg> b, cg.a.a c, List<cs> d) implements dv.a {
      public static final Codec<cg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(cg.a::a),
                  cg.a.a.a.optionalFieldOf("slots", cg.a.a.b).forGetter(cg.a::b),
                  cs.a.listOf().optionalFieldOf("items", List.of()).forGetter(cg.a::c)
               )
               .apply($$0, cg.a::new)
      );

      public static ao<cg.a> a(cs.a... $$0) {
         return a(Stream.of($$0).map(cs.a::b).toArray(cs[]::new));
      }

      public static ao<cg.a> a(cs... $$0) {
         return an.f.a(new cg.a(Optional.empty(), cg.a.a.b, List.of($$0)));
      }

      public static ao<cg.a> a(ddr... $$0) {
         cs[] $$1 = new cs[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cs(Optional.of(jr.a($$0[$$2].r().o())), dh.d.c, kp.c, Map.of());
         }

         return a($$1);
      }

      public boolean a(cno $$0, cvl $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cs> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cvl $$8 = $$0.a($$7);
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

      public cg.a.a b() {
         return this.c;
      }

      public List<cs> c() {
         return this.d;
      }

      public static record a(dh.d c, dh.d d, dh.d e) {
         public static final Codec<cg.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     dh.d.d.optionalFieldOf("occupied", dh.d.c).forGetter(cg.a.a::a),
                     dh.d.d.optionalFieldOf("full", dh.d.c).forGetter(cg.a.a::b),
                     dh.d.d.optionalFieldOf("empty", dh.d.c).forGetter(cg.a.a::c)
                  )
                  .apply($$0, cg.a.a::new)
         );
         public static final cg.a.a b = new cg.a.a(dh.d.c, dh.d.c, dh.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public dh.d a() {
            return this.c;
         }

         public dh.d b() {
            return this.d;
         }

         public dh.d c() {
            return this.e;
         }
      }
   }
}
