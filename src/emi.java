import java.util.Locale;

public interface emi {
   emi a = a(env.a::new, "MSCorridor");
   emi b = a(env.b::new, "MSCrossing");
   emi c = a(env.d::new, "MSRoom");
   emi d = a(env.e::new, "MSStairs");
   emi e = a(enx.a::new, "NeBCr");
   emi f = a(enx.b::new, "NeBEF");
   emi g = a(enx.c::new, "NeBS");
   emi h = a(enx.d::new, "NeCCS");
   emi i = a(enx.e::new, "NeCTB");
   emi j = a(enx.f::new, "NeCE");
   emi k = a(enx.g::new, "NeSCSC");
   emi l = a(enx.h::new, "NeSCLT");
   emi m = a(enx.i::new, "NeSC");
   emi n = a(enx.j::new, "NeSCRT");
   emi o = a(enx.k::new, "NeCSR");
   emi p = a(enx.l::new, "NeMT");
   emi q = a(enx.o::new, "NeRC");
   emi r = a(enx.p::new, "NeSR");
   emi s = a(enx.q::new, "NeStart");
   emi t = a(eoj.a::new, "SHCC");
   emi u = a(eoj.b::new, "SHFC");
   emi v = a(eoj.c::new, "SH5C");
   emi w = a(eoj.d::new, "SHLT");
   emi x = a(eoj.e::new, "SHLi");
   emi y = a(eoj.g::new, "SHPR");
   emi z = a(eoj.h::new, "SHPH");
   emi A = a(eoj.i::new, "SHRT");
   emi B = a(eoj.j::new, "SHRC");
   emi C = a(eoj.l::new, "SHSD");
   emi D = a(eoj.m::new, "SHStart");
   emi E = a(eoj.n::new, "SHS");
   emi F = a(eoj.o::new, "SHSSD");
   emi G = a(ent::new, "TeJP");
   emi H = a(eod.a::a, "ORP");
   emi I = a(enq.a::new, "Iglu");
   emi J = a(eof::new, "RUPO");
   emi K = a(eol::new, "TeSH");
   emi L = a(enm::new, "TeDP");
   emi M = a(eob.h::new, "OMB");
   emi N = a(eob.j::new, "OMCR");
   emi O = a(eob.k::new, "OMDXR");
   emi P = a(eob.l::new, "OMDXYR");
   emi Q = a(eob.m::new, "OMDYR");
   emi R = a(eob.n::new, "OMDYZR");
   emi S = a(eob.o::new, "OMDZR");
   emi T = a(eob.p::new, "OMEntry");
   emi U = a(eob.q::new, "OMPenthouse");
   emi V = a(eob.s::new, "OMSimple");
   emi W = a(eob.t::new, "OMSimpleT");
   emi X = a(eob.u::new, "OMWR");
   emi Y = a(eno.a::new, "ECP");
   emi Z = a(eon.i::new, "WMP");
   emi aa = a(enk.a::new, "BTP");
   emi ab = a(eoh.a::new, "Shipwreck");
   emi ac = a(enz.a::new, "NeFos");
   emi ad = a(eln::new, "jigsaw");

   elv load(emh var1, uj var2);

   private static emi a(emi $$0, String $$1) {
      return kc.a(lx.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static emi a(emi.a $$0, String $$1) {
      return a((emi)$$0, $$1);
   }

   private static emi a(emi.b $$0, String $$1) {
      return a((emi)$$0, $$1);
   }

   public interface a extends emi {
      elv load(uj var1);

      @Override
      default elv load(emh $$0, uj $$1) {
         return this.load($$1);
      }
   }

   public interface b extends emi {
      elv load(epu var1, uj var2);

      @Override
      default elv load(emh $$0, uj $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
