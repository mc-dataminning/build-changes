import java.util.Locale;

public interface ejd {
   ejd a = a(ekp.a::new, "MSCorridor");
   ejd b = a(ekp.b::new, "MSCrossing");
   ejd c = a(ekp.d::new, "MSRoom");
   ejd d = a(ekp.e::new, "MSStairs");
   ejd e = a(ekr.a::new, "NeBCr");
   ejd f = a(ekr.b::new, "NeBEF");
   ejd g = a(ekr.c::new, "NeBS");
   ejd h = a(ekr.d::new, "NeCCS");
   ejd i = a(ekr.e::new, "NeCTB");
   ejd j = a(ekr.f::new, "NeCE");
   ejd k = a(ekr.g::new, "NeSCSC");
   ejd l = a(ekr.h::new, "NeSCLT");
   ejd m = a(ekr.i::new, "NeSC");
   ejd n = a(ekr.j::new, "NeSCRT");
   ejd o = a(ekr.k::new, "NeCSR");
   ejd p = a(ekr.l::new, "NeMT");
   ejd q = a(ekr.o::new, "NeRC");
   ejd r = a(ekr.p::new, "NeSR");
   ejd s = a(ekr.q::new, "NeStart");
   ejd t = a(eld.a::new, "SHCC");
   ejd u = a(eld.b::new, "SHFC");
   ejd v = a(eld.c::new, "SH5C");
   ejd w = a(eld.d::new, "SHLT");
   ejd x = a(eld.e::new, "SHLi");
   ejd y = a(eld.g::new, "SHPR");
   ejd z = a(eld.h::new, "SHPH");
   ejd A = a(eld.i::new, "SHRT");
   ejd B = a(eld.j::new, "SHRC");
   ejd C = a(eld.l::new, "SHSD");
   ejd D = a(eld.m::new, "SHStart");
   ejd E = a(eld.n::new, "SHS");
   ejd F = a(eld.o::new, "SHSSD");
   ejd G = a(ekn::new, "TeJP");
   ejd H = a(ekx.a::a, "ORP");
   ejd I = a(ekk.a::new, "Iglu");
   ejd J = a(ekz::new, "RUPO");
   ejd K = a(elf::new, "TeSH");
   ejd L = a(ekg::new, "TeDP");
   ejd M = a(ekv.h::new, "OMB");
   ejd N = a(ekv.j::new, "OMCR");
   ejd O = a(ekv.k::new, "OMDXR");
   ejd P = a(ekv.l::new, "OMDXYR");
   ejd Q = a(ekv.m::new, "OMDYR");
   ejd R = a(ekv.n::new, "OMDYZR");
   ejd S = a(ekv.o::new, "OMDZR");
   ejd T = a(ekv.p::new, "OMEntry");
   ejd U = a(ekv.q::new, "OMPenthouse");
   ejd V = a(ekv.s::new, "OMSimple");
   ejd W = a(ekv.t::new, "OMSimpleT");
   ejd X = a(ekv.u::new, "OMWR");
   ejd Y = a(eki.a::new, "ECP");
   ejd Z = a(elh.i::new, "WMP");
   ejd aa = a(eke.a::new, "BTP");
   ejd ab = a(elb.a::new, "Shipwreck");
   ejd ac = a(ekt.a::new, "NeFos");
   ejd ad = a(eii::new, "jigsaw");

   eiq load(ejc var1, us var2);

   private static ejd a(ejd $$0, String $$1) {
      return jv.a(lp.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ejd a(ejd.a $$0, String $$1) {
      return a((ejd)$$0, $$1);
   }

   private static ejd a(ejd.b $$0, String $$1) {
      return a((ejd)$$0, $$1);
   }

   public interface a extends ejd {
      eiq load(us var1);

      @Override
      default eiq load(ejc $$0, us $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ejd {
      eiq load(emn var1, us var2);

      @Override
      default eiq load(ejc $$0, us $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
