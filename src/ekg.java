import java.util.Locale;

public interface ekg {
   ekg a = a(elt.a::new, "MSCorridor");
   ekg b = a(elt.b::new, "MSCrossing");
   ekg c = a(elt.d::new, "MSRoom");
   ekg d = a(elt.e::new, "MSStairs");
   ekg e = a(elv.a::new, "NeBCr");
   ekg f = a(elv.b::new, "NeBEF");
   ekg g = a(elv.c::new, "NeBS");
   ekg h = a(elv.d::new, "NeCCS");
   ekg i = a(elv.e::new, "NeCTB");
   ekg j = a(elv.f::new, "NeCE");
   ekg k = a(elv.g::new, "NeSCSC");
   ekg l = a(elv.h::new, "NeSCLT");
   ekg m = a(elv.i::new, "NeSC");
   ekg n = a(elv.j::new, "NeSCRT");
   ekg o = a(elv.k::new, "NeCSR");
   ekg p = a(elv.l::new, "NeMT");
   ekg q = a(elv.o::new, "NeRC");
   ekg r = a(elv.p::new, "NeSR");
   ekg s = a(elv.q::new, "NeStart");
   ekg t = a(emh.a::new, "SHCC");
   ekg u = a(emh.b::new, "SHFC");
   ekg v = a(emh.c::new, "SH5C");
   ekg w = a(emh.d::new, "SHLT");
   ekg x = a(emh.e::new, "SHLi");
   ekg y = a(emh.g::new, "SHPR");
   ekg z = a(emh.h::new, "SHPH");
   ekg A = a(emh.i::new, "SHRT");
   ekg B = a(emh.j::new, "SHRC");
   ekg C = a(emh.l::new, "SHSD");
   ekg D = a(emh.m::new, "SHStart");
   ekg E = a(emh.n::new, "SHS");
   ekg F = a(emh.o::new, "SHSSD");
   ekg G = a(elr::new, "TeJP");
   ekg H = a(emb.a::a, "ORP");
   ekg I = a(elo.a::new, "Iglu");
   ekg J = a(emd::new, "RUPO");
   ekg K = a(emj::new, "TeSH");
   ekg L = a(elk::new, "TeDP");
   ekg M = a(elz.h::new, "OMB");
   ekg N = a(elz.j::new, "OMCR");
   ekg O = a(elz.k::new, "OMDXR");
   ekg P = a(elz.l::new, "OMDXYR");
   ekg Q = a(elz.m::new, "OMDYR");
   ekg R = a(elz.n::new, "OMDYZR");
   ekg S = a(elz.o::new, "OMDZR");
   ekg T = a(elz.p::new, "OMEntry");
   ekg U = a(elz.q::new, "OMPenthouse");
   ekg V = a(elz.s::new, "OMSimple");
   ekg W = a(elz.t::new, "OMSimpleT");
   ekg X = a(elz.u::new, "OMWR");
   ekg Y = a(elm.a::new, "ECP");
   ekg Z = a(eml.i::new, "WMP");
   ekg aa = a(eli.a::new, "BTP");
   ekg ab = a(emf.a::new, "Shipwreck");
   ekg ac = a(elx.a::new, "NeFos");
   ekg ad = a(ejl::new, "jigsaw");

   ejt load(ekf var1, ub var2);

   private static ekg a(ekg $$0, String $$1) {
      return jz.a(lt.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ekg a(ekg.a $$0, String $$1) {
      return a((ekg)$$0, $$1);
   }

   private static ekg a(ekg.b $$0, String $$1) {
      return a((ekg)$$0, $$1);
   }

   public interface a extends ekg {
      ejt load(ub var1);

      @Override
      default ejt load(ekf $$0, ub $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ekg {
      ejt load(ens var1, ub var2);

      @Override
      default ejt load(ekf $$0, ub $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
