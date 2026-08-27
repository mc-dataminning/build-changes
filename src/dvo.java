import java.util.Locale;

public interface dvo {
   dvo a = a(dwt.a::new, "MSCorridor");
   dvo b = a(dwt.b::new, "MSCrossing");
   dvo c = a(dwt.d::new, "MSRoom");
   dvo d = a(dwt.e::new, "MSStairs");
   dvo e = a(dwv.a::new, "NeBCr");
   dvo f = a(dwv.b::new, "NeBEF");
   dvo g = a(dwv.c::new, "NeBS");
   dvo h = a(dwv.d::new, "NeCCS");
   dvo i = a(dwv.e::new, "NeCTB");
   dvo j = a(dwv.f::new, "NeCE");
   dvo k = a(dwv.g::new, "NeSCSC");
   dvo l = a(dwv.h::new, "NeSCLT");
   dvo m = a(dwv.i::new, "NeSC");
   dvo n = a(dwv.j::new, "NeSCRT");
   dvo o = a(dwv.k::new, "NeCSR");
   dvo p = a(dwv.l::new, "NeMT");
   dvo q = a(dwv.o::new, "NeRC");
   dvo r = a(dwv.p::new, "NeSR");
   dvo s = a(dwv.q::new, "NeStart");
   dvo t = a(dxh.a::new, "SHCC");
   dvo u = a(dxh.b::new, "SHFC");
   dvo v = a(dxh.c::new, "SH5C");
   dvo w = a(dxh.d::new, "SHLT");
   dvo x = a(dxh.e::new, "SHLi");
   dvo y = a(dxh.g::new, "SHPR");
   dvo z = a(dxh.h::new, "SHPH");
   dvo A = a(dxh.i::new, "SHRT");
   dvo B = a(dxh.j::new, "SHRC");
   dvo C = a(dxh.l::new, "SHSD");
   dvo D = a(dxh.m::new, "SHStart");
   dvo E = a(dxh.n::new, "SHS");
   dvo F = a(dxh.o::new, "SHSSD");
   dvo G = a(dwr::new, "TeJP");
   dvo H = a(dxb.a::a, "ORP");
   dvo I = a(dwo.a::new, "Iglu");
   dvo J = a(dxd::new, "RUPO");
   dvo K = a(dxj::new, "TeSH");
   dvo L = a(dwk::new, "TeDP");
   dvo M = a(dwz.h::new, "OMB");
   dvo N = a(dwz.j::new, "OMCR");
   dvo O = a(dwz.k::new, "OMDXR");
   dvo P = a(dwz.l::new, "OMDXYR");
   dvo Q = a(dwz.m::new, "OMDYR");
   dvo R = a(dwz.n::new, "OMDYZR");
   dvo S = a(dwz.o::new, "OMDZR");
   dvo T = a(dwz.p::new, "OMEntry");
   dvo U = a(dwz.q::new, "OMPenthouse");
   dvo V = a(dwz.s::new, "OMSimple");
   dvo W = a(dwz.t::new, "OMSimpleT");
   dvo X = a(dwz.u::new, "OMWR");
   dvo Y = a(dwm.a::new, "ECP");
   dvo Z = a(dxl.i::new, "WMP");
   dvo aa = a(dwi.a::new, "BTP");
   dvo ab = a(dxf.a::new, "Shipwreck");
   dvo ac = a(dwx.a::new, "NeFos");
   dvo ad = a(dut::new, "jigsaw");

   dvb load(dvn var1, qs var2);

   private static dvo a(dvo $$0, String $$1) {
      return hs.a(jc.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dvo a(dvo.a $$0, String $$1) {
      return a((dvo)$$0, $$1);
   }

   private static dvo a(dvo.b $$0, String $$1) {
      return a((dvo)$$0, $$1);
   }

   public interface a extends dvo {
      dvb load(qs var1);

      @Override
      default dvb load(dvn $$0, qs $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dvo {
      dvb load(dyr var1, qs var2);

      @Override
      default dvb load(dvn $$0, qs $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
