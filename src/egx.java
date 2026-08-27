import java.util.Locale;

public interface egx {
   egx a = a(eij.a::new, "MSCorridor");
   egx b = a(eij.b::new, "MSCrossing");
   egx c = a(eij.d::new, "MSRoom");
   egx d = a(eij.e::new, "MSStairs");
   egx e = a(eil.a::new, "NeBCr");
   egx f = a(eil.b::new, "NeBEF");
   egx g = a(eil.c::new, "NeBS");
   egx h = a(eil.d::new, "NeCCS");
   egx i = a(eil.e::new, "NeCTB");
   egx j = a(eil.f::new, "NeCE");
   egx k = a(eil.g::new, "NeSCSC");
   egx l = a(eil.h::new, "NeSCLT");
   egx m = a(eil.i::new, "NeSC");
   egx n = a(eil.j::new, "NeSCRT");
   egx o = a(eil.k::new, "NeCSR");
   egx p = a(eil.l::new, "NeMT");
   egx q = a(eil.o::new, "NeRC");
   egx r = a(eil.p::new, "NeSR");
   egx s = a(eil.q::new, "NeStart");
   egx t = a(eix.a::new, "SHCC");
   egx u = a(eix.b::new, "SHFC");
   egx v = a(eix.c::new, "SH5C");
   egx w = a(eix.d::new, "SHLT");
   egx x = a(eix.e::new, "SHLi");
   egx y = a(eix.g::new, "SHPR");
   egx z = a(eix.h::new, "SHPH");
   egx A = a(eix.i::new, "SHRT");
   egx B = a(eix.j::new, "SHRC");
   egx C = a(eix.l::new, "SHSD");
   egx D = a(eix.m::new, "SHStart");
   egx E = a(eix.n::new, "SHS");
   egx F = a(eix.o::new, "SHSSD");
   egx G = a(eih::new, "TeJP");
   egx H = a(eir.a::a, "ORP");
   egx I = a(eie.a::new, "Iglu");
   egx J = a(eit::new, "RUPO");
   egx K = a(eiz::new, "TeSH");
   egx L = a(eia::new, "TeDP");
   egx M = a(eip.h::new, "OMB");
   egx N = a(eip.j::new, "OMCR");
   egx O = a(eip.k::new, "OMDXR");
   egx P = a(eip.l::new, "OMDXYR");
   egx Q = a(eip.m::new, "OMDYR");
   egx R = a(eip.n::new, "OMDYZR");
   egx S = a(eip.o::new, "OMDZR");
   egx T = a(eip.p::new, "OMEntry");
   egx U = a(eip.q::new, "OMPenthouse");
   egx V = a(eip.s::new, "OMSimple");
   egx W = a(eip.t::new, "OMSimpleT");
   egx X = a(eip.u::new, "OMWR");
   egx Y = a(eic.a::new, "ECP");
   egx Z = a(ejb.i::new, "WMP");
   egx aa = a(ehy.a::new, "BTP");
   egx ab = a(eiv.a::new, "Shipwreck");
   egx ac = a(ein.a::new, "NeFos");
   egx ad = a(egc::new, "jigsaw");

   egk load(egw var1, ty var2);

   private static egx a(egx $$0, String $$1) {
      return ji.a(lc.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static egx a(egx.a $$0, String $$1) {
      return a((egx)$$0, $$1);
   }

   private static egx a(egx.b $$0, String $$1) {
      return a((egx)$$0, $$1);
   }

   public interface a extends egx {
      egk load(ty var1);

      @Override
      default egk load(egw $$0, ty $$1) {
         return this.load($$1);
      }
   }

   public interface b extends egx {
      egk load(ekh var1, ty var2);

      @Override
      default egk load(egw $$0, ty $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
