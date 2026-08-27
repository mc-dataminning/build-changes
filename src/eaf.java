import java.util.Locale;

public interface eaf {
   eaf a = a(ebr.a::new, "MSCorridor");
   eaf b = a(ebr.b::new, "MSCrossing");
   eaf c = a(ebr.d::new, "MSRoom");
   eaf d = a(ebr.e::new, "MSStairs");
   eaf e = a(ebt.a::new, "NeBCr");
   eaf f = a(ebt.b::new, "NeBEF");
   eaf g = a(ebt.c::new, "NeBS");
   eaf h = a(ebt.d::new, "NeCCS");
   eaf i = a(ebt.e::new, "NeCTB");
   eaf j = a(ebt.f::new, "NeCE");
   eaf k = a(ebt.g::new, "NeSCSC");
   eaf l = a(ebt.h::new, "NeSCLT");
   eaf m = a(ebt.i::new, "NeSC");
   eaf n = a(ebt.j::new, "NeSCRT");
   eaf o = a(ebt.k::new, "NeCSR");
   eaf p = a(ebt.l::new, "NeMT");
   eaf q = a(ebt.o::new, "NeRC");
   eaf r = a(ebt.p::new, "NeSR");
   eaf s = a(ebt.q::new, "NeStart");
   eaf t = a(ecf.a::new, "SHCC");
   eaf u = a(ecf.b::new, "SHFC");
   eaf v = a(ecf.c::new, "SH5C");
   eaf w = a(ecf.d::new, "SHLT");
   eaf x = a(ecf.e::new, "SHLi");
   eaf y = a(ecf.g::new, "SHPR");
   eaf z = a(ecf.h::new, "SHPH");
   eaf A = a(ecf.i::new, "SHRT");
   eaf B = a(ecf.j::new, "SHRC");
   eaf C = a(ecf.l::new, "SHSD");
   eaf D = a(ecf.m::new, "SHStart");
   eaf E = a(ecf.n::new, "SHS");
   eaf F = a(ecf.o::new, "SHSSD");
   eaf G = a(ebp::new, "TeJP");
   eaf H = a(ebz.a::a, "ORP");
   eaf I = a(ebm.a::new, "Iglu");
   eaf J = a(ecb::new, "RUPO");
   eaf K = a(ech::new, "TeSH");
   eaf L = a(ebi::new, "TeDP");
   eaf M = a(ebx.h::new, "OMB");
   eaf N = a(ebx.j::new, "OMCR");
   eaf O = a(ebx.k::new, "OMDXR");
   eaf P = a(ebx.l::new, "OMDXYR");
   eaf Q = a(ebx.m::new, "OMDYR");
   eaf R = a(ebx.n::new, "OMDYZR");
   eaf S = a(ebx.o::new, "OMDZR");
   eaf T = a(ebx.p::new, "OMEntry");
   eaf U = a(ebx.q::new, "OMPenthouse");
   eaf V = a(ebx.s::new, "OMSimple");
   eaf W = a(ebx.t::new, "OMSimpleT");
   eaf X = a(ebx.u::new, "OMWR");
   eaf Y = a(ebk.a::new, "ECP");
   eaf Z = a(ecj.i::new, "WMP");
   eaf aa = a(ebg.a::new, "BTP");
   eaf ab = a(ecd.a::new, "Shipwreck");
   eaf ac = a(ebv.a::new, "NeFos");
   eaf ad = a(dzk::new, "jigsaw");

   dzs load(eae var1, so var2);

   private static eaf a(eaf $$0, String $$1) {
      return it.a(kd.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eaf a(eaf.a $$0, String $$1) {
      return a((eaf)$$0, $$1);
   }

   private static eaf a(eaf.b $$0, String $$1) {
      return a((eaf)$$0, $$1);
   }

   public interface a extends eaf {
      dzs load(so var1);

      @Override
      default dzs load(eae $$0, so $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eaf {
      dzs load(edp var1, so var2);

      @Override
      default dzs load(eae $$0, so $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
