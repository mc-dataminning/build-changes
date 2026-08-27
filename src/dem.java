import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dem extends dbt {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dem> a = b(dem::new);
   public static final dqc b = dek.a;
   public static final dpz c = dpy.A;
   private static final Map<crn, jz> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jy()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dem> a() {
      return a;
   }

   public static void a(czf $$0, jz $$1) {
      e.put($$0.p(), $$1);
   }

   protected dem(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dng) {
            $$3.a((dng)$$5);
            if ($$5 instanceof dnh) {
               $$3.a(auz.ac);
            } else {
               $$3.a(auz.ae);
            }
         }

         return bof.b;
      }
   }

   protected void a(apu $$0, dpi $$1, id $$2) {
      dng $$3 = $$0.a($$2, dmq.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jw $$4 = new jw($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dub.a, $$2, dub.a.a($$3.n()));
         } else {
            crs $$6 = $$3.a($$5);
            jz $$7 = this.a($$6);
            if ($$7 != jz.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jz a(crs $$0) {
      return e.get($$0.f());
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.c());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dng($$0, $$1);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.d().g());
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      bob.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static ix a(jw $$0) {
      ij $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.a($$1.c_($$2));
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }
}
