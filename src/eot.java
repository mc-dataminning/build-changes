import java.util.Locale;

public interface eot {
   eot a = a(eqg.a::new, "MSCorridor");
   eot b = a(eqg.b::new, "MSCrossing");
   eot c = a(eqg.d::new, "MSRoom");
   eot d = a(eqg.e::new, "MSStairs");
   eot e = a(eqi.a::new, "NeBCr");
   eot f = a(eqi.b::new, "NeBEF");
   eot g = a(eqi.c::new, "NeBS");
   eot h = a(eqi.d::new, "NeCCS");
   eot i = a(eqi.e::new, "NeCTB");
   eot j = a(eqi.f::new, "NeCE");
   eot k = a(eqi.g::new, "NeSCSC");
   eot l = a(eqi.h::new, "NeSCLT");
   eot m = a(eqi.i::new, "NeSC");
   eot n = a(eqi.j::new, "NeSCRT");
   eot o = a(eqi.k::new, "NeCSR");
   eot p = a(eqi.l::new, "NeMT");
   eot q = a(eqi.o::new, "NeRC");
   eot r = a(eqi.p::new, "NeSR");
   eot s = a(eqi.q::new, "NeStart");
   eot t = a(equ.a::new, "SHCC");
   eot u = a(equ.b::new, "SHFC");
   eot v = a(equ.c::new, "SH5C");
   eot w = a(equ.d::new, "SHLT");
   eot x = a(equ.e::new, "SHLi");
   eot y = a(equ.g::new, "SHPR");
   eot z = a(equ.h::new, "SHPH");
   eot A = a(equ.i::new, "SHRT");
   eot B = a(equ.j::new, "SHRC");
   eot C = a(equ.l::new, "SHSD");
   eot D = a(equ.m::new, "SHStart");
   eot E = a(equ.n::new, "SHS");
   eot F = a(equ.o::new, "SHSSD");
   eot G = a(eqe::new, "TeJP");
   eot H = a(eqo.a::a, "ORP");
   eot I = a(eqb.a::new, "Iglu");
   eot J = a(eqq::new, "RUPO");
   eot K = a(eqw::new, "TeSH");
   eot L = a(epx::new, "TeDP");
   eot M = a(eqm.h::new, "OMB");
   eot N = a(eqm.j::new, "OMCR");
   eot O = a(eqm.k::new, "OMDXR");
   eot P = a(eqm.l::new, "OMDXYR");
   eot Q = a(eqm.m::new, "OMDYR");
   eot R = a(eqm.n::new, "OMDYZR");
   eot S = a(eqm.o::new, "OMDZR");
   eot T = a(eqm.p::new, "OMEntry");
   eot U = a(eqm.q::new, "OMPenthouse");
   eot V = a(eqm.s::new, "OMSimple");
   eot W = a(eqm.t::new, "OMSimpleT");
   eot X = a(eqm.u::new, "OMWR");
   eot Y = a(epz.a::new, "ECP");
   eot Z = a(eqy.i::new, "WMP");
   eot aa = a(epv.a::new, "BTP");
   eot ab = a(eqs.a::new, "Shipwreck");
   eot ac = a(eqk.a::new, "NeFos");
   eot ad = a(eny::new, "jigsaw");

   eog load(eos var1, ux var2);

   private static eot a(eot $$0, String $$1) {
      return kd.a(ma.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eot a(eot.a $$0, String $$1) {
      return a((eot)$$0, $$1);
   }

   private static eot a(eot.b $$0, String $$1) {
      return a((eot)$$0, $$1);
   }

   public interface a extends eot {
      eog load(ux var1);

      @Override
      default eog load(eos $$0, ux $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eot {
      eog load(esf var1, ux var2);

      @Override
      default eog load(eos $$0, ux $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
