import java.util.Locale;

public interface emo {
   emo a = a(eob.a::new, "MSCorridor");
   emo b = a(eob.b::new, "MSCrossing");
   emo c = a(eob.d::new, "MSRoom");
   emo d = a(eob.e::new, "MSStairs");
   emo e = a(eod.a::new, "NeBCr");
   emo f = a(eod.b::new, "NeBEF");
   emo g = a(eod.c::new, "NeBS");
   emo h = a(eod.d::new, "NeCCS");
   emo i = a(eod.e::new, "NeCTB");
   emo j = a(eod.f::new, "NeCE");
   emo k = a(eod.g::new, "NeSCSC");
   emo l = a(eod.h::new, "NeSCLT");
   emo m = a(eod.i::new, "NeSC");
   emo n = a(eod.j::new, "NeSCRT");
   emo o = a(eod.k::new, "NeCSR");
   emo p = a(eod.l::new, "NeMT");
   emo q = a(eod.o::new, "NeRC");
   emo r = a(eod.p::new, "NeSR");
   emo s = a(eod.q::new, "NeStart");
   emo t = a(eop.a::new, "SHCC");
   emo u = a(eop.b::new, "SHFC");
   emo v = a(eop.c::new, "SH5C");
   emo w = a(eop.d::new, "SHLT");
   emo x = a(eop.e::new, "SHLi");
   emo y = a(eop.g::new, "SHPR");
   emo z = a(eop.h::new, "SHPH");
   emo A = a(eop.i::new, "SHRT");
   emo B = a(eop.j::new, "SHRC");
   emo C = a(eop.l::new, "SHSD");
   emo D = a(eop.m::new, "SHStart");
   emo E = a(eop.n::new, "SHS");
   emo F = a(eop.o::new, "SHSSD");
   emo G = a(enz::new, "TeJP");
   emo H = a(eoj.a::a, "ORP");
   emo I = a(enw.a::new, "Iglu");
   emo J = a(eol::new, "RUPO");
   emo K = a(eor::new, "TeSH");
   emo L = a(ens::new, "TeDP");
   emo M = a(eoh.h::new, "OMB");
   emo N = a(eoh.j::new, "OMCR");
   emo O = a(eoh.k::new, "OMDXR");
   emo P = a(eoh.l::new, "OMDXYR");
   emo Q = a(eoh.m::new, "OMDYR");
   emo R = a(eoh.n::new, "OMDYZR");
   emo S = a(eoh.o::new, "OMDZR");
   emo T = a(eoh.p::new, "OMEntry");
   emo U = a(eoh.q::new, "OMPenthouse");
   emo V = a(eoh.s::new, "OMSimple");
   emo W = a(eoh.t::new, "OMSimpleT");
   emo X = a(eoh.u::new, "OMWR");
   emo Y = a(enu.a::new, "ECP");
   emo Z = a(eot.i::new, "WMP");
   emo aa = a(enq.a::new, "BTP");
   emo ab = a(eon.a::new, "Shipwreck");
   emo ac = a(eof.a::new, "NeFos");
   emo ad = a(elt::new, "jigsaw");

   emb load(emn var1, uk var2);

   private static emo a(emo $$0, String $$1) {
      return kd.a(ly.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static emo a(emo.a $$0, String $$1) {
      return a((emo)$$0, $$1);
   }

   private static emo a(emo.b $$0, String $$1) {
      return a((emo)$$0, $$1);
   }

   public interface a extends emo {
      emb load(uk var1);

      @Override
      default emb load(emn $$0, uk $$1) {
         return this.load($$1);
      }
   }

   public interface b extends emo {
      emb load(eqa var1, uk var2);

      @Override
      default emb load(emn $$0, uk $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
