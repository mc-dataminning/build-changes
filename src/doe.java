import com.mojang.serialization.Codec;

public interface doe<P extends dod> {
   doe<doj> a = a("matching_blocks", doj.a);
   doe<doi> b = a("matching_block_tag", doi.e);
   doe<dok> c = a("matching_fluids", dok.a);
   doe<dog> d = a("has_sturdy_face", dog.a);
   doe<don> e = a("solid", don.a);
   doe<dom> f = a("replaceable", dom.a);
   doe<doq> g = a("would_survive", doq.a);
   doe<doh> h = a("inside_world_bounds", doh.a);
   doe<doc> i = a("any_of", doc.a);
   doe<dob> j = a("all_of", dob.a);
   doe<dol> k = a("not", dol.a);
   doe<dop> l = a("true", dop.e);

   Codec<P> codec();

   private static <P extends dod> doe<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.P, $$0, () -> $$1);
   }
}
