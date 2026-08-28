import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class doj extends dgv {
   public static final MapCodec<doj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cuj.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new doj((cuj)$$0x.orElse(null), $$1))
   );
   private static final xd d = xd.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ezm f = dhj.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm g = dhj.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ezm h = dhj.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezm i = dhj.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm j = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezm k = dhj.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jj, ezm> l = ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      $$0.put(jj.c, j);
      $$0.put(jj.f, i);
      $$0.put(jj.d, k);
      $$0.put(jj.e, h);
      $$0.put(jj.b, f);
      $$0.put(jj.a, g);
   });
   public static final dvm<jj> b = djm.a;
   public static final alc c = alc.b("contents");
   @Nullable
   private final cuj m;

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   public doj(@Nullable cuj $$0, dun.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jj.b));
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dtd(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.x, dtd::a);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.b;
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dtd $$5 && a($$0, $$1, $$2, $$5)) {
         $$3.a($$5);
         $$3.a(awo.aq);
         cml.a($$3, true);
      }

      return brp.a;
   }

   private static boolean a(duo $$0, deg $$1, je $$2, dtd $$3) {
      if ($$3.k() != dtd.a.a) {
         return true;
      } else {
         eyn $$4 = clg.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.k());
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      drs $$4 = $$0.c_($$1);
      if ($$4 instanceof dtd $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cvp $$6 = b(this.b());
            $$6.b($$4.r());
            cke $$7 = new cke($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.q();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvp> a(duo $$0, etk.a $$1) {
      drs $$2 = $$1.b(ewd.h);
      if ($$2 instanceof dtd $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drs $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dtd) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kr.ak)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cvp $$6 : $$0.a(kr.ag, cyl.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xd.a("container.shulkerBox.itemCount", $$6.y(), $$6.J()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xd.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      if ($$1.c_($$2) instanceof dtd $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return ezj.b();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      drs $$4 = $$1.c_($$2);
      return $$4 instanceof dtd ? ezj.a(((dtd)$$4).a($$0)) : ezj.b();
   }

   @Override
   protected boolean e_(duo $$0) {
      return false;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.a($$1.c_($$2));
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      cvp $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dru.x).ifPresent($$2x -> $$2x.a($$3, $$0.F_()));
      return $$3;
   }

   @Nullable
   public static cuj b(cvk $$0) {
      return a(dhj.a($$0));
   }

   @Nullable
   public static cuj a(dhj $$0) {
      return $$0 instanceof doj ? ((doj)$$0).b() : null;
   }

   public static dhj a(@Nullable cuj $$0) {
      if ($$0 == null) {
         return dhl.kP;
      } else {
         return switch ($$0) {
            case a -> dhl.kQ;
            case b -> dhl.kR;
            case c -> dhl.kS;
            case d -> dhl.kT;
            case e -> dhl.kU;
            case f -> dhl.kV;
            case g -> dhl.kW;
            case h -> dhl.kX;
            case i -> dhl.kY;
            case j -> dhl.kZ;
            case l -> dhl.lb;
            case m -> dhl.lc;
            case n -> dhl.ld;
            case o -> dhl.le;
            case p -> dhl.lf;
            case k -> dhl.la;
         };
      }
   }

   @Nullable
   public cuj b() {
      return this.m;
   }

   public static cvp b(@Nullable cuj $$0) {
      return new cvp(a($$0));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
