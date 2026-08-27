import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cwd extends ctm {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cwd> a = b(cwd::new);
   public static final dgv b = cwb.a;
   public static final dgs c = dgr.A;
   private static final Map<cke, je> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jd()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cwd> a() {
      return a;
   }

   public static void a(cqy $$0, je $$1) {
      e.put($$0.k(), $$1);
   }

   protected cwd(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         ddx $$6 = $$1.c_($$2);
         if ($$6 instanceof deo) {
            $$3.a((deo)$$6);
            if ($$6 instanceof dep) {
               $$3.a(aqn.ac);
            } else {
               $$3.a(aqn.ae);
            }
         }

         return bib.b;
      }
   }

   protected void a(alq $$0, dgb $$1, ht $$2) {
      deo $$3 = $$0.a($$2, ddz.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jb $$4 = new jb($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dkl.a, $$2, dkl.a.a($$3.q()));
         } else {
            ckj $$6 = $$3.a($$5);
            je $$7 = this.a($$6);
            if ($$7 != je.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected je a(ckj $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.c());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new deo($$0, $$1);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof deo) {
            ((deo)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      bhx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static im a(jb $$0) {
      hx $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return cfp.a($$1.c_($$2));
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }
}
