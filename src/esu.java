import java.util.Locale;

public interface esu {
   esu a = a(euh.a::new, "MSCorridor");
   esu b = a(euh.b::new, "MSCrossing");
   esu c = a(euh.d::new, "MSRoom");
   esu d = a(euh.e::new, "MSStairs");
   esu e = a(euj.a::new, "NeBCr");
   esu f = a(euj.b::new, "NeBEF");
   esu g = a(euj.c::new, "NeBS");
   esu h = a(euj.d::new, "NeCCS");
   esu i = a(euj.e::new, "NeCTB");
   esu j = a(euj.f::new, "NeCE");
   esu k = a(euj.g::new, "NeSCSC");
   esu l = a(euj.h::new, "NeSCLT");
   esu m = a(euj.i::new, "NeSC");
   esu n = a(euj.j::new, "NeSCRT");
   esu o = a(euj.k::new, "NeCSR");
   esu p = a(euj.l::new, "NeMT");
   esu q = a(euj.o::new, "NeRC");
   esu r = a(euj.p::new, "NeSR");
   esu s = a(euj.q::new, "NeStart");
   esu t = a(euv.a::new, "SHCC");
   esu u = a(euv.b::new, "SHFC");
   esu v = a(euv.c::new, "SH5C");
   esu w = a(euv.d::new, "SHLT");
   esu x = a(euv.e::new, "SHLi");
   esu y = a(euv.g::new, "SHPR");
   esu z = a(euv.h::new, "SHPH");
   esu A = a(euv.i::new, "SHRT");
   esu B = a(euv.j::new, "SHRC");
   esu C = a(euv.l::new, "SHSD");
   esu D = a(euv.m::new, "SHStart");
   esu E = a(euv.n::new, "SHS");
   esu F = a(euv.o::new, "SHSSD");
   esu G = a(euf::new, "TeJP");
   esu H = a(eup.a::a, "ORP");
   esu I = a(euc.a::new, "Iglu");
   esu J = a(eur::new, "RUPO");
   esu K = a(eux::new, "TeSH");
   esu L = a(ety::new, "TeDP");
   esu M = a(eun.h::new, "OMB");
   esu N = a(eun.j::new, "OMCR");
   esu O = a(eun.k::new, "OMDXR");
   esu P = a(eun.l::new, "OMDXYR");
   esu Q = a(eun.m::new, "OMDYR");
   esu R = a(eun.n::new, "OMDYZR");
   esu S = a(eun.o::new, "OMDZR");
   esu T = a(eun.p::new, "OMEntry");
   esu U = a(eun.q::new, "OMPenthouse");
   esu V = a(eun.s::new, "OMSimple");
   esu W = a(eun.t::new, "OMSimpleT");
   esu X = a(eun.u::new, "OMWR");
   esu Y = a(eua.a::new, "ECP");
   esu Z = a(euz.i::new, "WMP");
   esu aa = a(etw.a::new, "BTP");
   esu ab = a(eut.a::new, "Shipwreck");
   esu ac = a(eul.a::new, "NeFos");
   esu ad = a(erz::new, "jigsaw");

   esh load(est var1, ua var2);

   private static esu a(esu $$0, String $$1) {
      return jt.a(mh.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static esu a(esu.a $$0, String $$1) {
      return a((esu)$$0, $$1);
   }

   private static esu a(esu.b $$0, String $$1) {
      return a((esu)$$0, $$1);
   }

   public interface a extends esu {
      esh load(ua var1);

      @Override
      default esh load(est $$0, ua $$1) {
         return this.load($$1);
      }
   }

   public interface b extends esu {
      esh load(ewg var1, ua var2);

      @Override
      default esh load(est $$0, ua $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
