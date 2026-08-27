import java.util.Locale;

public interface dzx {
   dzx a = a(ebj.a::new, "MSCorridor");
   dzx b = a(ebj.b::new, "MSCrossing");
   dzx c = a(ebj.d::new, "MSRoom");
   dzx d = a(ebj.e::new, "MSStairs");
   dzx e = a(ebl.a::new, "NeBCr");
   dzx f = a(ebl.b::new, "NeBEF");
   dzx g = a(ebl.c::new, "NeBS");
   dzx h = a(ebl.d::new, "NeCCS");
   dzx i = a(ebl.e::new, "NeCTB");
   dzx j = a(ebl.f::new, "NeCE");
   dzx k = a(ebl.g::new, "NeSCSC");
   dzx l = a(ebl.h::new, "NeSCLT");
   dzx m = a(ebl.i::new, "NeSC");
   dzx n = a(ebl.j::new, "NeSCRT");
   dzx o = a(ebl.k::new, "NeCSR");
   dzx p = a(ebl.l::new, "NeMT");
   dzx q = a(ebl.o::new, "NeRC");
   dzx r = a(ebl.p::new, "NeSR");
   dzx s = a(ebl.q::new, "NeStart");
   dzx t = a(ebx.a::new, "SHCC");
   dzx u = a(ebx.b::new, "SHFC");
   dzx v = a(ebx.c::new, "SH5C");
   dzx w = a(ebx.d::new, "SHLT");
   dzx x = a(ebx.e::new, "SHLi");
   dzx y = a(ebx.g::new, "SHPR");
   dzx z = a(ebx.h::new, "SHPH");
   dzx A = a(ebx.i::new, "SHRT");
   dzx B = a(ebx.j::new, "SHRC");
   dzx C = a(ebx.l::new, "SHSD");
   dzx D = a(ebx.m::new, "SHStart");
   dzx E = a(ebx.n::new, "SHS");
   dzx F = a(ebx.o::new, "SHSSD");
   dzx G = a(ebh::new, "TeJP");
   dzx H = a(ebr.a::a, "ORP");
   dzx I = a(ebe.a::new, "Iglu");
   dzx J = a(ebt::new, "RUPO");
   dzx K = a(ebz::new, "TeSH");
   dzx L = a(eba::new, "TeDP");
   dzx M = a(ebp.h::new, "OMB");
   dzx N = a(ebp.j::new, "OMCR");
   dzx O = a(ebp.k::new, "OMDXR");
   dzx P = a(ebp.l::new, "OMDXYR");
   dzx Q = a(ebp.m::new, "OMDYR");
   dzx R = a(ebp.n::new, "OMDYZR");
   dzx S = a(ebp.o::new, "OMDZR");
   dzx T = a(ebp.p::new, "OMEntry");
   dzx U = a(ebp.q::new, "OMPenthouse");
   dzx V = a(ebp.s::new, "OMSimple");
   dzx W = a(ebp.t::new, "OMSimpleT");
   dzx X = a(ebp.u::new, "OMWR");
   dzx Y = a(ebc.a::new, "ECP");
   dzx Z = a(ecb.i::new, "WMP");
   dzx aa = a(eay.a::new, "BTP");
   dzx ab = a(ebv.a::new, "Shipwreck");
   dzx ac = a(ebn.a::new, "NeFos");
   dzx ad = a(dzc::new, "jigsaw");

   dzk load(dzw var1, sn var2);

   private static dzx a(dzx $$0, String $$1) {
      return it.a(kd.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dzx a(dzx.a $$0, String $$1) {
      return a((dzx)$$0, $$1);
   }

   private static dzx a(dzx.b $$0, String $$1) {
      return a((dzx)$$0, $$1);
   }

   public interface a extends dzx {
      dzk load(sn var1);

      @Override
      default dzk load(dzw $$0, sn $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dzx {
      dzk load(edh var1, sn var2);

      @Override
      default dzk load(dzw $$0, sn $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
