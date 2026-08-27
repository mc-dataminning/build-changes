import java.util.Locale;

public interface dwr {
   dwr a = a(dxw.a::new, "MSCorridor");
   dwr b = a(dxw.b::new, "MSCrossing");
   dwr c = a(dxw.d::new, "MSRoom");
   dwr d = a(dxw.e::new, "MSStairs");
   dwr e = a(dxy.a::new, "NeBCr");
   dwr f = a(dxy.b::new, "NeBEF");
   dwr g = a(dxy.c::new, "NeBS");
   dwr h = a(dxy.d::new, "NeCCS");
   dwr i = a(dxy.e::new, "NeCTB");
   dwr j = a(dxy.f::new, "NeCE");
   dwr k = a(dxy.g::new, "NeSCSC");
   dwr l = a(dxy.h::new, "NeSCLT");
   dwr m = a(dxy.i::new, "NeSC");
   dwr n = a(dxy.j::new, "NeSCRT");
   dwr o = a(dxy.k::new, "NeCSR");
   dwr p = a(dxy.l::new, "NeMT");
   dwr q = a(dxy.o::new, "NeRC");
   dwr r = a(dxy.p::new, "NeSR");
   dwr s = a(dxy.q::new, "NeStart");
   dwr t = a(dyk.a::new, "SHCC");
   dwr u = a(dyk.b::new, "SHFC");
   dwr v = a(dyk.c::new, "SH5C");
   dwr w = a(dyk.d::new, "SHLT");
   dwr x = a(dyk.e::new, "SHLi");
   dwr y = a(dyk.g::new, "SHPR");
   dwr z = a(dyk.h::new, "SHPH");
   dwr A = a(dyk.i::new, "SHRT");
   dwr B = a(dyk.j::new, "SHRC");
   dwr C = a(dyk.l::new, "SHSD");
   dwr D = a(dyk.m::new, "SHStart");
   dwr E = a(dyk.n::new, "SHS");
   dwr F = a(dyk.o::new, "SHSSD");
   dwr G = a(dxu::new, "TeJP");
   dwr H = a(dye.a::a, "ORP");
   dwr I = a(dxr.a::new, "Iglu");
   dwr J = a(dyg::new, "RUPO");
   dwr K = a(dym::new, "TeSH");
   dwr L = a(dxn::new, "TeDP");
   dwr M = a(dyc.h::new, "OMB");
   dwr N = a(dyc.j::new, "OMCR");
   dwr O = a(dyc.k::new, "OMDXR");
   dwr P = a(dyc.l::new, "OMDXYR");
   dwr Q = a(dyc.m::new, "OMDYR");
   dwr R = a(dyc.n::new, "OMDYZR");
   dwr S = a(dyc.o::new, "OMDZR");
   dwr T = a(dyc.p::new, "OMEntry");
   dwr U = a(dyc.q::new, "OMPenthouse");
   dwr V = a(dyc.s::new, "OMSimple");
   dwr W = a(dyc.t::new, "OMSimpleT");
   dwr X = a(dyc.u::new, "OMWR");
   dwr Y = a(dxp.a::new, "ECP");
   dwr Z = a(dyo.i::new, "WMP");
   dwr aa = a(dxl.a::new, "BTP");
   dwr ab = a(dyi.a::new, "Shipwreck");
   dwr ac = a(dya.a::new, "NeFos");
   dwr ad = a(dvw::new, "jigsaw");

   dwe load(dwq var1, rt var2);

   private static dwr a(dwr $$0, String $$1) {
      return io.a(jy.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dwr a(dwr.a $$0, String $$1) {
      return a((dwr)$$0, $$1);
   }

   private static dwr a(dwr.b $$0, String $$1) {
      return a((dwr)$$0, $$1);
   }

   public interface a extends dwr {
      dwe load(rt var1);

      @Override
      default dwe load(dwq $$0, rt $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dwr {
      dwe load(dzu var1, rt var2);

      @Override
      default dwe load(dwq $$0, rt $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
