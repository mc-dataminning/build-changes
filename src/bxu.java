import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bxu {
   private static final Map<bwj<?>, bxu.a> a = Maps.newHashMap();

   private static <T extends bxb> void a(bwj<T> $$0, bxs $$1, efn.a $$2, bxu.b<T> $$3) {
      bxu.a $$4 = a.put($$0, new bxu.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mf.f.b($$0));
      }
   }

   public static bxs a(bwj<?> $$0) {
      bxu.a $$1 = a.get($$0);
      return $$1 == null ? bxt.a : $$1.b;
   }

   public static boolean a(bwj<?> $$0, dis $$1, iu $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static efn.a b(@Nullable bwj<?> $$0) {
      bxu.a $$1 = a.get($$0);
      return $$1 == null ? efn.a.f : $$1.a;
   }

   public static <T extends bwa> boolean a(bwj<T> $$0, djg $$1, bwi $$2, iu $$3, azt $$4) {
      bxu.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bwj.h, bxt.b, efn.a.f, ckd::a);
      a(bwj.A, bxt.b, efn.a.f, cjt::c);
      a(bwj.H, bxt.b, efn.a.f, cin::b);
      a(bwj.K, bxt.b, efn.a.f, cnh::a);
      a(bwj.ai, bxt.b, efn.a.f, cnp::b);
      a(bwj.aX, bxt.b, efn.a.f, cjt::c);
      a(bwj.ba, bxt.b, efn.a.f, cjt::c);
      a(bwj.br, bxt.b, efn.a.f, cin::b);
      a(bwj.bA, bxt.b, efn.a.f, cjr::b);
      a(bwj.e, bxt.d, efn.a.f, cka::c);
      a(bwj.k, bxt.d, efn.a.f, cii::b);
      a(bwj.o, bxt.d, efn.a.f, cnt::c);
      a(bwj.q, bxt.d, efn.a.f, cnt::b);
      a(bwj.r, bxt.d, efn.a.f, cnt::c);
      a(bwj.v, bxt.d, efn.a.f, cnt::b);
      a(bwj.z, bxt.d, efn.a.f, cio::b);
      a(bwj.C, bxt.d, efn.a.f, cio::b);
      a(bwj.E, bxt.d, efn.a.f, cnt::b);
      a(bwj.I, bxt.d, efn.a.f, cio::b);
      a(bwj.N, bxt.d, efn.a.f, cnt::b);
      a(bwj.O, bxt.d, efn.a.f, cnk::b);
      a(bwj.P, bxt.d, efn.a.f, bxb::a);
      a(bwj.ab, bxt.d, efn.a.f, ckl::c);
      a(bwj.ad, bxt.d, efn.a.f, cnn::b);
      a(bwj.ae, bxt.d, efn.a.f, cnt::b);
      a(bwj.ag, bxt.b, efn.a.f, bwq::a);
      a(bwj.ah, bxt.d, efn.a.f, ckt::c);
      a(bwj.al, bxt.d, efn.a.f, cio::b);
      a(bwj.am, bxt.d, efn.a.f, cnq::a);
      a(bwj.ap, bxt.d, efn.a.f, bxb::a);
      a(bwj.ax, bxt.d, efn.a.f, cio::b);
      a(bwj.az, bxt.d, efn.a.f, cns::b);
      a(bwj.aE, bxt.d, efn.a.f, cjb::c);
      a(bwj.aF, bxt.d, efn.a.f, cio::b);
      a(bwj.aI, bxt.d, efn.a.e, cjc::c);
      a(bwj.aO, bxt.d, efn.a.e, cje::c);
      a(bwj.aQ, bxt.d, efn.a.f, cio::b);
      a(bwj.aj, bxt.d, efn.a.f, cpb::c);
      a(bwj.aR, bxt.d, efn.a.f, cph::b);
      a(bwj.aT, bxt.d, efn.a.f, cnu::b);
      a(bwj.aU, bxt.d, efn.a.f, cji::c);
      a(bwj.aY, bxt.d, efn.a.f, cjk::c);
      a(bwj.bb, bxt.d, efn.a.f, cio::b);
      a(bwj.be, bxt.d, efn.a.f, coa::b);
      a(bwj.bf, bxt.d, efn.a.f, cnt::b);
      a(bwj.bg, bxt.d, efn.a.f, cld::c);
      a(bwj.bh, bxt.d, efn.a.f, coc::c);
      a(bwj.bl, bxt.d, efn.a.f, bxb::a);
      a(bwj.bo, bxt.d, efn.a.f, cnt::b);
      a(bwj.bs, bxt.d, efn.a.f, cof::a);
      a(bwj.bt, bxt.c, efn.a.f, cog::c);
      a(bwj.bB, bxt.d, efn.a.f, cjs::c);
      a(bwj.bD, bxt.d, efn.a.f, bxb::a);
      a(bwj.bI, bxt.d, efn.a.f, cnt::b);
      a(bwj.bJ, bxt.d, efn.a.f, cnt::b);
      a(bwj.bK, bxt.d, efn.a.f, cnt::b);
      a(bwj.bM, bxt.d, efn.a.f, cju::c);
      a(bwj.bN, bxt.d, efn.a.f, cnt::c);
      a(bwj.D, bxt.d, efn.a.f, cnt::b);
      a(bwj.bO, bxt.d, efn.a.f, cnt::b);
      a(bwj.bP, bxt.d, efn.a.f, clh::c);
      a(bwj.bR, bxt.d, efn.a.f, cop::b);
      a(bwj.bQ, bxt.d, efn.a.f, cnt::b);
      a(bwj.u, bxt.d, efn.a.f, cio::b);
      a(bwj.M, bxt.b, efn.a.f, cnp::b);
      a(bwj.S, bxt.a, efn.a.f, cnt::b);
      a(bwj.aa, bxt.a, efn.a.f, ciz::c);
      a(bwj.an, bxt.a, efn.a.f, cnt::b);
      a(bwj.aN, bxt.a, efn.a.f, cio::b);
      a(bwj.aP, bxt.a, efn.a.f, bxb::a);
      a(bwj.aZ, bxt.d, efn.a.f, cnt::b);
      a(bwj.bc, bxt.a, efn.a.f, bxb::a);
      a(bwj.by, bxt.a, efn.a.f, cio::b);
      a(bwj.bC, bxt.a, efn.a.f, cnt::b);
      a(bwj.bE, bxt.a, efn.a.f, cnt::b);
      a(bwj.bF, bxt.d, efn.a.f, bxb::a);
      a(bwj.bG, bxt.a, efn.a.f, cnt::b);
   }

   static record a(efn.a a, bxs b, bxu.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bwa> {
      boolean test(bwj<T> var1, djg var2, bwi var3, iu var4, azt var5);
   }
}
