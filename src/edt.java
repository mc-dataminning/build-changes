import java.util.Locale;

public interface edt {
   edt a = a(eff.a::new, "MSCorridor");
   edt b = a(eff.b::new, "MSCrossing");
   edt c = a(eff.d::new, "MSRoom");
   edt d = a(eff.e::new, "MSStairs");
   edt e = a(efh.a::new, "NeBCr");
   edt f = a(efh.b::new, "NeBEF");
   edt g = a(efh.c::new, "NeBS");
   edt h = a(efh.d::new, "NeCCS");
   edt i = a(efh.e::new, "NeCTB");
   edt j = a(efh.f::new, "NeCE");
   edt k = a(efh.g::new, "NeSCSC");
   edt l = a(efh.h::new, "NeSCLT");
   edt m = a(efh.i::new, "NeSC");
   edt n = a(efh.j::new, "NeSCRT");
   edt o = a(efh.k::new, "NeCSR");
   edt p = a(efh.l::new, "NeMT");
   edt q = a(efh.o::new, "NeRC");
   edt r = a(efh.p::new, "NeSR");
   edt s = a(efh.q::new, "NeStart");
   edt t = a(eft.a::new, "SHCC");
   edt u = a(eft.b::new, "SHFC");
   edt v = a(eft.c::new, "SH5C");
   edt w = a(eft.d::new, "SHLT");
   edt x = a(eft.e::new, "SHLi");
   edt y = a(eft.g::new, "SHPR");
   edt z = a(eft.h::new, "SHPH");
   edt A = a(eft.i::new, "SHRT");
   edt B = a(eft.j::new, "SHRC");
   edt C = a(eft.l::new, "SHSD");
   edt D = a(eft.m::new, "SHStart");
   edt E = a(eft.n::new, "SHS");
   edt F = a(eft.o::new, "SHSSD");
   edt G = a(efd::new, "TeJP");
   edt H = a(efn.a::a, "ORP");
   edt I = a(efa.a::new, "Iglu");
   edt J = a(efp::new, "RUPO");
   edt K = a(efv::new, "TeSH");
   edt L = a(eew::new, "TeDP");
   edt M = a(efl.h::new, "OMB");
   edt N = a(efl.j::new, "OMCR");
   edt O = a(efl.k::new, "OMDXR");
   edt P = a(efl.l::new, "OMDXYR");
   edt Q = a(efl.m::new, "OMDYR");
   edt R = a(efl.n::new, "OMDYZR");
   edt S = a(efl.o::new, "OMDZR");
   edt T = a(efl.p::new, "OMEntry");
   edt U = a(efl.q::new, "OMPenthouse");
   edt V = a(efl.s::new, "OMSimple");
   edt W = a(efl.t::new, "OMSimpleT");
   edt X = a(efl.u::new, "OMWR");
   edt Y = a(eey.a::new, "ECP");
   edt Z = a(efx.i::new, "WMP");
   edt aa = a(eeu.a::new, "BTP");
   edt ab = a(efr.a::new, "Shipwreck");
   edt ac = a(efj.a::new, "NeFos");
   edt ad = a(ecy::new, "jigsaw");

   edg load(eds var1, ta var2);

   private static edt a(edt $$0, String $$1) {
      return iy.a(ki.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static edt a(edt.a $$0, String $$1) {
      return a((edt)$$0, $$1);
   }

   private static edt a(edt.b $$0, String $$1) {
      return a((edt)$$0, $$1);
   }

   public interface a extends edt {
      edg load(ta var1);

      @Override
      default edg load(eds $$0, ta $$1) {
         return this.load($$1);
      }
   }

   public interface b extends edt {
      edg load(ehd var1, ta var2);

      @Override
      default edg load(eds $$0, ta $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
