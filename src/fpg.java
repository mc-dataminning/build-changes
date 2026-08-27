import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fpg {
   public static final fpg a = new fpg();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fpg.a[] c;
   private final aeu[] d;

   private fpg() {
      this.c = new fpg.a[0];
      this.d = new aeu[0];
   }

   public fpg(gbe $$0, fpb $$1, List<fpf> $$2) {
      this.d = $$2.stream().flatMap(fpf::b).map(fpf.b::a).distinct().toArray(aeu[]::new);
      Object2IntMap<aeu> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fpg.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fpf $$7 = $$2.get($$6);
         gba $$8 = this.a($$0, $$1, $$7);
         fpg.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fpg.b($$2x, $$1x.b());
         }).toArray(fpg.b[]::new);
         $$5.add(new fpg.a($$9, $$8));
      }

      this.c = $$5.toArray(new fpg.a[0]);
   }

   @Nullable
   private gba a(gbe $$0, fpb $$1, fpf $$2) {
      gbl $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gbb.a);
   }

   @Nullable
   public gba a(gba $$0, cja $$1, @Nullable fis $$2, @Nullable bjb $$3, int $$4) {
      if (this.c.length != 0) {
         civ $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aeu $$9 = this.d[$$8];
            fyh $$10 = fyg.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fpg.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gba $$12 = $$11.b;
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
      private final fpg.b[] a;
      @Nullable
      final gba b;

      a(fpg.b[] $$0, @Nullable gba $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fpg.b $$1 : this.a) {
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
