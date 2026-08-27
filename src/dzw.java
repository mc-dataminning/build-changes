import java.util.Locale;

public interface dzw {
   dzw a = a(ebi.a::new, "MSCorridor");
   dzw b = a(ebi.b::new, "MSCrossing");
   dzw c = a(ebi.d::new, "MSRoom");
   dzw d = a(ebi.e::new, "MSStairs");
   dzw e = a(ebk.a::new, "NeBCr");
   dzw f = a(ebk.b::new, "NeBEF");
   dzw g = a(ebk.c::new, "NeBS");
   dzw h = a(ebk.d::new, "NeCCS");
   dzw i = a(ebk.e::new, "NeCTB");
   dzw j = a(ebk.f::new, "NeCE");
   dzw k = a(ebk.g::new, "NeSCSC");
   dzw l = a(ebk.h::new, "NeSCLT");
   dzw m = a(ebk.i::new, "NeSC");
   dzw n = a(ebk.j::new, "NeSCRT");
   dzw o = a(ebk.k::new, "NeCSR");
   dzw p = a(ebk.l::new, "NeMT");
   dzw q = a(ebk.o::new, "NeRC");
   dzw r = a(ebk.p::new, "NeSR");
   dzw s = a(ebk.q::new, "NeStart");
   dzw t = a(ebw.a::new, "SHCC");
   dzw u = a(ebw.b::new, "SHFC");
   dzw v = a(ebw.c::new, "SH5C");
   dzw w = a(ebw.d::new, "SHLT");
   dzw x = a(ebw.e::new, "SHLi");
   dzw y = a(ebw.g::new, "SHPR");
   dzw z = a(ebw.h::new, "SHPH");
   dzw A = a(ebw.i::new, "SHRT");
   dzw B = a(ebw.j::new, "SHRC");
   dzw C = a(ebw.l::new, "SHSD");
   dzw D = a(ebw.m::new, "SHStart");
   dzw E = a(ebw.n::new, "SHS");
   dzw F = a(ebw.o::new, "SHSSD");
   dzw G = a(ebg::new, "TeJP");
   dzw H = a(ebq.a::a, "ORP");
   dzw I = a(ebd.a::new, "Iglu");
   dzw J = a(ebs::new, "RUPO");
   dzw K = a(eby::new, "TeSH");
   dzw L = a(eaz::new, "TeDP");
   dzw M = a(ebo.h::new, "OMB");
   dzw N = a(ebo.j::new, "OMCR");
   dzw O = a(ebo.k::new, "OMDXR");
   dzw P = a(ebo.l::new, "OMDXYR");
   dzw Q = a(ebo.m::new, "OMDYR");
   dzw R = a(ebo.n::new, "OMDYZR");
   dzw S = a(ebo.o::new, "OMDZR");
   dzw T = a(ebo.p::new, "OMEntry");
   dzw U = a(ebo.q::new, "OMPenthouse");
   dzw V = a(ebo.s::new, "OMSimple");
   dzw W = a(ebo.t::new, "OMSimpleT");
   dzw X = a(ebo.u::new, "OMWR");
   dzw Y = a(ebb.a::new, "ECP");
   dzw Z = a(eca.i::new, "WMP");
   dzw aa = a(eax.a::new, "BTP");
   dzw ab = a(ebu.a::new, "Shipwreck");
   dzw ac = a(ebm.a::new, "NeFos");
   dzw ad = a(dzb::new, "jigsaw");

   dzj load(dzv var1, sn var2);

   private static dzw a(dzw $$0, String $$1) {
      return it.a(kd.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dzw a(dzw.a $$0, String $$1) {
      return a((dzw)$$0, $$1);
   }

   private static dzw a(dzw.b $$0, String $$1) {
      return a((dzw)$$0, $$1);
   }

   public interface a extends dzw {
      dzj load(sn var1);

      @Override
      default dzj load(dzv $$0, sn $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dzw {
      dzj load(edg var1, sn var2);

      @Override
      default dzj load(dzv $$0, sn $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
