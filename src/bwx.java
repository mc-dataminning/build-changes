import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwx {
   private static final Map<bvm<?>, bwx.a> a = Maps.newHashMap();

   private static <T extends bwd> void a(bvm<T> $$0, bwv $$1, edi.a $$2, bwx.b<T> $$3) {
      bwx.a $$4 = a.put($$0, new bwx.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ma.f.b($$0));
      }
   }

   public static bwv a(bvm<?> $$0) {
      bwx.a $$1 = a.get($$0);
      return $$1 == null ? bww.a : $$1.b;
   }

   public static boolean a(bvm<?> $$0, dhd $$1, jh $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static edi.a b(@Nullable bvm<?> $$0) {
      bwx.a $$1 = a.get($$0);
      return $$1 == null ? edi.a.f : $$1.a;
   }

   public static <T extends bvf> boolean a(bvm<T> $$0, dhr $$1, bvl $$2, jh $$3, bam $$4) {
      bwx.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bvm.h, bww.b, edi.a.f, cje::a);
      a(bvm.A, bww.b, edi.a.f, ciu::c);
      a(bvm.I, bww.b, edi.a.f, chr::b);
      a(bvm.L, bww.b, edi.a.f, cmg::a);
      a(bvm.aj, bww.b, edi.a.f, cmo::b);
      a(bvm.aX, bww.b, edi.a.f, ciu::c);
      a(bvm.ba, bww.b, edi.a.f, ciu::c);
      a(bvm.br, bww.b, edi.a.f, chr::b);
      a(bvm.bA, bww.b, edi.a.f, cis::b);
      a(bvm.e, bww.d, edi.a.f, cjb::c);
      a(bvm.k, bww.d, edi.a.f, chm::b);
      a(bvm.o, bww.d, edi.a.f, cms::c);
      a(bvm.q, bww.d, edi.a.f, cms::b);
      a(bvm.r, bww.d, edi.a.f, cms::c);
      a(bvm.v, bww.d, edi.a.f, cms::b);
      a(bvm.z, bww.d, edi.a.f, chs::b);
      a(bvm.C, bww.d, edi.a.f, chs::b);
      a(bvm.F, bww.d, edi.a.f, cms::b);
      a(bvm.J, bww.d, edi.a.f, chs::b);
      a(bvm.O, bww.d, edi.a.f, cms::b);
      a(bvm.P, bww.d, edi.a.f, cmj::b);
      a(bvm.Q, bww.d, edi.a.f, bwd::a);
      a(bvm.ac, bww.d, edi.a.f, cjm::c);
      a(bvm.ae, bww.d, edi.a.f, cmm::b);
      a(bvm.af, bww.d, edi.a.f, cms::b);
      a(bvm.ah, bww.b, edi.a.f, bvt::a);
      a(bvm.ai, bww.d, edi.a.f, cjs::c);
      a(bvm.am, bww.d, edi.a.f, chs::b);
      a(bvm.an, bww.d, edi.a.f, cmp::a);
      a(bvm.aq, bww.d, edi.a.f, bwd::a);
      a(bvm.ay, bww.d, edi.a.f, chs::b);
      a(bvm.aA, bww.d, edi.a.f, cmr::b);
      a(bvm.aF, bww.d, edi.a.f, cif::c);
      a(bvm.aG, bww.d, edi.a.f, chs::b);
      a(bvm.aJ, bww.d, edi.a.e, cig::c);
      a(bvm.aP, bww.d, edi.a.e, cii::c);
      a(bvm.aR, bww.d, edi.a.f, chs::b);
      a(bvm.ak, bww.d, edi.a.f, coa::c);
      a(bvm.aS, bww.d, edi.a.f, cog::b);
      a(bvm.aU, bww.d, edi.a.f, cmt::b);
      a(bvm.aV, bww.d, edi.a.f, cik::c);
      a(bvm.aY, bww.d, edi.a.f, cim::c);
      a(bvm.bb, bww.d, edi.a.f, chs::b);
      a(bvm.be, bww.d, edi.a.f, cmz::b);
      a(bvm.bf, bww.d, edi.a.f, cms::b);
      a(bvm.bg, bww.d, edi.a.f, ckc::c);
      a(bvm.bh, bww.d, edi.a.f, cnb::c);
      a(bvm.bl, bww.d, edi.a.f, bwd::a);
      a(bvm.bo, bww.d, edi.a.f, cms::b);
      a(bvm.bs, bww.d, edi.a.f, cne::a);
      a(bvm.bt, bww.c, edi.a.f, cnf::c);
      a(bvm.bB, bww.d, edi.a.f, cit::c);
      a(bvm.bD, bww.d, edi.a.f, bwd::a);
      a(bvm.bI, bww.d, edi.a.f, cms::b);
      a(bvm.bJ, bww.d, edi.a.f, cms::b);
      a(bvm.bK, bww.d, edi.a.f, cms::b);
      a(bvm.bM, bww.d, edi.a.f, civ::c);
      a(bvm.bN, bww.d, edi.a.f, cms::c);
      a(bvm.D, bww.d, edi.a.f, cms::b);
      a(bvm.E, bww.d, edi.a.f, cms::b);
      a(bvm.bO, bww.d, edi.a.f, cms::b);
      a(bvm.bP, bww.d, edi.a.f, ckg::c);
      a(bvm.bR, bww.d, edi.a.f, cnn::b);
      a(bvm.bQ, bww.d, edi.a.f, cms::b);
      a(bvm.u, bww.d, edi.a.f, chs::b);
      a(bvm.N, bww.b, edi.a.f, cmo::b);
      a(bvm.T, bww.a, edi.a.f, cms::b);
      a(bvm.ab, bww.a, edi.a.f, cic::c);
      a(bvm.ao, bww.a, edi.a.f, cms::b);
      a(bvm.aO, bww.a, edi.a.f, chs::b);
      a(bvm.aQ, bww.a, edi.a.f, bwd::a);
      a(bvm.aZ, bww.d, edi.a.f, cms::b);
      a(bvm.bc, bww.a, edi.a.f, bwd::a);
      a(bvm.by, bww.a, edi.a.f, chs::b);
      a(bvm.bC, bww.a, edi.a.f, cms::b);
      a(bvm.bE, bww.a, edi.a.f, cms::b);
      a(bvm.bF, bww.d, edi.a.f, bwd::a);
      a(bvm.bG, bww.a, edi.a.f, cms::b);
   }

   static record a(edi.a a, bwv b, bwx.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bvf> {
      boolean test(bvm<T> var1, dhr var2, bvl var3, jh var4, bam var5);
   }
}
