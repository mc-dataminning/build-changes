import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fph {
   public static final fph a = new fph();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fph.a[] c;
   private final aez[] d;

   private fph() {
      this.c = new fph.a[0];
      this.d = new aez[0];
   }

   public fph(gbf $$0, fpc $$1, List<fpg> $$2) {
      this.d = $$2.stream().flatMap(fpg::b).map(fpg.b::a).distinct().toArray(aez[]::new);
      Object2IntMap<aez> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fph.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fpg $$7 = $$2.get($$6);
         gbb $$8 = this.a($$0, $$1, $$7);
         fph.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fph.b($$2x, $$1x.b());
         }).toArray(fph.b[]::new);
         $$5.add(new fph.a($$9, $$8));
      }

      this.c = $$5.toArray(new fph.a[0]);
   }

   @Nullable
   private gbb a(gbf $$0, fpc $$1, fpg $$2) {
      gbm $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gbc.a);
   }

   @Nullable
   public gbb a(gbb $$0, cjl $$1, @Nullable fis $$2, @Nullable bjm $$3, int $$4) {
      if (this.c.length != 0) {
         cjg $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aez $$9 = this.d[$$8];
            fyi $$10 = fyh.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fph.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gbb $$12 = $$11.b;
               if ($$12 == null) {
                  return $$0;
               }

               return $$12;
            }
         }
      }

      return $$0;
   }

   static class a {
      private final fph.b[] a;
      @Nullable
      final gbb b;

      a(fph.b[] $$0, @Nullable gbb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fph.b $$1 : this.a) {
            float $$2 = $$0[$$1.a];
            if ($$2 < $$1.b) {
               return false;
            }
         }

         return true;
      }
   }

   static class b {
      public final int a;
      public final float b;

      b(int $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
