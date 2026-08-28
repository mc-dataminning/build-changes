import java.util.Locale;

public interface ejn {
   ejn a = a(ekz.a::new, "MSCorridor");
   ejn b = a(ekz.b::new, "MSCrossing");
   ejn c = a(ekz.d::new, "MSRoom");
   ejn d = a(ekz.e::new, "MSStairs");
   ejn e = a(elb.a::new, "NeBCr");
   ejn f = a(elb.b::new, "NeBEF");
   ejn g = a(elb.c::new, "NeBS");
   ejn h = a(elb.d::new, "NeCCS");
   ejn i = a(elb.e::new, "NeCTB");
   ejn j = a(elb.f::new, "NeCE");
   ejn k = a(elb.g::new, "NeSCSC");
   ejn l = a(elb.h::new, "NeSCLT");
   ejn m = a(elb.i::new, "NeSC");
   ejn n = a(elb.j::new, "NeSCRT");
   ejn o = a(elb.k::new, "NeCSR");
   ejn p = a(elb.l::new, "NeMT");
   ejn q = a(elb.o::new, "NeRC");
   ejn r = a(elb.p::new, "NeSR");
   ejn s = a(elb.q::new, "NeStart");
   ejn t = a(eln.a::new, "SHCC");
   ejn u = a(eln.b::new, "SHFC");
   ejn v = a(eln.c::new, "SH5C");
   ejn w = a(eln.d::new, "SHLT");
   ejn x = a(eln.e::new, "SHLi");
   ejn y = a(eln.g::new, "SHPR");
   ejn z = a(eln.h::new, "SHPH");
   ejn A = a(eln.i::new, "SHRT");
   ejn B = a(eln.j::new, "SHRC");
   ejn C = a(eln.l::new, "SHSD");
   ejn D = a(eln.m::new, "SHStart");
   ejn E = a(eln.n::new, "SHS");
   ejn F = a(eln.o::new, "SHSSD");
   ejn G = a(ekx::new, "TeJP");
   ejn H = a(elh.a::a, "ORP");
   ejn I = a(eku.a::new, "Iglu");
   ejn J = a(elj::new, "RUPO");
   ejn K = a(elp::new, "TeSH");
   ejn L = a(ekq::new, "TeDP");
   ejn M = a(elf.h::new, "OMB");
   ejn N = a(elf.j::new, "OMCR");
   ejn O = a(elf.k::new, "OMDXR");
   ejn P = a(elf.l::new, "OMDXYR");
   ejn Q = a(elf.m::new, "OMDYR");
   ejn R = a(elf.n::new, "OMDYZR");
   ejn S = a(elf.o::new, "OMDZR");
   ejn T = a(elf.p::new, "OMEntry");
   ejn U = a(elf.q::new, "OMPenthouse");
   ejn V = a(elf.s::new, "OMSimple");
   ejn W = a(elf.t::new, "OMSimpleT");
   ejn X = a(elf.u::new, "OMWR");
   ejn Y = a(eks.a::new, "ECP");
   ejn Z = a(elr.i::new, "WMP");
   ejn aa = a(eko.a::new, "BTP");
   ejn ab = a(ell.a::new, "Shipwreck");
   ejn ac = a(eld.a::new, "NeFos");
   ejn ad = a(eis::new, "jigsaw");

   eja load(ejm var1, tx var2);

   private static ejn a(ejn $$0, String $$1) {
      return jw.a(lq.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ejn a(ejn.a $$0, String $$1) {
      return a((ejn)$$0, $$1);
   }

   private static ejn a(ejn.b $$0, String $$1) {
      return a((ejn)$$0, $$1);
   }

   public interface a extends ejn {
      eja load(tx var1);

      @Override
      default eja load(ejm $$0, tx $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ejn {
      eja load(emx var1, tx var2);

      @Override
      default eja load(ejm $$0, tx $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
