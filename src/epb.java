import java.util.Locale;

public interface epb {
   epb a = a(eqo.a::new, "MSCorridor");
   epb b = a(eqo.b::new, "MSCrossing");
   epb c = a(eqo.d::new, "MSRoom");
   epb d = a(eqo.e::new, "MSStairs");
   epb e = a(eqq.a::new, "NeBCr");
   epb f = a(eqq.b::new, "NeBEF");
   epb g = a(eqq.c::new, "NeBS");
   epb h = a(eqq.d::new, "NeCCS");
   epb i = a(eqq.e::new, "NeCTB");
   epb j = a(eqq.f::new, "NeCE");
   epb k = a(eqq.g::new, "NeSCSC");
   epb l = a(eqq.h::new, "NeSCLT");
   epb m = a(eqq.i::new, "NeSC");
   epb n = a(eqq.j::new, "NeSCRT");
   epb o = a(eqq.k::new, "NeCSR");
   epb p = a(eqq.l::new, "NeMT");
   epb q = a(eqq.o::new, "NeRC");
   epb r = a(eqq.p::new, "NeSR");
   epb s = a(eqq.q::new, "NeStart");
   epb t = a(erc.a::new, "SHCC");
   epb u = a(erc.b::new, "SHFC");
   epb v = a(erc.c::new, "SH5C");
   epb w = a(erc.d::new, "SHLT");
   epb x = a(erc.e::new, "SHLi");
   epb y = a(erc.g::new, "SHPR");
   epb z = a(erc.h::new, "SHPH");
   epb A = a(erc.i::new, "SHRT");
   epb B = a(erc.j::new, "SHRC");
   epb C = a(erc.l::new, "SHSD");
   epb D = a(erc.m::new, "SHStart");
   epb E = a(erc.n::new, "SHS");
   epb F = a(erc.o::new, "SHSSD");
   epb G = a(eqm::new, "TeJP");
   epb H = a(eqw.a::a, "ORP");
   epb I = a(eqj.a::new, "Iglu");
   epb J = a(eqy::new, "RUPO");
   epb K = a(ere::new, "TeSH");
   epb L = a(eqf::new, "TeDP");
   epb M = a(equ.h::new, "OMB");
   epb N = a(equ.j::new, "OMCR");
   epb O = a(equ.k::new, "OMDXR");
   epb P = a(equ.l::new, "OMDXYR");
   epb Q = a(equ.m::new, "OMDYR");
   epb R = a(equ.n::new, "OMDYZR");
   epb S = a(equ.o::new, "OMDZR");
   epb T = a(equ.p::new, "OMEntry");
   epb U = a(equ.q::new, "OMPenthouse");
   epb V = a(equ.s::new, "OMSimple");
   epb W = a(equ.t::new, "OMSimpleT");
   epb X = a(equ.u::new, "OMWR");
   epb Y = a(eqh.a::new, "ECP");
   epb Z = a(erg.i::new, "WMP");
   epb aa = a(eqd.a::new, "BTP");
   epb ab = a(era.a::new, "Shipwreck");
   epb ac = a(eqs.a::new, "NeFos");
   epb ad = a(eog::new, "jigsaw");

   eoo load(epa var1, ux var2);

   private static epb a(epb $$0, String $$1) {
      return kd.a(ma.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static epb a(epb.a $$0, String $$1) {
      return a((epb)$$0, $$1);
   }

   private static epb a(epb.b $$0, String $$1) {
      return a((epb)$$0, $$1);
   }

   public interface a extends epb {
      eoo load(ux var1);

      @Override
      default eoo load(epa $$0, ux $$1) {
         return this.load($$1);
      }
   }

   public interface b extends epb {
      eoo load(esn var1, ux var2);

      @Override
      default eoo load(epa $$0, ux $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
