import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbr extends cuf {
   public static final MapCodec<dbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cjp.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), t())
            .apply($$0, ($$0x, $$1) -> new dbr((cjp)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final ekb e = cut.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekb f = cut.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ekb g = cut.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ekb h = cut.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekb i = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ekb j = cut.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hx, ekb> k = ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, i);
      $$0.put(hx.f, h);
      $$0.put(hx.d, j);
      $$0.put(hx.e, g);
      $$0.put(hx.b, e);
      $$0.put(hx.a, f);
   });
   public static final dhu<hx> b = cwv.a;
   public static final agg c = new agg("contents");
   @Nullable
   private final cjp l;

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(@Nullable cjp $$0, dgv.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, hx.b));
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfz(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.x, dfz::a);
   }

   @Override
   public day b_(dgw $$0) {
      return day.b;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else if ($$3.N_()) {
         return biq.b;
      } else if ($$1.c_($$2) instanceof dfz $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(aqx.aq);
            ccd.a($$3, true);
         }

         return biq.b;
      } else {
         return biq.d;
      }
   }

   private static boolean a(dgw $$0, crs $$1, ht $$2, dfz $$3) {
      if ($$3.i() != dfz.a.a) {
         return true;
      } else {
         ejd $$4 = cbg.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      der $$4 = $$0.c_($$1);
      if ($$4 instanceof dfz $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            clb $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            caf $$7 = new caf($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.t();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<clb> a(dgw $$0, eer.a $$1) {
      der $$2 = $$1.b(egw.h);
      if ($$2 instanceof dfz $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dfz) {
            ((dfz)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         der $$5 = $$1.c_($$2);
         if ($$5 instanceof dfz) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(clb $$0, @Nullable cqy $$1, List<ur> $$2, cms $$3) {
      super.a($$0, $$1, $$2, $$3);
      rz $$4 = ciu.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(ur.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            il<clb> $$5 = il.a(27, clb.b);
            bik.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (clb $$8 : $$5) {
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
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dfz $$4 && !$$4.v()) {
         return k.get($$0.c(b).g());
      }

      return ejy.b();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      der $$4 = $$1.c_($$2);
      return $$4 instanceof dfz ? ejy.a(((dfz)$$4).a($$0)) : ejy.b();
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.a($$1.c_($$2));
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      clb $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, det.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cjp b(ckw $$0) {
      return a(cut.a($$0));
   }

   @Nullable
   public static cjp a(cut $$0) {
      return $$0 instanceof dbr ? ((dbr)$$0).b() : null;
   }

   public static cut a(@Nullable cjp $$0) {
      if ($$0 == null) {
         return cuv.kP;
      } else {
         switch ($$0) {
            case a:
               return cuv.kQ;
            case b:
               return cuv.kR;
            case c:
               return cuv.kS;
            case d:
               return cuv.kT;
            case e:
               return cuv.kU;
            case f:
               return cuv.kV;
            case g:
               return cuv.kW;
            case h:
               return cuv.kX;
            case i:
               return cuv.kY;
            case j:
               return cuv.kZ;
            case k:
            default:
               return cuv.la;
            case l:
               return cuv.lb;
            case m:
               return cuv.lc;
            case n:
               return cuv.ld;
            case o:
               return cuv.le;
            case p:
               return cuv.lf;
         }
      }
   }

   @Nullable
   public cjp b() {
      return this.l;
   }

   public static clb b(@Nullable cjp $$0) {
      return new clb(a($$0));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
