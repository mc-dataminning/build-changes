import java.util.Locale;

public interface ems {
   ems a = a(eof.a::new, "MSCorridor");
   ems b = a(eof.b::new, "MSCrossing");
   ems c = a(eof.d::new, "MSRoom");
   ems d = a(eof.e::new, "MSStairs");
   ems e = a(eoh.a::new, "NeBCr");
   ems f = a(eoh.b::new, "NeBEF");
   ems g = a(eoh.c::new, "NeBS");
   ems h = a(eoh.d::new, "NeCCS");
   ems i = a(eoh.e::new, "NeCTB");
   ems j = a(eoh.f::new, "NeCE");
   ems k = a(eoh.g::new, "NeSCSC");
   ems l = a(eoh.h::new, "NeSCLT");
   ems m = a(eoh.i::new, "NeSC");
   ems n = a(eoh.j::new, "NeSCRT");
   ems o = a(eoh.k::new, "NeCSR");
   ems p = a(eoh.l::new, "NeMT");
   ems q = a(eoh.o::new, "NeRC");
   ems r = a(eoh.p::new, "NeSR");
   ems s = a(eoh.q::new, "NeStart");
   ems t = a(eot.a::new, "SHCC");
   ems u = a(eot.b::new, "SHFC");
   ems v = a(eot.c::new, "SH5C");
   ems w = a(eot.d::new, "SHLT");
   ems x = a(eot.e::new, "SHLi");
   ems y = a(eot.g::new, "SHPR");
   ems z = a(eot.h::new, "SHPH");
   ems A = a(eot.i::new, "SHRT");
   ems B = a(eot.j::new, "SHRC");
   ems C = a(eot.l::new, "SHSD");
   ems D = a(eot.m::new, "SHStart");
   ems E = a(eot.n::new, "SHS");
   ems F = a(eot.o::new, "SHSSD");
   ems G = a(eod::new, "TeJP");
   ems H = a(eon.a::a, "ORP");
   ems I = a(eoa.a::new, "Iglu");
   ems J = a(eop::new, "RUPO");
   ems K = a(eov::new, "TeSH");
   ems L = a(enw::new, "TeDP");
   ems M = a(eol.h::new, "OMB");
   ems N = a(eol.j::new, "OMCR");
   ems O = a(eol.k::new, "OMDXR");
   ems P = a(eol.l::new, "OMDXYR");
   ems Q = a(eol.m::new, "OMDYR");
   ems R = a(eol.n::new, "OMDYZR");
   ems S = a(eol.o::new, "OMDZR");
   ems T = a(eol.p::new, "OMEntry");
   ems U = a(eol.q::new, "OMPenthouse");
   ems V = a(eol.s::new, "OMSimple");
   ems W = a(eol.t::new, "OMSimpleT");
   ems X = a(eol.u::new, "OMWR");
   ems Y = a(eny.a::new, "ECP");
   ems Z = a(eox.i::new, "WMP");
   ems aa = a(enu.a::new, "BTP");
   ems ab = a(eor.a::new, "Shipwreck");
   ems ac = a(eoj.a::new, "NeFos");
   ems ad = a(elx::new, "jigsaw");

   emf load(emr var1, un var2);

   private static ems a(ems $$0, String $$1) {
      return kd.a(lz.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ems a(ems.a $$0, String $$1) {
      return a((ems)$$0, $$1);
   }

   private static ems a(ems.b $$0, String $$1) {
      return a((ems)$$0, $$1);
   }

   public interface a extends ems {
      emf load(un var1);

      @Override
      default emf load(emr $$0, un $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ems {
      emf load(eqe var1, un var2);

      @Override
      default emf load(emr $$0, un $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
