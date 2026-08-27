import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fpl {
   public static final fpl a = new fpl();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fpl.a[] c;
   private final aew[] d;

   private fpl() {
      this.c = new fpl.a[0];
      this.d = new aew[0];
   }

   public fpl(gbj $$0, fpg $$1, List<fpk> $$2) {
      this.d = $$2.stream().flatMap(fpk::b).map(fpk.b::a).distinct().toArray(aew[]::new);
      Object2IntMap<aew> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fpl.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fpk $$7 = $$2.get($$6);
         gbf $$8 = this.a($$0, $$1, $$7);
         fpl.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fpl.b($$2x, $$1x.b());
         }).toArray(fpl.b[]::new);
         $$5.add(new fpl.a($$9, $$8));
      }

      this.c = $$5.toArray(new fpl.a[0]);
   }

   @Nullable
   private gbf a(gbj $$0, fpg $$1, fpk $$2) {
      gbq $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gbg.a);
   }

   @Nullable
   public gbf a(gbf $$0, cjf $$1, @Nullable fix $$2, @Nullable bjg $$3, int $$4) {
      if (this.c.length != 0) {
         cja $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aew $$9 = this.d[$$8];
            fym $$10 = fyl.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fpl.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gbf $$12 = $$11.b;
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
      private final fpl.b[] a;
      @Nullable
      final gbf b;

      a(fpl.b[] $$0, @Nullable gbf $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fpl.b $$1 : this.a) {
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
