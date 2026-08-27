import java.util.Locale;

public interface dxy {
   dxy a = a(dzk.a::new, "MSCorridor");
   dxy b = a(dzk.b::new, "MSCrossing");
   dxy c = a(dzk.d::new, "MSRoom");
   dxy d = a(dzk.e::new, "MSStairs");
   dxy e = a(dzm.a::new, "NeBCr");
   dxy f = a(dzm.b::new, "NeBEF");
   dxy g = a(dzm.c::new, "NeBS");
   dxy h = a(dzm.d::new, "NeCCS");
   dxy i = a(dzm.e::new, "NeCTB");
   dxy j = a(dzm.f::new, "NeCE");
   dxy k = a(dzm.g::new, "NeSCSC");
   dxy l = a(dzm.h::new, "NeSCLT");
   dxy m = a(dzm.i::new, "NeSC");
   dxy n = a(dzm.j::new, "NeSCRT");
   dxy o = a(dzm.k::new, "NeCSR");
   dxy p = a(dzm.l::new, "NeMT");
   dxy q = a(dzm.o::new, "NeRC");
   dxy r = a(dzm.p::new, "NeSR");
   dxy s = a(dzm.q::new, "NeStart");
   dxy t = a(dzy.a::new, "SHCC");
   dxy u = a(dzy.b::new, "SHFC");
   dxy v = a(dzy.c::new, "SH5C");
   dxy w = a(dzy.d::new, "SHLT");
   dxy x = a(dzy.e::new, "SHLi");
   dxy y = a(dzy.g::new, "SHPR");
   dxy z = a(dzy.h::new, "SHPH");
   dxy A = a(dzy.i::new, "SHRT");
   dxy B = a(dzy.j::new, "SHRC");
   dxy C = a(dzy.l::new, "SHSD");
   dxy D = a(dzy.m::new, "SHStart");
   dxy E = a(dzy.n::new, "SHS");
   dxy F = a(dzy.o::new, "SHSSD");
   dxy G = a(dzi::new, "TeJP");
   dxy H = a(dzs.a::a, "ORP");
   dxy I = a(dzf.a::new, "Iglu");
   dxy J = a(dzu::new, "RUPO");
   dxy K = a(eaa::new, "TeSH");
   dxy L = a(dzb::new, "TeDP");
   dxy M = a(dzq.h::new, "OMB");
   dxy N = a(dzq.j::new, "OMCR");
   dxy O = a(dzq.k::new, "OMDXR");
   dxy P = a(dzq.l::new, "OMDXYR");
   dxy Q = a(dzq.m::new, "OMDYR");
   dxy R = a(dzq.n::new, "OMDYZR");
   dxy S = a(dzq.o::new, "OMDZR");
   dxy T = a(dzq.p::new, "OMEntry");
   dxy U = a(dzq.q::new, "OMPenthouse");
   dxy V = a(dzq.s::new, "OMSimple");
   dxy W = a(dzq.t::new, "OMSimpleT");
   dxy X = a(dzq.u::new, "OMWR");
   dxy Y = a(dzd.a::new, "ECP");
   dxy Z = a(eac.i::new, "WMP");
   dxy aa = a(dyz.a::new, "BTP");
   dxy ab = a(dzw.a::new, "Shipwreck");
   dxy ac = a(dzo.a::new, "NeFos");
   dxy ad = a(dxd::new, "jigsaw");

   dxl load(dxx var1, rz var2);

   private static dxy a(dxy $$0, String $$1) {
      return io.a(jy.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dxy a(dxy.a $$0, String $$1) {
      return a((dxy)$$0, $$1);
   }

   private static dxy a(dxy.b $$0, String $$1) {
      return a((dxy)$$0, $$1);
   }

   public interface a extends dxy {
      dxl load(rz var1);

      @Override
      default dxl load(dxx $$0, rz $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dxy {
      dxl load(ebi var1, rz var2);

      @Override
      default dxl load(dxx $$0, rz $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
