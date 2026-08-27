import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fom {
   public static final fom a = new fom();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fom.a[] c;
   private final aep[] d;

   private fom() {
      this.c = new fom.a[0];
      this.d = new aep[0];
   }

   public fom(gal $$0, foh $$1, List<fol> $$2) {
      this.d = $$2.stream().flatMap(fol::b).map(fol.b::a).distinct().toArray(aep[]::new);
      Object2IntMap<aep> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fom.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fol $$7 = $$2.get($$6);
         gah $$8 = this.a($$0, $$1, $$7);
         fom.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fom.b($$2x, $$1x.b());
         }).toArray(fom.b[]::new);
         $$5.add(new fom.a($$9, $$8));
      }

      this.c = $$5.toArray(new fom.a[0]);
   }

   @Nullable
   private gah a(gal $$0, foh $$1, fol $$2) {
      gas $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gai.a);
   }

   @Nullable
   public gah a(gah $$0, ciw $$1, @Nullable fie $$2, @Nullable biw $$3, int $$4) {
      if (this.c.length != 0) {
         cir $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aep $$9 = this.d[$$8];
            fxo $$10 = fxn.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fom.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gah $$12 = $$11.b;
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
      private final fom.b[] a;
      @Nullable
      final gah b;

      a(fom.b[] $$0, @Nullable gah $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fom.b $$1 : this.a) {
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
