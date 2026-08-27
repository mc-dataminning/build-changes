import java.util.Locale;

public interface dzq {
   dzq a = a(ebc.a::new, "MSCorridor");
   dzq b = a(ebc.b::new, "MSCrossing");
   dzq c = a(ebc.d::new, "MSRoom");
   dzq d = a(ebc.e::new, "MSStairs");
   dzq e = a(ebe.a::new, "NeBCr");
   dzq f = a(ebe.b::new, "NeBEF");
   dzq g = a(ebe.c::new, "NeBS");
   dzq h = a(ebe.d::new, "NeCCS");
   dzq i = a(ebe.e::new, "NeCTB");
   dzq j = a(ebe.f::new, "NeCE");
   dzq k = a(ebe.g::new, "NeSCSC");
   dzq l = a(ebe.h::new, "NeSCLT");
   dzq m = a(ebe.i::new, "NeSC");
   dzq n = a(ebe.j::new, "NeSCRT");
   dzq o = a(ebe.k::new, "NeCSR");
   dzq p = a(ebe.l::new, "NeMT");
   dzq q = a(ebe.o::new, "NeRC");
   dzq r = a(ebe.p::new, "NeSR");
   dzq s = a(ebe.q::new, "NeStart");
   dzq t = a(ebq.a::new, "SHCC");
   dzq u = a(ebq.b::new, "SHFC");
   dzq v = a(ebq.c::new, "SH5C");
   dzq w = a(ebq.d::new, "SHLT");
   dzq x = a(ebq.e::new, "SHLi");
   dzq y = a(ebq.g::new, "SHPR");
   dzq z = a(ebq.h::new, "SHPH");
   dzq A = a(ebq.i::new, "SHRT");
   dzq B = a(ebq.j::new, "SHRC");
   dzq C = a(ebq.l::new, "SHSD");
   dzq D = a(ebq.m::new, "SHStart");
   dzq E = a(ebq.n::new, "SHS");
   dzq F = a(ebq.o::new, "SHSSD");
   dzq G = a(eba::new, "TeJP");
   dzq H = a(ebk.a::a, "ORP");
   dzq I = a(eax.a::new, "Iglu");
   dzq J = a(ebm::new, "RUPO");
   dzq K = a(ebs::new, "TeSH");
   dzq L = a(eat::new, "TeDP");
   dzq M = a(ebi.h::new, "OMB");
   dzq N = a(ebi.j::new, "OMCR");
   dzq O = a(ebi.k::new, "OMDXR");
   dzq P = a(ebi.l::new, "OMDXYR");
   dzq Q = a(ebi.m::new, "OMDYR");
   dzq R = a(ebi.n::new, "OMDYZR");
   dzq S = a(ebi.o::new, "OMDZR");
   dzq T = a(ebi.p::new, "OMEntry");
   dzq U = a(ebi.q::new, "OMPenthouse");
   dzq V = a(ebi.s::new, "OMSimple");
   dzq W = a(ebi.t::new, "OMSimpleT");
   dzq X = a(ebi.u::new, "OMWR");
   dzq Y = a(eav.a::new, "ECP");
   dzq Z = a(ebu.i::new, "WMP");
   dzq aa = a(ear.a::new, "BTP");
   dzq ab = a(ebo.a::new, "Shipwreck");
   dzq ac = a(ebg.a::new, "NeFos");
   dzq ad = a(dyv::new, "jigsaw");

   dzd load(dzp var1, sl var2);

   private static dzq a(dzq $$0, String $$1) {
      return it.a(kd.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dzq a(dzq.a $$0, String $$1) {
      return a((dzq)$$0, $$1);
   }

   private static dzq a(dzq.b $$0, String $$1) {
      return a((dzq)$$0, $$1);
   }

   public interface a extends dzq {
      dzd load(sl var1);

      @Override
      default dzd load(dzp $$0, sl $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dzq {
      dzd load(eda var1, sl var2);

      @Override
      default dzd load(dzp $$0, sl $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
