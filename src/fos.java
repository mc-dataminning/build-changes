import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fos {
   public static final fos a = new fos();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fos.a[] c;
   private final aer[] d;

   private fos() {
      this.c = new fos.a[0];
      this.d = new aer[0];
   }

   public fos(gaq $$0, fom $$1, List<foq> $$2) {
      this.d = $$2.stream().flatMap(foq::b).map(foq.b::a).distinct().toArray(aer[]::new);
      Object2IntMap<aer> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fos.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         foq $$7 = $$2.get($$6);
         gam $$8 = this.a($$0, $$1, $$7);
         fos.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fos.b($$2x, $$1x.b());
         }).toArray(fos.b[]::new);
         $$5.add(new fos.a($$9, $$8));
      }

      this.c = $$5.toArray(new fos.a[0]);
   }

   @Nullable
   private gam a(gaq $$0, fom $$1, foq $$2) {
      gax $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gan.a);
   }

   @Nullable
   public gam a(gam $$0, ciy $$1, @Nullable fii $$2, @Nullable biy $$3, int $$4) {
      if (this.c.length != 0) {
         cit $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aer $$9 = this.d[$$8];
            fxt $$10 = fxs.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fos.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gam $$12 = $$11.b;
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
      private final fos.b[] a;
      @Nullable
      final gam b;

      a(fos.b[] $$0, @Nullable gam $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fos.b $$1 : this.a) {
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
