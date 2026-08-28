import java.util.Locale;

public interface eob {
   eob a = a(epo.a::new, "MSCorridor");
   eob b = a(epo.b::new, "MSCrossing");
   eob c = a(epo.d::new, "MSRoom");
   eob d = a(epo.e::new, "MSStairs");
   eob e = a(epq.a::new, "NeBCr");
   eob f = a(epq.b::new, "NeBEF");
   eob g = a(epq.c::new, "NeBS");
   eob h = a(epq.d::new, "NeCCS");
   eob i = a(epq.e::new, "NeCTB");
   eob j = a(epq.f::new, "NeCE");
   eob k = a(epq.g::new, "NeSCSC");
   eob l = a(epq.h::new, "NeSCLT");
   eob m = a(epq.i::new, "NeSC");
   eob n = a(epq.j::new, "NeSCRT");
   eob o = a(epq.k::new, "NeCSR");
   eob p = a(epq.l::new, "NeMT");
   eob q = a(epq.o::new, "NeRC");
   eob r = a(epq.p::new, "NeSR");
   eob s = a(epq.q::new, "NeStart");
   eob t = a(eqc.a::new, "SHCC");
   eob u = a(eqc.b::new, "SHFC");
   eob v = a(eqc.c::new, "SH5C");
   eob w = a(eqc.d::new, "SHLT");
   eob x = a(eqc.e::new, "SHLi");
   eob y = a(eqc.g::new, "SHPR");
   eob z = a(eqc.h::new, "SHPH");
   eob A = a(eqc.i::new, "SHRT");
   eob B = a(eqc.j::new, "SHRC");
   eob C = a(eqc.l::new, "SHSD");
   eob D = a(eqc.m::new, "SHStart");
   eob E = a(eqc.n::new, "SHS");
   eob F = a(eqc.o::new, "SHSSD");
   eob G = a(epm::new, "TeJP");
   eob H = a(epw.a::a, "ORP");
   eob I = a(epj.a::new, "Iglu");
   eob J = a(epy::new, "RUPO");
   eob K = a(eqe::new, "TeSH");
   eob L = a(epf::new, "TeDP");
   eob M = a(epu.h::new, "OMB");
   eob N = a(epu.j::new, "OMCR");
   eob O = a(epu.k::new, "OMDXR");
   eob P = a(epu.l::new, "OMDXYR");
   eob Q = a(epu.m::new, "OMDYR");
   eob R = a(epu.n::new, "OMDYZR");
   eob S = a(epu.o::new, "OMDZR");
   eob T = a(epu.p::new, "OMEntry");
   eob U = a(epu.q::new, "OMPenthouse");
   eob V = a(epu.s::new, "OMSimple");
   eob W = a(epu.t::new, "OMSimpleT");
   eob X = a(epu.u::new, "OMWR");
   eob Y = a(eph.a::new, "ECP");
   eob Z = a(eqg.i::new, "WMP");
   eob aa = a(epd.a::new, "BTP");
   eob ab = a(eqa.a::new, "Shipwreck");
   eob ac = a(eps.a::new, "NeFos");
   eob ad = a(eng::new, "jigsaw");

   eno load(eoa var1, tq var2);

   private static eob a(eob $$0, String $$1) {
      return ke.a(mb.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eob a(eob.a $$0, String $$1) {
      return a((eob)$$0, $$1);
   }

   private static eob a(eob.b $$0, String $$1) {
      return a((eob)$$0, $$1);
   }

   public interface a extends eob {
      eno load(tq var1);

      @Override
      default eno load(eoa $$0, tq $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eob {
      eno load(ern var1, tq var2);

      @Override
      default eno load(eoa $$0, tq $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
