import java.util.Locale;

public interface ese {
   ese a = a(etr.a::new, "MSCorridor");
   ese b = a(etr.b::new, "MSCrossing");
   ese c = a(etr.d::new, "MSRoom");
   ese d = a(etr.e::new, "MSStairs");
   ese e = a(ett.a::new, "NeBCr");
   ese f = a(ett.b::new, "NeBEF");
   ese g = a(ett.c::new, "NeBS");
   ese h = a(ett.d::new, "NeCCS");
   ese i = a(ett.e::new, "NeCTB");
   ese j = a(ett.f::new, "NeCE");
   ese k = a(ett.g::new, "NeSCSC");
   ese l = a(ett.h::new, "NeSCLT");
   ese m = a(ett.i::new, "NeSC");
   ese n = a(ett.j::new, "NeSCRT");
   ese o = a(ett.k::new, "NeCSR");
   ese p = a(ett.l::new, "NeMT");
   ese q = a(ett.o::new, "NeRC");
   ese r = a(ett.p::new, "NeSR");
   ese s = a(ett.q::new, "NeStart");
   ese t = a(euf.a::new, "SHCC");
   ese u = a(euf.b::new, "SHFC");
   ese v = a(euf.c::new, "SH5C");
   ese w = a(euf.d::new, "SHLT");
   ese x = a(euf.e::new, "SHLi");
   ese y = a(euf.g::new, "SHPR");
   ese z = a(euf.h::new, "SHPH");
   ese A = a(euf.i::new, "SHRT");
   ese B = a(euf.j::new, "SHRC");
   ese C = a(euf.l::new, "SHSD");
   ese D = a(euf.m::new, "SHStart");
   ese E = a(euf.n::new, "SHS");
   ese F = a(euf.o::new, "SHSSD");
   ese G = a(etp::new, "TeJP");
   ese H = a(etz.a::a, "ORP");
   ese I = a(etm.a::new, "Iglu");
   ese J = a(eub::new, "RUPO");
   ese K = a(euh::new, "TeSH");
   ese L = a(eti::new, "TeDP");
   ese M = a(etx.h::new, "OMB");
   ese N = a(etx.j::new, "OMCR");
   ese O = a(etx.k::new, "OMDXR");
   ese P = a(etx.l::new, "OMDXYR");
   ese Q = a(etx.m::new, "OMDYR");
   ese R = a(etx.n::new, "OMDYZR");
   ese S = a(etx.o::new, "OMDZR");
   ese T = a(etx.p::new, "OMEntry");
   ese U = a(etx.q::new, "OMPenthouse");
   ese V = a(etx.s::new, "OMSimple");
   ese W = a(etx.t::new, "OMSimpleT");
   ese X = a(etx.u::new, "OMWR");
   ese Y = a(etk.a::new, "ECP");
   ese Z = a(euj.i::new, "WMP");
   ese aa = a(etg.a::new, "BTP");
   ese ab = a(eud.a::new, "Shipwreck");
   ese ac = a(etv.a::new, "NeFos");
   ese ad = a(erj::new, "jigsaw");

   err load(esd var1, tz var2);

   private static ese a(ese $$0, String $$1) {
      return js.a(mg.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static ese a(ese.a $$0, String $$1) {
      return a((ese)$$0, $$1);
   }

   private static ese a(ese.b $$0, String $$1) {
      return a((ese)$$0, $$1);
   }

   public interface a extends ese {
      err load(tz var1);

      @Override
      default err load(esd $$0, tz $$1) {
         return this.load($$1);
      }
   }

   public interface b extends ese {
      err load(evq var1, tz var2);

      @Override
      default err load(esd $$0, tz $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
