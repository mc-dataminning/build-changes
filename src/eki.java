import java.util.Locale;

public interface eki {
   eki a = a(elv.a::new, "MSCorridor");
   eki b = a(elv.b::new, "MSCrossing");
   eki c = a(elv.d::new, "MSRoom");
   eki d = a(elv.e::new, "MSStairs");
   eki e = a(elx.a::new, "NeBCr");
   eki f = a(elx.b::new, "NeBEF");
   eki g = a(elx.c::new, "NeBS");
   eki h = a(elx.d::new, "NeCCS");
   eki i = a(elx.e::new, "NeCTB");
   eki j = a(elx.f::new, "NeCE");
   eki k = a(elx.g::new, "NeSCSC");
   eki l = a(elx.h::new, "NeSCLT");
   eki m = a(elx.i::new, "NeSC");
   eki n = a(elx.j::new, "NeSCRT");
   eki o = a(elx.k::new, "NeCSR");
   eki p = a(elx.l::new, "NeMT");
   eki q = a(elx.o::new, "NeRC");
   eki r = a(elx.p::new, "NeSR");
   eki s = a(elx.q::new, "NeStart");
   eki t = a(emj.a::new, "SHCC");
   eki u = a(emj.b::new, "SHFC");
   eki v = a(emj.c::new, "SH5C");
   eki w = a(emj.d::new, "SHLT");
   eki x = a(emj.e::new, "SHLi");
   eki y = a(emj.g::new, "SHPR");
   eki z = a(emj.h::new, "SHPH");
   eki A = a(emj.i::new, "SHRT");
   eki B = a(emj.j::new, "SHRC");
   eki C = a(emj.l::new, "SHSD");
   eki D = a(emj.m::new, "SHStart");
   eki E = a(emj.n::new, "SHS");
   eki F = a(emj.o::new, "SHSSD");
   eki G = a(elt::new, "TeJP");
   eki H = a(emd.a::a, "ORP");
   eki I = a(elq.a::new, "Iglu");
   eki J = a(emf::new, "RUPO");
   eki K = a(eml::new, "TeSH");
   eki L = a(elm::new, "TeDP");
   eki M = a(emb.h::new, "OMB");
   eki N = a(emb.j::new, "OMCR");
   eki O = a(emb.k::new, "OMDXR");
   eki P = a(emb.l::new, "OMDXYR");
   eki Q = a(emb.m::new, "OMDYR");
   eki R = a(emb.n::new, "OMDYZR");
   eki S = a(emb.o::new, "OMDZR");
   eki T = a(emb.p::new, "OMEntry");
   eki U = a(emb.q::new, "OMPenthouse");
   eki V = a(emb.s::new, "OMSimple");
   eki W = a(emb.t::new, "OMSimpleT");
   eki X = a(emb.u::new, "OMWR");
   eki Y = a(elo.a::new, "ECP");
   eki Z = a(emn.i::new, "WMP");
   eki aa = a(elk.a::new, "BTP");
   eki ab = a(emh.a::new, "Shipwreck");
   eki ac = a(elz.a::new, "NeFos");
   eki ad = a(ejn::new, "jigsaw");

   ejv load(ekh var1, ub var2);

   private static eki a(eki $$0, String $$1) {
      return jz.a(lt.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static eki a(eki.a $$0, String $$1) {
      return a((eki)$$0, $$1);
   }

   private static eki a(eki.b $$0, String $$1) {
      return a((eki)$$0, $$1);
   }

   public interface a extends eki {
      ejv load(ub var1);

      @Override
      default ejv load(ekh $$0, ub $$1) {
         return this.load($$1);
      }
   }

   public interface b extends eki {
      ejv load(enu var1, ub var2);

      @Override
      default ejv load(ekh $$0, ub $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
