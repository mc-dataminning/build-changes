import java.util.Locale;

public interface elf {
   elf a = a(ems.a::new, "MSCorridor");
   elf b = a(ems.b::new, "MSCrossing");
   elf c = a(ems.d::new, "MSRoom");
   elf d = a(ems.e::new, "MSStairs");
   elf e = a(emu.a::new, "NeBCr");
   elf f = a(emu.b::new, "NeBEF");
   elf g = a(emu.c::new, "NeBS");
   elf h = a(emu.d::new, "NeCCS");
   elf i = a(emu.e::new, "NeCTB");
   elf j = a(emu.f::new, "NeCE");
   elf k = a(emu.g::new, "NeSCSC");
   elf l = a(emu.h::new, "NeSCLT");
   elf m = a(emu.i::new, "NeSC");
   elf n = a(emu.j::new, "NeSCRT");
   elf o = a(emu.k::new, "NeCSR");
   elf p = a(emu.l::new, "NeMT");
   elf q = a(emu.o::new, "NeRC");
   elf r = a(emu.p::new, "NeSR");
   elf s = a(emu.q::new, "NeStart");
   elf t = a(eng.a::new, "SHCC");
   elf u = a(eng.b::new, "SHFC");
   elf v = a(eng.c::new, "SH5C");
   elf w = a(eng.d::new, "SHLT");
   elf x = a(eng.e::new, "SHLi");
   elf y = a(eng.g::new, "SHPR");
   elf z = a(eng.h::new, "SHPH");
   elf A = a(eng.i::new, "SHRT");
   elf B = a(eng.j::new, "SHRC");
   elf C = a(eng.l::new, "SHSD");
   elf D = a(eng.m::new, "SHStart");
   elf E = a(eng.n::new, "SHS");
   elf F = a(eng.o::new, "SHSSD");
   elf G = a(emq::new, "TeJP");
   elf H = a(ena.a::a, "ORP");
   elf I = a(emn.a::new, "Iglu");
   elf J = a(enc::new, "RUPO");
   elf K = a(eni::new, "TeSH");
   elf L = a(emj::new, "TeDP");
   elf M = a(emy.h::new, "OMB");
   elf N = a(emy.j::new, "OMCR");
   elf O = a(emy.k::new, "OMDXR");
   elf P = a(emy.l::new, "OMDXYR");
   elf Q = a(emy.m::new, "OMDYR");
   elf R = a(emy.n::new, "OMDYZR");
   elf S = a(emy.o::new, "OMDZR");
   elf T = a(emy.p::new, "OMEntry");
   elf U = a(emy.q::new, "OMPenthouse");
   elf V = a(emy.s::new, "OMSimple");
   elf W = a(emy.t::new, "OMSimpleT");
   elf X = a(emy.u::new, "OMWR");
   elf Y = a(eml.a::new, "ECP");
   elf Z = a(enk.i::new, "WMP");
   elf aa = a(emh.a::new, "BTP");
   elf ab = a(ene.a::new, "Shipwreck");
   elf ac = a(emw.a::new, "NeFos");
   elf ad = a(ekk::new, "jigsaw");

   eks load(ele var1, uf var2);

   private static elf a(elf $$0, String $$1) {
      return ka.a(lu.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static elf a(elf.a $$0, String $$1) {
      return a((elf)$$0, $$1);
   }

   private static elf a(elf.b $$0, String $$1) {
      return a((elf)$$0, $$1);
   }

   public interface a extends elf {
      eks load(uf var1);

      @Override
      default eks load(ele $$0, uf $$1) {
         return this.load($$1);
      }
   }

   public interface b extends elf {
      eks load(eor var1, uf var2);

      @Override
      default eks load(ele $$0, uf $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
