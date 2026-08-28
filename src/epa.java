import java.util.Locale;

public interface epa {
   epa a = a(eqn.a::new, "MSCorridor");
   epa b = a(eqn.b::new, "MSCrossing");
   epa c = a(eqn.d::new, "MSRoom");
   epa d = a(eqn.e::new, "MSStairs");
   epa e = a(eqp.a::new, "NeBCr");
   epa f = a(eqp.b::new, "NeBEF");
   epa g = a(eqp.c::new, "NeBS");
   epa h = a(eqp.d::new, "NeCCS");
   epa i = a(eqp.e::new, "NeCTB");
   epa j = a(eqp.f::new, "NeCE");
   epa k = a(eqp.g::new, "NeSCSC");
   epa l = a(eqp.h::new, "NeSCLT");
   epa m = a(eqp.i::new, "NeSC");
   epa n = a(eqp.j::new, "NeSCRT");
   epa o = a(eqp.k::new, "NeCSR");
   epa p = a(eqp.l::new, "NeMT");
   epa q = a(eqp.o::new, "NeRC");
   epa r = a(eqp.p::new, "NeSR");
   epa s = a(eqp.q::new, "NeStart");
   epa t = a(erb.a::new, "SHCC");
   epa u = a(erb.b::new, "SHFC");
   epa v = a(erb.c::new, "SH5C");
   epa w = a(erb.d::new, "SHLT");
   epa x = a(erb.e::new, "SHLi");
   epa y = a(erb.g::new, "SHPR");
   epa z = a(erb.h::new, "SHPH");
   epa A = a(erb.i::new, "SHRT");
   epa B = a(erb.j::new, "SHRC");
   epa C = a(erb.l::new, "SHSD");
   epa D = a(erb.m::new, "SHStart");
   epa E = a(erb.n::new, "SHS");
   epa F = a(erb.o::new, "SHSSD");
   epa G = a(eql::new, "TeJP");
   epa H = a(eqv.a::a, "ORP");
   epa I = a(eqi.a::new, "Iglu");
   epa J = a(eqx::new, "RUPO");
   epa K = a(erd::new, "TeSH");
   epa L = a(eqe::new, "TeDP");
   epa M = a(eqt.h::new, "OMB");
   epa N = a(eqt.j::new, "OMCR");
   epa O = a(eqt.k::new, "OMDXR");
   epa P = a(eqt.l::new, "OMDXYR");
   epa Q = a(eqt.m::new, "OMDYR");
   epa R = a(eqt.n::new, "OMDYZR");
   epa S = a(eqt.o::new, "OMDZR");
   epa T = a(eqt.p::new, "OMEntry");
   epa U = a(eqt.q::new, "OMPenthouse");
   epa V = a(eqt.s::new, "OMSimple");
   epa W = a(eqt.t::new, "OMSimpleT");
   epa X = a(eqt.u::new, "OMWR");
   epa Y = a(eqg.a::new, "ECP");
   epa Z = a(erf.i::new, "WMP");
   epa aa = a(eqc.a::new, "BTP");
   epa ab = a(eqz.a::new, "Shipwreck");
   epa ac = a(eqr.a::new, "NeFos");
   epa ad = a(eof::new, "jigsaw");

   eon load(eoz var1, tq var2);

   private static epa a(epa $$0, String $$1) {
      return ke.a(mb.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static epa a(epa.a $$0, String $$1) {
      return a((epa)$$0, $$1);
   }

   private static epa a(epa.b $$0, String $$1) {
      return a((epa)$$0, $$1);
   }

   public interface a extends epa {
      eon load(tq var1);

      @Override
      default eon load(eoz $$0, tq $$1) {
         return this.load($$1);
      }
   }

   public interface b extends epa {
      eon load(esm var1, tq var2);

      @Override
      default eon load(eoz $$0, tq $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
