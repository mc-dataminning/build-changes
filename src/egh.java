import java.util.Locale;

public interface egh {
   egh a = a(eht.a::new, "MSCorridor");
   egh b = a(eht.b::new, "MSCrossing");
   egh c = a(eht.d::new, "MSRoom");
   egh d = a(eht.e::new, "MSStairs");
   egh e = a(ehv.a::new, "NeBCr");
   egh f = a(ehv.b::new, "NeBEF");
   egh g = a(ehv.c::new, "NeBS");
   egh h = a(ehv.d::new, "NeCCS");
   egh i = a(ehv.e::new, "NeCTB");
   egh j = a(ehv.f::new, "NeCE");
   egh k = a(ehv.g::new, "NeSCSC");
   egh l = a(ehv.h::new, "NeSCLT");
   egh m = a(ehv.i::new, "NeSC");
   egh n = a(ehv.j::new, "NeSCRT");
   egh o = a(ehv.k::new, "NeCSR");
   egh p = a(ehv.l::new, "NeMT");
   egh q = a(ehv.o::new, "NeRC");
   egh r = a(ehv.p::new, "NeSR");
   egh s = a(ehv.q::new, "NeStart");
   egh t = a(eih.a::new, "SHCC");
   egh u = a(eih.b::new, "SHFC");
   egh v = a(eih.c::new, "SH5C");
   egh w = a(eih.d::new, "SHLT");
   egh x = a(eih.e::new, "SHLi");
   egh y = a(eih.g::new, "SHPR");
   egh z = a(eih.h::new, "SHPH");
   egh A = a(eih.i::new, "SHRT");
   egh B = a(eih.j::new, "SHRC");
   egh C = a(eih.l::new, "SHSD");
   egh D = a(eih.m::new, "SHStart");
   egh E = a(eih.n::new, "SHS");
   egh F = a(eih.o::new, "SHSSD");
   egh G = a(ehr::new, "TeJP");
   egh H = a(eib.a::a, "ORP");
   egh I = a(eho.a::new, "Iglu");
   egh J = a(eid::new, "RUPO");
   egh K = a(eij::new, "TeSH");
   egh L = a(ehk::new, "TeDP");
   egh M = a(ehz.h::new, "OMB");
   egh N = a(ehz.j::new, "OMCR");
   egh O = a(ehz.k::new, "OMDXR");
   egh P = a(ehz.l::new, "OMDXYR");
   egh Q = a(ehz.m::new, "OMDYR");
   egh R = a(ehz.n::new, "OMDYZR");
   egh S = a(ehz.o::new, "OMDZR");
   egh T = a(ehz.p::new, "OMEntry");
   egh U = a(ehz.q::new, "OMPenthouse");
   egh V = a(ehz.s::new, "OMSimple");
   egh W = a(ehz.t::new, "OMSimpleT");
   egh X = a(ehz.u::new, "OMWR");
   egh Y = a(ehm.a::new, "ECP");
   egh Z = a(eil.i::new, "WMP");
   egh aa = a(ehi.a::new, "BTP");
   egh ab = a(eif.a::new, "Shipwreck");
   egh ac = a(ehx.a::new, "NeFos");
   egh ad = a(efm::new, "jigsaw");

   efu load(egg var1, to var2);

   private static egh a(egh $$0, String $$1) {
      return ja.a(kt.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static egh a(egh.a $$0, String $$1) {
      return a((egh)$$0, $$1);
   }

   private static egh a(egh.b $$0, String $$1) {
      return a((egh)$$0, $$1);
   }

   public interface a extends egh {
      efu load(to var1);

      @Override
      default efu load(egg $$0, to $$1) {
         return this.load($$1);
      }
   }

   public interface b extends egh {
      efu load(ejr var1, to var2);

      @Override
      default efu load(egg $$0, to $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
