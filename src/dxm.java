import java.util.Locale;

public interface dxm {
   dxm a = a(dyy.a::new, "MSCorridor");
   dxm b = a(dyy.b::new, "MSCrossing");
   dxm c = a(dyy.d::new, "MSRoom");
   dxm d = a(dyy.e::new, "MSStairs");
   dxm e = a(dza.a::new, "NeBCr");
   dxm f = a(dza.b::new, "NeBEF");
   dxm g = a(dza.c::new, "NeBS");
   dxm h = a(dza.d::new, "NeCCS");
   dxm i = a(dza.e::new, "NeCTB");
   dxm j = a(dza.f::new, "NeCE");
   dxm k = a(dza.g::new, "NeSCSC");
   dxm l = a(dza.h::new, "NeSCLT");
   dxm m = a(dza.i::new, "NeSC");
   dxm n = a(dza.j::new, "NeSCRT");
   dxm o = a(dza.k::new, "NeCSR");
   dxm p = a(dza.l::new, "NeMT");
   dxm q = a(dza.o::new, "NeRC");
   dxm r = a(dza.p::new, "NeSR");
   dxm s = a(dza.q::new, "NeStart");
   dxm t = a(dzm.a::new, "SHCC");
   dxm u = a(dzm.b::new, "SHFC");
   dxm v = a(dzm.c::new, "SH5C");
   dxm w = a(dzm.d::new, "SHLT");
   dxm x = a(dzm.e::new, "SHLi");
   dxm y = a(dzm.g::new, "SHPR");
   dxm z = a(dzm.h::new, "SHPH");
   dxm A = a(dzm.i::new, "SHRT");
   dxm B = a(dzm.j::new, "SHRC");
   dxm C = a(dzm.l::new, "SHSD");
   dxm D = a(dzm.m::new, "SHStart");
   dxm E = a(dzm.n::new, "SHS");
   dxm F = a(dzm.o::new, "SHSSD");
   dxm G = a(dyw::new, "TeJP");
   dxm H = a(dzg.a::a, "ORP");
   dxm I = a(dyt.a::new, "Iglu");
   dxm J = a(dzi::new, "RUPO");
   dxm K = a(dzo::new, "TeSH");
   dxm L = a(dyp::new, "TeDP");
   dxm M = a(dze.h::new, "OMB");
   dxm N = a(dze.j::new, "OMCR");
   dxm O = a(dze.k::new, "OMDXR");
   dxm P = a(dze.l::new, "OMDXYR");
   dxm Q = a(dze.m::new, "OMDYR");
   dxm R = a(dze.n::new, "OMDYZR");
   dxm S = a(dze.o::new, "OMDZR");
   dxm T = a(dze.p::new, "OMEntry");
   dxm U = a(dze.q::new, "OMPenthouse");
   dxm V = a(dze.s::new, "OMSimple");
   dxm W = a(dze.t::new, "OMSimpleT");
   dxm X = a(dze.u::new, "OMWR");
   dxm Y = a(dyr.a::new, "ECP");
   dxm Z = a(dzq.i::new, "WMP");
   dxm aa = a(dyn.a::new, "BTP");
   dxm ab = a(dzk.a::new, "Shipwreck");
   dxm ac = a(dzc.a::new, "NeFos");
   dxm ad = a(dwr::new, "jigsaw");

   dwz load(dxl var1, rz var2);

   private static dxm a(dxm $$0, String $$1) {
      return io.a(jy.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dxm a(dxm.a $$0, String $$1) {
      return a((dxm)$$0, $$1);
   }

   private static dxm a(dxm.b $$0, String $$1) {
      return a((dxm)$$0, $$1);
   }

   public interface a extends dxm {
      dwz load(rz var1);

      @Override
      default dwz load(dxl $$0, rz $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dxm {
      dwz load(eaw var1, rz var2);

      @Override
      default dwz load(dxl $$0, rz $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
