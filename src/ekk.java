import java.util.Locale;

public interface ekk {
   ekk a = a(elw.a::new, "MSCorridor");
   ekk b = a(elw.b::new, "MSCrossing");
   ekk c = a(elw.d::new, "MSRoom");
   ekk d = a(elw.e::new, "MSStairs");
   ekk e = a(ely.a::new, "NeBCr");
   ekk f = a(ely.b::new, "NeBEF");
   ekk g = a(ely.c::new, "NeBS");
   ekk h = a(ely.d::new, "NeCCS");
   ekk i = a(ely.e::new, "NeCTB");
   ekk j = a(ely.f::new, "NeCE");
   ekk k = a(ely.g::new, "NeSCSC");
   ekk l = a(ely.h::new, "NeSCLT");
   ekk m = a(ely.i::new, "NeSC");
   ekk n = a(ely.j::new, "NeSCRT");
   ekk o = a(ely.k::new, "NeCSR");
   ekk p = a(ely.l::new, "NeMT");
   ekk q = a(ely.o::new, "NeRC");
   ekk r = a(ely.p::new, "NeSR");
   ekk s = a(ely.q::new, "NeStart");
   ekk t = a(emk.a::new, "SHCC");
   ekk u = a(emk.b::new, "SHFC");
   ekk v = a(emk.c::new, "SH5C");
   ekk w = a(emk.d::new, "SHLT");
   ekk x = a(emk.e::new, "SHLi");
   ekk y = a(emk.g::new, "SHPR");
   ekk z = a(emk.h::new, "SHPH");
   ekk A = a(emk.i::new, "SHRT");
   ekk B = a(emk.j::new, "SHRC");
   ekk C = a(emk.l::new, "SHSD");
   ekk D = a(emk.m::new, "SHStart");
   ekk E = a(emk.n::new, "SHS");
   ekk F = a(emk.o::new, "SHSSD");
   ekk G = a(elu::new, "TeJP");
   ekk H = a(eme.a::a, "ORP");
   ekk I = a(elr.a::new, "Iglu");
   ekk J = a(emg::new, "RUPO");
   ekk K = a(emm::new, "TeSH");
   ekk L = a(eln::new, "TeDP");
   ekk M = a(emc.h::new, "OMB");
   ekk N = a(emc.j::new, "OMCR");
   ekk O = a(emc.k::new, "OMDXR");
   ekk P = a(emc.l::new, "OMDXYR");
   ekk Q = a(emc.m::new, "OMDYR");
   ekk R = a(emc.n::new, "OMDYZR");
   ekk S = a(emc.o::new, "OMDZR");
   ekk T = a(emc.p::new, "OMEntry");
   ekk U = a(emc.q::new, "OMPenthouse");
   ekk V = a(emc.s::new, "OMSimple");
   ekk W = a(emc.t::new, "OMSimpleT");
   ekk X = a(emc.u::new, "OMWR");
   ekk Y = a(elp.a::new, "ECP");
   ekk Z = a(emo.i::new, "WMP");
   ekk aa = a(ell.a::new, "BTP");
   ekk ab = a(emi.a::new, "Shipwreck");
   ekk ac = a(ema.a::new, "NeFos");
   ekk ad = a(ejp::new, "jigsaw");

   ejx load(ekj var1, uk var2);

   private static ekk a(ekk $$0, String $$1) {
      return jn.a(lh.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ekk a(ekk.a $$0, String $$1) {
      return a((ekk)$$0, $$1);
   }

   private static ekk a(ekk.b $$0, String $$1) {
      return a((ekk)$$0, $$1);
   }

   public interface a extends ekk {
      ejx load(uk var1);

      @Override
      default ejx load(ekj $$0, uk $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ekk {
      ejx load(enu var1, uk var2);

      @Override
      default ejx load(ekj $$0, uk $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
