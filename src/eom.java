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

public class eom {
   private static final float a = 1.5F;
   private final eoi[] b = new eoi[32];
   private final int c;
   private final eoj d;
   private static final boolean e = false;
   private final eog f = new eog();

   public eom(eoj $$0, int $$1) {
      this.d = $$0;
      this.c = $$1;
   }

   @Nullable
   public eok a(dcm $$0, bts $$1, Set<iz> $$2, float $$3, int $$4, float $$5) {
      this.f.a();
      this.d.a($$0, $$1);
      eoi $$6 = this.d.a();
      if ($$6 == null) {
         return null;
      } else {
         Map<eor, iz> $$7 = $$2.stream().collect(Collectors.toMap($$0x -> this.d.a((double)$$0x.u(), (double)$$0x.v(), (double)$$0x.w()), Function.identity()));
         eok $$8 = this.a($$0.a(), $$6, $$7, $$3, $$4, $$5);
         this.d.b();
         return $$8;
      }
   }

   @Nullable
   private eok a(bnj $$0, eoi $$1, Map<eor, iz> $$2, float $$3, int $$4, float $$5) {
      $$0.a("find_path");
      $$0.a(bop.a);
      Set<eor> $$6 = $$2.keySet();
      $$1.e = 0.0F;
      $$1.f = this.a($$1, $$6);
      $$1.g = $$1.f;
      this.f.a();
      this.f.a($$1);
      Set<eoi> $$7 = ImmutableSet.of();
      int $$8 = 0;
      Set<eor> $$9 = Sets.newHashSetWithExpectedSize($$6.size());
      int $$10 = (int)((float)this.c * $$5);

      while (!this.f.e()) {
         if (++$$8 >= $$10) {
            break;
         }

         eoi $$11 = this.f.c();
         $$11.i = true;

         for (eor $$12 : $$6) {
            if ($$11.d($$12) <= (float)$$4) {
               $$12.e();
               $$9.add($$12);
            }
         }

         if (!$$9.isEmpty()) {
            break;
         }

         if (!($$11.a($$1) >= $$3)) {
            int $$13 = this.d.a(this.b, $$11);

            for (int $$14 = 0; $$14 < $$13; $$14++) {
               eoi $$15 = this.b[$$14];
               float $$16 = this.a($$11, $$15);
               $$15.j = $$11.j + $$16;
               float $$17 = $$11.e + $$16 + $$15.k;
               if ($$15.j < $$3 && (!$$15.c() || $$17 < $$15.e)) {
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

      Optional<eok> $$18 = !$$9.isEmpty()
         ? $$9.stream().map($$1x -> this.a($$1x.d(), $$2.get($$1x), true)).min(Comparator.comparingInt(eok::e))
         : $$6.stream().map($$1x -> this.a($$1x.d(), $$2.get($$1x), false)).min(Comparator.comparingDouble(eok::m).thenComparingInt(eok::e));
      $$0.c();
      return $$18.isEmpty() ? null : $$18.get();
   }

   protected float a(eoi $$0, eoi $$1) {
      return $$0.a($$1);
   }

   private float a(eoi $$0, Set<eor> $$1) {
      float $$2 = Float.MAX_VALUE;

      for (eor $$3 : $$1) {
         float $$4 = $$0.a($$3);
         $$3.a($$4, $$0);
         $$2 = Math.min($$4, $$2);
      }

      return $$2;
   }

   private eok a(eoi $$0, iz $$1, boolean $$2) {
      List<eoi> $$3 = Lists.newArrayList();
      eoi $$4 = $$0;
      $$3.add(0, $$0);

      while ($$4.h != null) {
         $$4 = $$4.h;
         $$3.add(0, $$4);
      }

      return new eok($$3, $$1, $$2);
   }
}
