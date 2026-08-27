import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmp extends den {
   public static final MapCodec<dmp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(csy.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dmp((csy)$$0x.orElse(null), $$1))
   );
   private static final xe d = xe.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final exn f = dfc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn g = dfc.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final exn h = dfc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exn i = dfc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn j = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exn k = dfc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<iw, exn> l = ad.a(Maps.newEnumMap(iw.class), $$0 -> {
      $$0.put(iw.c, j);
      $$0.put(iw.f, i);
      $$0.put(iw.d, k);
      $$0.put(iw.e, h);
      $$0.put(iw.b, f);
      $$0.put(iw.a, g);
   });
   public static final dua<iw> b = dhg.a;
   public static final akt c = new akt("contents");
   @Nullable
   private final csy m;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(@Nullable csy $$0, dtb.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, iw.b));
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drq(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.y, drq::a);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.b;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else if ($$3.O_()) {
         return bqa.b;
      } else if ($$1.c_($$2) instanceof drq $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avz.ar);
            ckp.a($$3, true);
         }

         return bqa.b;
      } else {
         return bqa.d;
      }
   }

   private static boolean a(dtc $$0, dca $$1, ir $$2, drq $$3) {
      if ($$3.l() != drq.a.a) {
         return true;
      } else {
         ewp $$4 = cjk.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      dqc $$4 = $$0.c_($$1);
      if ($$4 instanceof drq $$5) {
         if (!$$0.C && $$3.f() && !$$5.c()) {
            cuh $$6 = b(this.b());
            $$6.a($$4.s());
            cig $$7 = new cig($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuh> a(dtc $$0, ers.a $$1) {
      dqc $$2 = $$1.b(eug.h);
      if ($$2 instanceof drq $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof drq) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cuh $$0, @Nullable dbg $$1, List<xe> $$2, cwi $$3, @Nullable jo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.b(ke.ad)) {
         $$2.add(d);
      }

      int $$5 = 0;
      int $$6 = 0;

      for (cuh $$7 : $$0.a(ke.Z, cxm.a)) {
         $$6++;
         if ($$5 <= 4) {
            $$5++;
            $$2.add(xe.a("container.shulkerBox.itemCount", $$7.w(), $$7.G()));
         }
      }

      if ($$6 - $$5 > 0) {
         $$2.add(xe.a("container.shulkerBox.more", $$6 - $$5).a(n.u));
      }
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      if ($$1.c_($$2) instanceof drq $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return exk.b();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      dqc $$4 = $$1.c_($$2);
      return $$4 instanceof drq ? exk.a(((drq)$$4).a($$0)) : exk.b();
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.a($$1.c_($$2));
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      cuh $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dqe.y).ifPresent($$2x -> $$2x.a($$3, $$0.I_()));
      return $$3;
   }

   @Nullable
   public static csy b(cuc $$0) {
      return a(dfc.a($$0));
   }

   @Nullable
   public static csy a(dfc $$0) {
      return $$0 instanceof dmp ? ((dmp)$$0).b() : null;
   }

   public static dfc a(@Nullable csy $$0) {
      if ($$0 == null) {
         return dfe.lN;
      } else {
         return switch ($$0) {
            case a -> dfe.lO;
            case b -> dfe.lP;
            case c -> dfe.lQ;
            case d -> dfe.lR;
            case e -> dfe.lS;
            case f -> dfe.lT;
            case g -> dfe.lU;
            case h -> dfe.lV;
            case i -> dfe.lW;
            case j -> dfe.lX;
            case l -> dfe.lZ;
            case m -> dfe.ma;
            case n -> dfe.mb;
            case o -> dfe.mc;
            case p -> dfe.md;
            case k -> dfe.lY;
         };
      }
   }

   @Nullable
   public csy b() {
      return this.m;
   }

   public static cuh b(@Nullable csy $$0) {
      return new cuh(a($$0));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
