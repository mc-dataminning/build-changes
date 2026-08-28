import java.util.Locale;

public interface ejb {
   ejb a = a(ekn.a::new, "MSCorridor");
   ejb b = a(ekn.b::new, "MSCrossing");
   ejb c = a(ekn.d::new, "MSRoom");
   ejb d = a(ekn.e::new, "MSStairs");
   ejb e = a(ekp.a::new, "NeBCr");
   ejb f = a(ekp.b::new, "NeBEF");
   ejb g = a(ekp.c::new, "NeBS");
   ejb h = a(ekp.d::new, "NeCCS");
   ejb i = a(ekp.e::new, "NeCTB");
   ejb j = a(ekp.f::new, "NeCE");
   ejb k = a(ekp.g::new, "NeSCSC");
   ejb l = a(ekp.h::new, "NeSCLT");
   ejb m = a(ekp.i::new, "NeSC");
   ejb n = a(ekp.j::new, "NeSCRT");
   ejb o = a(ekp.k::new, "NeCSR");
   ejb p = a(ekp.l::new, "NeMT");
   ejb q = a(ekp.o::new, "NeRC");
   ejb r = a(ekp.p::new, "NeSR");
   ejb s = a(ekp.q::new, "NeStart");
   ejb t = a(elb.a::new, "SHCC");
   ejb u = a(elb.b::new, "SHFC");
   ejb v = a(elb.c::new, "SH5C");
   ejb w = a(elb.d::new, "SHLT");
   ejb x = a(elb.e::new, "SHLi");
   ejb y = a(elb.g::new, "SHPR");
   ejb z = a(elb.h::new, "SHPH");
   ejb A = a(elb.i::new, "SHRT");
   ejb B = a(elb.j::new, "SHRC");
   ejb C = a(elb.l::new, "SHSD");
   ejb D = a(elb.m::new, "SHStart");
   ejb E = a(elb.n::new, "SHS");
   ejb F = a(elb.o::new, "SHSSD");
   ejb G = a(ekl::new, "TeJP");
   ejb H = a(ekv.a::a, "ORP");
   ejb I = a(eki.a::new, "Iglu");
   ejb J = a(ekx::new, "RUPO");
   ejb K = a(eld::new, "TeSH");
   ejb L = a(eke::new, "TeDP");
   ejb M = a(ekt.h::new, "OMB");
   ejb N = a(ekt.j::new, "OMCR");
   ejb O = a(ekt.k::new, "OMDXR");
   ejb P = a(ekt.l::new, "OMDXYR");
   ejb Q = a(ekt.m::new, "OMDYR");
   ejb R = a(ekt.n::new, "OMDYZR");
   ejb S = a(ekt.o::new, "OMDZR");
   ejb T = a(ekt.p::new, "OMEntry");
   ejb U = a(ekt.q::new, "OMPenthouse");
   ejb V = a(ekt.s::new, "OMSimple");
   ejb W = a(ekt.t::new, "OMSimpleT");
   ejb X = a(ekt.u::new, "OMWR");
   ejb Y = a(ekg.a::new, "ECP");
   ejb Z = a(elf.i::new, "WMP");
   ejb aa = a(ekc.a::new, "BTP");
   ejb ab = a(ekz.a::new, "Shipwreck");
   ejb ac = a(ekr.a::new, "NeFos");
   ejb ad = a(eig::new, "jigsaw");

   eio load(eja var1, us var2);

   private static ejb a(ejb $$0, String $$1) {
      return jv.a(lp.S, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ejb a(ejb.a $$0, String $$1) {
      return a((ejb)$$0, $$1);
   }

   private static ejb a(ejb.b $$0, String $$1) {
      return a((ejb)$$0, $$1);
   }

   public interface a extends ejb {
      eio load(us var1);

      @Override
      default eio load(eja $$0, us $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ejb {
      eio load(eml var1, us var2);

      @Override
      default eio load(eja $$0, us $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
