import java.util.Locale;

public interface dvu {
   dvu a = a(dwz.a::new, "MSCorridor");
   dvu b = a(dwz.b::new, "MSCrossing");
   dvu c = a(dwz.d::new, "MSRoom");
   dvu d = a(dwz.e::new, "MSStairs");
   dvu e = a(dxb.a::new, "NeBCr");
   dvu f = a(dxb.b::new, "NeBEF");
   dvu g = a(dxb.c::new, "NeBS");
   dvu h = a(dxb.d::new, "NeCCS");
   dvu i = a(dxb.e::new, "NeCTB");
   dvu j = a(dxb.f::new, "NeCE");
   dvu k = a(dxb.g::new, "NeSCSC");
   dvu l = a(dxb.h::new, "NeSCLT");
   dvu m = a(dxb.i::new, "NeSC");
   dvu n = a(dxb.j::new, "NeSCRT");
   dvu o = a(dxb.k::new, "NeCSR");
   dvu p = a(dxb.l::new, "NeMT");
   dvu q = a(dxb.o::new, "NeRC");
   dvu r = a(dxb.p::new, "NeSR");
   dvu s = a(dxb.q::new, "NeStart");
   dvu t = a(dxn.a::new, "SHCC");
   dvu u = a(dxn.b::new, "SHFC");
   dvu v = a(dxn.c::new, "SH5C");
   dvu w = a(dxn.d::new, "SHLT");
   dvu x = a(dxn.e::new, "SHLi");
   dvu y = a(dxn.g::new, "SHPR");
   dvu z = a(dxn.h::new, "SHPH");
   dvu A = a(dxn.i::new, "SHRT");
   dvu B = a(dxn.j::new, "SHRC");
   dvu C = a(dxn.l::new, "SHSD");
   dvu D = a(dxn.m::new, "SHStart");
   dvu E = a(dxn.n::new, "SHS");
   dvu F = a(dxn.o::new, "SHSSD");
   dvu G = a(dwx::new, "TeJP");
   dvu H = a(dxh.a::a, "ORP");
   dvu I = a(dwu.a::new, "Iglu");
   dvu J = a(dxj::new, "RUPO");
   dvu K = a(dxp::new, "TeSH");
   dvu L = a(dwq::new, "TeDP");
   dvu M = a(dxf.h::new, "OMB");
   dvu N = a(dxf.j::new, "OMCR");
   dvu O = a(dxf.k::new, "OMDXR");
   dvu P = a(dxf.l::new, "OMDXYR");
   dvu Q = a(dxf.m::new, "OMDYR");
   dvu R = a(dxf.n::new, "OMDYZR");
   dvu S = a(dxf.o::new, "OMDZR");
   dvu T = a(dxf.p::new, "OMEntry");
   dvu U = a(dxf.q::new, "OMPenthouse");
   dvu V = a(dxf.s::new, "OMSimple");
   dvu W = a(dxf.t::new, "OMSimpleT");
   dvu X = a(dxf.u::new, "OMWR");
   dvu Y = a(dws.a::new, "ECP");
   dvu Z = a(dxr.i::new, "WMP");
   dvu aa = a(dwo.a::new, "BTP");
   dvu ab = a(dxl.a::new, "Shipwreck");
   dvu ac = a(dxd.a::new, "NeFos");
   dvu ad = a(duz::new, "jigsaw");

   dvh load(dvt var1, qu var2);

   private static dvu a(dvu $$0, String $$1) {
      return ht.a(jd.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dvu a(dvu.a $$0, String $$1) {
      return a((dvu)$$0, $$1);
   }

   private static dvu a(dvu.b $$0, String $$1) {
      return a((dvu)$$0, $$1);
   }

   public interface a extends dvu {
      dvh load(qu var1);

      @Override
      default dvh load(dvt $$0, qu $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dvu {
      dvh load(dyx var1, qu var2);

      @Override
      default dvh load(dvt $$0, qu $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
