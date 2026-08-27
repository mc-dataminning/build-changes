import java.util.Locale;

public interface dzf {
   dzf a = a(ear.a::new, "MSCorridor");
   dzf b = a(ear.b::new, "MSCrossing");
   dzf c = a(ear.d::new, "MSRoom");
   dzf d = a(ear.e::new, "MSStairs");
   dzf e = a(eat.a::new, "NeBCr");
   dzf f = a(eat.b::new, "NeBEF");
   dzf g = a(eat.c::new, "NeBS");
   dzf h = a(eat.d::new, "NeCCS");
   dzf i = a(eat.e::new, "NeCTB");
   dzf j = a(eat.f::new, "NeCE");
   dzf k = a(eat.g::new, "NeSCSC");
   dzf l = a(eat.h::new, "NeSCLT");
   dzf m = a(eat.i::new, "NeSC");
   dzf n = a(eat.j::new, "NeSCRT");
   dzf o = a(eat.k::new, "NeCSR");
   dzf p = a(eat.l::new, "NeMT");
   dzf q = a(eat.o::new, "NeRC");
   dzf r = a(eat.p::new, "NeSR");
   dzf s = a(eat.q::new, "NeStart");
   dzf t = a(ebf.a::new, "SHCC");
   dzf u = a(ebf.b::new, "SHFC");
   dzf v = a(ebf.c::new, "SH5C");
   dzf w = a(ebf.d::new, "SHLT");
   dzf x = a(ebf.e::new, "SHLi");
   dzf y = a(ebf.g::new, "SHPR");
   dzf z = a(ebf.h::new, "SHPH");
   dzf A = a(ebf.i::new, "SHRT");
   dzf B = a(ebf.j::new, "SHRC");
   dzf C = a(ebf.l::new, "SHSD");
   dzf D = a(ebf.m::new, "SHStart");
   dzf E = a(ebf.n::new, "SHS");
   dzf F = a(ebf.o::new, "SHSSD");
   dzf G = a(eap::new, "TeJP");
   dzf H = a(eaz.a::a, "ORP");
   dzf I = a(eam.a::new, "Iglu");
   dzf J = a(ebb::new, "RUPO");
   dzf K = a(ebh::new, "TeSH");
   dzf L = a(eai::new, "TeDP");
   dzf M = a(eax.h::new, "OMB");
   dzf N = a(eax.j::new, "OMCR");
   dzf O = a(eax.k::new, "OMDXR");
   dzf P = a(eax.l::new, "OMDXYR");
   dzf Q = a(eax.m::new, "OMDYR");
   dzf R = a(eax.n::new, "OMDYZR");
   dzf S = a(eax.o::new, "OMDZR");
   dzf T = a(eax.p::new, "OMEntry");
   dzf U = a(eax.q::new, "OMPenthouse");
   dzf V = a(eax.s::new, "OMSimple");
   dzf W = a(eax.t::new, "OMSimpleT");
   dzf X = a(eax.u::new, "OMWR");
   dzf Y = a(eak.a::new, "ECP");
   dzf Z = a(ebj.i::new, "WMP");
   dzf aa = a(eag.a::new, "BTP");
   dzf ab = a(ebd.a::new, "Shipwreck");
   dzf ac = a(eav.a::new, "NeFos");
   dzf ad = a(dyk::new, "jigsaw");

   dys load(dze var1, sj var2);

   private static dzf a(dzf $$0, String $$1) {
      return ir.a(kb.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dzf a(dzf.a $$0, String $$1) {
      return a((dzf)$$0, $$1);
   }

   private static dzf a(dzf.b $$0, String $$1) {
      return a((dzf)$$0, $$1);
   }

   public interface a extends dzf {
      dys load(sj var1);

      @Override
      default dys load(dze $$0, sj $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dzf {
      dys load(ecp var1, sj var2);

      @Override
      default dys load(dze $$0, sj $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
