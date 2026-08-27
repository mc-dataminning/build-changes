import java.util.Locale;

public interface dsr {
   dsr a = a(dtw.a::new, "MSCorridor");
   dsr b = a(dtw.b::new, "MSCrossing");
   dsr c = a(dtw.d::new, "MSRoom");
   dsr d = a(dtw.e::new, "MSStairs");
   dsr e = a(dty.a::new, "NeBCr");
   dsr f = a(dty.b::new, "NeBEF");
   dsr g = a(dty.c::new, "NeBS");
   dsr h = a(dty.d::new, "NeCCS");
   dsr i = a(dty.e::new, "NeCTB");
   dsr j = a(dty.f::new, "NeCE");
   dsr k = a(dty.g::new, "NeSCSC");
   dsr l = a(dty.h::new, "NeSCLT");
   dsr m = a(dty.i::new, "NeSC");
   dsr n = a(dty.j::new, "NeSCRT");
   dsr o = a(dty.k::new, "NeCSR");
   dsr p = a(dty.l::new, "NeMT");
   dsr q = a(dty.o::new, "NeRC");
   dsr r = a(dty.p::new, "NeSR");
   dsr s = a(dty.q::new, "NeStart");
   dsr t = a(duk.a::new, "SHCC");
   dsr u = a(duk.b::new, "SHFC");
   dsr v = a(duk.c::new, "SH5C");
   dsr w = a(duk.d::new, "SHLT");
   dsr x = a(duk.e::new, "SHLi");
   dsr y = a(duk.g::new, "SHPR");
   dsr z = a(duk.h::new, "SHPH");
   dsr A = a(duk.i::new, "SHRT");
   dsr B = a(duk.j::new, "SHRC");
   dsr C = a(duk.l::new, "SHSD");
   dsr D = a(duk.m::new, "SHStart");
   dsr E = a(duk.n::new, "SHS");
   dsr F = a(duk.o::new, "SHSSD");
   dsr G = a(dtu::new, "TeJP");
   dsr H = a(due.a::a, "ORP");
   dsr I = a(dtr.a::new, "Iglu");
   dsr J = a(dug::new, "RUPO");
   dsr K = a(dum::new, "TeSH");
   dsr L = a(dtn::new, "TeDP");
   dsr M = a(duc.h::new, "OMB");
   dsr N = a(duc.j::new, "OMCR");
   dsr O = a(duc.k::new, "OMDXR");
   dsr P = a(duc.l::new, "OMDXYR");
   dsr Q = a(duc.m::new, "OMDYR");
   dsr R = a(duc.n::new, "OMDYZR");
   dsr S = a(duc.o::new, "OMDZR");
   dsr T = a(duc.p::new, "OMEntry");
   dsr U = a(duc.q::new, "OMPenthouse");
   dsr V = a(duc.s::new, "OMSimple");
   dsr W = a(duc.t::new, "OMSimpleT");
   dsr X = a(duc.u::new, "OMWR");
   dsr Y = a(dtp.a::new, "ECP");
   dsr Z = a(duo.i::new, "WMP");
   dsr aa = a(dtl.a::new, "BTP");
   dsr ab = a(dui.a::new, "Shipwreck");
   dsr ac = a(dua.a::new, "NeFos");
   dsr ad = a(drw::new, "jigsaw");

   dse load(dsq var1, qr var2);

   private static dsr a(dsr $$0, String $$1) {
      return hr.a(jb.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dsr a(dsr.a $$0, String $$1) {
      return a((dsr)$$0, $$1);
   }

   private static dsr a(dsr.b $$0, String $$1) {
      return a((dsr)$$0, $$1);
   }

   public interface a extends dsr {
      dse load(qr var1);

      @Override
      default dse load(dsq $$0, qr $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dsr {
      dse load(dvu var1, qr var2);

      @Override
      default dse load(dsq $$0, qr $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
