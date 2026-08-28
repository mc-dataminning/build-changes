import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnv extends dgh {
   public static final MapCodec<dnv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cue.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dnv((cue)$$0x.orElse(null), $$1))
   );
   private static final xd d = xd.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final eyx f = dgv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eyx g = dgv.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eyx h = dgv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eyx i = dgv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eyx j = dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eyx k = dgv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jj, eyx> l = ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      $$0.put(jj.c, j);
      $$0.put(jj.f, i);
      $$0.put(jj.d, k);
      $$0.put(jj.e, h);
      $$0.put(jj.b, f);
      $$0.put(jj.a, g);
   });
   public static final duy<jj> b = diy.a;
   public static final alb c = alb.b("contents");
   @Nullable
   private final cue m;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(@Nullable cue $$0, dtz.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.E.b().b(b, jj.b));
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsp(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.x, dsp::a);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.b;
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dsp $$5 && a($$0, $$1, $$2, $$5)) {
         $$3.a($$5);
         $$3.a(awn.aq);
         cmg.a($$3, true);
      }

      return brk.a;
   }

   private static boolean a(dua $$0, dds $$1, je $$2, dsp $$3) {
      if ($$3.k() != dsp.a.a) {
         return true;
      } else {
         exz $$4 = clb.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.k());
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      dre $$4 = $$0.c_($$1);
      if ($$4 instanceof dsp $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cvl $$6 = b(this.b());
            $$6.b($$4.r());
            cjz $$7 = new cjz($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.q();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvl> a(dua $$0, esw.a $$1) {
      dre $$2 = $$1.b(evp.h);
      if ($$2 instanceof dsp $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dre $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dsp) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kr.ah)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cvl $$6 : $$0.a(kr.ad, cyh.a).d()) {
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
   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      if ($$1.c_($$2) instanceof dsp $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return eyu.b();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      dre $$4 = $$1.c_($$2);
      return $$4 instanceof dsp ? eyu.a(((dsp)$$4).a($$0)) : eyu.b();
   }

   @Override
   protected boolean e_(dua $$0) {
      return false;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.a($$1.c_($$2));
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      cvl $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, drg.x).ifPresent($$2x -> $$2x.a($$3, $$0.F_()));
      return $$3;
   }

   @Nullable
   public static cue b(cvg $$0) {
      return a(dgv.a($$0));
   }

   @Nullable
   public static cue a(dgv $$0) {
      return $$0 instanceof dnv ? ((dnv)$$0).b() : null;
   }

   public static dgv a(@Nullable cue $$0) {
      if ($$0 == null) {
         return dgx.kP;
      } else {
         return switch ($$0) {
            case a -> dgx.kQ;
            case b -> dgx.kR;
            case c -> dgx.kS;
            case d -> dgx.kT;
            case e -> dgx.kU;
            case f -> dgx.kV;
            case g -> dgx.kW;
            case h -> dgx.kX;
            case i -> dgx.kY;
            case j -> dgx.kZ;
            case l -> dgx.lb;
            case m -> dgx.lc;
            case n -> dgx.ld;
            case o -> dgx.le;
            case p -> dgx.lf;
            case k -> dgx.la;
         };
      }
   }

   @Nullable
   public cue b() {
      return this.m;
   }

   public static cvl b(@Nullable cue $$0) {
      return new cvl(a($$0));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
