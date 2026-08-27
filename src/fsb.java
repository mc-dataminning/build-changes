import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fsb {
   public static final fsb a = new fsb();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fsb.a[] c;
   private final agi[] d;

   private fsb() {
      this.c = new fsb.a[0];
      this.d = new agi[0];
   }

   public fsb(gdz $$0, frw $$1, List<fsa> $$2) {
      this.d = $$2.stream().flatMap(fsa::b).map(fsa.b::a).distinct().toArray(agi[]::new);
      Object2IntMap<agi> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fsb.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fsa $$7 = $$2.get($$6);
         gdv $$8 = this.a($$0, $$1, $$7);
         fsb.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fsb.b($$2x, $$1x.b());
         }).toArray(fsb.b[]::new);
         $$5.add(new fsb.a($$9, $$8));
      }

      this.c = $$5.toArray(new fsb.a[0]);
   }

   @Nullable
   private gdv a(gdz $$0, frw $$1, fsa $$2) {
      geg $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gdw.a);
   }

   @Nullable
   public gdv a(gdv $$0, clj $$1, @Nullable flj $$2, @Nullable blg $$3, int $$4) {
      if (this.c.length != 0) {
         cle $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            agi $$9 = this.d[$$8];
            gbc $$10 = gbb.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fsb.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gdv $$12 = $$11.b;
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
      private final fsb.b[] a;
      @Nullable
      final gdv b;

      a(fsb.b[] $$0, @Nullable gdv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fsb.b $$1 : this.a) {
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
