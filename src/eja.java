import java.util.Locale;

public interface eja {
   eja a = a(ekm.a::new, "MSCorridor");
   eja b = a(ekm.b::new, "MSCrossing");
   eja c = a(ekm.d::new, "MSRoom");
   eja d = a(ekm.e::new, "MSStairs");
   eja e = a(eko.a::new, "NeBCr");
   eja f = a(eko.b::new, "NeBEF");
   eja g = a(eko.c::new, "NeBS");
   eja h = a(eko.d::new, "NeCCS");
   eja i = a(eko.e::new, "NeCTB");
   eja j = a(eko.f::new, "NeCE");
   eja k = a(eko.g::new, "NeSCSC");
   eja l = a(eko.h::new, "NeSCLT");
   eja m = a(eko.i::new, "NeSC");
   eja n = a(eko.j::new, "NeSCRT");
   eja o = a(eko.k::new, "NeCSR");
   eja p = a(eko.l::new, "NeMT");
   eja q = a(eko.o::new, "NeRC");
   eja r = a(eko.p::new, "NeSR");
   eja s = a(eko.q::new, "NeStart");
   eja t = a(ela.a::new, "SHCC");
   eja u = a(ela.b::new, "SHFC");
   eja v = a(ela.c::new, "SH5C");
   eja w = a(ela.d::new, "SHLT");
   eja x = a(ela.e::new, "SHLi");
   eja y = a(ela.g::new, "SHPR");
   eja z = a(ela.h::new, "SHPH");
   eja A = a(ela.i::new, "SHRT");
   eja B = a(ela.j::new, "SHRC");
   eja C = a(ela.l::new, "SHSD");
   eja D = a(ela.m::new, "SHStart");
   eja E = a(ela.n::new, "SHS");
   eja F = a(ela.o::new, "SHSSD");
   eja G = a(ekk::new, "TeJP");
   eja H = a(eku.a::a, "ORP");
   eja I = a(ekh.a::new, "Iglu");
   eja J = a(ekw::new, "RUPO");
   eja K = a(elc::new, "TeSH");
   eja L = a(ekd::new, "TeDP");
   eja M = a(eks.h::new, "OMB");
   eja N = a(eks.j::new, "OMCR");
   eja O = a(eks.k::new, "OMDXR");
   eja P = a(eks.l::new, "OMDXYR");
   eja Q = a(eks.m::new, "OMDYR");
   eja R = a(eks.n::new, "OMDYZR");
   eja S = a(eks.o::new, "OMDZR");
   eja T = a(eks.p::new, "OMEntry");
   eja U = a(eks.q::new, "OMPenthouse");
   eja V = a(eks.s::new, "OMSimple");
   eja W = a(eks.t::new, "OMSimpleT");
   eja X = a(eks.u::new, "OMWR");
   eja Y = a(ekf.a::new, "ECP");
   eja Z = a(ele.i::new, "WMP");
   eja aa = a(ekb.a::new, "BTP");
   eja ab = a(eky.a::new, "Shipwreck");
   eja ac = a(ekq.a::new, "NeFos");
   eja ad = a(eif::new, "jigsaw");

   ein load(eiz var1, ur var2);

   private static eja a(eja $$0, String $$1) {
      return jv.a(lp.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eja a(eja.a $$0, String $$1) {
      return a((eja)$$0, $$1);
   }

   private static eja a(eja.b $$0, String $$1) {
      return a((eja)$$0, $$1);
   }

   public interface a extends eja {
      ein load(ur var1);

      @Override
      default ein load(eiz $$0, ur $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eja {
      ein load(emk var1, ur var2);

      @Override
      default ein load(eiz $$0, ur $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
