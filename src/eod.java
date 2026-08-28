import java.util.Locale;

public interface eod {
   eod a = a(epq.a::new, "MSCorridor");
   eod b = a(epq.b::new, "MSCrossing");
   eod c = a(epq.d::new, "MSRoom");
   eod d = a(epq.e::new, "MSStairs");
   eod e = a(eps.a::new, "NeBCr");
   eod f = a(eps.b::new, "NeBEF");
   eod g = a(eps.c::new, "NeBS");
   eod h = a(eps.d::new, "NeCCS");
   eod i = a(eps.e::new, "NeCTB");
   eod j = a(eps.f::new, "NeCE");
   eod k = a(eps.g::new, "NeSCSC");
   eod l = a(eps.h::new, "NeSCLT");
   eod m = a(eps.i::new, "NeSC");
   eod n = a(eps.j::new, "NeSCRT");
   eod o = a(eps.k::new, "NeCSR");
   eod p = a(eps.l::new, "NeMT");
   eod q = a(eps.o::new, "NeRC");
   eod r = a(eps.p::new, "NeSR");
   eod s = a(eps.q::new, "NeStart");
   eod t = a(eqe.a::new, "SHCC");
   eod u = a(eqe.b::new, "SHFC");
   eod v = a(eqe.c::new, "SH5C");
   eod w = a(eqe.d::new, "SHLT");
   eod x = a(eqe.e::new, "SHLi");
   eod y = a(eqe.g::new, "SHPR");
   eod z = a(eqe.h::new, "SHPH");
   eod A = a(eqe.i::new, "SHRT");
   eod B = a(eqe.j::new, "SHRC");
   eod C = a(eqe.l::new, "SHSD");
   eod D = a(eqe.m::new, "SHStart");
   eod E = a(eqe.n::new, "SHS");
   eod F = a(eqe.o::new, "SHSSD");
   eod G = a(epo::new, "TeJP");
   eod H = a(epy.a::a, "ORP");
   eod I = a(epl.a::new, "Iglu");
   eod J = a(eqa::new, "RUPO");
   eod K = a(eqg::new, "TeSH");
   eod L = a(eph::new, "TeDP");
   eod M = a(epw.h::new, "OMB");
   eod N = a(epw.j::new, "OMCR");
   eod O = a(epw.k::new, "OMDXR");
   eod P = a(epw.l::new, "OMDXYR");
   eod Q = a(epw.m::new, "OMDYR");
   eod R = a(epw.n::new, "OMDYZR");
   eod S = a(epw.o::new, "OMDZR");
   eod T = a(epw.p::new, "OMEntry");
   eod U = a(epw.q::new, "OMPenthouse");
   eod V = a(epw.s::new, "OMSimple");
   eod W = a(epw.t::new, "OMSimpleT");
   eod X = a(epw.u::new, "OMWR");
   eod Y = a(epj.a::new, "ECP");
   eod Z = a(eqi.i::new, "WMP");
   eod aa = a(epf.a::new, "BTP");
   eod ab = a(eqc.a::new, "Shipwreck");
   eod ac = a(epu.a::new, "NeFos");
   eod ad = a(eni::new, "jigsaw");

   enq load(eoc var1, tq var2);

   private static eod a(eod $$0, String $$1) {
      return ke.a(mb.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eod a(eod.a $$0, String $$1) {
      return a((eod)$$0, $$1);
   }

   private static eod a(eod.b $$0, String $$1) {
      return a((eod)$$0, $$1);
   }

   public interface a extends eod {
      enq load(tq var1);

      @Override
      default enq load(eoc $$0, tq $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eod {
      enq load(erp var1, tq var2);

      @Override
      default enq load(eoc $$0, tq $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
