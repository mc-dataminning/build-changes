import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class dcf extends czm {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<dcf> a = b(dcf::new);
   public static final dnt b = dcd.a;
   public static final dnq c = dnp.A;
   private static final Map<cqf, jo> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new jn()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends dcf> a() {
      return a;
   }

   public static void a(cwy $$0, jo $$1) {
      e.put($$0.l(), $$1);
   }

   protected dcf(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof dky) {
            $$3.a((dky)$$5);
            if ($$5 instanceof dkz) {
               $$3.a(aui.ac);
            } else {
               $$3.a(aui.ae);
            }
         }

         return bnc.b;
      }
   }

   protected void a(apf $$0, dmz $$1, ib $$2) {
      dky $$3 = $$0.a($$2, dki.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         jl $$4 = new jl($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(drn.a, $$2, drn.a.a($$3.n()));
         } else {
            cqk $$6 = $$3.a($$5);
            jo $$7 = this.a($$6);
            if ($$7 != jo.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected jo a(cqk $$0) {
      return e.get($$0.d());
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
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
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dky($$0, $$1);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof dky) {
            ((dky)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      bmy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static iv a(jl $$0) {
      ih $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return clo.a($$1.c_($$2));
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }
}
