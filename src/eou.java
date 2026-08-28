import java.util.Locale;

public interface eou {
   eou a = a(eqh.a::new, "MSCorridor");
   eou b = a(eqh.b::new, "MSCrossing");
   eou c = a(eqh.d::new, "MSRoom");
   eou d = a(eqh.e::new, "MSStairs");
   eou e = a(eqj.a::new, "NeBCr");
   eou f = a(eqj.b::new, "NeBEF");
   eou g = a(eqj.c::new, "NeBS");
   eou h = a(eqj.d::new, "NeCCS");
   eou i = a(eqj.e::new, "NeCTB");
   eou j = a(eqj.f::new, "NeCE");
   eou k = a(eqj.g::new, "NeSCSC");
   eou l = a(eqj.h::new, "NeSCLT");
   eou m = a(eqj.i::new, "NeSC");
   eou n = a(eqj.j::new, "NeSCRT");
   eou o = a(eqj.k::new, "NeCSR");
   eou p = a(eqj.l::new, "NeMT");
   eou q = a(eqj.o::new, "NeRC");
   eou r = a(eqj.p::new, "NeSR");
   eou s = a(eqj.q::new, "NeStart");
   eou t = a(eqv.a::new, "SHCC");
   eou u = a(eqv.b::new, "SHFC");
   eou v = a(eqv.c::new, "SH5C");
   eou w = a(eqv.d::new, "SHLT");
   eou x = a(eqv.e::new, "SHLi");
   eou y = a(eqv.g::new, "SHPR");
   eou z = a(eqv.h::new, "SHPH");
   eou A = a(eqv.i::new, "SHRT");
   eou B = a(eqv.j::new, "SHRC");
   eou C = a(eqv.l::new, "SHSD");
   eou D = a(eqv.m::new, "SHStart");
   eou E = a(eqv.n::new, "SHS");
   eou F = a(eqv.o::new, "SHSSD");
   eou G = a(eqf::new, "TeJP");
   eou H = a(eqp.a::a, "ORP");
   eou I = a(eqc.a::new, "Iglu");
   eou J = a(eqr::new, "RUPO");
   eou K = a(eqx::new, "TeSH");
   eou L = a(epy::new, "TeDP");
   eou M = a(eqn.h::new, "OMB");
   eou N = a(eqn.j::new, "OMCR");
   eou O = a(eqn.k::new, "OMDXR");
   eou P = a(eqn.l::new, "OMDXYR");
   eou Q = a(eqn.m::new, "OMDYR");
   eou R = a(eqn.n::new, "OMDYZR");
   eou S = a(eqn.o::new, "OMDZR");
   eou T = a(eqn.p::new, "OMEntry");
   eou U = a(eqn.q::new, "OMPenthouse");
   eou V = a(eqn.s::new, "OMSimple");
   eou W = a(eqn.t::new, "OMSimpleT");
   eou X = a(eqn.u::new, "OMWR");
   eou Y = a(eqa.a::new, "ECP");
   eou Z = a(eqz.i::new, "WMP");
   eou aa = a(epw.a::new, "BTP");
   eou ab = a(eqt.a::new, "Shipwreck");
   eou ac = a(eql.a::new, "NeFos");
   eou ad = a(enz::new, "jigsaw");

   eoh load(eot var1, um var2);

   private static eou a(eou $$0, String $$1) {
      return kd.a(ma.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eou a(eou.a $$0, String $$1) {
      return a((eou)$$0, $$1);
   }

   private static eou a(eou.b $$0, String $$1) {
      return a((eou)$$0, $$1);
   }

   public interface a extends eou {
      eoh load(um var1);

      @Override
      default eoh load(eot $$0, um $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eou {
      eoh load(esg var1, um var2);

      @Override
      default eoh load(eot $$0, um $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
