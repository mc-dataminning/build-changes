import com.google.common.collect.Comparators;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;

public class asz {
   private static final Logger c = LogUtils.getLogger();
   public static final float a = 0.01F;
   public static final float b = 64.0F;
   private static final float d = 9.0F;
   private static final int e = 10;
   private final LongSet f = new LongOpenHashSet();
   private final boolean g;
   private float h = 9.0F;
   private float i;
   private int j;
   private int k = 1;

   public asz(boolean $$0) {
      this.g = $$0;
   }

   public void a(edx $$0) {
      this.f.add($$0.f().a());
   }

   public void a(asc $$0, djo $$1) {
      if (!this.f.remove($$1.a()) && $$0.bJ()) {
         $$0.f.b(new adl($$1));
      }
   }

   public void a(asc $$0) {
      if (this.j < this.k) {
         float $$1 = Math.max(1.0F, this.h);
         this.i = Math.min(this.i + this.h, $$1);
         if (!(this.i < 1.0F)) {
            if (!this.f.isEmpty()) {
               asb $$2 = $$0.y();
               arf $$3 = $$2.m().a;
               List<edx> $$4 = this.a($$3, $$0.dx());
               if (!$$4.isEmpty()) {
                  ate $$5 = $$0.f;
                  this.j++;
                  $$5.b(act.a);

                  for (edx $$6 : $$4) {
                     a($$5, $$2, $$6);
                  }

                  $$5.b(new acs($$4.size()));
                  this.i = this.i - (float)$$4.size();
               }
            }
         }
      }
   }

   private static void a(ate $$0, asb $$1, edx $$2) {
      $$0.b(new adr($$2, $$1.B_(), null, null));
      djo $$3 = $$2.f();
      agx.a($$1, $$3);
   }

   private List<edx> a(arf $$0, djo $$1) {
      int $$2 = azz.d(this.i);
      List<edx> $$4;
      if (!this.g && this.f.size() > $$2) {
         $$4 = this.f
            .stream()
            .collect(Comparators.least($$2, Comparator.comparingInt($$1::c)))
            .stream()
            .mapToLong(Long::longValue)
            .mapToObj($$0::e)
            .filter(Objects::nonNull)
            .toList();
      } else {
         $$4 = this.f.longStream().mapToObj($$0::e).filter(Objects::nonNull).sorted(Comparator.comparingInt($$1x -> $$1.b($$1x.f()))).toList();
      }

      for (edx $$5 : $$4) {
         this.f.remove($$5.f().a());
      }

      return $$4;
   }

   public void a(float $$0) {
      this.j--;
      this.h = Double.isNaN((double)$$0) ? 0.01F : azz.a($$0, 0.01F, 64.0F);
      if (this.j == 0) {
         this.i = 1.0F;
      }

      this.k = 10;
   }

   public boolean a(long $$0) {
      return this.f.contains($$0);
   }
}
