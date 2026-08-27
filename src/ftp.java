import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class ftp {
   public static final ftp a = new ftp();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final ftp.a[] c;
   private final agt[] d;

   private ftp() {
      this.c = new ftp.a[0];
      this.d = new agt[0];
   }

   public ftp(gft $$0, ftk $$1, List<fto> $$2) {
      this.d = $$2.stream().flatMap(fto::b).map(fto.b::a).distinct().toArray(agt[]::new);
      Object2IntMap<agt> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<ftp.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fto $$7 = $$2.get($$6);
         gfp $$8 = this.a($$0, $$1, $$7);
         ftp.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new ftp.b($$2x, $$1x.b());
         }).toArray(ftp.b[]::new);
         $$5.add(new ftp.a($$9, $$8));
      }

      this.c = $$5.toArray(new ftp.a[0]);
   }

   @Nullable
   private gfp a(gft $$0, ftk $$1, fto $$2) {
      gga $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gfq.a);
   }

   @Nullable
   public gfp a(gfp $$0, cmh $$1, @Nullable fmt $$2, @Nullable blv $$3, int $$4) {
      if (this.c.length != 0) {
         cmc $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            agt $$9 = this.d[$$8];
            gcw $$10 = gcv.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (ftp.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gfp $$12 = $$11.b;
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
      private final ftp.b[] a;
      @Nullable
      final gfp b;

      a(ftp.b[] $$0, @Nullable gfp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (ftp.b $$1 : this.a) {
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
