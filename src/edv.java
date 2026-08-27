import java.util.Locale;

public interface edv {
   edv a = a(efh.a::new, "MSCorridor");
   edv b = a(efh.b::new, "MSCrossing");
   edv c = a(efh.d::new, "MSRoom");
   edv d = a(efh.e::new, "MSStairs");
   edv e = a(efj.a::new, "NeBCr");
   edv f = a(efj.b::new, "NeBEF");
   edv g = a(efj.c::new, "NeBS");
   edv h = a(efj.d::new, "NeCCS");
   edv i = a(efj.e::new, "NeCTB");
   edv j = a(efj.f::new, "NeCE");
   edv k = a(efj.g::new, "NeSCSC");
   edv l = a(efj.h::new, "NeSCLT");
   edv m = a(efj.i::new, "NeSC");
   edv n = a(efj.j::new, "NeSCRT");
   edv o = a(efj.k::new, "NeCSR");
   edv p = a(efj.l::new, "NeMT");
   edv q = a(efj.o::new, "NeRC");
   edv r = a(efj.p::new, "NeSR");
   edv s = a(efj.q::new, "NeStart");
   edv t = a(efv.a::new, "SHCC");
   edv u = a(efv.b::new, "SHFC");
   edv v = a(efv.c::new, "SH5C");
   edv w = a(efv.d::new, "SHLT");
   edv x = a(efv.e::new, "SHLi");
   edv y = a(efv.g::new, "SHPR");
   edv z = a(efv.h::new, "SHPH");
   edv A = a(efv.i::new, "SHRT");
   edv B = a(efv.j::new, "SHRC");
   edv C = a(efv.l::new, "SHSD");
   edv D = a(efv.m::new, "SHStart");
   edv E = a(efv.n::new, "SHS");
   edv F = a(efv.o::new, "SHSSD");
   edv G = a(eff::new, "TeJP");
   edv H = a(efp.a::a, "ORP");
   edv I = a(efc.a::new, "Iglu");
   edv J = a(efr::new, "RUPO");
   edv K = a(efx::new, "TeSH");
   edv L = a(eey::new, "TeDP");
   edv M = a(efn.h::new, "OMB");
   edv N = a(efn.j::new, "OMCR");
   edv O = a(efn.k::new, "OMDXR");
   edv P = a(efn.l::new, "OMDXYR");
   edv Q = a(efn.m::new, "OMDYR");
   edv R = a(efn.n::new, "OMDYZR");
   edv S = a(efn.o::new, "OMDZR");
   edv T = a(efn.p::new, "OMEntry");
   edv U = a(efn.q::new, "OMPenthouse");
   edv V = a(efn.s::new, "OMSimple");
   edv W = a(efn.t::new, "OMSimpleT");
   edv X = a(efn.u::new, "OMWR");
   edv Y = a(efa.a::new, "ECP");
   edv Z = a(efz.i::new, "WMP");
   edv aa = a(eew.a::new, "BTP");
   edv ab = a(eft.a::new, "Shipwreck");
   edv ac = a(efl.a::new, "NeFos");
   edv ad = a(eda::new, "jigsaw");

   edi load(edu var1, ta var2);

   private static edv a(edv $$0, String $$1) {
      return iy.a(ki.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static edv a(edv.a $$0, String $$1) {
      return a((edv)$$0, $$1);
   }

   private static edv a(edv.b $$0, String $$1) {
      return a((edv)$$0, $$1);
   }

   public interface a extends edv {
      edi load(ta var1);

      @Override
      default edi load(edu $$0, ta $$1) {
         return this.load($$1);
      }
   }

   public interface b extends edv {
      edi load(ehf var1, ta var2);

      @Override
      default edi load(edu $$0, ta $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
