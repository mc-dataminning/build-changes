import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dto extends dlr {
   public static final MapCodec<dto> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyb.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dto((cyb)$$0x.orElse(null), $$1))
   );
   public static final Map<ja, ffk> b = ffh.d(dmf.c(16.0, 0.0, 1.0));
   public static final ebf<ja> c = doj.a;
   public static final alg d = alg.b("contents");
   @Nullable
   private final cyb e;

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   public dto(@Nullable cyb $$0, eag.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, ja.b));
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dys(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.y, dys::a);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dys $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awx.aq);
         cps.a($$5, $$3, true);
      }

      return bud.a;
   }

   private static boolean a(eah $$0, dja $$1, iu $$2, dys $$3) {
      if ($$3.k() != dys.a.a) {
         return true;
      } else {
         fel $$4 = coj.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      dxf $$4 = $$0.c_($$1);
      if ($$4 instanceof dys $$5) {
         if (!$$0.C && $$3.gl() && !$$5.c()) {
            czd $$6 = b(this.b());
            $$6.b($$4.q());
            cnh $$7 = new cnh($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czd> a(eah $$0, ezk.a $$1) {
      dxf $$2 = $$1.b(fcb.h);
      if ($$2 instanceof dys $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dys $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return ffh.b();
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$1.c_($$2) instanceof dys $$5 ? ffh.a($$5.a($$0)) : ffh.b();
   }

   @Override
   protected boolean e_(eah $$0) {
      return false;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.a($$1.c_($$2));
   }

   public static dmf a(@Nullable cyb $$0) {
      if ($$0 == null) {
         return dmh.lv;
      } else {
         return switch ($$0) {
            case a -> dmh.lw;
            case b -> dmh.lx;
            case c -> dmh.ly;
            case d -> dmh.lz;
            case e -> dmh.lA;
            case f -> dmh.lB;
            case g -> dmh.lC;
            case h -> dmh.lD;
            case i -> dmh.lE;
            case j -> dmh.lF;
            case l -> dmh.lH;
            case m -> dmh.lI;
            case n -> dmh.lJ;
            case o -> dmh.lK;
            case p -> dmh.lL;
            case k -> dmh.lG;
         };
      }
   }

   @Nullable
   public cyb b() {
      return this.e;
   }

   public static czd b(@Nullable cyb $$0) {
      return new czd(a($$0));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
