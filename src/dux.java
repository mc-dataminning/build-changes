import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dux extends dna {
   public static final MapCodec<dux> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czi.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dux((czi)$$0x.orElse(null), $$1))
   );
   public static final Map<jc, fgw> b = fgt.d(dno.c(16.0, 0.0, 1.0));
   public static final eco<jc> c = dps.a;
   public static final alr d = alr.b("contents");
   @Nullable
   private final czi e;

   @Override
   public MapCodec<dux> a() {
      return a;
   }

   public dux(@Nullable czi $$0, ebp.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, jc.b));
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eab(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.y, eab::a);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1 instanceof asb $$5 && $$1.c_($$2) instanceof eab $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(axi.aq);
         cqy.a($$5, $$3, true);
      }

      return bvc.a;
   }

   private static boolean a(ebq $$0, dkj $$1, iw $$2, eab $$3) {
      if ($$3.k() != eab.a.a) {
         return true;
      } else {
         ffx $$4 = cpq.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      dyo $$4 = $$0.c_($$1);
      if ($$4 instanceof eab $$5) {
         if (!$$0.C && $$3.gl() && !$$5.c()) {
            dak $$6 = b(this.b());
            $$6.b($$4.q());
            coo $$7 = new coo($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<dak> a(ebq $$0, faw.a $$1) {
      dyo $$2 = $$1.b(fdn.h);
      if ($$2 instanceof eab $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      if ($$1.c_($$2) instanceof eab $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fgt.b();
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$1.c_($$2) instanceof eab $$5 ? fgt.a($$5.a($$0)) : fgt.b();
   }

   @Override
   protected boolean e_(ebq $$0) {
      return false;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.a($$1.c_($$2));
   }

   public static dno a(@Nullable czi $$0) {
      if ($$0 == null) {
         return dnq.lv;
      } else {
         return switch ($$0) {
            case a -> dnq.lw;
            case b -> dnq.lx;
            case c -> dnq.ly;
            case d -> dnq.lz;
            case e -> dnq.lA;
            case f -> dnq.lB;
            case g -> dnq.lC;
            case h -> dnq.lD;
            case i -> dnq.lE;
            case j -> dnq.lF;
            case l -> dnq.lH;
            case m -> dnq.lI;
            case n -> dnq.lJ;
            case o -> dnq.lK;
            case p -> dnq.lL;
            case k -> dnq.lG;
         };
      }
   }

   @Nullable
   public czi b() {
      return this.e;
   }

   public static dak b(@Nullable czi $$0) {
      return new dak(a($$0));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
