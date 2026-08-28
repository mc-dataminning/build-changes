import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dun extends dmq {
   public static final MapCodec<dun> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyy.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dun((cyy)$$0x.orElse(null), $$1))
   );
   public static final Map<jc, fgm> b = fgj.d(dne.c(16.0, 0.0, 1.0));
   public static final ece<jc> c = dpi.a;
   public static final alk d = alk.b("contents");
   @Nullable
   private final cyy e;

   @Override
   public MapCodec<dun> a() {
      return a;
   }

   public dun(@Nullable cyy $$0, ebf.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, jc.b));
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzr(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.y, dzr::a);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1 instanceof aru $$5 && $$1.c_($$2) instanceof dzr $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(axb.aq);
         cqp.a($$5, $$3, true);
      }

      return but.a;
   }

   private static boolean a(ebg $$0, djz $$1, iw $$2, dzr $$3) {
      if ($$3.k() != dzr.a.a) {
         return true;
      } else {
         ffn $$4 = cph.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      dye $$4 = $$0.c_($$1);
      if ($$4 instanceof dzr $$5) {
         if (!$$0.C && $$3.gl() && !$$5.c()) {
            daa $$6 = b(this.b());
            $$6.b($$4.q());
            coe $$7 = new coe($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<daa> a(ebg $$0, fam.a $$1) {
      dye $$2 = $$1.b(fdd.h);
      if ($$2 instanceof dzr $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      if ($$1.c_($$2) instanceof dzr $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fgj.b();
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$1.c_($$2) instanceof dzr $$5 ? fgj.a($$5.a($$0)) : fgj.b();
   }

   @Override
   protected boolean e_(ebg $$0) {
      return false;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.a($$1.c_($$2));
   }

   public static dne a(@Nullable cyy $$0) {
      if ($$0 == null) {
         return dng.lv;
      } else {
         return switch ($$0) {
            case a -> dng.lw;
            case b -> dng.lx;
            case c -> dng.ly;
            case d -> dng.lz;
            case e -> dng.lA;
            case f -> dng.lB;
            case g -> dng.lC;
            case h -> dng.lD;
            case i -> dng.lE;
            case j -> dng.lF;
            case l -> dng.lH;
            case m -> dng.lI;
            case n -> dng.lJ;
            case o -> dng.lK;
            case p -> dng.lL;
            case k -> dng.lG;
         };
      }
   }

   @Nullable
   public cyy b() {
      return this.e;
   }

   public static daa b(@Nullable cyy $$0) {
      return new daa(a($$0));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
