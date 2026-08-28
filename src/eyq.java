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

public class eyq {
   private static final float a = 1.5F;
   private final eym[] b = new eym[32];
   private int c;
   private final eyn d;
   private static final boolean e = false;
   private final eyk f = new eyk();

   public eyq(eyn $$0, int $$1) {
      this.d = $$0;
      this.c = $$1;
   }

   public void a(int $$0) {
      this.c = $$0;
   }

   @Nullable
   public eyo a(dkw $$0, byh $$1, Set<iw> $$2, float $$3, int $$4, float $$5) {
      this.f.a();
      this.d.a($$0, $$1);
      eym $$6 = this.d.a();
      if ($$6 == null) {
         return null;
      } else {
         Map<eyv, iw> $$7 = $$2.stream().collect(Collectors.toMap($$0x -> this.d.a((double)$$0x.u(), (double)$$0x.v(), (double)$$0x.w()), Function.identity()));
         eyo $$8 = this.a($$6, $$7, $$3, $$4, $$5);
         this.d.b();
         return $$8;
      }
   }

   @Nullable
   private eyo a(eym $$0, Map<eyv, iw> $$1, float $$2, int $$3, float $$4) {
      brm $$5 = brl.a();
      $$5.a("find_path");
      $$5.a(bsv.a);
      Set<eyv> $$6 = $$1.keySet();
      $$0.e = 0.0F;
      $$0.f = this.a($$0, $$6);
      $$0.g = $$0.f;
      this.f.a();
      this.f.a($$0);
      Set<eym> $$7 = ImmutableSet.of();
      int $$8 = 0;
      Set<eyv> $$9 = Sets.newHashSetWithExpectedSize($$6.size());
      int $$10 = (int)((float)this.c * $$4);

      while (!this.f.e()) {
         if (++$$8 >= $$10) {
            break;
         }

         eym $$11 = this.f.c();
         $$11.i = true;

         for (eyv $$12 : $$6) {
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
               eym $$15 = this.b[$$14];
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

      Optional<eyo> $$18 = !$$9.isEmpty()
         ? $$9.stream().map($$1x -> this.a($$1x.d(), $$1.get($$1x), true)).min(Comparator.comparingInt(eyo::e))
         : $$6.stream().map($$1x -> this.a($$1x.d(), $$1.get($$1x), false)).min(Comparator.comparingDouble(eyo::m).thenComparingInt(eyo::e));
      $$5.c();
      return $$18.isEmpty() ? null : $$18.get();
   }

   protected float a(eym $$0, eym $$1) {
      return $$0.a($$1);
   }

   private float a(eym $$0, Set<eyv> $$1) {
      float $$2 = Float.MAX_VALUE;

      for (eyv $$3 : $$1) {
         float $$4 = $$0.a($$3);
         $$3.a($$4, $$0);
         $$2 = Math.min($$4, $$2);
      }

      return $$2;
   }

   private eyo a(eym $$0, iw $$1, boolean $$2) {
      List<eym> $$3 = Lists.newArrayList();
      eym $$4 = $$0;
      $$3.add(0, $$0);

      while ($$4.h != null) {
         $$4 = $$4.h;
         $$3.add(0, $$4);
      }

      return new eyo($$3, $$1, $$2);
   }
}
