import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dby extends cum {
   public static final MapCodec<dby> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cjx.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dby((cjx)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final ekn e = cva.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekn f = cva.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ekn g = cva.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ekn h = cva.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekn i = cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ekn j = cva.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hx, ekn> k = ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, i);
      $$0.put(hx.f, h);
      $$0.put(hx.d, j);
      $$0.put(hx.e, g);
      $$0.put(hx.b, e);
      $$0.put(hx.a, f);
   });
   public static final dig<hx> b = cxd.a;
   public static final agi c = new agi("contents");
   @Nullable
   private final cjx l;

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public dby(@Nullable cjx $$0, dhh.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, hx.b));
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgl(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.x, dgl::a);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.b;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else if ($$3.O_()) {
         return bix.b;
      } else if ($$1.c_($$2) instanceof dgl $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(arb.aq);
            ccl.a($$3, true);
         }

         return bix.b;
      } else {
         return bix.d;
      }
   }

   private static boolean a(dhi $$0, csa $$1, ht $$2, dgl $$3) {
      if ($$3.i() != dgl.a.a) {
         return true;
      } else {
         ejp $$4 = cbo.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      dfd $$4 = $$0.c_($$1);
      if ($$4 instanceof dgl $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            clj $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            can $$7 = new can($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<clj> a(dhi $$0, efd.a $$1) {
      dfd $$2 = $$1.b(ehi.h);
      if ($$2 instanceof dgl $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgl) {
            ((dgl)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfd $$5 = $$1.c_($$2);
         if ($$5 instanceof dgl) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(clj $$0, @Nullable crg $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      rz $$4 = cjc.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(ur.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            il<clj> $$5 = il.a(27, clj.b);
            bir.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (clj $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(ur.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(ur.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dgl $$4 && !$$4.v()) {
         return k.get($$0.c(b).g());
      }

      return ekk.b();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      dfd $$4 = $$1.c_($$2);
      return $$4 instanceof dgl ? ekk.a(((dgl)$$4).a($$0)) : ekk.b();
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.a($$1.c_($$2));
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      clj $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dff.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cjx b(cle $$0) {
      return a(cva.a($$0));
   }

   @Nullable
   public static cjx a(cva $$0) {
      return $$0 instanceof dby ? ((dby)$$0).b() : null;
   }

   public static cva a(@Nullable cjx $$0) {
      if ($$0 == null) {
         return cvc.kP;
      } else {
         switch ($$0) {
            case a:
               return cvc.kQ;
            case b:
               return cvc.kR;
            case c:
               return cvc.kS;
            case d:
               return cvc.kT;
            case e:
               return cvc.kU;
            case f:
               return cvc.kV;
            case g:
               return cvc.kW;
            case h:
               return cvc.kX;
            case i:
               return cvc.kY;
            case j:
               return cvc.kZ;
            case k:
            default:
               return cvc.la;
            case l:
               return cvc.lb;
            case m:
               return cvc.lc;
            case n:
               return cvc.ld;
            case o:
               return cvc.le;
            case p:
               return cvc.lf;
         }
      }
   }

   @Nullable
   public cjx b() {
      return this.l;
   }

   public static clj b(@Nullable cjx $$0) {
      return new clj(a($$0));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
