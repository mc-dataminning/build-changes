import java.util.Locale;

public interface eia {
   eia a = a(ejm.a::new, "MSCorridor");
   eia b = a(ejm.b::new, "MSCrossing");
   eia c = a(ejm.d::new, "MSRoom");
   eia d = a(ejm.e::new, "MSStairs");
   eia e = a(ejo.a::new, "NeBCr");
   eia f = a(ejo.b::new, "NeBEF");
   eia g = a(ejo.c::new, "NeBS");
   eia h = a(ejo.d::new, "NeCCS");
   eia i = a(ejo.e::new, "NeCTB");
   eia j = a(ejo.f::new, "NeCE");
   eia k = a(ejo.g::new, "NeSCSC");
   eia l = a(ejo.h::new, "NeSCLT");
   eia m = a(ejo.i::new, "NeSC");
   eia n = a(ejo.j::new, "NeSCRT");
   eia o = a(ejo.k::new, "NeCSR");
   eia p = a(ejo.l::new, "NeMT");
   eia q = a(ejo.o::new, "NeRC");
   eia r = a(ejo.p::new, "NeSR");
   eia s = a(ejo.q::new, "NeStart");
   eia t = a(eka.a::new, "SHCC");
   eia u = a(eka.b::new, "SHFC");
   eia v = a(eka.c::new, "SH5C");
   eia w = a(eka.d::new, "SHLT");
   eia x = a(eka.e::new, "SHLi");
   eia y = a(eka.g::new, "SHPR");
   eia z = a(eka.h::new, "SHPH");
   eia A = a(eka.i::new, "SHRT");
   eia B = a(eka.j::new, "SHRC");
   eia C = a(eka.l::new, "SHSD");
   eia D = a(eka.m::new, "SHStart");
   eia E = a(eka.n::new, "SHS");
   eia F = a(eka.o::new, "SHSSD");
   eia G = a(ejk::new, "TeJP");
   eia H = a(eju.a::a, "ORP");
   eia I = a(ejh.a::new, "Iglu");
   eia J = a(ejw::new, "RUPO");
   eia K = a(ekc::new, "TeSH");
   eia L = a(ejd::new, "TeDP");
   eia M = a(ejs.h::new, "OMB");
   eia N = a(ejs.j::new, "OMCR");
   eia O = a(ejs.k::new, "OMDXR");
   eia P = a(ejs.l::new, "OMDXYR");
   eia Q = a(ejs.m::new, "OMDYR");
   eia R = a(ejs.n::new, "OMDYZR");
   eia S = a(ejs.o::new, "OMDZR");
   eia T = a(ejs.p::new, "OMEntry");
   eia U = a(ejs.q::new, "OMPenthouse");
   eia V = a(ejs.s::new, "OMSimple");
   eia W = a(ejs.t::new, "OMSimpleT");
   eia X = a(ejs.u::new, "OMWR");
   eia Y = a(ejf.a::new, "ECP");
   eia Z = a(eke.i::new, "WMP");
   eia aa = a(ejb.a::new, "BTP");
   eia ab = a(ejy.a::new, "Shipwreck");
   eia ac = a(ejq.a::new, "NeFos");
   eia ad = a(ehf::new, "jigsaw");

   ehn load(ehz var1, ud var2);

   private static eia a(eia $$0, String $$1) {
      return jk.a(le.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eia a(eia.a $$0, String $$1) {
      return a((eia)$$0, $$1);
   }

   private static eia a(eia.b $$0, String $$1) {
      return a((eia)$$0, $$1);
   }

   public interface a extends eia {
      ehn load(ud var1);

      @Override
      default ehn load(ehz $$0, ud $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eia {
      ehn load(elk var1, ud var2);

      @Override
      default ehn load(ehz $$0, ud $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
