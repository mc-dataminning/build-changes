import java.util.Locale;

public interface ecc {
   ecc a = a(edo.a::new, "MSCorridor");
   ecc b = a(edo.b::new, "MSCrossing");
   ecc c = a(edo.d::new, "MSRoom");
   ecc d = a(edo.e::new, "MSStairs");
   ecc e = a(edq.a::new, "NeBCr");
   ecc f = a(edq.b::new, "NeBEF");
   ecc g = a(edq.c::new, "NeBS");
   ecc h = a(edq.d::new, "NeCCS");
   ecc i = a(edq.e::new, "NeCTB");
   ecc j = a(edq.f::new, "NeCE");
   ecc k = a(edq.g::new, "NeSCSC");
   ecc l = a(edq.h::new, "NeSCLT");
   ecc m = a(edq.i::new, "NeSC");
   ecc n = a(edq.j::new, "NeSCRT");
   ecc o = a(edq.k::new, "NeCSR");
   ecc p = a(edq.l::new, "NeMT");
   ecc q = a(edq.o::new, "NeRC");
   ecc r = a(edq.p::new, "NeSR");
   ecc s = a(edq.q::new, "NeStart");
   ecc t = a(eec.a::new, "SHCC");
   ecc u = a(eec.b::new, "SHFC");
   ecc v = a(eec.c::new, "SH5C");
   ecc w = a(eec.d::new, "SHLT");
   ecc x = a(eec.e::new, "SHLi");
   ecc y = a(eec.g::new, "SHPR");
   ecc z = a(eec.h::new, "SHPH");
   ecc A = a(eec.i::new, "SHRT");
   ecc B = a(eec.j::new, "SHRC");
   ecc C = a(eec.l::new, "SHSD");
   ecc D = a(eec.m::new, "SHStart");
   ecc E = a(eec.n::new, "SHS");
   ecc F = a(eec.o::new, "SHSSD");
   ecc G = a(edm::new, "TeJP");
   ecc H = a(edw.a::a, "ORP");
   ecc I = a(edj.a::new, "Iglu");
   ecc J = a(edy::new, "RUPO");
   ecc K = a(eee::new, "TeSH");
   ecc L = a(edf::new, "TeDP");
   ecc M = a(edu.h::new, "OMB");
   ecc N = a(edu.j::new, "OMCR");
   ecc O = a(edu.k::new, "OMDXR");
   ecc P = a(edu.l::new, "OMDXYR");
   ecc Q = a(edu.m::new, "OMDYR");
   ecc R = a(edu.n::new, "OMDYZR");
   ecc S = a(edu.o::new, "OMDZR");
   ecc T = a(edu.p::new, "OMEntry");
   ecc U = a(edu.q::new, "OMPenthouse");
   ecc V = a(edu.s::new, "OMSimple");
   ecc W = a(edu.t::new, "OMSimpleT");
   ecc X = a(edu.u::new, "OMWR");
   ecc Y = a(edh.a::new, "ECP");
   ecc Z = a(eeg.i::new, "WMP");
   ecc aa = a(edd.a::new, "BTP");
   ecc ab = a(eea.a::new, "Shipwreck");
   ecc ac = a(eds.a::new, "NeFos");
   ecc ad = a(ebh::new, "jigsaw");

   ebp load(ecb var1, sw var2);

   private static ecc a(ecc $$0, String $$1) {
      return iv.a(kf.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ecc a(ecc.a $$0, String $$1) {
      return a((ecc)$$0, $$1);
   }

   private static ecc a(ecc.b $$0, String $$1) {
      return a((ecc)$$0, $$1);
   }

   public interface a extends ecc {
      ebp load(sw var1);

      @Override
      default ebp load(ecb $$0, sw $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ecc {
      ebp load(efm var1, sw var2);

      @Override
      default ebp load(ecb $$0, sw $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
