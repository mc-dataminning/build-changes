import java.util.Locale;

public interface ehg {
   ehg a = a(eis.a::new, "MSCorridor");
   ehg b = a(eis.b::new, "MSCrossing");
   ehg c = a(eis.d::new, "MSRoom");
   ehg d = a(eis.e::new, "MSStairs");
   ehg e = a(eiu.a::new, "NeBCr");
   ehg f = a(eiu.b::new, "NeBEF");
   ehg g = a(eiu.c::new, "NeBS");
   ehg h = a(eiu.d::new, "NeCCS");
   ehg i = a(eiu.e::new, "NeCTB");
   ehg j = a(eiu.f::new, "NeCE");
   ehg k = a(eiu.g::new, "NeSCSC");
   ehg l = a(eiu.h::new, "NeSCLT");
   ehg m = a(eiu.i::new, "NeSC");
   ehg n = a(eiu.j::new, "NeSCRT");
   ehg o = a(eiu.k::new, "NeCSR");
   ehg p = a(eiu.l::new, "NeMT");
   ehg q = a(eiu.o::new, "NeRC");
   ehg r = a(eiu.p::new, "NeSR");
   ehg s = a(eiu.q::new, "NeStart");
   ehg t = a(ejg.a::new, "SHCC");
   ehg u = a(ejg.b::new, "SHFC");
   ehg v = a(ejg.c::new, "SH5C");
   ehg w = a(ejg.d::new, "SHLT");
   ehg x = a(ejg.e::new, "SHLi");
   ehg y = a(ejg.g::new, "SHPR");
   ehg z = a(ejg.h::new, "SHPH");
   ehg A = a(ejg.i::new, "SHRT");
   ehg B = a(ejg.j::new, "SHRC");
   ehg C = a(ejg.l::new, "SHSD");
   ehg D = a(ejg.m::new, "SHStart");
   ehg E = a(ejg.n::new, "SHS");
   ehg F = a(ejg.o::new, "SHSSD");
   ehg G = a(eiq::new, "TeJP");
   ehg H = a(eja.a::a, "ORP");
   ehg I = a(ein.a::new, "Iglu");
   ehg J = a(ejc::new, "RUPO");
   ehg K = a(eji::new, "TeSH");
   ehg L = a(eij::new, "TeDP");
   ehg M = a(eiy.h::new, "OMB");
   ehg N = a(eiy.j::new, "OMCR");
   ehg O = a(eiy.k::new, "OMDXR");
   ehg P = a(eiy.l::new, "OMDXYR");
   ehg Q = a(eiy.m::new, "OMDYR");
   ehg R = a(eiy.n::new, "OMDYZR");
   ehg S = a(eiy.o::new, "OMDZR");
   ehg T = a(eiy.p::new, "OMEntry");
   ehg U = a(eiy.q::new, "OMPenthouse");
   ehg V = a(eiy.s::new, "OMSimple");
   ehg W = a(eiy.t::new, "OMSimpleT");
   ehg X = a(eiy.u::new, "OMWR");
   ehg Y = a(eil.a::new, "ECP");
   ehg Z = a(ejk.i::new, "WMP");
   ehg aa = a(eih.a::new, "BTP");
   ehg ab = a(eje.a::new, "Shipwreck");
   ehg ac = a(eiw.a::new, "NeFos");
   ehg ad = a(egl::new, "jigsaw");

   egt load(ehf var1, ua var2);

   private static ehg a(ehg $$0, String $$1) {
      return jj.a(ld.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ehg a(ehg.a $$0, String $$1) {
      return a((ehg)$$0, $$1);
   }

   private static ehg a(ehg.b $$0, String $$1) {
      return a((ehg)$$0, $$1);
   }

   public interface a extends ehg {
      egt load(ua var1);

      @Override
      default egt load(ehf $$0, ua $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ehg {
      egt load(ekq var1, ua var2);

      @Override
      default egt load(ehf $$0, ua $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
