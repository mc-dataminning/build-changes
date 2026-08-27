import java.util.Locale;

public interface dvt {
   dvt a = a(dwy.a::new, "MSCorridor");
   dvt b = a(dwy.b::new, "MSCrossing");
   dvt c = a(dwy.d::new, "MSRoom");
   dvt d = a(dwy.e::new, "MSStairs");
   dvt e = a(dxa.a::new, "NeBCr");
   dvt f = a(dxa.b::new, "NeBEF");
   dvt g = a(dxa.c::new, "NeBS");
   dvt h = a(dxa.d::new, "NeCCS");
   dvt i = a(dxa.e::new, "NeCTB");
   dvt j = a(dxa.f::new, "NeCE");
   dvt k = a(dxa.g::new, "NeSCSC");
   dvt l = a(dxa.h::new, "NeSCLT");
   dvt m = a(dxa.i::new, "NeSC");
   dvt n = a(dxa.j::new, "NeSCRT");
   dvt o = a(dxa.k::new, "NeCSR");
   dvt p = a(dxa.l::new, "NeMT");
   dvt q = a(dxa.o::new, "NeRC");
   dvt r = a(dxa.p::new, "NeSR");
   dvt s = a(dxa.q::new, "NeStart");
   dvt t = a(dxm.a::new, "SHCC");
   dvt u = a(dxm.b::new, "SHFC");
   dvt v = a(dxm.c::new, "SH5C");
   dvt w = a(dxm.d::new, "SHLT");
   dvt x = a(dxm.e::new, "SHLi");
   dvt y = a(dxm.g::new, "SHPR");
   dvt z = a(dxm.h::new, "SHPH");
   dvt A = a(dxm.i::new, "SHRT");
   dvt B = a(dxm.j::new, "SHRC");
   dvt C = a(dxm.l::new, "SHSD");
   dvt D = a(dxm.m::new, "SHStart");
   dvt E = a(dxm.n::new, "SHS");
   dvt F = a(dxm.o::new, "SHSSD");
   dvt G = a(dww::new, "TeJP");
   dvt H = a(dxg.a::a, "ORP");
   dvt I = a(dwt.a::new, "Iglu");
   dvt J = a(dxi::new, "RUPO");
   dvt K = a(dxo::new, "TeSH");
   dvt L = a(dwp::new, "TeDP");
   dvt M = a(dxe.h::new, "OMB");
   dvt N = a(dxe.j::new, "OMCR");
   dvt O = a(dxe.k::new, "OMDXR");
   dvt P = a(dxe.l::new, "OMDXYR");
   dvt Q = a(dxe.m::new, "OMDYR");
   dvt R = a(dxe.n::new, "OMDYZR");
   dvt S = a(dxe.o::new, "OMDZR");
   dvt T = a(dxe.p::new, "OMEntry");
   dvt U = a(dxe.q::new, "OMPenthouse");
   dvt V = a(dxe.s::new, "OMSimple");
   dvt W = a(dxe.t::new, "OMSimpleT");
   dvt X = a(dxe.u::new, "OMWR");
   dvt Y = a(dwr.a::new, "ECP");
   dvt Z = a(dxq.i::new, "WMP");
   dvt aa = a(dwn.a::new, "BTP");
   dvt ab = a(dxk.a::new, "Shipwreck");
   dvt ac = a(dxc.a::new, "NeFos");
   dvt ad = a(duy::new, "jigsaw");

   dvg load(dvs var1, qw var2);

   private static dvt a(dvt $$0, String $$1) {
      return hq.a(jb.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dvt a(dvt.a $$0, String $$1) {
      return a((dvt)$$0, $$1);
   }

   private static dvt a(dvt.b $$0, String $$1) {
      return a((dvt)$$0, $$1);
   }

   public interface a extends dvt {
      dvg load(qw var1);

      @Override
      default dvg load(dvs $$0, qw $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dvt {
      dvg load(dyw var1, qw var2);

      @Override
      default dvg load(dvs $$0, qw $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
