import java.util.Locale;

public interface elx {
   elx a = a(enk.a::new, "MSCorridor");
   elx b = a(enk.b::new, "MSCrossing");
   elx c = a(enk.d::new, "MSRoom");
   elx d = a(enk.e::new, "MSStairs");
   elx e = a(enm.a::new, "NeBCr");
   elx f = a(enm.b::new, "NeBEF");
   elx g = a(enm.c::new, "NeBS");
   elx h = a(enm.d::new, "NeCCS");
   elx i = a(enm.e::new, "NeCTB");
   elx j = a(enm.f::new, "NeCE");
   elx k = a(enm.g::new, "NeSCSC");
   elx l = a(enm.h::new, "NeSCLT");
   elx m = a(enm.i::new, "NeSC");
   elx n = a(enm.j::new, "NeSCRT");
   elx o = a(enm.k::new, "NeCSR");
   elx p = a(enm.l::new, "NeMT");
   elx q = a(enm.o::new, "NeRC");
   elx r = a(enm.p::new, "NeSR");
   elx s = a(enm.q::new, "NeStart");
   elx t = a(eny.a::new, "SHCC");
   elx u = a(eny.b::new, "SHFC");
   elx v = a(eny.c::new, "SH5C");
   elx w = a(eny.d::new, "SHLT");
   elx x = a(eny.e::new, "SHLi");
   elx y = a(eny.g::new, "SHPR");
   elx z = a(eny.h::new, "SHPH");
   elx A = a(eny.i::new, "SHRT");
   elx B = a(eny.j::new, "SHRC");
   elx C = a(eny.l::new, "SHSD");
   elx D = a(eny.m::new, "SHStart");
   elx E = a(eny.n::new, "SHS");
   elx F = a(eny.o::new, "SHSSD");
   elx G = a(eni::new, "TeJP");
   elx H = a(ens.a::a, "ORP");
   elx I = a(enf.a::new, "Iglu");
   elx J = a(enu::new, "RUPO");
   elx K = a(eoa::new, "TeSH");
   elx L = a(enb::new, "TeDP");
   elx M = a(enq.h::new, "OMB");
   elx N = a(enq.j::new, "OMCR");
   elx O = a(enq.k::new, "OMDXR");
   elx P = a(enq.l::new, "OMDXYR");
   elx Q = a(enq.m::new, "OMDYR");
   elx R = a(enq.n::new, "OMDYZR");
   elx S = a(enq.o::new, "OMDZR");
   elx T = a(enq.p::new, "OMEntry");
   elx U = a(enq.q::new, "OMPenthouse");
   elx V = a(enq.s::new, "OMSimple");
   elx W = a(enq.t::new, "OMSimpleT");
   elx X = a(enq.u::new, "OMWR");
   elx Y = a(end.a::new, "ECP");
   elx Z = a(eoc.i::new, "WMP");
   elx aa = a(emz.a::new, "BTP");
   elx ab = a(enw.a::new, "Shipwreck");
   elx ac = a(eno.a::new, "NeFos");
   elx ad = a(elc::new, "jigsaw");

   elk load(elw var1, ug var2);

   private static elx a(elx $$0, String $$1) {
      return kb.a(lv.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static elx a(elx.a $$0, String $$1) {
      return a((elx)$$0, $$1);
   }

   private static elx a(elx.b $$0, String $$1) {
      return a((elx)$$0, $$1);
   }

   public interface a extends elx {
      elk load(ug var1);

      @Override
      default elk load(elw $$0, ug $$1) {
         return this.load($$1);
      }
   }

   public interface b extends elx {
      elk load(epj var1, ug var2);

      @Override
      default elk load(elw $$0, ug $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
