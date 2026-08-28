import java.util.Locale;

public interface eiz {
   eiz a = a(ekl.a::new, "MSCorridor");
   eiz b = a(ekl.b::new, "MSCrossing");
   eiz c = a(ekl.d::new, "MSRoom");
   eiz d = a(ekl.e::new, "MSStairs");
   eiz e = a(ekn.a::new, "NeBCr");
   eiz f = a(ekn.b::new, "NeBEF");
   eiz g = a(ekn.c::new, "NeBS");
   eiz h = a(ekn.d::new, "NeCCS");
   eiz i = a(ekn.e::new, "NeCTB");
   eiz j = a(ekn.f::new, "NeCE");
   eiz k = a(ekn.g::new, "NeSCSC");
   eiz l = a(ekn.h::new, "NeSCLT");
   eiz m = a(ekn.i::new, "NeSC");
   eiz n = a(ekn.j::new, "NeSCRT");
   eiz o = a(ekn.k::new, "NeCSR");
   eiz p = a(ekn.l::new, "NeMT");
   eiz q = a(ekn.o::new, "NeRC");
   eiz r = a(ekn.p::new, "NeSR");
   eiz s = a(ekn.q::new, "NeStart");
   eiz t = a(ekz.a::new, "SHCC");
   eiz u = a(ekz.b::new, "SHFC");
   eiz v = a(ekz.c::new, "SH5C");
   eiz w = a(ekz.d::new, "SHLT");
   eiz x = a(ekz.e::new, "SHLi");
   eiz y = a(ekz.g::new, "SHPR");
   eiz z = a(ekz.h::new, "SHPH");
   eiz A = a(ekz.i::new, "SHRT");
   eiz B = a(ekz.j::new, "SHRC");
   eiz C = a(ekz.l::new, "SHSD");
   eiz D = a(ekz.m::new, "SHStart");
   eiz E = a(ekz.n::new, "SHS");
   eiz F = a(ekz.o::new, "SHSSD");
   eiz G = a(ekj::new, "TeJP");
   eiz H = a(ekt.a::a, "ORP");
   eiz I = a(ekg.a::new, "Iglu");
   eiz J = a(ekv::new, "RUPO");
   eiz K = a(elb::new, "TeSH");
   eiz L = a(ekc::new, "TeDP");
   eiz M = a(ekr.h::new, "OMB");
   eiz N = a(ekr.j::new, "OMCR");
   eiz O = a(ekr.k::new, "OMDXR");
   eiz P = a(ekr.l::new, "OMDXYR");
   eiz Q = a(ekr.m::new, "OMDYR");
   eiz R = a(ekr.n::new, "OMDYZR");
   eiz S = a(ekr.o::new, "OMDZR");
   eiz T = a(ekr.p::new, "OMEntry");
   eiz U = a(ekr.q::new, "OMPenthouse");
   eiz V = a(ekr.s::new, "OMSimple");
   eiz W = a(ekr.t::new, "OMSimpleT");
   eiz X = a(ekr.u::new, "OMWR");
   eiz Y = a(eke.a::new, "ECP");
   eiz Z = a(eld.i::new, "WMP");
   eiz aa = a(eka.a::new, "BTP");
   eiz ab = a(ekx.a::new, "Shipwreck");
   eiz ac = a(ekp.a::new, "NeFos");
   eiz ad = a(eie::new, "jigsaw");

   eim load(eiy var1, ur var2);

   private static eiz a(eiz $$0, String $$1) {
      return jv.a(lp.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eiz a(eiz.a $$0, String $$1) {
      return a((eiz)$$0, $$1);
   }

   private static eiz a(eiz.b $$0, String $$1) {
      return a((eiz)$$0, $$1);
   }

   public interface a extends eiz {
      eim load(ur var1);

      @Override
      default eim load(eiy $$0, ur $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eiz {
      eim load(emj var1, ur var2);

      @Override
      default eim load(eiy $$0, ur $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
