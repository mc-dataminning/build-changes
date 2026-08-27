import java.util.Locale;

public interface dvp {
   dvp a = a(dwu.a::new, "MSCorridor");
   dvp b = a(dwu.b::new, "MSCrossing");
   dvp c = a(dwu.d::new, "MSRoom");
   dvp d = a(dwu.e::new, "MSStairs");
   dvp e = a(dww.a::new, "NeBCr");
   dvp f = a(dww.b::new, "NeBEF");
   dvp g = a(dww.c::new, "NeBS");
   dvp h = a(dww.d::new, "NeCCS");
   dvp i = a(dww.e::new, "NeCTB");
   dvp j = a(dww.f::new, "NeCE");
   dvp k = a(dww.g::new, "NeSCSC");
   dvp l = a(dww.h::new, "NeSCLT");
   dvp m = a(dww.i::new, "NeSC");
   dvp n = a(dww.j::new, "NeSCRT");
   dvp o = a(dww.k::new, "NeCSR");
   dvp p = a(dww.l::new, "NeMT");
   dvp q = a(dww.o::new, "NeRC");
   dvp r = a(dww.p::new, "NeSR");
   dvp s = a(dww.q::new, "NeStart");
   dvp t = a(dxi.a::new, "SHCC");
   dvp u = a(dxi.b::new, "SHFC");
   dvp v = a(dxi.c::new, "SH5C");
   dvp w = a(dxi.d::new, "SHLT");
   dvp x = a(dxi.e::new, "SHLi");
   dvp y = a(dxi.g::new, "SHPR");
   dvp z = a(dxi.h::new, "SHPH");
   dvp A = a(dxi.i::new, "SHRT");
   dvp B = a(dxi.j::new, "SHRC");
   dvp C = a(dxi.l::new, "SHSD");
   dvp D = a(dxi.m::new, "SHStart");
   dvp E = a(dxi.n::new, "SHS");
   dvp F = a(dxi.o::new, "SHSSD");
   dvp G = a(dws::new, "TeJP");
   dvp H = a(dxc.a::a, "ORP");
   dvp I = a(dwp.a::new, "Iglu");
   dvp J = a(dxe::new, "RUPO");
   dvp K = a(dxk::new, "TeSH");
   dvp L = a(dwl::new, "TeDP");
   dvp M = a(dxa.h::new, "OMB");
   dvp N = a(dxa.j::new, "OMCR");
   dvp O = a(dxa.k::new, "OMDXR");
   dvp P = a(dxa.l::new, "OMDXYR");
   dvp Q = a(dxa.m::new, "OMDYR");
   dvp R = a(dxa.n::new, "OMDYZR");
   dvp S = a(dxa.o::new, "OMDZR");
   dvp T = a(dxa.p::new, "OMEntry");
   dvp U = a(dxa.q::new, "OMPenthouse");
   dvp V = a(dxa.s::new, "OMSimple");
   dvp W = a(dxa.t::new, "OMSimpleT");
   dvp X = a(dxa.u::new, "OMWR");
   dvp Y = a(dwn.a::new, "ECP");
   dvp Z = a(dxm.i::new, "WMP");
   dvp aa = a(dwj.a::new, "BTP");
   dvp ab = a(dxg.a::new, "Shipwreck");
   dvp ac = a(dwy.a::new, "NeFos");
   dvp ad = a(duu::new, "jigsaw");

   dvc load(dvo var1, qr var2);

   private static dvp a(dvp $$0, String $$1) {
      return hr.a(jb.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dvp a(dvp.a $$0, String $$1) {
      return a((dvp)$$0, $$1);
   }

   private static dvp a(dvp.b $$0, String $$1) {
      return a((dvp)$$0, $$1);
   }

   public interface a extends dvp {
      dvc load(qr var1);

      @Override
      default dvc load(dvo $$0, qr $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dvp {
      dvc load(dys var1, qr var2);

      @Override
      default dvc load(dvo $$0, qr $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
