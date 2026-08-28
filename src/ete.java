import java.util.Locale;

public interface ete {
   ete a = a(eur.a::new, "MSCorridor");
   ete b = a(eur.b::new, "MSCrossing");
   ete c = a(eur.d::new, "MSRoom");
   ete d = a(eur.e::new, "MSStairs");
   ete e = a(eut.a::new, "NeBCr");
   ete f = a(eut.b::new, "NeBEF");
   ete g = a(eut.c::new, "NeBS");
   ete h = a(eut.d::new, "NeCCS");
   ete i = a(eut.e::new, "NeCTB");
   ete j = a(eut.f::new, "NeCE");
   ete k = a(eut.g::new, "NeSCSC");
   ete l = a(eut.h::new, "NeSCLT");
   ete m = a(eut.i::new, "NeSC");
   ete n = a(eut.j::new, "NeSCRT");
   ete o = a(eut.k::new, "NeCSR");
   ete p = a(eut.l::new, "NeMT");
   ete q = a(eut.o::new, "NeRC");
   ete r = a(eut.p::new, "NeSR");
   ete s = a(eut.q::new, "NeStart");
   ete t = a(evf.a::new, "SHCC");
   ete u = a(evf.b::new, "SHFC");
   ete v = a(evf.c::new, "SH5C");
   ete w = a(evf.d::new, "SHLT");
   ete x = a(evf.e::new, "SHLi");
   ete y = a(evf.g::new, "SHPR");
   ete z = a(evf.h::new, "SHPH");
   ete A = a(evf.i::new, "SHRT");
   ete B = a(evf.j::new, "SHRC");
   ete C = a(evf.l::new, "SHSD");
   ete D = a(evf.m::new, "SHStart");
   ete E = a(evf.n::new, "SHS");
   ete F = a(evf.o::new, "SHSSD");
   ete G = a(eup::new, "TeJP");
   ete H = a(euz.a::a, "ORP");
   ete I = a(eum.a::new, "Iglu");
   ete J = a(evb::new, "RUPO");
   ete K = a(evh::new, "TeSH");
   ete L = a(eui::new, "TeDP");
   ete M = a(eux.h::new, "OMB");
   ete N = a(eux.j::new, "OMCR");
   ete O = a(eux.k::new, "OMDXR");
   ete P = a(eux.l::new, "OMDXYR");
   ete Q = a(eux.m::new, "OMDYR");
   ete R = a(eux.n::new, "OMDYZR");
   ete S = a(eux.o::new, "OMDZR");
   ete T = a(eux.p::new, "OMEntry");
   ete U = a(eux.q::new, "OMPenthouse");
   ete V = a(eux.s::new, "OMSimple");
   ete W = a(eux.t::new, "OMSimpleT");
   ete X = a(eux.u::new, "OMWR");
   ete Y = a(euk.a::new, "ECP");
   ete Z = a(evj.i::new, "WMP");
   ete aa = a(eug.a::new, "BTP");
   ete ab = a(evd.a::new, "Shipwreck");
   ete ac = a(euv.a::new, "NeFos");
   ete ad = a(esj::new, "jigsaw");

   esr load(etd var1, ua var2);

   private static ete a(ete $$0, String $$1) {
      return jt.a(mh.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ete a(ete.a $$0, String $$1) {
      return a((ete)$$0, $$1);
   }

   private static ete a(ete.b $$0, String $$1) {
      return a((ete)$$0, $$1);
   }

   public interface a extends ete {
      esr load(ua var1);

      @Override
      default esr load(etd $$0, ua $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ete {
      esr load(ewq var1, ua var2);

      @Override
      default esr load(etd $$0, ua $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
