import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class flb {
   public static final flb a = new flb();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final flb.a[] c;
   private final acq[] d;

   private flb() {
      this.c = new flb.a[0];
      this.d = new acq[0];
   }

   public flb(fwv $$0, fkw $$1, List<fla> $$2) {
      this.d = $$2.stream().flatMap(fla::b).map(fla.b::a).distinct().toArray(acq[]::new);
      Object2IntMap<acq> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<flb.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fla $$7 = $$2.get($$6);
         fwr $$8 = this.a($$0, $$1, $$7);
         flb.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new flb.b($$2x, $$1x.b());
         }).toArray(flb.b[]::new);
         $$5.add(new flb.a($$9, $$8));
      }

      this.c = $$5.toArray(new flb.a[0]);
   }

   @Nullable
   private fwr a(fwv $$0, fkw $$1, fla $$2) {
      fxc $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), fws.a);
   }

   @Nullable
   public fwr a(fwr $$0, cfz $$1, @Nullable few $$2, @Nullable bfz $$3, int $$4) {
      if (this.c.length != 0) {
         cfu $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            acq $$9 = this.d[$$8];
            fud $$10 = fuc.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (flb.a $$11 : this.c) {
            if ($$11.a($$7)) {
               fwr $$12 = $$11.b;
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
      private final flb.b[] a;
      @Nullable
      final fwr b;

      a(flb.b[] $$0, @Nullable fwr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (flb.b $$1 : this.a) {
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
