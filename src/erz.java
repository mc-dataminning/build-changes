import java.util.Locale;

public interface erz {
   erz a = a(etm.a::new, "MSCorridor");
   erz b = a(etm.b::new, "MSCrossing");
   erz c = a(etm.d::new, "MSRoom");
   erz d = a(etm.e::new, "MSStairs");
   erz e = a(eto.a::new, "NeBCr");
   erz f = a(eto.b::new, "NeBEF");
   erz g = a(eto.c::new, "NeBS");
   erz h = a(eto.d::new, "NeCCS");
   erz i = a(eto.e::new, "NeCTB");
   erz j = a(eto.f::new, "NeCE");
   erz k = a(eto.g::new, "NeSCSC");
   erz l = a(eto.h::new, "NeSCLT");
   erz m = a(eto.i::new, "NeSC");
   erz n = a(eto.j::new, "NeSCRT");
   erz o = a(eto.k::new, "NeCSR");
   erz p = a(eto.l::new, "NeMT");
   erz q = a(eto.o::new, "NeRC");
   erz r = a(eto.p::new, "NeSR");
   erz s = a(eto.q::new, "NeStart");
   erz t = a(eua.a::new, "SHCC");
   erz u = a(eua.b::new, "SHFC");
   erz v = a(eua.c::new, "SH5C");
   erz w = a(eua.d::new, "SHLT");
   erz x = a(eua.e::new, "SHLi");
   erz y = a(eua.g::new, "SHPR");
   erz z = a(eua.h::new, "SHPH");
   erz A = a(eua.i::new, "SHRT");
   erz B = a(eua.j::new, "SHRC");
   erz C = a(eua.l::new, "SHSD");
   erz D = a(eua.m::new, "SHStart");
   erz E = a(eua.n::new, "SHS");
   erz F = a(eua.o::new, "SHSSD");
   erz G = a(etk::new, "TeJP");
   erz H = a(etu.a::a, "ORP");
   erz I = a(eth.a::new, "Iglu");
   erz J = a(etw::new, "RUPO");
   erz K = a(euc::new, "TeSH");
   erz L = a(etd::new, "TeDP");
   erz M = a(ets.h::new, "OMB");
   erz N = a(ets.j::new, "OMCR");
   erz O = a(ets.k::new, "OMDXR");
   erz P = a(ets.l::new, "OMDXYR");
   erz Q = a(ets.m::new, "OMDYR");
   erz R = a(ets.n::new, "OMDYZR");
   erz S = a(ets.o::new, "OMDZR");
   erz T = a(ets.p::new, "OMEntry");
   erz U = a(ets.q::new, "OMPenthouse");
   erz V = a(ets.s::new, "OMSimple");
   erz W = a(ets.t::new, "OMSimpleT");
   erz X = a(ets.u::new, "OMWR");
   erz Y = a(etf.a::new, "ECP");
   erz Z = a(eue.i::new, "WMP");
   erz aa = a(etb.a::new, "BTP");
   erz ab = a(ety.a::new, "Shipwreck");
   erz ac = a(etq.a::new, "NeFos");
   erz ad = a(ere::new, "jigsaw");

   erm load(ery var1, tz var2);

   private static erz a(erz $$0, String $$1) {
      return js.a(mg.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static erz a(erz.a $$0, String $$1) {
      return a((erz)$$0, $$1);
   }

   private static erz a(erz.b $$0, String $$1) {
      return a((erz)$$0, $$1);
   }

   public interface a extends erz {
      erm load(tz var1);

      @Override
      default erm load(ery $$0, tz $$1) {
         return this.load($$1);
      }
   }

   public interface b extends erz {
      erm load(evl var1, tz var2);

      @Override
      default erm load(ery $$0, tz $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
