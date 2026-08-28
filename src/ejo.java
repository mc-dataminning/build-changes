import java.util.Locale;

public interface ejo {
   ejo a = a(elb.a::new, "MSCorridor");
   ejo b = a(elb.b::new, "MSCrossing");
   ejo c = a(elb.d::new, "MSRoom");
   ejo d = a(elb.e::new, "MSStairs");
   ejo e = a(eld.a::new, "NeBCr");
   ejo f = a(eld.b::new, "NeBEF");
   ejo g = a(eld.c::new, "NeBS");
   ejo h = a(eld.d::new, "NeCCS");
   ejo i = a(eld.e::new, "NeCTB");
   ejo j = a(eld.f::new, "NeCE");
   ejo k = a(eld.g::new, "NeSCSC");
   ejo l = a(eld.h::new, "NeSCLT");
   ejo m = a(eld.i::new, "NeSC");
   ejo n = a(eld.j::new, "NeSCRT");
   ejo o = a(eld.k::new, "NeCSR");
   ejo p = a(eld.l::new, "NeMT");
   ejo q = a(eld.o::new, "NeRC");
   ejo r = a(eld.p::new, "NeSR");
   ejo s = a(eld.q::new, "NeStart");
   ejo t = a(elp.a::new, "SHCC");
   ejo u = a(elp.b::new, "SHFC");
   ejo v = a(elp.c::new, "SH5C");
   ejo w = a(elp.d::new, "SHLT");
   ejo x = a(elp.e::new, "SHLi");
   ejo y = a(elp.g::new, "SHPR");
   ejo z = a(elp.h::new, "SHPH");
   ejo A = a(elp.i::new, "SHRT");
   ejo B = a(elp.j::new, "SHRC");
   ejo C = a(elp.l::new, "SHSD");
   ejo D = a(elp.m::new, "SHStart");
   ejo E = a(elp.n::new, "SHS");
   ejo F = a(elp.o::new, "SHSSD");
   ejo G = a(ekz::new, "TeJP");
   ejo H = a(elj.a::a, "ORP");
   ejo I = a(ekw.a::new, "Iglu");
   ejo J = a(ell::new, "RUPO");
   ejo K = a(elr::new, "TeSH");
   ejo L = a(eks::new, "TeDP");
   ejo M = a(elh.h::new, "OMB");
   ejo N = a(elh.j::new, "OMCR");
   ejo O = a(elh.k::new, "OMDXR");
   ejo P = a(elh.l::new, "OMDXYR");
   ejo Q = a(elh.m::new, "OMDYR");
   ejo R = a(elh.n::new, "OMDYZR");
   ejo S = a(elh.o::new, "OMDZR");
   ejo T = a(elh.p::new, "OMEntry");
   ejo U = a(elh.q::new, "OMPenthouse");
   ejo V = a(elh.s::new, "OMSimple");
   ejo W = a(elh.t::new, "OMSimpleT");
   ejo X = a(elh.u::new, "OMWR");
   ejo Y = a(eku.a::new, "ECP");
   ejo Z = a(elt.i::new, "WMP");
   ejo aa = a(ekq.a::new, "BTP");
   ejo ab = a(eln.a::new, "Shipwreck");
   ejo ac = a(elf.a::new, "NeFos");
   ejo ad = a(eit::new, "jigsaw");

   ejb load(ejn var1, tx var2);

   private static ejo a(ejo $$0, String $$1) {
      return jw.a(lq.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ejo a(ejo.a $$0, String $$1) {
      return a((ejo)$$0, $$1);
   }

   private static ejo a(ejo.b $$0, String $$1) {
      return a((ejo)$$0, $$1);
   }

   public interface a extends ejo {
      ejb load(tx var1);

      @Override
      default ejb load(ejn $$0, tx $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ejo {
      ejb load(emz var1, tx var2);

      @Override
      default ejb load(ejn $$0, tx $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
