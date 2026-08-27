import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dju extends dch {
   public static final MapCodec<dju> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cqw.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dju((cqw)$$0x.orElse(null), $$1))
   );
   private static final ws d = ws.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ety f = dcv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety g = dcv.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ety h = dcv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ety i = dcv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety j = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ety k = dcv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ir, ety> l = ac.a(Maps.newEnumMap(ir.class), $$0 -> {
      $$0.put(ir.c, j);
      $$0.put(ir.f, i);
      $$0.put(ir.d, k);
      $$0.put(ir.e, h);
      $$0.put(ir.b, f);
      $$0.put(ir.a, g);
   });
   public static final dqw<ir> b = dey.a;
   public static final akf c = new akf("contents");
   @Nullable
   private final cqw m;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(@Nullable cqw $$0, dpx.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, ir.b));
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dom(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.x, dom::a);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.b;
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else if ($$3.N_()) {
         return boq.b;
      } else if ($$1.c_($$2) instanceof dom $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avj.aq);
            cjc.a($$3, true);
         }

         return boq.b;
      } else {
         return boq.d;
      }
   }

   private static boolean a(dpy $$0, czu $$1, im $$2, dom $$3) {
      if ($$3.l() != dom.a.a) {
         return true;
      } else {
         eta $$4 = chx.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      dnd $$4 = $$0.c_($$1);
      if ($$4 instanceof dom $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            csd $$6 = b(this.b());
            $$6.a($$4.s());
            cgv $$7 = new cgv($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<csd> a(dpy $$0, eog.a $$1) {
      dnd $$2 = $$1.b(eqt.h);
      if ($$2 instanceof dom $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dom) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(csd $$0, @Nullable cza $$1, List<ws> $$2, ctu $$3, @Nullable jj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.b(jz.U)) {
         $$2.add(d);
      }

      int $$5 = 0;
      int $$6 = 0;

      for (csd $$7 : $$0.a(jz.Q, cux.a)) {
         $$6++;
         if ($$5 <= 4) {
            $$5++;
            $$2.add(ws.a("container.shulkerBox.itemCount", $$7.w(), $$7.G()));
         }
      }

      if ($$6 - $$5 > 0) {
         $$2.add(ws.a("container.shulkerBox.more", $$6 - $$5).a(n.u));
      }
   }

   @Override
   protected ety b_(dpy $$0, cza $$1, im $$2) {
      if ($$1.c_($$2) instanceof dom $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return etv.b();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      dnd $$4 = $$1.c_($$2);
      return $$4 instanceof dom ? etv.a(((dom)$$4).a($$0)) : etv.b();
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.a($$1.c_($$2));
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      csd $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dnf.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cqw b(cry $$0) {
      return a(dcv.a($$0));
   }

   @Nullable
   public static cqw a(dcv $$0) {
      return $$0 instanceof dju ? ((dju)$$0).b() : null;
   }

   public static dcv a(@Nullable cqw $$0) {
      if ($$0 == null) {
         return dcx.kP;
      } else {
         return switch ($$0) {
            case a -> dcx.kQ;
            case b -> dcx.kR;
            case c -> dcx.kS;
            case d -> dcx.kT;
            case e -> dcx.kU;
            case f -> dcx.kV;
            case g -> dcx.kW;
            case h -> dcx.kX;
            case i -> dcx.kY;
            case j -> dcx.kZ;
            case l -> dcx.lb;
            case m -> dcx.lc;
            case n -> dcx.ld;
            case o -> dcx.le;
            case p -> dcx.lf;
            case k -> dcx.la;
         };
      }
   }

   @Nullable
   public cqw b() {
      return this.m;
   }

   public static csd b(@Nullable cqw $$0) {
      return new csd(a($$0));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
