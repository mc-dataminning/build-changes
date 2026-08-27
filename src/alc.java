import com.google.common.collect.Comparators;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;

public class alc {
   private static final Logger d = LogUtils.getLogger();
   public static final double a = 25.0;
   public static final float b = 0.01F;
   public static final float c = 64.0F;
   private static final float e = 9.0F;
   private static final int f = 10;
   private final LongSet g = new LongOpenHashSet();
   private final boolean h;
   private float i = 9.0F;
   private float j;
   private int k;
   private int l = 1;

   public alc(boolean $$0) {
      this.h = $$0;
   }

   public void a(dhf $$0) {
      this.g.add($$0.f().a());
   }

   public void a(akj $$0, cor $$1) {
      if (!this.g.remove($$1.a()) && $$0.bv()) {
         $$0.c.b(new xt($$1));
      }
   }

   public void a(akj $$0) {
      if (this.k < this.l) {
         float $$1 = Math.max(1.0F, this.i);
         this.j = Math.min(this.j + this.i, $$1);
         if (!(this.j < 1.0F)) {
            if (!this.g.isEmpty()) {
               aki $$2 = $$0.x();
               ajt $$3 = $$2.k().a;
               List<dhf> $$4 = this.a($$3, $$0.dm());
               if (!$$4.isEmpty()) {
                  alg $$5 = $$0.c;
                  this.k++;
                  $$5.b(new xd());

                  for (dhf $$6 : $$4) {
                     a($$5, $$2, $$6);
                  }

                  $$5.b(new xc($$4.size()));
                  this.j = this.j - (float)$$4.size();
               }
            }
         }
      }
   }

   private static void a(alg $$0, aki $$1, dhf $$2) {
      $$0.c(new xz($$2, $$1.s_(), null, null));
      cor $$3 = $$2.f();
      aau.a($$1, $$3);
   }

   private List<dhf> a(ajt $$0, cor $$1) {
      int $$2 = aro.d(this.j);
      List<dhf> $$4;
      if (!this.h && this.g.size() > $$2) {
         $$4 = this.g
            .stream()
            .collect(Comparators.least($$2, Comparator.comparingInt($$1::c)))
            .stream()
            .mapToLong(Long::longValue)
            .peek(this.g::remove)
            .mapToObj($$0::d)
            .filter(Objects::nonNull)
            .toList();
      } else {
         $$4 = this.g.longStream().mapToObj($$0::d).filter(Objects::nonNull).sorted(Comparator.comparingInt($$1x -> $$1.b($$1x.f()))).toList();
         this.g.clear();
      }

      return $$4;
   }

   public void a(float $$0) {
      this.k--;
      this.i = Double.isNaN((double)$$0) ? 0.01F : aro.a($$0, 0.01F, 64.0F);
      if (this.k == 0) {
         this.j = 1.0F;
      }

      this.l = 10;
   }

   public boolean a(long $$0) {
      return this.g.contains($$0);
   }
}
