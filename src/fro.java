import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fro {
   public static final fro a = new fro();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fro.a[] c;
   private final agg[] d;

   private fro() {
      this.c = new fro.a[0];
      this.d = new agg[0];
   }

   public fro(gdm $$0, frj $$1, List<frn> $$2) {
      this.d = $$2.stream().flatMap(frn::b).map(frn.b::a).distinct().toArray(agg[]::new);
      Object2IntMap<agg> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fro.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         frn $$7 = $$2.get($$6);
         gdi $$8 = this.a($$0, $$1, $$7);
         fro.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fro.b($$2x, $$1x.b());
         }).toArray(fro.b[]::new);
         $$5.add(new fro.a($$9, $$8));
      }

      this.c = $$5.toArray(new fro.a[0]);
   }

   @Nullable
   private gdi a(gdm $$0, frj $$1, frn $$2) {
      gdt $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gdj.a);
   }

   @Nullable
   public gdi a(gdi $$0, clb $$1, @Nullable fkw $$2, @Nullable bky $$3, int $$4) {
      if (this.c.length != 0) {
         ckw $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            agg $$9 = this.d[$$8];
            gap $$10 = gao.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fro.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gdi $$12 = $$11.b;
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
      private final fro.b[] a;
      @Nullable
      final gdi b;

      a(fro.b[] $$0, @Nullable gdi $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fro.b $$1 : this.a) {
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
