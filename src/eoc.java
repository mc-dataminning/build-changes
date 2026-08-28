import java.util.Locale;

public interface eoc {
   eoc a = a(epp.a::new, "MSCorridor");
   eoc b = a(epp.b::new, "MSCrossing");
   eoc c = a(epp.d::new, "MSRoom");
   eoc d = a(epp.e::new, "MSStairs");
   eoc e = a(epr.a::new, "NeBCr");
   eoc f = a(epr.b::new, "NeBEF");
   eoc g = a(epr.c::new, "NeBS");
   eoc h = a(epr.d::new, "NeCCS");
   eoc i = a(epr.e::new, "NeCTB");
   eoc j = a(epr.f::new, "NeCE");
   eoc k = a(epr.g::new, "NeSCSC");
   eoc l = a(epr.h::new, "NeSCLT");
   eoc m = a(epr.i::new, "NeSC");
   eoc n = a(epr.j::new, "NeSCRT");
   eoc o = a(epr.k::new, "NeCSR");
   eoc p = a(epr.l::new, "NeMT");
   eoc q = a(epr.o::new, "NeRC");
   eoc r = a(epr.p::new, "NeSR");
   eoc s = a(epr.q::new, "NeStart");
   eoc t = a(eqd.a::new, "SHCC");
   eoc u = a(eqd.b::new, "SHFC");
   eoc v = a(eqd.c::new, "SH5C");
   eoc w = a(eqd.d::new, "SHLT");
   eoc x = a(eqd.e::new, "SHLi");
   eoc y = a(eqd.g::new, "SHPR");
   eoc z = a(eqd.h::new, "SHPH");
   eoc A = a(eqd.i::new, "SHRT");
   eoc B = a(eqd.j::new, "SHRC");
   eoc C = a(eqd.l::new, "SHSD");
   eoc D = a(eqd.m::new, "SHStart");
   eoc E = a(eqd.n::new, "SHS");
   eoc F = a(eqd.o::new, "SHSSD");
   eoc G = a(epn::new, "TeJP");
   eoc H = a(epx.a::a, "ORP");
   eoc I = a(epk.a::new, "Iglu");
   eoc J = a(epz::new, "RUPO");
   eoc K = a(eqf::new, "TeSH");
   eoc L = a(epg::new, "TeDP");
   eoc M = a(epv.h::new, "OMB");
   eoc N = a(epv.j::new, "OMCR");
   eoc O = a(epv.k::new, "OMDXR");
   eoc P = a(epv.l::new, "OMDXYR");
   eoc Q = a(epv.m::new, "OMDYR");
   eoc R = a(epv.n::new, "OMDYZR");
   eoc S = a(epv.o::new, "OMDZR");
   eoc T = a(epv.p::new, "OMEntry");
   eoc U = a(epv.q::new, "OMPenthouse");
   eoc V = a(epv.s::new, "OMSimple");
   eoc W = a(epv.t::new, "OMSimpleT");
   eoc X = a(epv.u::new, "OMWR");
   eoc Y = a(epi.a::new, "ECP");
   eoc Z = a(eqh.i::new, "WMP");
   eoc aa = a(epe.a::new, "BTP");
   eoc ab = a(eqb.a::new, "Shipwreck");
   eoc ac = a(ept.a::new, "NeFos");
   eoc ad = a(enh::new, "jigsaw");

   enp load(eob var1, tq var2);

   private static eoc a(eoc $$0, String $$1) {
      return ke.a(mb.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eoc a(eoc.a $$0, String $$1) {
      return a((eoc)$$0, $$1);
   }

   private static eoc a(eoc.b $$0, String $$1) {
      return a((eoc)$$0, $$1);
   }

   public interface a extends eoc {
      enp load(tq var1);

      @Override
      default enp load(eob $$0, tq $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eoc {
      enp load(ero var1, tq var2);

      @Override
      default enp load(eob $$0, tq $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
