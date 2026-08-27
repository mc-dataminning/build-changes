import java.util.Locale;

public interface ecx {
   ecx a = a(eej.a::new, "MSCorridor");
   ecx b = a(eej.b::new, "MSCrossing");
   ecx c = a(eej.d::new, "MSRoom");
   ecx d = a(eej.e::new, "MSStairs");
   ecx e = a(eel.a::new, "NeBCr");
   ecx f = a(eel.b::new, "NeBEF");
   ecx g = a(eel.c::new, "NeBS");
   ecx h = a(eel.d::new, "NeCCS");
   ecx i = a(eel.e::new, "NeCTB");
   ecx j = a(eel.f::new, "NeCE");
   ecx k = a(eel.g::new, "NeSCSC");
   ecx l = a(eel.h::new, "NeSCLT");
   ecx m = a(eel.i::new, "NeSC");
   ecx n = a(eel.j::new, "NeSCRT");
   ecx o = a(eel.k::new, "NeCSR");
   ecx p = a(eel.l::new, "NeMT");
   ecx q = a(eel.o::new, "NeRC");
   ecx r = a(eel.p::new, "NeSR");
   ecx s = a(eel.q::new, "NeStart");
   ecx t = a(eex.a::new, "SHCC");
   ecx u = a(eex.b::new, "SHFC");
   ecx v = a(eex.c::new, "SH5C");
   ecx w = a(eex.d::new, "SHLT");
   ecx x = a(eex.e::new, "SHLi");
   ecx y = a(eex.g::new, "SHPR");
   ecx z = a(eex.h::new, "SHPH");
   ecx A = a(eex.i::new, "SHRT");
   ecx B = a(eex.j::new, "SHRC");
   ecx C = a(eex.l::new, "SHSD");
   ecx D = a(eex.m::new, "SHStart");
   ecx E = a(eex.n::new, "SHS");
   ecx F = a(eex.o::new, "SHSSD");
   ecx G = a(eeh::new, "TeJP");
   ecx H = a(eer.a::a, "ORP");
   ecx I = a(eee.a::new, "Iglu");
   ecx J = a(eet::new, "RUPO");
   ecx K = a(eez::new, "TeSH");
   ecx L = a(eea::new, "TeDP");
   ecx M = a(eep.h::new, "OMB");
   ecx N = a(eep.j::new, "OMCR");
   ecx O = a(eep.k::new, "OMDXR");
   ecx P = a(eep.l::new, "OMDXYR");
   ecx Q = a(eep.m::new, "OMDYR");
   ecx R = a(eep.n::new, "OMDYZR");
   ecx S = a(eep.o::new, "OMDZR");
   ecx T = a(eep.p::new, "OMEntry");
   ecx U = a(eep.q::new, "OMPenthouse");
   ecx V = a(eep.s::new, "OMSimple");
   ecx W = a(eep.t::new, "OMSimpleT");
   ecx X = a(eep.u::new, "OMWR");
   ecx Y = a(eec.a::new, "ECP");
   ecx Z = a(efb.i::new, "WMP");
   ecx aa = a(edy.a::new, "BTP");
   ecx ab = a(eev.a::new, "Shipwreck");
   ecx ac = a(een.a::new, "NeFos");
   ecx ad = a(ecc::new, "jigsaw");

   eck load(ecw var1, sy var2);

   private static ecx a(ecx $$0, String $$1) {
      return ix.a(kh.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ecx a(ecx.a $$0, String $$1) {
      return a((ecx)$$0, $$1);
   }

   private static ecx a(ecx.b $$0, String $$1) {
      return a((ecx)$$0, $$1);
   }

   public interface a extends ecx {
      eck load(sy var1);

      @Override
      default eck load(ecw $$0, sy $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ecx {
      eck load(egh var1, sy var2);

      @Override
      default eck load(ecw $$0, sy $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
