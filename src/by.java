import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class by extends cv<by.a> {
   @Override
   public Codec<by.a> a() {
      return by.a.a;
   }

   public void a(ane $$0, cfh $$1, cmy $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cmy $$7 = $$1.a($$6);
         if ($$7.b()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.L() >= $$7.g()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(ane $$0, cfh $$1, cmy $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bb> b, by.a.a c, List<ca> d) implements cv.a {
      public static final Codec<by.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atw.a(bp.b, "player").forGetter(by.a::a),
                  atw.a(by.a.a.a, "slots", by.a.a.b).forGetter(by.a::b),
                  atw.a(ca.a.listOf(), "items", List.of()).forGetter(by.a::c)
               )
               .apply($$0, by.a::new)
      );

      public static an<by.a> a(ca.a... $$0) {
         return a(Stream.of($$0).map(ca.a::b).toArray(ca[]::new));
      }

      public static an<by.a> a(ca... $$0) {
         return am.f.a(new by.a(Optional.empty(), by.a.a.b, List.of($$0)));
      }

      public static an<by.a> a(cto... $$0) {
         ca[] $$1 = new ca[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new ca(Optional.empty(), Optional.of(il.a($$0[$$2].k().j())), ck.d.c, ck.d.c, List.of(), List.of(), Optional.empty(), Optional.empty());
         }

         return a($$1);
      }

      public boolean a(cfh $$0, cmy $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<ca> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cmy $$8 = $$0.a($$7);
               if (!$$8.b()) {
                  $$5.removeIf($$1x -> $$1x.a($$8));
               }
            }

            return $$5.isEmpty();
         } else {
            return !$$1.b() && this.d.get(0).a($$1);
         }
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public by.a.a b() {
         return this.c;
      }

      public List<ca> c() {
         return this.d;
      }

      public static record a(ck.d c, ck.d d, ck.d e) {
         public static final Codec<by.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atw.a(ck.d.d, "occupied", ck.d.c).forGetter(by.a.a::a),
                     atw.a(ck.d.d, "full", ck.d.c).forGetter(by.a.a::b),
                     atw.a(ck.d.d, "empty", ck.d.c).forGetter(by.a.a::c)
                  )
                  .apply($$0, by.a.a::new)
         );
         public static final by.a.a b = new by.a.a(ck.d.c, ck.d.c, ck.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public ck.d a() {
            return this.c;
         }

         public ck.d b() {
            return this.d;
         }

         public ck.d c() {
            return this.e;
         }
      }
   }
}
