import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtv extends dly {
   public static final MapCodec<dtv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyi.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dtv((cyi)$$0x.orElse(null), $$1))
   );
   public static final Map<jb, ffr> b = ffo.d(dmm.c(16.0, 0.0, 1.0));
   public static final ebm<jb> c = doq.a;
   public static final alg d = alg.b("contents");
   @Nullable
   private final cyi e;

   @Override
   public MapCodec<dtv> a() {
      return a;
   }

   public dtv(@Nullable cyi $$0, ean.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, jb.b));
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyz(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.y, dyz::a);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dyz $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awx.aq);
         cpz.a($$5, $$3, true);
      }

      return bug.a;
   }

   private static boolean a(eao $$0, djh $$1, iv $$2, dyz $$3) {
      if ($$3.k() != dyz.a.a) {
         return true;
      } else {
         fes $$4 = cor.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      dxm $$4 = $$0.c_($$1);
      if ($$4 instanceof dyz $$5) {
         if (!$$0.C && $$3.gk() && !$$5.c()) {
            czk $$6 = b(this.b());
            $$6.b($$4.q());
            cno $$7 = new cno($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czk> a(eao $$0, ezr.a $$1) {
      dxm $$2 = $$1.b(fci.h);
      if ($$2 instanceof dyz $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dyz $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return ffo.b();
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$1.c_($$2) instanceof dyz $$5 ? ffo.a($$5.a($$0)) : ffo.b();
   }

   @Override
   protected boolean e_(eao $$0) {
      return false;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.a($$1.c_($$2));
   }

   public static dmm a(@Nullable cyi $$0) {
      if ($$0 == null) {
         return dmo.lv;
      } else {
         return switch ($$0) {
            case a -> dmo.lw;
            case b -> dmo.lx;
            case c -> dmo.ly;
            case d -> dmo.lz;
            case e -> dmo.lA;
            case f -> dmo.lB;
            case g -> dmo.lC;
            case h -> dmo.lD;
            case i -> dmo.lE;
            case j -> dmo.lF;
            case l -> dmo.lH;
            case m -> dmo.lI;
            case n -> dmo.lJ;
            case o -> dmo.lK;
            case p -> dmo.lL;
            case k -> dmo.lG;
         };
      }
   }

   @Nullable
   public cyi b() {
      return this.e;
   }

   public static czk b(@Nullable cyi $$0) {
      return new czk(a($$0));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
