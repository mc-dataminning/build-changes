import java.util.Locale;

public interface ebv {
   ebv a = a(edh.a::new, "MSCorridor");
   ebv b = a(edh.b::new, "MSCrossing");
   ebv c = a(edh.d::new, "MSRoom");
   ebv d = a(edh.e::new, "MSStairs");
   ebv e = a(edj.a::new, "NeBCr");
   ebv f = a(edj.b::new, "NeBEF");
   ebv g = a(edj.c::new, "NeBS");
   ebv h = a(edj.d::new, "NeCCS");
   ebv i = a(edj.e::new, "NeCTB");
   ebv j = a(edj.f::new, "NeCE");
   ebv k = a(edj.g::new, "NeSCSC");
   ebv l = a(edj.h::new, "NeSCLT");
   ebv m = a(edj.i::new, "NeSC");
   ebv n = a(edj.j::new, "NeSCRT");
   ebv o = a(edj.k::new, "NeCSR");
   ebv p = a(edj.l::new, "NeMT");
   ebv q = a(edj.o::new, "NeRC");
   ebv r = a(edj.p::new, "NeSR");
   ebv s = a(edj.q::new, "NeStart");
   ebv t = a(edv.a::new, "SHCC");
   ebv u = a(edv.b::new, "SHFC");
   ebv v = a(edv.c::new, "SH5C");
   ebv w = a(edv.d::new, "SHLT");
   ebv x = a(edv.e::new, "SHLi");
   ebv y = a(edv.g::new, "SHPR");
   ebv z = a(edv.h::new, "SHPH");
   ebv A = a(edv.i::new, "SHRT");
   ebv B = a(edv.j::new, "SHRC");
   ebv C = a(edv.l::new, "SHSD");
   ebv D = a(edv.m::new, "SHStart");
   ebv E = a(edv.n::new, "SHS");
   ebv F = a(edv.o::new, "SHSSD");
   ebv G = a(edf::new, "TeJP");
   ebv H = a(edp.a::a, "ORP");
   ebv I = a(edc.a::new, "Iglu");
   ebv J = a(edr::new, "RUPO");
   ebv K = a(edx::new, "TeSH");
   ebv L = a(ecy::new, "TeDP");
   ebv M = a(edn.h::new, "OMB");
   ebv N = a(edn.j::new, "OMCR");
   ebv O = a(edn.k::new, "OMDXR");
   ebv P = a(edn.l::new, "OMDXYR");
   ebv Q = a(edn.m::new, "OMDYR");
   ebv R = a(edn.n::new, "OMDYZR");
   ebv S = a(edn.o::new, "OMDZR");
   ebv T = a(edn.p::new, "OMEntry");
   ebv U = a(edn.q::new, "OMPenthouse");
   ebv V = a(edn.s::new, "OMSimple");
   ebv W = a(edn.t::new, "OMSimpleT");
   ebv X = a(edn.u::new, "OMWR");
   ebv Y = a(eda.a::new, "ECP");
   ebv Z = a(edz.i::new, "WMP");
   ebv aa = a(ecw.a::new, "BTP");
   ebv ab = a(edt.a::new, "Shipwreck");
   ebv ac = a(edl.a::new, "NeFos");
   ebv ad = a(eba::new, "jigsaw");

   ebi load(ebu var1, sw var2);

   private static ebv a(ebv $$0, String $$1) {
      return iv.a(kf.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ebv a(ebv.a $$0, String $$1) {
      return a((ebv)$$0, $$1);
   }

   private static ebv a(ebv.b $$0, String $$1) {
      return a((ebv)$$0, $$1);
   }

   public interface a extends ebv {
      ebi load(sw var1);

      @Override
      default ebi load(ebu $$0, sw $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ebv {
      ebi load(eff var1, sw var2);

      @Override
      default ebi load(ebu $$0, sw $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
