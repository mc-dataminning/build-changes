import java.util.Locale;

public interface erk {
   erk a = a(esx.a::new, "MSCorridor");
   erk b = a(esx.b::new, "MSCrossing");
   erk c = a(esx.d::new, "MSRoom");
   erk d = a(esx.e::new, "MSStairs");
   erk e = a(esz.a::new, "NeBCr");
   erk f = a(esz.b::new, "NeBEF");
   erk g = a(esz.c::new, "NeBS");
   erk h = a(esz.d::new, "NeCCS");
   erk i = a(esz.e::new, "NeCTB");
   erk j = a(esz.f::new, "NeCE");
   erk k = a(esz.g::new, "NeSCSC");
   erk l = a(esz.h::new, "NeSCLT");
   erk m = a(esz.i::new, "NeSC");
   erk n = a(esz.j::new, "NeSCRT");
   erk o = a(esz.k::new, "NeCSR");
   erk p = a(esz.l::new, "NeMT");
   erk q = a(esz.o::new, "NeRC");
   erk r = a(esz.p::new, "NeSR");
   erk s = a(esz.q::new, "NeStart");
   erk t = a(etl.a::new, "SHCC");
   erk u = a(etl.b::new, "SHFC");
   erk v = a(etl.c::new, "SH5C");
   erk w = a(etl.d::new, "SHLT");
   erk x = a(etl.e::new, "SHLi");
   erk y = a(etl.g::new, "SHPR");
   erk z = a(etl.h::new, "SHPH");
   erk A = a(etl.i::new, "SHRT");
   erk B = a(etl.j::new, "SHRC");
   erk C = a(etl.l::new, "SHSD");
   erk D = a(etl.m::new, "SHStart");
   erk E = a(etl.n::new, "SHS");
   erk F = a(etl.o::new, "SHSSD");
   erk G = a(esv::new, "TeJP");
   erk H = a(etf.a::a, "ORP");
   erk I = a(ess.a::new, "Iglu");
   erk J = a(eth::new, "RUPO");
   erk K = a(etn::new, "TeSH");
   erk L = a(eso::new, "TeDP");
   erk M = a(etd.h::new, "OMB");
   erk N = a(etd.j::new, "OMCR");
   erk O = a(etd.k::new, "OMDXR");
   erk P = a(etd.l::new, "OMDXYR");
   erk Q = a(etd.m::new, "OMDYR");
   erk R = a(etd.n::new, "OMDYZR");
   erk S = a(etd.o::new, "OMDZR");
   erk T = a(etd.p::new, "OMEntry");
   erk U = a(etd.q::new, "OMPenthouse");
   erk V = a(etd.s::new, "OMSimple");
   erk W = a(etd.t::new, "OMSimpleT");
   erk X = a(etd.u::new, "OMWR");
   erk Y = a(esq.a::new, "ECP");
   erk Z = a(etp.i::new, "WMP");
   erk aa = a(esm.a::new, "BTP");
   erk ab = a(etj.a::new, "Shipwreck");
   erk ac = a(etb.a::new, "NeFos");
   erk ad = a(eqp::new, "jigsaw");

   eqx load(erj var1, tz var2);

   private static erk a(erk $$0, String $$1) {
      return jr.a(mf.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static erk a(erk.a $$0, String $$1) {
      return a((erk)$$0, $$1);
   }

   private static erk a(erk.b $$0, String $$1) {
      return a((erk)$$0, $$1);
   }

   public interface a extends erk {
      eqx load(tz var1);

      @Override
      default eqx load(erj $$0, tz $$1) {
         return this.load($$1);
      }
   }

   public interface b extends erk {
      eqx load(euw var1, tz var2);

      @Override
      default eqx load(erj $$0, tz $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
