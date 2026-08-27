import java.util.Locale;

public interface dvq {
   dvq a = a(dwv.a::new, "MSCorridor");
   dvq b = a(dwv.b::new, "MSCrossing");
   dvq c = a(dwv.d::new, "MSRoom");
   dvq d = a(dwv.e::new, "MSStairs");
   dvq e = a(dwx.a::new, "NeBCr");
   dvq f = a(dwx.b::new, "NeBEF");
   dvq g = a(dwx.c::new, "NeBS");
   dvq h = a(dwx.d::new, "NeCCS");
   dvq i = a(dwx.e::new, "NeCTB");
   dvq j = a(dwx.f::new, "NeCE");
   dvq k = a(dwx.g::new, "NeSCSC");
   dvq l = a(dwx.h::new, "NeSCLT");
   dvq m = a(dwx.i::new, "NeSC");
   dvq n = a(dwx.j::new, "NeSCRT");
   dvq o = a(dwx.k::new, "NeCSR");
   dvq p = a(dwx.l::new, "NeMT");
   dvq q = a(dwx.o::new, "NeRC");
   dvq r = a(dwx.p::new, "NeSR");
   dvq s = a(dwx.q::new, "NeStart");
   dvq t = a(dxj.a::new, "SHCC");
   dvq u = a(dxj.b::new, "SHFC");
   dvq v = a(dxj.c::new, "SH5C");
   dvq w = a(dxj.d::new, "SHLT");
   dvq x = a(dxj.e::new, "SHLi");
   dvq y = a(dxj.g::new, "SHPR");
   dvq z = a(dxj.h::new, "SHPH");
   dvq A = a(dxj.i::new, "SHRT");
   dvq B = a(dxj.j::new, "SHRC");
   dvq C = a(dxj.l::new, "SHSD");
   dvq D = a(dxj.m::new, "SHStart");
   dvq E = a(dxj.n::new, "SHS");
   dvq F = a(dxj.o::new, "SHSSD");
   dvq G = a(dwt::new, "TeJP");
   dvq H = a(dxd.a::a, "ORP");
   dvq I = a(dwq.a::new, "Iglu");
   dvq J = a(dxf::new, "RUPO");
   dvq K = a(dxl::new, "TeSH");
   dvq L = a(dwm::new, "TeDP");
   dvq M = a(dxb.h::new, "OMB");
   dvq N = a(dxb.j::new, "OMCR");
   dvq O = a(dxb.k::new, "OMDXR");
   dvq P = a(dxb.l::new, "OMDXYR");
   dvq Q = a(dxb.m::new, "OMDYR");
   dvq R = a(dxb.n::new, "OMDYZR");
   dvq S = a(dxb.o::new, "OMDZR");
   dvq T = a(dxb.p::new, "OMEntry");
   dvq U = a(dxb.q::new, "OMPenthouse");
   dvq V = a(dxb.s::new, "OMSimple");
   dvq W = a(dxb.t::new, "OMSimpleT");
   dvq X = a(dxb.u::new, "OMWR");
   dvq Y = a(dwo.a::new, "ECP");
   dvq Z = a(dxn.i::new, "WMP");
   dvq aa = a(dwk.a::new, "BTP");
   dvq ab = a(dxh.a::new, "Shipwreck");
   dvq ac = a(dwz.a::new, "NeFos");
   dvq ad = a(duv::new, "jigsaw");

   dvd load(dvp var1, qr var2);

   private static dvq a(dvq $$0, String $$1) {
      return hr.a(jb.T, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dvq a(dvq.a $$0, String $$1) {
      return a((dvq)$$0, $$1);
   }

   private static dvq a(dvq.b $$0, String $$1) {
      return a((dvq)$$0, $$1);
   }

   public interface a extends dvq {
      dvd load(qr var1);

      @Override
      default dvd load(dvp $$0, qr $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dvq {
      dvd load(dyt var1, qr var2);

      @Override
      default dvd load(dvp $$0, qr $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
