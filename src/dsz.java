import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsz extends dlg {
   public static final MapCodec<dsz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxq.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dsz((cxq)$$0x.orElse(null), $$1))
   );
   public static final Map<ja, feq> b = fen.d(dlu.c(16.0, 0.0, 1.0));
   public static final eam<ja> c = dny.a;
   public static final ale d = ale.b("contents");
   @Nullable
   private final cxq e;

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   public dsz(@Nullable cxq $$0, dzn.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.B.b().b(c, ja.b));
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dya(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.y, dya::a);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1 instanceof aro $$5 && $$1.c_($$2) instanceof dya $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awv.aq);
         cpi.a($$5, $$3, true);
      }

      return bty.a;
   }

   private static boolean a(dzo $$0, dip $$1, iu $$2, dya $$3) {
      if ($$3.k() != dya.a.a) {
         return true;
      } else {
         fdr $$4 = cnz.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      dwn $$4 = $$0.c_($$1);
      if ($$4 instanceof dya $$5) {
         if (!$$0.C && $$3.gk() && !$$5.c()) {
            cys $$6 = b(this.b());
            $$6.b($$4.q());
            cmx $$7 = new cmx($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cys> a(dzo $$0, eyq.a $$1) {
      dwn $$2 = $$1.b(fbh.h);
      if ($$2 instanceof dya $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dya $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fen.b();
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$1.c_($$2) instanceof dya $$5 ? fen.a($$5.a($$0)) : fen.b();
   }

   @Override
   protected boolean e_(dzo $$0) {
      return false;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.a($$1.c_($$2));
   }

   public static dlu a(@Nullable cxq $$0) {
      if ($$0 == null) {
         return dlw.lr;
      } else {
         return switch ($$0) {
            case a -> dlw.ls;
            case b -> dlw.lt;
            case c -> dlw.lu;
            case d -> dlw.lv;
            case e -> dlw.lw;
            case f -> dlw.lx;
            case g -> dlw.ly;
            case h -> dlw.lz;
            case i -> dlw.lA;
            case j -> dlw.lB;
            case l -> dlw.lD;
            case m -> dlw.lE;
            case n -> dlw.lF;
            case o -> dlw.lG;
            case p -> dlw.lH;
            case k -> dlw.lC;
         };
      }
   }

   @Nullable
   public cxq b() {
      return this.e;
   }

   public static cys b(@Nullable cxq $$0) {
      return new cys(a($$0));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
