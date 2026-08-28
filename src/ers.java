import java.util.Locale;

public interface ers {
   ers a = a(etf.a::new, "MSCorridor");
   ers b = a(etf.b::new, "MSCrossing");
   ers c = a(etf.d::new, "MSRoom");
   ers d = a(etf.e::new, "MSStairs");
   ers e = a(eth.a::new, "NeBCr");
   ers f = a(eth.b::new, "NeBEF");
   ers g = a(eth.c::new, "NeBS");
   ers h = a(eth.d::new, "NeCCS");
   ers i = a(eth.e::new, "NeCTB");
   ers j = a(eth.f::new, "NeCE");
   ers k = a(eth.g::new, "NeSCSC");
   ers l = a(eth.h::new, "NeSCLT");
   ers m = a(eth.i::new, "NeSC");
   ers n = a(eth.j::new, "NeSCRT");
   ers o = a(eth.k::new, "NeCSR");
   ers p = a(eth.l::new, "NeMT");
   ers q = a(eth.o::new, "NeRC");
   ers r = a(eth.p::new, "NeSR");
   ers s = a(eth.q::new, "NeStart");
   ers t = a(ett.a::new, "SHCC");
   ers u = a(ett.b::new, "SHFC");
   ers v = a(ett.c::new, "SH5C");
   ers w = a(ett.d::new, "SHLT");
   ers x = a(ett.e::new, "SHLi");
   ers y = a(ett.g::new, "SHPR");
   ers z = a(ett.h::new, "SHPH");
   ers A = a(ett.i::new, "SHRT");
   ers B = a(ett.j::new, "SHRC");
   ers C = a(ett.l::new, "SHSD");
   ers D = a(ett.m::new, "SHStart");
   ers E = a(ett.n::new, "SHS");
   ers F = a(ett.o::new, "SHSSD");
   ers G = a(etd::new, "TeJP");
   ers H = a(etn.a::a, "ORP");
   ers I = a(eta.a::new, "Iglu");
   ers J = a(etp::new, "RUPO");
   ers K = a(etv::new, "TeSH");
   ers L = a(esw::new, "TeDP");
   ers M = a(etl.h::new, "OMB");
   ers N = a(etl.j::new, "OMCR");
   ers O = a(etl.k::new, "OMDXR");
   ers P = a(etl.l::new, "OMDXYR");
   ers Q = a(etl.m::new, "OMDYR");
   ers R = a(etl.n::new, "OMDYZR");
   ers S = a(etl.o::new, "OMDZR");
   ers T = a(etl.p::new, "OMEntry");
   ers U = a(etl.q::new, "OMPenthouse");
   ers V = a(etl.s::new, "OMSimple");
   ers W = a(etl.t::new, "OMSimpleT");
   ers X = a(etl.u::new, "OMWR");
   ers Y = a(esy.a::new, "ECP");
   ers Z = a(etx.i::new, "WMP");
   ers aa = a(esu.a::new, "BTP");
   ers ab = a(etr.a::new, "Shipwreck");
   ers ac = a(etj.a::new, "NeFos");
   ers ad = a(eqx::new, "jigsaw");

   erf load(err var1, tz var2);

   private static ers a(ers $$0, String $$1) {
      return jr.a(mf.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ers a(ers.a $$0, String $$1) {
      return a((ers)$$0, $$1);
   }

   private static ers a(ers.b $$0, String $$1) {
      return a((ers)$$0, $$1);
   }

   public interface a extends ers {
      erf load(tz var1);

      @Override
      default erf load(err $$0, tz $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ers {
      erf load(eve var1, tz var2);

      @Override
      default erf load(err $$0, tz $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
