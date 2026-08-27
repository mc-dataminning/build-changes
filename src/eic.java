import java.util.Locale;

public interface eic {
   eic a = a(ejo.a::new, "MSCorridor");
   eic b = a(ejo.b::new, "MSCrossing");
   eic c = a(ejo.d::new, "MSRoom");
   eic d = a(ejo.e::new, "MSStairs");
   eic e = a(ejq.a::new, "NeBCr");
   eic f = a(ejq.b::new, "NeBEF");
   eic g = a(ejq.c::new, "NeBS");
   eic h = a(ejq.d::new, "NeCCS");
   eic i = a(ejq.e::new, "NeCTB");
   eic j = a(ejq.f::new, "NeCE");
   eic k = a(ejq.g::new, "NeSCSC");
   eic l = a(ejq.h::new, "NeSCLT");
   eic m = a(ejq.i::new, "NeSC");
   eic n = a(ejq.j::new, "NeSCRT");
   eic o = a(ejq.k::new, "NeCSR");
   eic p = a(ejq.l::new, "NeMT");
   eic q = a(ejq.o::new, "NeRC");
   eic r = a(ejq.p::new, "NeSR");
   eic s = a(ejq.q::new, "NeStart");
   eic t = a(ekc.a::new, "SHCC");
   eic u = a(ekc.b::new, "SHFC");
   eic v = a(ekc.c::new, "SH5C");
   eic w = a(ekc.d::new, "SHLT");
   eic x = a(ekc.e::new, "SHLi");
   eic y = a(ekc.g::new, "SHPR");
   eic z = a(ekc.h::new, "SHPH");
   eic A = a(ekc.i::new, "SHRT");
   eic B = a(ekc.j::new, "SHRC");
   eic C = a(ekc.l::new, "SHSD");
   eic D = a(ekc.m::new, "SHStart");
   eic E = a(ekc.n::new, "SHS");
   eic F = a(ekc.o::new, "SHSSD");
   eic G = a(ejm::new, "TeJP");
   eic H = a(ejw.a::a, "ORP");
   eic I = a(ejj.a::new, "Iglu");
   eic J = a(ejy::new, "RUPO");
   eic K = a(eke::new, "TeSH");
   eic L = a(ejf::new, "TeDP");
   eic M = a(eju.h::new, "OMB");
   eic N = a(eju.j::new, "OMCR");
   eic O = a(eju.k::new, "OMDXR");
   eic P = a(eju.l::new, "OMDXYR");
   eic Q = a(eju.m::new, "OMDYR");
   eic R = a(eju.n::new, "OMDYZR");
   eic S = a(eju.o::new, "OMDZR");
   eic T = a(eju.p::new, "OMEntry");
   eic U = a(eju.q::new, "OMPenthouse");
   eic V = a(eju.s::new, "OMSimple");
   eic W = a(eju.t::new, "OMSimpleT");
   eic X = a(eju.u::new, "OMWR");
   eic Y = a(ejh.a::new, "ECP");
   eic Z = a(ekg.i::new, "WMP");
   eic aa = a(ejd.a::new, "BTP");
   eic ab = a(eka.a::new, "Shipwreck");
   eic ac = a(ejs.a::new, "NeFos");
   eic ad = a(ehh::new, "jigsaw");

   ehp load(eib var1, ud var2);

   private static eic a(eic $$0, String $$1) {
      return jk.a(le.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eic a(eic.a $$0, String $$1) {
      return a((eic)$$0, $$1);
   }

   private static eic a(eic.b $$0, String $$1) {
      return a((eic)$$0, $$1);
   }

   public interface a extends eic {
      ehp load(ud var1);

      @Override
      default ehp load(eib $$0, ud $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eic {
      ehp load(elm var1, ud var2);

      @Override
      default ehp load(eib $$0, ud $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
