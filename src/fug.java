import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fug {
   public static final fug a = new fug();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fug.a[] c;
   private final ahd[] d;

   private fug() {
      this.c = new fug.a[0];
      this.d = new ahd[0];
   }

   public fug(ggk $$0, fub $$1, List<fuf> $$2) {
      this.d = $$2.stream().flatMap(fuf::b).map(fuf.b::a).distinct().toArray(ahd[]::new);
      Object2IntMap<ahd> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fug.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fuf $$7 = $$2.get($$6);
         ggg $$8 = this.a($$0, $$1, $$7);
         fug.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fug.b($$2x, $$1x.b());
         }).toArray(fug.b[]::new);
         $$5.add(new fug.a($$9, $$8));
      }

      this.c = $$5.toArray(new fug.a[0]);
   }

   @Nullable
   private ggg a(ggk $$0, fub $$1, fuf $$2) {
      ggr $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), ggh.a);
   }

   @Nullable
   public ggg a(ggg $$0, cmr $$1, @Nullable fnk $$2, @Nullable bmf $$3, int $$4) {
      if (this.c.length != 0) {
         cmm $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ahd $$9 = this.d[$$8];
            gdn $$10 = gdm.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fug.a $$11 : this.c) {
            if ($$11.a($$7)) {
               ggg $$12 = $$11.b;
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
      private final fug.b[] a;
      @Nullable
      final ggg b;

      a(fug.b[] $$0, @Nullable ggg $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fug.b $$1 : this.a) {
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
