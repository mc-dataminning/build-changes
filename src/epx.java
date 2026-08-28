import java.util.Locale;

public interface epx {
   epx a = a(erk.a::new, "MSCorridor");
   epx b = a(erk.b::new, "MSCrossing");
   epx c = a(erk.d::new, "MSRoom");
   epx d = a(erk.e::new, "MSStairs");
   epx e = a(erm.a::new, "NeBCr");
   epx f = a(erm.b::new, "NeBEF");
   epx g = a(erm.c::new, "NeBS");
   epx h = a(erm.d::new, "NeCCS");
   epx i = a(erm.e::new, "NeCTB");
   epx j = a(erm.f::new, "NeCE");
   epx k = a(erm.g::new, "NeSCSC");
   epx l = a(erm.h::new, "NeSCLT");
   epx m = a(erm.i::new, "NeSC");
   epx n = a(erm.j::new, "NeSCRT");
   epx o = a(erm.k::new, "NeCSR");
   epx p = a(erm.l::new, "NeMT");
   epx q = a(erm.o::new, "NeRC");
   epx r = a(erm.p::new, "NeSR");
   epx s = a(erm.q::new, "NeStart");
   epx t = a(ery.a::new, "SHCC");
   epx u = a(ery.b::new, "SHFC");
   epx v = a(ery.c::new, "SH5C");
   epx w = a(ery.d::new, "SHLT");
   epx x = a(ery.e::new, "SHLi");
   epx y = a(ery.g::new, "SHPR");
   epx z = a(ery.h::new, "SHPH");
   epx A = a(ery.i::new, "SHRT");
   epx B = a(ery.j::new, "SHRC");
   epx C = a(ery.l::new, "SHSD");
   epx D = a(ery.m::new, "SHStart");
   epx E = a(ery.n::new, "SHS");
   epx F = a(ery.o::new, "SHSSD");
   epx G = a(eri::new, "TeJP");
   epx H = a(ers.a::a, "ORP");
   epx I = a(erf.a::new, "Iglu");
   epx J = a(eru::new, "RUPO");
   epx K = a(esa::new, "TeSH");
   epx L = a(erb::new, "TeDP");
   epx M = a(erq.h::new, "OMB");
   epx N = a(erq.j::new, "OMCR");
   epx O = a(erq.k::new, "OMDXR");
   epx P = a(erq.l::new, "OMDXYR");
   epx Q = a(erq.m::new, "OMDYR");
   epx R = a(erq.n::new, "OMDYZR");
   epx S = a(erq.o::new, "OMDZR");
   epx T = a(erq.p::new, "OMEntry");
   epx U = a(erq.q::new, "OMPenthouse");
   epx V = a(erq.s::new, "OMSimple");
   epx W = a(erq.t::new, "OMSimpleT");
   epx X = a(erq.u::new, "OMWR");
   epx Y = a(erd.a::new, "ECP");
   epx Z = a(esc.i::new, "WMP");
   epx aa = a(eqz.a::new, "BTP");
   epx ab = a(erw.a::new, "Shipwreck");
   epx ac = a(ero.a::new, "NeFos");
   epx ad = a(epc::new, "jigsaw");

   epk load(epw var1, tw var2);

   private static epx a(epx $$0, String $$1) {
      return kf.a(md.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static epx a(epx.a $$0, String $$1) {
      return a((epx)$$0, $$1);
   }

   private static epx a(epx.b $$0, String $$1) {
      return a((epx)$$0, $$1);
   }

   public interface a extends epx {
      epk load(tw var1);

      @Override
      default epk load(epw $$0, tw $$1) {
         return this.load($$1);
      }
   }

   public interface b extends epx {
      epk load(etj var1, tw var2);

      @Override
      default epk load(epw $$0, tw $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
