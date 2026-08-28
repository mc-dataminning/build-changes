import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class eto {
   private static final float a = 1.5F;
   private final etk[] b = new etk[32];
   private int c;
   private final etl d;
   private static final boolean e = false;
   private final eti f = new eti();

   public eto(etl $$0, int $$1) {
      this.d = $$0;
      this.c = $$1;
   }

   public void a(int $$0) {
      this.c = $$0;
   }

   @Nullable
   public etm a(dgu $$0, bvi $$1, Set<ji> $$2, float $$3, int $$4, float $$5) {
      this.f.a();
      this.d.a($$0, $$1);
      etk $$6 = this.d.a();
      if ($$6 == null) {
         return null;
      } else {
         Map<ett, ji> $$7 = $$2.stream().collect(Collectors.toMap($$0x -> this.d.a((double)$$0x.u(), (double)$$0x.v(), (double)$$0x.w()), Function.identity()));
         etm $$8 = this.a($$6, $$7, $$3, $$4, $$5);
         this.d.b();
         return $$8;
      }
   }

   @Nullable
   private etm a(etk $$0, Map<ett, ji> $$1, float $$2, int $$3, float $$4) {
      bos $$5 = bor.a();
      $$5.a("find_path");
      $$5.a(bqb.a);
      Set<ett> $$6 = $$1.keySet();
      $$0.e = 0.0F;
      $$0.f = this.a($$0, $$6);
      $$0.g = $$0.f;
      this.f.a();
      this.f.a($$0);
      Set<etk> $$7 = ImmutableSet.of();
      int $$8 = 0;
      Set<ett> $$9 = Sets.newHashSetWithExpectedSize($$6.size());
      int $$10 = (int)((float)this.c * $$4);

      while (!this.f.e()) {
         if (++$$8 >= $$10) {
            break;
         }

         etk $$11 = this.f.c();
         $$11.i = true;

         for (ett $$12 : $$6) {
            if ($$11.d($$12) <= (float)$$3) {
               $$12.e();
               $$9.add($$12);
            }
         }

         if (!$$9.isEmpty()) {
            break;
         }

         if (!($$11.a($$0) >= $$2)) {
            int $$13 = this.d.a(this.b, $$11);

            for (int $$14 = 0; $$14 < $$13; $$14++) {
               etk $$15 = this.b[$$14];
               float $$16 = this.a($$11, $$15);
               $$15.j = $$11.j + $$16;
               float $$17 = $$11.e + $$16 + $$15.k;
               if ($$15.j < $$2 && (!$$15.c() || $$17 < $$15.e)) {
                  $$15.h = $$11;
                  $$15.e = $$17;
                  $$15.f = this.a($$15, $$6) * 1.5F;
                  if ($$15.c()) {
                     this.f.a($$15, $$15.e + $$15.f);
                  } else {
                     $$15.g = $$15.e + $$15.f;
                     this.f.a($$15);
                  }
               }
            }
         }
      }

      Optional<etm> $$18 = !$$9.isEmpty()
         ? $$9.stream().map($$1x -> this.a($$1x.d(), $$1.get($$1x), true)).min(Comparator.comparingInt(etm::e))
         : $$6.stream().map($$1x -> this.a($$1x.d(), $$1.get($$1x), false)).min(Comparator.comparingDouble(etm::m).thenComparingInt(etm::e));
      $$5.c();
      return $$18.isEmpty() ? null : $$18.get();
   }

   protected float a(etk $$0, etk $$1) {
      return $$0.a($$1);
   }

   private float a(etk $$0, Set<ett> $$1) {
      float $$2 = Float.MAX_VALUE;

      for (ett $$3 : $$1) {
         float $$4 = $$0.a($$3);
         $$3.a($$4, $$0);
         $$2 = Math.min($$4, $$2);
      }

      return $$2;
   }

   private etm a(etk $$0, ji $$1, boolean $$2) {
      List<etk> $$3 = Lists.newArrayList();
      etk $$4 = $$0;
      $$3.add(0, $$0);

      while ($$4.h != null) {
         $$4 = $$4.h;
         $$3.add(0, $$4);
      }

      return new etm($$3, $$1, $$2);
   }
}
