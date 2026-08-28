import java.util.Locale;

public interface emz {
   emz a = a(eom.a::new, "MSCorridor");
   emz b = a(eom.b::new, "MSCrossing");
   emz c = a(eom.d::new, "MSRoom");
   emz d = a(eom.e::new, "MSStairs");
   emz e = a(eoo.a::new, "NeBCr");
   emz f = a(eoo.b::new, "NeBEF");
   emz g = a(eoo.c::new, "NeBS");
   emz h = a(eoo.d::new, "NeCCS");
   emz i = a(eoo.e::new, "NeCTB");
   emz j = a(eoo.f::new, "NeCE");
   emz k = a(eoo.g::new, "NeSCSC");
   emz l = a(eoo.h::new, "NeSCLT");
   emz m = a(eoo.i::new, "NeSC");
   emz n = a(eoo.j::new, "NeSCRT");
   emz o = a(eoo.k::new, "NeCSR");
   emz p = a(eoo.l::new, "NeMT");
   emz q = a(eoo.o::new, "NeRC");
   emz r = a(eoo.p::new, "NeSR");
   emz s = a(eoo.q::new, "NeStart");
   emz t = a(epa.a::new, "SHCC");
   emz u = a(epa.b::new, "SHFC");
   emz v = a(epa.c::new, "SH5C");
   emz w = a(epa.d::new, "SHLT");
   emz x = a(epa.e::new, "SHLi");
   emz y = a(epa.g::new, "SHPR");
   emz z = a(epa.h::new, "SHPH");
   emz A = a(epa.i::new, "SHRT");
   emz B = a(epa.j::new, "SHRC");
   emz C = a(epa.l::new, "SHSD");
   emz D = a(epa.m::new, "SHStart");
   emz E = a(epa.n::new, "SHS");
   emz F = a(epa.o::new, "SHSSD");
   emz G = a(eok::new, "TeJP");
   emz H = a(eou.a::a, "ORP");
   emz I = a(eoh.a::new, "Iglu");
   emz J = a(eow::new, "RUPO");
   emz K = a(epc::new, "TeSH");
   emz L = a(eod::new, "TeDP");
   emz M = a(eos.h::new, "OMB");
   emz N = a(eos.j::new, "OMCR");
   emz O = a(eos.k::new, "OMDXR");
   emz P = a(eos.l::new, "OMDXYR");
   emz Q = a(eos.m::new, "OMDYR");
   emz R = a(eos.n::new, "OMDYZR");
   emz S = a(eos.o::new, "OMDZR");
   emz T = a(eos.p::new, "OMEntry");
   emz U = a(eos.q::new, "OMPenthouse");
   emz V = a(eos.s::new, "OMSimple");
   emz W = a(eos.t::new, "OMSimpleT");
   emz X = a(eos.u::new, "OMWR");
   emz Y = a(eof.a::new, "ECP");
   emz Z = a(epe.i::new, "WMP");
   emz aa = a(eob.a::new, "BTP");
   emz ab = a(eoy.a::new, "Shipwreck");
   emz ac = a(eoq.a::new, "NeFos");
   emz ad = a(eme::new, "jigsaw");

   emm load(emy var1, ul var2);

   private static emz a(emz $$0, String $$1) {
      return kd.a(lz.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static emz a(emz.a $$0, String $$1) {
      return a((emz)$$0, $$1);
   }

   private static emz a(emz.b $$0, String $$1) {
      return a((emz)$$0, $$1);
   }

   public interface a extends emz {
      emm load(ul var1);

      @Override
      default emm load(emy $$0, ul $$1) {
         return this.load($$1);
      }
   }

   public interface b extends emz {
      emm load(eql var1, ul var2);

      @Override
      default emm load(emy $$0, ul $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
