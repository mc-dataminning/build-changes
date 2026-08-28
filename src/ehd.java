import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class ehd {
   private static final Logger a = LogUtils.getLogger();
   static final Predicate<ebe> b = $$0 -> !$$0.l();
   static final Predicate<ebe> c = ebd.a::d;
   private final ayc d;
   private final Predicate<ebe> e;
   private final edb f;

   public ehd(edb $$0, ehd.a $$1) {
      this.e = $$1.e();
      this.f = $$0;
      int $$2 = azo.e($$0.L_() + 1);
      this.d = new baf($$2, 256);
   }

   public static void a(edb $$0, Set<ehd.a> $$1) {
      if (!$$1.isEmpty()) {
         int $$2 = $$1.size();
         ObjectList<ehd> $$3 = new ObjectArrayList($$2);
         ObjectListIterator<ehd> $$4 = $$3.iterator();
         int $$5 = $$0.b() + 16;
         iv.a $$6 = new iv.a();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               for (ehd.a $$9 : $$1) {
                  $$3.add($$0.a($$9));
               }

               for (int $$10 = $$5 - 1; $$10 >= $$0.K_(); $$10--) {
                  $$6.d($$7, $$10, $$8);
                  ebe $$11 = $$0.a_($$6);
                  if (!$$11.a(dne.a)) {
                     while ($$4.hasNext()) {
                        ehd $$12 = (ehd)$$4.next();
                        if ($$12.e.test($$11)) {
                           $$12.a($$7, $$8, $$10 + 1);
                           $$4.remove();
                        }
                     }

                     if ($$3.isEmpty()) {
                        break;
                     }

                     $$4.back($$2);
                  }
               }
            }
         }
      }
   }

   public boolean a(int $$0, int $$1, int $$2, ebe $$3) {
      int $$4 = this.a($$0, $$2);
      if ($$1 <= $$4 - 2) {
         return false;
      } else {
         if (this.e.test($$3)) {
            if ($$1 >= $$4) {
               this.a($$0, $$2, $$1 + 1);
               return true;
            }
         } else if ($$4 - 1 == $$1) {
            iv.a $$5 = new iv.a();

            for (int $$6 = $$1 - 1; $$6 >= this.f.K_(); $$6--) {
               $$5.d($$0, $$6, $$2);
               if (this.e.test(this.f.a_($$5))) {
                  this.a($$0, $$2, $$6 + 1);
                  return true;
               }
            }

            this.a($$0, $$2, this.f.K_());
            return true;
         }

         return false;
      }
   }

   public int a(int $$0, int $$1) {
      return this.a(c($$0, $$1));
   }

   public int b(int $$0, int $$1) {
      return this.a(c($$0, $$1)) - 1;
   }

   private int a(int $$0) {
      return this.d.a($$0) + this.f.K_();
   }

   private void a(int $$0, int $$1, int $$2) {
      this.d.b(c($$0, $$1), $$2 - this.f.K_());
   }

   public void a(edb $$0, ehd.a $$1, long[] $$2) {
      long[] $$3 = this.d.a();
      if ($$3.length == $$2.length) {
         System.arraycopy($$2, 0, $$3, 0, $$2.length);
      } else {
         a.warn("Ignoring heightmap data for chunk " + $$0.f() + ", size does not match; expected: " + $$3.length + ", got: " + $$2.length);
         a($$0, EnumSet.of($$1));
      }
   }

   public long[] a() {
      return this.d.a();
   }

   private static int c(int $$0, int $$1) {
      return $$0 + $$1 * 16;
   }

   public static enum a implements bam {
      a(0, "WORLD_SURFACE_WG", ehd.b.a, ehd.b),
      b(1, "WORLD_SURFACE", ehd.b.c, ehd.b),
      c(2, "OCEAN_FLOOR_WG", ehd.b.a, ehd.c),
      d(3, "OCEAN_FLOOR", ehd.b.b, ehd.c),
      e(4, "MOTION_BLOCKING", ehd.b.c, $$0 -> $$0.d() || !$$0.y().c()),
      f(5, "MOTION_BLOCKING_NO_LEAVES", ehd.b.c, $$0 -> ($$0.d() || !$$0.y().c()) && !($$0.b() instanceof drs));

      public static final Codec<ehd.a> g = bam.a(ehd.a::values);
      private static final IntFunction<ehd.a> i = aye.a($$0 -> $$0.j, values(), aye.a.a);
      public static final yy<ByteBuf, ehd.a> h = yw.a(i, $$0 -> $$0.j);
      private final int j;
      private final String k;
      private final ehd.b l;
      private final Predicate<ebe> m;

      private a(final int $$0, final String $$1, final ehd.b $$2, final Predicate<ebe> $$3) {
         this.j = $$0;
         this.k = $$1;
         this.l = $$2;
         this.m = $$3;
      }

      public String a() {
         return this.k;
      }

      public boolean b() {
         return this.l == ehd.b.c;
      }

      public boolean d() {
         return this.l != ehd.b.a;
      }

      public Predicate<ebe> e() {
         return this.m;
      }

      @Override
      public String c() {
         return this.k;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
