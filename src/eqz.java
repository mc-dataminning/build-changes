import java.util.Locale;

public interface eqz {
   eqz a = a(esm.a::new, "MSCorridor");
   eqz b = a(esm.b::new, "MSCrossing");
   eqz c = a(esm.d::new, "MSRoom");
   eqz d = a(esm.e::new, "MSStairs");
   eqz e = a(eso.a::new, "NeBCr");
   eqz f = a(eso.b::new, "NeBEF");
   eqz g = a(eso.c::new, "NeBS");
   eqz h = a(eso.d::new, "NeCCS");
   eqz i = a(eso.e::new, "NeCTB");
   eqz j = a(eso.f::new, "NeCE");
   eqz k = a(eso.g::new, "NeSCSC");
   eqz l = a(eso.h::new, "NeSCLT");
   eqz m = a(eso.i::new, "NeSC");
   eqz n = a(eso.j::new, "NeSCRT");
   eqz o = a(eso.k::new, "NeCSR");
   eqz p = a(eso.l::new, "NeMT");
   eqz q = a(eso.o::new, "NeRC");
   eqz r = a(eso.p::new, "NeSR");
   eqz s = a(eso.q::new, "NeStart");
   eqz t = a(eta.a::new, "SHCC");
   eqz u = a(eta.b::new, "SHFC");
   eqz v = a(eta.c::new, "SH5C");
   eqz w = a(eta.d::new, "SHLT");
   eqz x = a(eta.e::new, "SHLi");
   eqz y = a(eta.g::new, "SHPR");
   eqz z = a(eta.h::new, "SHPH");
   eqz A = a(eta.i::new, "SHRT");
   eqz B = a(eta.j::new, "SHRC");
   eqz C = a(eta.l::new, "SHSD");
   eqz D = a(eta.m::new, "SHStart");
   eqz E = a(eta.n::new, "SHS");
   eqz F = a(eta.o::new, "SHSSD");
   eqz G = a(esk::new, "TeJP");
   eqz H = a(esu.a::a, "ORP");
   eqz I = a(esh.a::new, "Iglu");
   eqz J = a(esw::new, "RUPO");
   eqz K = a(etc::new, "TeSH");
   eqz L = a(esd::new, "TeDP");
   eqz M = a(ess.h::new, "OMB");
   eqz N = a(ess.j::new, "OMCR");
   eqz O = a(ess.k::new, "OMDXR");
   eqz P = a(ess.l::new, "OMDXYR");
   eqz Q = a(ess.m::new, "OMDYR");
   eqz R = a(ess.n::new, "OMDYZR");
   eqz S = a(ess.o::new, "OMDZR");
   eqz T = a(ess.p::new, "OMEntry");
   eqz U = a(ess.q::new, "OMPenthouse");
   eqz V = a(ess.s::new, "OMSimple");
   eqz W = a(ess.t::new, "OMSimpleT");
   eqz X = a(ess.u::new, "OMWR");
   eqz Y = a(esf.a::new, "ECP");
   eqz Z = a(ete.i::new, "WMP");
   eqz aa = a(esb.a::new, "BTP");
   eqz ab = a(esy.a::new, "Shipwreck");
   eqz ac = a(esq.a::new, "NeFos");
   eqz ad = a(eqe::new, "jigsaw");

   eqm load(eqy var1, tx var2);

   private static eqz a(eqz $$0, String $$1) {
      return jr.a(mf.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eqz a(eqz.a $$0, String $$1) {
      return a((eqz)$$0, $$1);
   }

   private static eqz a(eqz.b $$0, String $$1) {
      return a((eqz)$$0, $$1);
   }

   public interface a extends eqz {
      eqm load(tx var1);

      @Override
      default eqm load(eqy $$0, tx $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eqz {
      eqm load(eul var1, tx var2);

      @Override
      default eqm load(eqy $$0, tx $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
