import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlz extends dem {
   public static final MapCodec<dlz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ctj.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dlz((ctj)$$0x.orElse(null), $$1))
   );
   private static final xp d = xp.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ewl f = dfa.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewl g = dfa.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewl h = dfa.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewl i = dfa.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewl j = dfa.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewl k = dfa.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewl> l = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, j);
      $$0.put(je.f, i);
      $$0.put(je.d, k);
      $$0.put(je.e, h);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   });
   public static final dtb<je> b = dhd.a;
   public static final alf c = new alf("contents");
   @Nullable
   private final ctj m;

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(@Nullable ctj $$0, dsc.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, je.b));
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqr(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.x, dqr::a);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.b;
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else if ($$3.N_()) {
         return bqv.c;
      } else if ($$1.c_($$2) instanceof dqr $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(awk.aq);
            clp.a($$3, true);
         }

         return bqv.c;
      } else {
         return bqv.e;
      }
   }

   private static boolean a(dsd $$0, dbz $$1, iz $$2, dqr $$3) {
      if ($$3.l() != dqr.a.a) {
         return true;
      } else {
         evn $$4 = ckk.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      dpi $$4 = $$0.c_($$1);
      if ($$4 instanceof dqr $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cuq $$6 = b(this.b());
            $$6.b($$4.s());
            cji $$7 = new cji($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuq> a(dsd $$0, eqm.a $$1) {
      dpi $$2 = $$1.b(etf.h);
      if ($$2 instanceof dqr $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dqr) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(km.ae)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cuq $$6 : $$0.a(km.aa, cxm.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xp.a("container.shulkerBox.itemCount", $$6.x(), $$6.I()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xp.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ewl b_(dsd $$0, dbf $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqr $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewi.b();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      dpi $$4 = $$1.c_($$2);
      return $$4 instanceof dqr ? ewi.a(((dqr)$$4).a($$0)) : ewi.b();
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.a($$1.c_($$2));
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      cuq $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dpk.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static ctj b(cul $$0) {
      return a(dfa.a($$0));
   }

   @Nullable
   public static ctj a(dfa $$0) {
      return $$0 instanceof dlz ? ((dlz)$$0).b() : null;
   }

   public static dfa a(@Nullable ctj $$0) {
      if ($$0 == null) {
         return dfc.kP;
      } else {
         return switch ($$0) {
            case a -> dfc.kQ;
            case b -> dfc.kR;
            case c -> dfc.kS;
            case d -> dfc.kT;
            case e -> dfc.kU;
            case f -> dfc.kV;
            case g -> dfc.kW;
            case h -> dfc.kX;
            case i -> dfc.kY;
            case j -> dfc.kZ;
            case l -> dfc.lb;
            case m -> dfc.lc;
            case n -> dfc.ld;
            case o -> dfc.le;
            case p -> dfc.lf;
            case k -> dfc.la;
         };
      }
   }

   @Nullable
   public ctj b() {
      return this.m;
   }

   public static cuq b(@Nullable ctj $$0) {
      return new cuq(a($$0));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
