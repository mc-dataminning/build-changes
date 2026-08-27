import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fpn {
   public static final fpn a = new fpn();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fpn.a[] c;
   private final aey[] d;

   private fpn() {
      this.c = new fpn.a[0];
      this.d = new aey[0];
   }

   public fpn(gbl $$0, fpi $$1, List<fpm> $$2) {
      this.d = $$2.stream().flatMap(fpm::b).map(fpm.b::a).distinct().toArray(aey[]::new);
      Object2IntMap<aey> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fpn.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fpm $$7 = $$2.get($$6);
         gbh $$8 = this.a($$0, $$1, $$7);
         fpn.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fpn.b($$2x, $$1x.b());
         }).toArray(fpn.b[]::new);
         $$5.add(new fpn.a($$9, $$8));
      }

      this.c = $$5.toArray(new fpn.a[0]);
   }

   @Nullable
   private gbh a(gbl $$0, fpi $$1, fpm $$2) {
      gbs $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gbi.a);
   }

   @Nullable
   public gbh a(gbh $$0, cjh $$1, @Nullable fiz $$2, @Nullable bji $$3, int $$4) {
      if (this.c.length != 0) {
         cjc $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aey $$9 = this.d[$$8];
            fyo $$10 = fyn.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fpn.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gbh $$12 = $$11.b;
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
      private final fpn.b[] a;
      @Nullable
      final gbh b;

      a(fpn.b[] $$0, @Nullable gbh $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fpn.b $$1 : this.a) {
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
