import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dua extends dmd {
   public static final MapCodec<dua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyl.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dua((cyl)$$0x.orElse(null), $$1))
   );
   public static final Map<jb, ffw> b = fft.d(dmr.c(16.0, 0.0, 1.0));
   public static final ebr<jb> c = dov.a;
   public static final alg d = alg.b("contents");
   @Nullable
   private final cyl e;

   @Override
   public MapCodec<dua> a() {
      return a;
   }

   public dua(@Nullable cyl $$0, eas.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, jb.b));
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dze(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.y, dze::a);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dze $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awx.aq);
         cqc.a($$5, $$3, true);
      }

      return bug.a;
   }

   private static boolean a(eat $$0, djm $$1, iv $$2, dze $$3) {
      if ($$3.k() != dze.a.a) {
         return true;
      } else {
         fex $$4 = cou.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      dxr $$4 = $$0.c_($$1);
      if ($$4 instanceof dze $$5) {
         if (!$$0.C && $$3.gk() && !$$5.c()) {
            czn $$6 = b(this.b());
            $$6.b($$4.q());
            cnr $$7 = new cnr($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czn> a(eat $$0, ezw.a $$1) {
      dxr $$2 = $$1.b(fcn.h);
      if ($$2 instanceof dze $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dze $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fft.b();
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$1.c_($$2) instanceof dze $$5 ? fft.a($$5.a($$0)) : fft.b();
   }

   @Override
   protected boolean e_(eat $$0) {
      return false;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.a($$1.c_($$2));
   }

   public static dmr a(@Nullable cyl $$0) {
      if ($$0 == null) {
         return dmt.lv;
      } else {
         return switch ($$0) {
            case a -> dmt.lw;
            case b -> dmt.lx;
            case c -> dmt.ly;
            case d -> dmt.lz;
            case e -> dmt.lA;
            case f -> dmt.lB;
            case g -> dmt.lC;
            case h -> dmt.lD;
            case i -> dmt.lE;
            case j -> dmt.lF;
            case l -> dmt.lH;
            case m -> dmt.lI;
            case n -> dmt.lJ;
            case o -> dmt.lK;
            case p -> dmt.lL;
            case k -> dmt.lG;
         };
      }
   }

   @Nullable
   public cyl b() {
      return this.e;
   }

   public static czn b(@Nullable cyl $$0) {
      return new czn(a($$0));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
