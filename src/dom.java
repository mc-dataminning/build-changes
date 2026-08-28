import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dom extends dgy {
   public static final MapCodec<dom> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cum.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dom((cum)$$0x.orElse(null), $$1))
   );
   private static final xe d = xe.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ezq f = dhm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq g = dhm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ezq h = dhm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezq i = dhm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq j = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezq k = dhm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jk, ezq> l = ad.a(Maps.newEnumMap(jk.class), $$0 -> {
      $$0.put(jk.c, j);
      $$0.put(jk.f, i);
      $$0.put(jk.d, k);
      $$0.put(jk.e, h);
      $$0.put(jk.b, f);
      $$0.put(jk.a, g);
   });
   public static final dvq<jk> b = djp.a;
   public static final ale c = ale.b("contents");
   @Nullable
   private final cum m;

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(@Nullable cum $$0, dur.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jk.b));
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtg(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.x, dtg::a);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.b;
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dtg $$5 && a($$0, $$1, $$2, $$5)) {
         $$3.a($$5);
         $$3.a(awq.aq);
         cmo.a($$3, true);
      }

      return brs.a;
   }

   private static boolean a(dus $$0, dej $$1, jf $$2, dtg $$3) {
      if ($$3.k() != dtg.a.a) {
         return true;
      } else {
         eyr $$4 = clj.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.k());
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      drv $$4 = $$0.c_($$1);
      if ($$4 instanceof dtg $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cvs $$6 = b(this.b());
            $$6.b($$4.r());
            ckh $$7 = new ckh($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.q();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvs> a(dus $$0, eto.a $$1) {
      drv $$2 = $$1.b(ewh.h);
      if ($$2 instanceof dtg $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drv $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dtg) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ks.ak)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cvs $$6 : $$0.a(ks.ag, cyo.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xe.a("container.shulkerBox.itemCount", $$6.y(), $$6.K()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xe.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      if ($$1.c_($$2) instanceof dtg $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return ezn.b();
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      drv $$4 = $$1.c_($$2);
      return $$4 instanceof dtg ? ezn.a(((dtg)$$4).a($$0)) : ezn.b();
   }

   @Override
   protected boolean e_(dus $$0) {
      return false;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.a($$1.c_($$2));
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      cvs $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, drx.x).ifPresent($$2x -> $$2x.a($$3, $$0.G_()));
      return $$3;
   }

   @Nullable
   public static cum b(cvn $$0) {
      return a(dhm.a($$0));
   }

   @Nullable
   public static cum a(dhm $$0) {
      return $$0 instanceof dom ? ((dom)$$0).b() : null;
   }

   public static dhm a(@Nullable cum $$0) {
      if ($$0 == null) {
         return dho.kP;
      } else {
         return switch ($$0) {
            case a -> dho.kQ;
            case b -> dho.kR;
            case c -> dho.kS;
            case d -> dho.kT;
            case e -> dho.kU;
            case f -> dho.kV;
            case g -> dho.kW;
            case h -> dho.kX;
            case i -> dho.kY;
            case j -> dho.kZ;
            case l -> dho.lb;
            case m -> dho.lc;
            case n -> dho.ld;
            case o -> dho.le;
            case p -> dho.lf;
            case k -> dho.la;
         };
      }
   }

   @Nullable
   public cum b() {
      return this.m;
   }

   public static cvs b(@Nullable cum $$0) {
      return new cvs(a($$0));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
