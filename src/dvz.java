import java.util.Locale;

public interface dvz {
   dvz a = a(dxe.a::new, "MSCorridor");
   dvz b = a(dxe.b::new, "MSCrossing");
   dvz c = a(dxe.d::new, "MSRoom");
   dvz d = a(dxe.e::new, "MSStairs");
   dvz e = a(dxg.a::new, "NeBCr");
   dvz f = a(dxg.b::new, "NeBEF");
   dvz g = a(dxg.c::new, "NeBS");
   dvz h = a(dxg.d::new, "NeCCS");
   dvz i = a(dxg.e::new, "NeCTB");
   dvz j = a(dxg.f::new, "NeCE");
   dvz k = a(dxg.g::new, "NeSCSC");
   dvz l = a(dxg.h::new, "NeSCLT");
   dvz m = a(dxg.i::new, "NeSC");
   dvz n = a(dxg.j::new, "NeSCRT");
   dvz o = a(dxg.k::new, "NeCSR");
   dvz p = a(dxg.l::new, "NeMT");
   dvz q = a(dxg.o::new, "NeRC");
   dvz r = a(dxg.p::new, "NeSR");
   dvz s = a(dxg.q::new, "NeStart");
   dvz t = a(dxs.a::new, "SHCC");
   dvz u = a(dxs.b::new, "SHFC");
   dvz v = a(dxs.c::new, "SH5C");
   dvz w = a(dxs.d::new, "SHLT");
   dvz x = a(dxs.e::new, "SHLi");
   dvz y = a(dxs.g::new, "SHPR");
   dvz z = a(dxs.h::new, "SHPH");
   dvz A = a(dxs.i::new, "SHRT");
   dvz B = a(dxs.j::new, "SHRC");
   dvz C = a(dxs.l::new, "SHSD");
   dvz D = a(dxs.m::new, "SHStart");
   dvz E = a(dxs.n::new, "SHS");
   dvz F = a(dxs.o::new, "SHSSD");
   dvz G = a(dxc::new, "TeJP");
   dvz H = a(dxm.a::a, "ORP");
   dvz I = a(dwz.a::new, "Iglu");
   dvz J = a(dxo::new, "RUPO");
   dvz K = a(dxu::new, "TeSH");
   dvz L = a(dwv::new, "TeDP");
   dvz M = a(dxk.h::new, "OMB");
   dvz N = a(dxk.j::new, "OMCR");
   dvz O = a(dxk.k::new, "OMDXR");
   dvz P = a(dxk.l::new, "OMDXYR");
   dvz Q = a(dxk.m::new, "OMDYR");
   dvz R = a(dxk.n::new, "OMDYZR");
   dvz S = a(dxk.o::new, "OMDZR");
   dvz T = a(dxk.p::new, "OMEntry");
   dvz U = a(dxk.q::new, "OMPenthouse");
   dvz V = a(dxk.s::new, "OMSimple");
   dvz W = a(dxk.t::new, "OMSimpleT");
   dvz X = a(dxk.u::new, "OMWR");
   dvz Y = a(dwx.a::new, "ECP");
   dvz Z = a(dxw.i::new, "WMP");
   dvz aa = a(dwt.a::new, "BTP");
   dvz ab = a(dxq.a::new, "Shipwreck");
   dvz ac = a(dxi.a::new, "NeFos");
   dvz ad = a(dve::new, "jigsaw");

   dvm load(dvy var1, qx var2);

   private static dvz a(dvz $$0, String $$1) {
      return ht.a(jd.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dvz a(dvz.a $$0, String $$1) {
      return a((dvz)$$0, $$1);
   }

   private static dvz a(dvz.b $$0, String $$1) {
      return a((dvz)$$0, $$1);
   }

   public interface a extends dvz {
      dvm load(qx var1);

      @Override
      default dvm load(dvy $$0, qx $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dvz {
      dvm load(dzc var1, qx var2);

      @Override
      default dvm load(dvy $$0, qx $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
