import java.util.Locale;

public interface eoe {
   eoe a = a(epr.a::new, "MSCorridor");
   eoe b = a(epr.b::new, "MSCrossing");
   eoe c = a(epr.d::new, "MSRoom");
   eoe d = a(epr.e::new, "MSStairs");
   eoe e = a(ept.a::new, "NeBCr");
   eoe f = a(ept.b::new, "NeBEF");
   eoe g = a(ept.c::new, "NeBS");
   eoe h = a(ept.d::new, "NeCCS");
   eoe i = a(ept.e::new, "NeCTB");
   eoe j = a(ept.f::new, "NeCE");
   eoe k = a(ept.g::new, "NeSCSC");
   eoe l = a(ept.h::new, "NeSCLT");
   eoe m = a(ept.i::new, "NeSC");
   eoe n = a(ept.j::new, "NeSCRT");
   eoe o = a(ept.k::new, "NeCSR");
   eoe p = a(ept.l::new, "NeMT");
   eoe q = a(ept.o::new, "NeRC");
   eoe r = a(ept.p::new, "NeSR");
   eoe s = a(ept.q::new, "NeStart");
   eoe t = a(eqf.a::new, "SHCC");
   eoe u = a(eqf.b::new, "SHFC");
   eoe v = a(eqf.c::new, "SH5C");
   eoe w = a(eqf.d::new, "SHLT");
   eoe x = a(eqf.e::new, "SHLi");
   eoe y = a(eqf.g::new, "SHPR");
   eoe z = a(eqf.h::new, "SHPH");
   eoe A = a(eqf.i::new, "SHRT");
   eoe B = a(eqf.j::new, "SHRC");
   eoe C = a(eqf.l::new, "SHSD");
   eoe D = a(eqf.m::new, "SHStart");
   eoe E = a(eqf.n::new, "SHS");
   eoe F = a(eqf.o::new, "SHSSD");
   eoe G = a(epp::new, "TeJP");
   eoe H = a(epz.a::a, "ORP");
   eoe I = a(epm.a::new, "Iglu");
   eoe J = a(eqb::new, "RUPO");
   eoe K = a(eqh::new, "TeSH");
   eoe L = a(epi::new, "TeDP");
   eoe M = a(epx.h::new, "OMB");
   eoe N = a(epx.j::new, "OMCR");
   eoe O = a(epx.k::new, "OMDXR");
   eoe P = a(epx.l::new, "OMDXYR");
   eoe Q = a(epx.m::new, "OMDYR");
   eoe R = a(epx.n::new, "OMDYZR");
   eoe S = a(epx.o::new, "OMDZR");
   eoe T = a(epx.p::new, "OMEntry");
   eoe U = a(epx.q::new, "OMPenthouse");
   eoe V = a(epx.s::new, "OMSimple");
   eoe W = a(epx.t::new, "OMSimpleT");
   eoe X = a(epx.u::new, "OMWR");
   eoe Y = a(epk.a::new, "ECP");
   eoe Z = a(eqj.i::new, "WMP");
   eoe aa = a(epg.a::new, "BTP");
   eoe ab = a(eqd.a::new, "Shipwreck");
   eoe ac = a(epv.a::new, "NeFos");
   eoe ad = a(enj::new, "jigsaw");

   enr load(eod var1, tq var2);

   private static eoe a(eoe $$0, String $$1) {
      return ke.a(mb.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eoe a(eoe.a $$0, String $$1) {
      return a((eoe)$$0, $$1);
   }

   private static eoe a(eoe.b $$0, String $$1) {
      return a((eoe)$$0, $$1);
   }

   public interface a extends eoe {
      enr load(tq var1);

      @Override
      default enr load(eod $$0, tq $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eoe {
      enr load(erq var1, tq var2);

      @Override
      default enr load(eod $$0, tq $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
