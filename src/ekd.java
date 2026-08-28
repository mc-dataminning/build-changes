import java.util.Locale;

public interface ekd {
   ekd a = a(elq.a::new, "MSCorridor");
   ekd b = a(elq.b::new, "MSCrossing");
   ekd c = a(elq.d::new, "MSRoom");
   ekd d = a(elq.e::new, "MSStairs");
   ekd e = a(els.a::new, "NeBCr");
   ekd f = a(els.b::new, "NeBEF");
   ekd g = a(els.c::new, "NeBS");
   ekd h = a(els.d::new, "NeCCS");
   ekd i = a(els.e::new, "NeCTB");
   ekd j = a(els.f::new, "NeCE");
   ekd k = a(els.g::new, "NeSCSC");
   ekd l = a(els.h::new, "NeSCLT");
   ekd m = a(els.i::new, "NeSC");
   ekd n = a(els.j::new, "NeSCRT");
   ekd o = a(els.k::new, "NeCSR");
   ekd p = a(els.l::new, "NeMT");
   ekd q = a(els.o::new, "NeRC");
   ekd r = a(els.p::new, "NeSR");
   ekd s = a(els.q::new, "NeStart");
   ekd t = a(eme.a::new, "SHCC");
   ekd u = a(eme.b::new, "SHFC");
   ekd v = a(eme.c::new, "SH5C");
   ekd w = a(eme.d::new, "SHLT");
   ekd x = a(eme.e::new, "SHLi");
   ekd y = a(eme.g::new, "SHPR");
   ekd z = a(eme.h::new, "SHPH");
   ekd A = a(eme.i::new, "SHRT");
   ekd B = a(eme.j::new, "SHRC");
   ekd C = a(eme.l::new, "SHSD");
   ekd D = a(eme.m::new, "SHStart");
   ekd E = a(eme.n::new, "SHS");
   ekd F = a(eme.o::new, "SHSSD");
   ekd G = a(elo::new, "TeJP");
   ekd H = a(ely.a::a, "ORP");
   ekd I = a(ell.a::new, "Iglu");
   ekd J = a(ema::new, "RUPO");
   ekd K = a(emg::new, "TeSH");
   ekd L = a(elh::new, "TeDP");
   ekd M = a(elw.h::new, "OMB");
   ekd N = a(elw.j::new, "OMCR");
   ekd O = a(elw.k::new, "OMDXR");
   ekd P = a(elw.l::new, "OMDXYR");
   ekd Q = a(elw.m::new, "OMDYR");
   ekd R = a(elw.n::new, "OMDYZR");
   ekd S = a(elw.o::new, "OMDZR");
   ekd T = a(elw.p::new, "OMEntry");
   ekd U = a(elw.q::new, "OMPenthouse");
   ekd V = a(elw.s::new, "OMSimple");
   ekd W = a(elw.t::new, "OMSimpleT");
   ekd X = a(elw.u::new, "OMWR");
   ekd Y = a(elj.a::new, "ECP");
   ekd Z = a(emi.i::new, "WMP");
   ekd aa = a(elf.a::new, "BTP");
   ekd ab = a(emc.a::new, "Shipwreck");
   ekd ac = a(elu.a::new, "NeFos");
   ekd ad = a(eji::new, "jigsaw");

   ejq load(ekc var1, ua var2);

   private static ekd a(ekd $$0, String $$1) {
      return jz.a(lt.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ekd a(ekd.a $$0, String $$1) {
      return a((ekd)$$0, $$1);
   }

   private static ekd a(ekd.b $$0, String $$1) {
      return a((ekd)$$0, $$1);
   }

   public interface a extends ekd {
      ejq load(ua var1);

      @Override
      default ejq load(ekc $$0, ua $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ekd {
      ejq load(eno var1, ua var2);

      @Override
      default ejq load(ekc $$0, ua $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
