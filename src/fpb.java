import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fpb {
   public static final fpb a = new fpb();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fpb.a[] c;
   private final aer[] d;

   private fpb() {
      this.c = new fpb.a[0];
      this.d = new aer[0];
   }

   public fpb(gaz $$0, fow $$1, List<fpa> $$2) {
      this.d = $$2.stream().flatMap(fpa::b).map(fpa.b::a).distinct().toArray(aer[]::new);
      Object2IntMap<aer> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fpb.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fpa $$7 = $$2.get($$6);
         gav $$8 = this.a($$0, $$1, $$7);
         fpb.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fpb.b($$2x, $$1x.b());
         }).toArray(fpb.b[]::new);
         $$5.add(new fpb.a($$9, $$8));
      }

      this.c = $$5.toArray(new fpb.a[0]);
   }

   @Nullable
   private gav a(gaz $$0, fow $$1, fpa $$2) {
      gbg $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gaw.a);
   }

   @Nullable
   public gav a(gav $$0, cix $$1, @Nullable fin $$2, @Nullable biy $$3, int $$4) {
      if (this.c.length != 0) {
         cis $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aer $$9 = this.d[$$8];
            fyc $$10 = fyb.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fpb.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gav $$12 = $$11.b;
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
      private final fpb.b[] a;
      @Nullable
      final gav b;

      a(fpb.b[] $$0, @Nullable gav $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fpb.b $$1 : this.a) {
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
