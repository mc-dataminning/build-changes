import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class czz extends cso {
   public static final MapCodec<czz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(chz.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), t())
            .apply($$0, ($$0x, $$1) -> new czz((chz)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eia e = ctc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia f = ctc.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eia g = ctc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eia h = ctc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia i = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eia j = ctc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ha, eia> k = ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, i);
      $$0.put(ha.f, h);
      $$0.put(ha.d, j);
      $$0.put(ha.e, g);
      $$0.put(ha.b, e);
      $$0.put(ha.a, f);
   });
   public static final dgb<ha> b = cvd.a;
   public static final aez c = new aez("contents");
   @Nullable
   private final chz l;

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   public czz(@Nullable chz $$0, dfc.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ha.b));
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new deg(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.x, deg::a);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.b;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else if ($$3.M_()) {
         return bhe.b;
      } else if ($$1.c_($$2) instanceof deg $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(apq.aq);
            car.a($$3, true);
         }

         return bhe.b;
      } else {
         return bhe.d;
      }
   }

   private static boolean a(dfd $$0, cqb $$1, gw $$2, deg $$3) {
      if ($$3.i() != deg.a.a) {
         return true;
      } else {
         ehc $$4 = bzu.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      dcz $$4 = $$0.c_($$1);
      if ($$4 instanceof deg $$5) {
         if (!$$0.B && $$3.f() && !$$5.af_()) {
            cjl $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            byt $$7 = new byt($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.t();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cjl> a(dfd $$0, ecq.a $$1) {
      dcz $$2 = $$1.b(eev.h);
      if ($$2 instanceof deg $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof deg) {
            ((deg)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof deg) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cjl $$0, @Nullable cph $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      qw $$4 = che.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(tl.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            hn<cjl> $$5 = hn.a(27, cjl.b);
            bgy.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cjl $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(tl.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(tl.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      if ($$1.c_($$2) instanceof deg $$4 && !$$4.v()) {
         return k.get($$0.c(b).g());
      }

      return ehx.b();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      dcz $$4 = $$1.c_($$2);
      return $$4 instanceof deg ? ehx.a(((deg)$$4).a($$0)) : ehx.b();
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return cer.a($$1.c_($$2));
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      cjl $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, ddb.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static chz b(cjg $$0) {
      return a(ctc.a($$0));
   }

   @Nullable
   public static chz a(ctc $$0) {
      return $$0 instanceof czz ? ((czz)$$0).b() : null;
   }

   public static ctc a(@Nullable chz $$0) {
      if ($$0 == null) {
         return cte.kP;
      } else {
         switch ($$0) {
            case a:
               return cte.kQ;
            case b:
               return cte.kR;
            case c:
               return cte.kS;
            case d:
               return cte.kT;
            case e:
               return cte.kU;
            case f:
               return cte.kV;
            case g:
               return cte.kW;
            case h:
               return cte.kX;
            case i:
               return cte.kY;
            case j:
               return cte.kZ;
            case k:
            default:
               return cte.la;
            case l:
               return cte.lb;
            case m:
               return cte.lc;
            case n:
               return cte.ld;
            case o:
               return cte.le;
            case p:
               return cte.lf;
         }
      }
   }

   @Nullable
   public chz b() {
      return this.l;
   }

   public static cjl b(@Nullable chz $$0) {
      return new cjl(a($$0));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
