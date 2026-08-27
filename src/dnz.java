import com.mojang.serialization.Codec;

public interface dnz<P extends dny> {
   dnz<doe> a = a("matching_blocks", doe.a);
   dnz<dod> b = a("matching_block_tag", dod.e);
   dnz<dof> c = a("matching_fluids", dof.a);
   dnz<dob> d = a("has_sturdy_face", dob.a);
   dnz<doi> e = a("solid", doi.a);
   dnz<doh> f = a("replaceable", doh.a);
   dnz<dol> g = a("would_survive", dol.a);
   dnz<doc> h = a("inside_world_bounds", doc.a);
   dnz<dnx> i = a("any_of", dnx.a);
   dnz<dnw> j = a("all_of", dnw.a);
   dnz<dog> k = a("not", dog.a);
   dnz<dok> l = a("true", dok.e);

   Codec<P> codec();

   private static <P extends dny> dnz<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.P, $$0, () -> $$1);
   }
}
