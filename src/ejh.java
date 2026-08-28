import java.util.Locale;

public interface ejh {
   ejh a = a(ekt.a::new, "MSCorridor");
   ejh b = a(ekt.b::new, "MSCrossing");
   ejh c = a(ekt.d::new, "MSRoom");
   ejh d = a(ekt.e::new, "MSStairs");
   ejh e = a(ekv.a::new, "NeBCr");
   ejh f = a(ekv.b::new, "NeBEF");
   ejh g = a(ekv.c::new, "NeBS");
   ejh h = a(ekv.d::new, "NeCCS");
   ejh i = a(ekv.e::new, "NeCTB");
   ejh j = a(ekv.f::new, "NeCE");
   ejh k = a(ekv.g::new, "NeSCSC");
   ejh l = a(ekv.h::new, "NeSCLT");
   ejh m = a(ekv.i::new, "NeSC");
   ejh n = a(ekv.j::new, "NeSCRT");
   ejh o = a(ekv.k::new, "NeCSR");
   ejh p = a(ekv.l::new, "NeMT");
   ejh q = a(ekv.o::new, "NeRC");
   ejh r = a(ekv.p::new, "NeSR");
   ejh s = a(ekv.q::new, "NeStart");
   ejh t = a(elh.a::new, "SHCC");
   ejh u = a(elh.b::new, "SHFC");
   ejh v = a(elh.c::new, "SH5C");
   ejh w = a(elh.d::new, "SHLT");
   ejh x = a(elh.e::new, "SHLi");
   ejh y = a(elh.g::new, "SHPR");
   ejh z = a(elh.h::new, "SHPH");
   ejh A = a(elh.i::new, "SHRT");
   ejh B = a(elh.j::new, "SHRC");
   ejh C = a(elh.l::new, "SHSD");
   ejh D = a(elh.m::new, "SHStart");
   ejh E = a(elh.n::new, "SHS");
   ejh F = a(elh.o::new, "SHSSD");
   ejh G = a(ekr::new, "TeJP");
   ejh H = a(elb.a::a, "ORP");
   ejh I = a(eko.a::new, "Iglu");
   ejh J = a(eld::new, "RUPO");
   ejh K = a(elj::new, "TeSH");
   ejh L = a(ekk::new, "TeDP");
   ejh M = a(ekz.h::new, "OMB");
   ejh N = a(ekz.j::new, "OMCR");
   ejh O = a(ekz.k::new, "OMDXR");
   ejh P = a(ekz.l::new, "OMDXYR");
   ejh Q = a(ekz.m::new, "OMDYR");
   ejh R = a(ekz.n::new, "OMDYZR");
   ejh S = a(ekz.o::new, "OMDZR");
   ejh T = a(ekz.p::new, "OMEntry");
   ejh U = a(ekz.q::new, "OMPenthouse");
   ejh V = a(ekz.s::new, "OMSimple");
   ejh W = a(ekz.t::new, "OMSimpleT");
   ejh X = a(ekz.u::new, "OMWR");
   ejh Y = a(ekm.a::new, "ECP");
   ejh Z = a(ell.i::new, "WMP");
   ejh aa = a(eki.a::new, "BTP");
   ejh ab = a(elf.a::new, "Shipwreck");
   ejh ac = a(ekx.a::new, "NeFos");
   ejh ad = a(eim::new, "jigsaw");

   eiu load(ejg var1, tx var2);

   private static ejh a(ejh $$0, String $$1) {
      return jw.a(lq.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ejh a(ejh.a $$0, String $$1) {
      return a((ejh)$$0, $$1);
   }

   private static ejh a(ejh.b $$0, String $$1) {
      return a((ejh)$$0, $$1);
   }

   public interface a extends ejh {
      eiu load(tx var1);

      @Override
      default eiu load(ejg $$0, tx $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ejh {
      eiu load(emr var1, tx var2);

      @Override
      default eiu load(ejg $$0, tx $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
