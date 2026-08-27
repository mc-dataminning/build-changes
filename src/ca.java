import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ca extends cx<ca.a> {
   @Override
   public Codec<ca.a> a() {
      return ca.a.a;
   }

   public void a(apb $$0, chz $$1, cpq $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$1.b(); $$6++) {
         cpq $$7 = $$1.a($$6);
         if ($$7.b()) {
            $$4++;
         } else {
            $$5++;
            if ($$7.M() >= $$7.g()) {
               $$3++;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(apb $$0, chz $$1, cpq $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bc> b, ca.a.a c, List<cc> d) implements cx.a {
      public static final Codec<ca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avu.a(br.b, "player").forGetter(ca.a::a),
                  avu.a(ca.a.a.a, "slots", ca.a.a.b).forGetter(ca.a::b),
                  avu.a(cc.a.listOf(), "items", List.of()).forGetter(ca.a::c)
               )
               .apply($$0, ca.a::new)
      );

      public static an<ca.a> a(cc.a... $$0) {
         return a(Stream.of($$0).map(cc.a::b).toArray(cc[]::new));
      }

      public static an<ca.a> a(cc... $$0) {
         return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
      }

      public static an<ca.a> a(cwd... $$0) {
         cc[] $$1 = new cc[$$0.length];

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$1[$$2] = new cc(Optional.empty(), Optional.of(ip.a($$0[$$2].l().k())), cm.d.c, cm.d.c, List.of(), List.of(), Optional.empty(), Optional.empty());
         }

         return a($$1);
      }

      public boolean a(chz $$0, cpq $$1, int $$2, int $$3, int $$4) {
         if (!this.c.a($$2, $$3, $$4)) {
            return false;
         } else if (this.d.isEmpty()) {
            return true;
         } else if (this.d.size() != 1) {
            List<cc> $$5 = new ObjectArrayList(this.d);
            int $$6 = $$0.b();

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               if ($$5.isEmpty()) {
                  return true;
               }

               cpq $$8 = $$0.a($$7);
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
      public Optional<bc> a() {
         return this.b;
      }

      public ca.a.a b() {
         return this.c;
      }

      public List<cc> c() {
         return this.d;
      }

      public static record a(cm.d c, cm.d d, cm.d e) {
         public static final Codec<ca.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avu.a(cm.d.d, "occupied", cm.d.c).forGetter(ca.a.a::a),
                     avu.a(cm.d.d, "full", cm.d.c).forGetter(ca.a.a::b),
                     avu.a(cm.d.d, "empty", cm.d.c).forGetter(ca.a.a::c)
                  )
                  .apply($$0, ca.a.a::new)
         );
         public static final ca.a.a b = new ca.a.a(cm.d.c, cm.d.c, cm.d.c);

         public boolean a(int $$0, int $$1, int $$2) {
            if (!this.d.d($$0)) {
               return false;
            } else {
               return !this.e.d($$1) ? false : this.c.d($$2);
            }
         }

         public cm.d a() {
            return this.c;
         }

         public cm.d b() {
            return this.d;
         }

         public cm.d c() {
            return this.e;
         }
      }
   }
}
