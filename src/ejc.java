import java.util.Locale;

public interface ejc {
   ejc a = a(eko.a::new, "MSCorridor");
   ejc b = a(eko.b::new, "MSCrossing");
   ejc c = a(eko.d::new, "MSRoom");
   ejc d = a(eko.e::new, "MSStairs");
   ejc e = a(ekq.a::new, "NeBCr");
   ejc f = a(ekq.b::new, "NeBEF");
   ejc g = a(ekq.c::new, "NeBS");
   ejc h = a(ekq.d::new, "NeCCS");
   ejc i = a(ekq.e::new, "NeCTB");
   ejc j = a(ekq.f::new, "NeCE");
   ejc k = a(ekq.g::new, "NeSCSC");
   ejc l = a(ekq.h::new, "NeSCLT");
   ejc m = a(ekq.i::new, "NeSC");
   ejc n = a(ekq.j::new, "NeSCRT");
   ejc o = a(ekq.k::new, "NeCSR");
   ejc p = a(ekq.l::new, "NeMT");
   ejc q = a(ekq.o::new, "NeRC");
   ejc r = a(ekq.p::new, "NeSR");
   ejc s = a(ekq.q::new, "NeStart");
   ejc t = a(elc.a::new, "SHCC");
   ejc u = a(elc.b::new, "SHFC");
   ejc v = a(elc.c::new, "SH5C");
   ejc w = a(elc.d::new, "SHLT");
   ejc x = a(elc.e::new, "SHLi");
   ejc y = a(elc.g::new, "SHPR");
   ejc z = a(elc.h::new, "SHPH");
   ejc A = a(elc.i::new, "SHRT");
   ejc B = a(elc.j::new, "SHRC");
   ejc C = a(elc.l::new, "SHSD");
   ejc D = a(elc.m::new, "SHStart");
   ejc E = a(elc.n::new, "SHS");
   ejc F = a(elc.o::new, "SHSSD");
   ejc G = a(ekm::new, "TeJP");
   ejc H = a(ekw.a::a, "ORP");
   ejc I = a(ekj.a::new, "Iglu");
   ejc J = a(eky::new, "RUPO");
   ejc K = a(ele::new, "TeSH");
   ejc L = a(ekf::new, "TeDP");
   ejc M = a(eku.h::new, "OMB");
   ejc N = a(eku.j::new, "OMCR");
   ejc O = a(eku.k::new, "OMDXR");
   ejc P = a(eku.l::new, "OMDXYR");
   ejc Q = a(eku.m::new, "OMDYR");
   ejc R = a(eku.n::new, "OMDYZR");
   ejc S = a(eku.o::new, "OMDZR");
   ejc T = a(eku.p::new, "OMEntry");
   ejc U = a(eku.q::new, "OMPenthouse");
   ejc V = a(eku.s::new, "OMSimple");
   ejc W = a(eku.t::new, "OMSimpleT");
   ejc X = a(eku.u::new, "OMWR");
   ejc Y = a(ekh.a::new, "ECP");
   ejc Z = a(elg.i::new, "WMP");
   ejc aa = a(ekd.a::new, "BTP");
   ejc ab = a(ela.a::new, "Shipwreck");
   ejc ac = a(eks.a::new, "NeFos");
   ejc ad = a(eih::new, "jigsaw");

   eip load(ejb var1, us var2);

   private static ejc a(ejc $$0, String $$1) {
      return jv.a(lp.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ejc a(ejc.a $$0, String $$1) {
      return a((ejc)$$0, $$1);
   }

   private static ejc a(ejc.b $$0, String $$1) {
      return a((ejc)$$0, $$1);
   }

   public interface a extends ejc {
      eip load(us var1);

      @Override
      default eip load(ejb $$0, us $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ejc {
      eip load(emm var1, us var2);

      @Override
      default eip load(ejb $$0, us $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
