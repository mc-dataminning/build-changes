import java.util.Locale;

public interface dyd {
   dyd a = a(dzp.a::new, "MSCorridor");
   dyd b = a(dzp.b::new, "MSCrossing");
   dyd c = a(dzp.d::new, "MSRoom");
   dyd d = a(dzp.e::new, "MSStairs");
   dyd e = a(dzr.a::new, "NeBCr");
   dyd f = a(dzr.b::new, "NeBEF");
   dyd g = a(dzr.c::new, "NeBS");
   dyd h = a(dzr.d::new, "NeCCS");
   dyd i = a(dzr.e::new, "NeCTB");
   dyd j = a(dzr.f::new, "NeCE");
   dyd k = a(dzr.g::new, "NeSCSC");
   dyd l = a(dzr.h::new, "NeSCLT");
   dyd m = a(dzr.i::new, "NeSC");
   dyd n = a(dzr.j::new, "NeSCRT");
   dyd o = a(dzr.k::new, "NeCSR");
   dyd p = a(dzr.l::new, "NeMT");
   dyd q = a(dzr.o::new, "NeRC");
   dyd r = a(dzr.p::new, "NeSR");
   dyd s = a(dzr.q::new, "NeStart");
   dyd t = a(ead.a::new, "SHCC");
   dyd u = a(ead.b::new, "SHFC");
   dyd v = a(ead.c::new, "SH5C");
   dyd w = a(ead.d::new, "SHLT");
   dyd x = a(ead.e::new, "SHLi");
   dyd y = a(ead.g::new, "SHPR");
   dyd z = a(ead.h::new, "SHPH");
   dyd A = a(ead.i::new, "SHRT");
   dyd B = a(ead.j::new, "SHRC");
   dyd C = a(ead.l::new, "SHSD");
   dyd D = a(ead.m::new, "SHStart");
   dyd E = a(ead.n::new, "SHS");
   dyd F = a(ead.o::new, "SHSSD");
   dyd G = a(dzn::new, "TeJP");
   dyd H = a(dzx.a::a, "ORP");
   dyd I = a(dzk.a::new, "Iglu");
   dyd J = a(dzz::new, "RUPO");
   dyd K = a(eaf::new, "TeSH");
   dyd L = a(dzg::new, "TeDP");
   dyd M = a(dzv.h::new, "OMB");
   dyd N = a(dzv.j::new, "OMCR");
   dyd O = a(dzv.k::new, "OMDXR");
   dyd P = a(dzv.l::new, "OMDXYR");
   dyd Q = a(dzv.m::new, "OMDYR");
   dyd R = a(dzv.n::new, "OMDYZR");
   dyd S = a(dzv.o::new, "OMDZR");
   dyd T = a(dzv.p::new, "OMEntry");
   dyd U = a(dzv.q::new, "OMPenthouse");
   dyd V = a(dzv.s::new, "OMSimple");
   dyd W = a(dzv.t::new, "OMSimpleT");
   dyd X = a(dzv.u::new, "OMWR");
   dyd Y = a(dzi.a::new, "ECP");
   dyd Z = a(eah.i::new, "WMP");
   dyd aa = a(dze.a::new, "BTP");
   dyd ab = a(eab.a::new, "Shipwreck");
   dyd ac = a(dzt.a::new, "NeFos");
   dyd ad = a(dxi::new, "jigsaw");

   dxq load(dyc var1, sd var2);

   private static dyd a(dyd $$0, String $$1) {
      return is.a(kc.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dyd a(dyd.a $$0, String $$1) {
      return a((dyd)$$0, $$1);
   }

   private static dyd a(dyd.b $$0, String $$1) {
      return a((dyd)$$0, $$1);
   }

   public interface a extends dyd {
      dxq load(sd var1);

      @Override
      default dxq load(dyc $$0, sd $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dyd {
      dxq load(ebn var1, sd var2);

      @Override
      default dxq load(dyc $$0, sd $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
