import java.util.Locale;

public interface efy {
   efy a = a(ehk.a::new, "MSCorridor");
   efy b = a(ehk.b::new, "MSCrossing");
   efy c = a(ehk.d::new, "MSRoom");
   efy d = a(ehk.e::new, "MSStairs");
   efy e = a(ehm.a::new, "NeBCr");
   efy f = a(ehm.b::new, "NeBEF");
   efy g = a(ehm.c::new, "NeBS");
   efy h = a(ehm.d::new, "NeCCS");
   efy i = a(ehm.e::new, "NeCTB");
   efy j = a(ehm.f::new, "NeCE");
   efy k = a(ehm.g::new, "NeSCSC");
   efy l = a(ehm.h::new, "NeSCLT");
   efy m = a(ehm.i::new, "NeSC");
   efy n = a(ehm.j::new, "NeSCRT");
   efy o = a(ehm.k::new, "NeCSR");
   efy p = a(ehm.l::new, "NeMT");
   efy q = a(ehm.o::new, "NeRC");
   efy r = a(ehm.p::new, "NeSR");
   efy s = a(ehm.q::new, "NeStart");
   efy t = a(ehy.a::new, "SHCC");
   efy u = a(ehy.b::new, "SHFC");
   efy v = a(ehy.c::new, "SH5C");
   efy w = a(ehy.d::new, "SHLT");
   efy x = a(ehy.e::new, "SHLi");
   efy y = a(ehy.g::new, "SHPR");
   efy z = a(ehy.h::new, "SHPH");
   efy A = a(ehy.i::new, "SHRT");
   efy B = a(ehy.j::new, "SHRC");
   efy C = a(ehy.l::new, "SHSD");
   efy D = a(ehy.m::new, "SHStart");
   efy E = a(ehy.n::new, "SHS");
   efy F = a(ehy.o::new, "SHSSD");
   efy G = a(ehi::new, "TeJP");
   efy H = a(ehs.a::a, "ORP");
   efy I = a(ehf.a::new, "Iglu");
   efy J = a(ehu::new, "RUPO");
   efy K = a(eia::new, "TeSH");
   efy L = a(ehb::new, "TeDP");
   efy M = a(ehq.h::new, "OMB");
   efy N = a(ehq.j::new, "OMCR");
   efy O = a(ehq.k::new, "OMDXR");
   efy P = a(ehq.l::new, "OMDXYR");
   efy Q = a(ehq.m::new, "OMDYR");
   efy R = a(ehq.n::new, "OMDYZR");
   efy S = a(ehq.o::new, "OMDZR");
   efy T = a(ehq.p::new, "OMEntry");
   efy U = a(ehq.q::new, "OMPenthouse");
   efy V = a(ehq.s::new, "OMSimple");
   efy W = a(ehq.t::new, "OMSimpleT");
   efy X = a(ehq.u::new, "OMWR");
   efy Y = a(ehd.a::new, "ECP");
   efy Z = a(eic.i::new, "WMP");
   efy aa = a(egz.a::new, "BTP");
   efy ab = a(ehw.a::new, "Shipwreck");
   efy ac = a(eho.a::new, "NeFos");
   efy ad = a(efd::new, "jigsaw");

   efl load(efx var1, tm var2);

   private static efy a(efy $$0, String $$1) {
      return iy.a(kr.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static efy a(efy.a $$0, String $$1) {
      return a((efy)$$0, $$1);
   }

   private static efy a(efy.b $$0, String $$1) {
      return a((efy)$$0, $$1);
   }

   public interface a extends efy {
      efl load(tm var1);

      @Override
      default efl load(efx $$0, tm $$1) {
         return this.load($$1);
      }
   }

   public interface b extends efy {
      efl load(eji var1, tm var2);

      @Override
      default efl load(efx $$0, tm $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
