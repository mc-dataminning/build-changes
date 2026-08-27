import java.util.Locale;

public interface dwb {
   dwb a = a(dxg.a::new, "MSCorridor");
   dwb b = a(dxg.b::new, "MSCrossing");
   dwb c = a(dxg.d::new, "MSRoom");
   dwb d = a(dxg.e::new, "MSStairs");
   dwb e = a(dxi.a::new, "NeBCr");
   dwb f = a(dxi.b::new, "NeBEF");
   dwb g = a(dxi.c::new, "NeBS");
   dwb h = a(dxi.d::new, "NeCCS");
   dwb i = a(dxi.e::new, "NeCTB");
   dwb j = a(dxi.f::new, "NeCE");
   dwb k = a(dxi.g::new, "NeSCSC");
   dwb l = a(dxi.h::new, "NeSCLT");
   dwb m = a(dxi.i::new, "NeSC");
   dwb n = a(dxi.j::new, "NeSCRT");
   dwb o = a(dxi.k::new, "NeCSR");
   dwb p = a(dxi.l::new, "NeMT");
   dwb q = a(dxi.o::new, "NeRC");
   dwb r = a(dxi.p::new, "NeSR");
   dwb s = a(dxi.q::new, "NeStart");
   dwb t = a(dxu.a::new, "SHCC");
   dwb u = a(dxu.b::new, "SHFC");
   dwb v = a(dxu.c::new, "SH5C");
   dwb w = a(dxu.d::new, "SHLT");
   dwb x = a(dxu.e::new, "SHLi");
   dwb y = a(dxu.g::new, "SHPR");
   dwb z = a(dxu.h::new, "SHPH");
   dwb A = a(dxu.i::new, "SHRT");
   dwb B = a(dxu.j::new, "SHRC");
   dwb C = a(dxu.l::new, "SHSD");
   dwb D = a(dxu.m::new, "SHStart");
   dwb E = a(dxu.n::new, "SHS");
   dwb F = a(dxu.o::new, "SHSSD");
   dwb G = a(dxe::new, "TeJP");
   dwb H = a(dxo.a::a, "ORP");
   dwb I = a(dxb.a::new, "Iglu");
   dwb J = a(dxq::new, "RUPO");
   dwb K = a(dxw::new, "TeSH");
   dwb L = a(dwx::new, "TeDP");
   dwb M = a(dxm.h::new, "OMB");
   dwb N = a(dxm.j::new, "OMCR");
   dwb O = a(dxm.k::new, "OMDXR");
   dwb P = a(dxm.l::new, "OMDXYR");
   dwb Q = a(dxm.m::new, "OMDYR");
   dwb R = a(dxm.n::new, "OMDYZR");
   dwb S = a(dxm.o::new, "OMDZR");
   dwb T = a(dxm.p::new, "OMEntry");
   dwb U = a(dxm.q::new, "OMPenthouse");
   dwb V = a(dxm.s::new, "OMSimple");
   dwb W = a(dxm.t::new, "OMSimpleT");
   dwb X = a(dxm.u::new, "OMWR");
   dwb Y = a(dwz.a::new, "ECP");
   dwb Z = a(dxy.i::new, "WMP");
   dwb aa = a(dwv.a::new, "BTP");
   dwb ab = a(dxs.a::new, "Shipwreck");
   dwb ac = a(dxk.a::new, "NeFos");
   dwb ad = a(dvg::new, "jigsaw");

   dvo load(dwa var1, qy var2);

   private static dwb a(dwb $$0, String $$1) {
      return ht.a(jd.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dwb a(dwb.a $$0, String $$1) {
      return a((dwb)$$0, $$1);
   }

   private static dwb a(dwb.b $$0, String $$1) {
      return a((dwb)$$0, $$1);
   }

   public interface a extends dwb {
      dvo load(qy var1);

      @Override
      default dvo load(dwa $$0, qy $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dwb {
      dvo load(dze var1, qy var2);

      @Override
      default dvo load(dwa $$0, qy $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
