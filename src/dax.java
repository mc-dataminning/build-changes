import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dax extends ctm {
   public static final MapCodec<dax> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cix.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), t())
            .apply($$0, ($$0x, $$1) -> new dax((cix)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eiy e = cua.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy f = cua.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eiy g = cua.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eiy h = cua.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy i = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eiy j = cua.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hx, eiy> k = ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, i);
      $$0.put(hx.f, h);
      $$0.put(hx.d, j);
      $$0.put(hx.e, g);
      $$0.put(hx.b, e);
      $$0.put(hx.a, f);
   });
   public static final dgz<hx> b = cwb.a;
   public static final afw c = new afw("contents");
   @Nullable
   private final cix l;

   @Override
   public MapCodec<dax> a() {
      return a;
   }

   public dax(@Nullable cix $$0, dga.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, hx.b));
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfe(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.x, dfe::a);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.b;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else if ($$3.N_()) {
         return bib.b;
      } else if ($$1.c_($$2) instanceof dfe $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(aqn.aq);
            cbo.a($$3, true);
         }

         return bib.b;
      } else {
         return bib.d;
      }
   }

   private static boolean a(dgb $$0, cqz $$1, ht $$2, dfe $$3) {
      if ($$3.i() != dfe.a.a) {
         return true;
      } else {
         eia $$4 = car.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      ddx $$4 = $$0.c_($$1);
      if ($$4 instanceof dfe $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            ckj $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            bzq $$7 = new bzq($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.t();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<ckj> a(dgb $$0, edo.a $$1) {
      ddx $$2 = $$1.b(eft.h);
      if ($$2 instanceof dfe $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof dfe) {
            ((dfe)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         ddx $$5 = $$1.c_($$2);
         if ($$5 instanceof dfe) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ckj $$0, @Nullable cqf $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      rt $$4 = cic.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(ui.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            il<ckj> $$5 = il.a(27, ckj.b);
            bhv.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (ckj $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(ui.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(ui.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dfe $$4 && !$$4.v()) {
         return k.get($$0.c(b).g());
      }

      return eiv.b();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      ddx $$4 = $$1.c_($$2);
      return $$4 instanceof dfe ? eiv.a(((dfe)$$4).a($$0)) : eiv.b();
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
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      ckj $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, ddz.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cix b(cke $$0) {
      return a(cua.a($$0));
   }

   @Nullable
   public static cix a(cua $$0) {
      return $$0 instanceof dax ? ((dax)$$0).b() : null;
   }

   public static cua a(@Nullable cix $$0) {
      if ($$0 == null) {
         return cuc.kP;
      } else {
         switch ($$0) {
            case a:
               return cuc.kQ;
            case b:
               return cuc.kR;
            case c:
               return cuc.kS;
            case d:
               return cuc.kT;
            case e:
               return cuc.kU;
            case f:
               return cuc.kV;
            case g:
               return cuc.kW;
            case h:
               return cuc.kX;
            case i:
               return cuc.kY;
            case j:
               return cuc.kZ;
            case k:
            default:
               return cuc.la;
            case l:
               return cuc.lb;
            case m:
               return cuc.lc;
            case n:
               return cuc.ld;
            case o:
               return cuc.le;
            case p:
               return cuc.lf;
         }
      }
   }

   @Nullable
   public cix b() {
      return this.l;
   }

   public static ckj b(@Nullable cix $$0) {
      return new ckj(a($$0));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
