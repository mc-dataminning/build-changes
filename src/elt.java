import java.util.Locale;

public interface elt {
   elt a = a(eng.a::new, "MSCorridor");
   elt b = a(eng.b::new, "MSCrossing");
   elt c = a(eng.d::new, "MSRoom");
   elt d = a(eng.e::new, "MSStairs");
   elt e = a(eni.a::new, "NeBCr");
   elt f = a(eni.b::new, "NeBEF");
   elt g = a(eni.c::new, "NeBS");
   elt h = a(eni.d::new, "NeCCS");
   elt i = a(eni.e::new, "NeCTB");
   elt j = a(eni.f::new, "NeCE");
   elt k = a(eni.g::new, "NeSCSC");
   elt l = a(eni.h::new, "NeSCLT");
   elt m = a(eni.i::new, "NeSC");
   elt n = a(eni.j::new, "NeSCRT");
   elt o = a(eni.k::new, "NeCSR");
   elt p = a(eni.l::new, "NeMT");
   elt q = a(eni.o::new, "NeRC");
   elt r = a(eni.p::new, "NeSR");
   elt s = a(eni.q::new, "NeStart");
   elt t = a(enu.a::new, "SHCC");
   elt u = a(enu.b::new, "SHFC");
   elt v = a(enu.c::new, "SH5C");
   elt w = a(enu.d::new, "SHLT");
   elt x = a(enu.e::new, "SHLi");
   elt y = a(enu.g::new, "SHPR");
   elt z = a(enu.h::new, "SHPH");
   elt A = a(enu.i::new, "SHRT");
   elt B = a(enu.j::new, "SHRC");
   elt C = a(enu.l::new, "SHSD");
   elt D = a(enu.m::new, "SHStart");
   elt E = a(enu.n::new, "SHS");
   elt F = a(enu.o::new, "SHSSD");
   elt G = a(ene::new, "TeJP");
   elt H = a(eno.a::a, "ORP");
   elt I = a(enb.a::new, "Iglu");
   elt J = a(enq::new, "RUPO");
   elt K = a(enw::new, "TeSH");
   elt L = a(emx::new, "TeDP");
   elt M = a(enm.h::new, "OMB");
   elt N = a(enm.j::new, "OMCR");
   elt O = a(enm.k::new, "OMDXR");
   elt P = a(enm.l::new, "OMDXYR");
   elt Q = a(enm.m::new, "OMDYR");
   elt R = a(enm.n::new, "OMDYZR");
   elt S = a(enm.o::new, "OMDZR");
   elt T = a(enm.p::new, "OMEntry");
   elt U = a(enm.q::new, "OMPenthouse");
   elt V = a(enm.s::new, "OMSimple");
   elt W = a(enm.t::new, "OMSimpleT");
   elt X = a(enm.u::new, "OMWR");
   elt Y = a(emz.a::new, "ECP");
   elt Z = a(eny.i::new, "WMP");
   elt aa = a(emv.a::new, "BTP");
   elt ab = a(ens.a::new, "Shipwreck");
   elt ac = a(enk.a::new, "NeFos");
   elt ad = a(eky::new, "jigsaw");

   elg load(els var1, uf var2);

   private static elt a(elt $$0, String $$1) {
      return ka.a(lu.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static elt a(elt.a $$0, String $$1) {
      return a((elt)$$0, $$1);
   }

   private static elt a(elt.b $$0, String $$1) {
      return a((elt)$$0, $$1);
   }

   public interface a extends elt {
      elg load(uf var1);

      @Override
      default elg load(els $$0, uf $$1) {
         return this.load($$1);
      }
   }

   public interface b extends elt {
      elg load(epf var1, uf var2);

      @Override
      default elg load(els $$0, uf $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
