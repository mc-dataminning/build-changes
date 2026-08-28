import java.util.Locale;

public interface ess {
   ess a = a(euf.a::new, "MSCorridor");
   ess b = a(euf.b::new, "MSCrossing");
   ess c = a(euf.d::new, "MSRoom");
   ess d = a(euf.e::new, "MSStairs");
   ess e = a(euh.a::new, "NeBCr");
   ess f = a(euh.b::new, "NeBEF");
   ess g = a(euh.c::new, "NeBS");
   ess h = a(euh.d::new, "NeCCS");
   ess i = a(euh.e::new, "NeCTB");
   ess j = a(euh.f::new, "NeCE");
   ess k = a(euh.g::new, "NeSCSC");
   ess l = a(euh.h::new, "NeSCLT");
   ess m = a(euh.i::new, "NeSC");
   ess n = a(euh.j::new, "NeSCRT");
   ess o = a(euh.k::new, "NeCSR");
   ess p = a(euh.l::new, "NeMT");
   ess q = a(euh.o::new, "NeRC");
   ess r = a(euh.p::new, "NeSR");
   ess s = a(euh.q::new, "NeStart");
   ess t = a(eut.a::new, "SHCC");
   ess u = a(eut.b::new, "SHFC");
   ess v = a(eut.c::new, "SH5C");
   ess w = a(eut.d::new, "SHLT");
   ess x = a(eut.e::new, "SHLi");
   ess y = a(eut.g::new, "SHPR");
   ess z = a(eut.h::new, "SHPH");
   ess A = a(eut.i::new, "SHRT");
   ess B = a(eut.j::new, "SHRC");
   ess C = a(eut.l::new, "SHSD");
   ess D = a(eut.m::new, "SHStart");
   ess E = a(eut.n::new, "SHS");
   ess F = a(eut.o::new, "SHSSD");
   ess G = a(eud::new, "TeJP");
   ess H = a(eun.a::a, "ORP");
   ess I = a(eua.a::new, "Iglu");
   ess J = a(eup::new, "RUPO");
   ess K = a(euv::new, "TeSH");
   ess L = a(etw::new, "TeDP");
   ess M = a(eul.h::new, "OMB");
   ess N = a(eul.j::new, "OMCR");
   ess O = a(eul.k::new, "OMDXR");
   ess P = a(eul.l::new, "OMDXYR");
   ess Q = a(eul.m::new, "OMDYR");
   ess R = a(eul.n::new, "OMDYZR");
   ess S = a(eul.o::new, "OMDZR");
   ess T = a(eul.p::new, "OMEntry");
   ess U = a(eul.q::new, "OMPenthouse");
   ess V = a(eul.s::new, "OMSimple");
   ess W = a(eul.t::new, "OMSimpleT");
   ess X = a(eul.u::new, "OMWR");
   ess Y = a(ety.a::new, "ECP");
   ess Z = a(eux.i::new, "WMP");
   ess aa = a(etu.a::new, "BTP");
   ess ab = a(eur.a::new, "Shipwreck");
   ess ac = a(euj.a::new, "NeFos");
   ess ad = a(erx::new, "jigsaw");

   esf load(esr var1, tz var2);

   private static ess a(ess $$0, String $$1) {
      return js.a(mg.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ess a(ess.a $$0, String $$1) {
      return a((ess)$$0, $$1);
   }

   private static ess a(ess.b $$0, String $$1) {
      return a((ess)$$0, $$1);
   }

   public interface a extends ess {
      esf load(tz var1);

      @Override
      default esf load(esr $$0, tz $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ess {
      esf load(ewe var1, tz var2);

      @Override
      default esf load(esr $$0, tz $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
