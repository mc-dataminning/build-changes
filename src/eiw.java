import java.util.Locale;

public interface eiw {
   eiw a = a(eki.a::new, "MSCorridor");
   eiw b = a(eki.b::new, "MSCrossing");
   eiw c = a(eki.d::new, "MSRoom");
   eiw d = a(eki.e::new, "MSStairs");
   eiw e = a(ekk.a::new, "NeBCr");
   eiw f = a(ekk.b::new, "NeBEF");
   eiw g = a(ekk.c::new, "NeBS");
   eiw h = a(ekk.d::new, "NeCCS");
   eiw i = a(ekk.e::new, "NeCTB");
   eiw j = a(ekk.f::new, "NeCE");
   eiw k = a(ekk.g::new, "NeSCSC");
   eiw l = a(ekk.h::new, "NeSCLT");
   eiw m = a(ekk.i::new, "NeSC");
   eiw n = a(ekk.j::new, "NeSCRT");
   eiw o = a(ekk.k::new, "NeCSR");
   eiw p = a(ekk.l::new, "NeMT");
   eiw q = a(ekk.o::new, "NeRC");
   eiw r = a(ekk.p::new, "NeSR");
   eiw s = a(ekk.q::new, "NeStart");
   eiw t = a(ekw.a::new, "SHCC");
   eiw u = a(ekw.b::new, "SHFC");
   eiw v = a(ekw.c::new, "SH5C");
   eiw w = a(ekw.d::new, "SHLT");
   eiw x = a(ekw.e::new, "SHLi");
   eiw y = a(ekw.g::new, "SHPR");
   eiw z = a(ekw.h::new, "SHPH");
   eiw A = a(ekw.i::new, "SHRT");
   eiw B = a(ekw.j::new, "SHRC");
   eiw C = a(ekw.l::new, "SHSD");
   eiw D = a(ekw.m::new, "SHStart");
   eiw E = a(ekw.n::new, "SHS");
   eiw F = a(ekw.o::new, "SHSSD");
   eiw G = a(ekg::new, "TeJP");
   eiw H = a(ekq.a::a, "ORP");
   eiw I = a(ekd.a::new, "Iglu");
   eiw J = a(eks::new, "RUPO");
   eiw K = a(eky::new, "TeSH");
   eiw L = a(ejz::new, "TeDP");
   eiw M = a(eko.h::new, "OMB");
   eiw N = a(eko.j::new, "OMCR");
   eiw O = a(eko.k::new, "OMDXR");
   eiw P = a(eko.l::new, "OMDXYR");
   eiw Q = a(eko.m::new, "OMDYR");
   eiw R = a(eko.n::new, "OMDYZR");
   eiw S = a(eko.o::new, "OMDZR");
   eiw T = a(eko.p::new, "OMEntry");
   eiw U = a(eko.q::new, "OMPenthouse");
   eiw V = a(eko.s::new, "OMSimple");
   eiw W = a(eko.t::new, "OMSimpleT");
   eiw X = a(eko.u::new, "OMWR");
   eiw Y = a(ekb.a::new, "ECP");
   eiw Z = a(ela.i::new, "WMP");
   eiw aa = a(ejx.a::new, "BTP");
   eiw ab = a(eku.a::new, "Shipwreck");
   eiw ac = a(ekm.a::new, "NeFos");
   eiw ad = a(eib::new, "jigsaw");

   eij load(eiv var1, ur var2);

   private static eiw a(eiw $$0, String $$1) {
      return jv.a(lp.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eiw a(eiw.a $$0, String $$1) {
      return a((eiw)$$0, $$1);
   }

   private static eiw a(eiw.b $$0, String $$1) {
      return a((eiw)$$0, $$1);
   }

   public interface a extends eiw {
      eij load(ur var1);

      @Override
      default eij load(eiv $$0, ur $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eiw {
      eij load(emg var1, ur var2);

      @Override
      default eij load(eiv $$0, ur $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
