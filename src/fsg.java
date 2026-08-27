import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fsg {
   public static final fsg a = new fsg();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fsg.a[] c;
   private final agm[] d;

   private fsg() {
      this.c = new fsg.a[0];
      this.d = new agm[0];
   }

   public fsg(gee $$0, fsb $$1, List<fsf> $$2) {
      this.d = $$2.stream().flatMap(fsf::b).map(fsf.b::a).distinct().toArray(agm[]::new);
      Object2IntMap<agm> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fsg.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fsf $$7 = $$2.get($$6);
         gea $$8 = this.a($$0, $$1, $$7);
         fsg.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fsg.b($$2x, $$1x.b());
         }).toArray(fsg.b[]::new);
         $$5.add(new fsg.a($$9, $$8));
      }

      this.c = $$5.toArray(new fsg.a[0]);
   }

   @Nullable
   private gea a(gee $$0, fsb $$1, fsf $$2) {
      gel $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), geb.a);
   }

   @Nullable
   public gea a(gea $$0, clo $$1, @Nullable flo $$2, @Nullable bll $$3, int $$4) {
      if (this.c.length != 0) {
         clj $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            agm $$9 = this.d[$$8];
            gbh $$10 = gbg.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fsg.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gea $$12 = $$11.b;
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
      private final fsg.b[] a;
      @Nullable
      final gea b;

      a(fsg.b[] $$0, @Nullable gea $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fsg.b $$1 : this.a) {
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
