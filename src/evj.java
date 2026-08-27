import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class evj {
   private static final atc a = atc.codepoint(32, vs.a);

   private static String a(String $$0) {
      return eti.N().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<atc> a(va $$0, int $$1, eur $$2) {
      esy $$3 = new esy();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(va.a(a($$2x), $$1x));
         return Optional.empty();
      }, vs.a);
      List<atc> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, vs.a, ($$1x, $$2x) -> {
         atc $$3x = ry.a().a($$1x);
         $$4.add($$2x ? atc.composite(a, $$3x) : $$3x);
      });
      return (List<atc>)($$4.isEmpty() ? Lists.newArrayList(new atc[]{atc.a}) : $$4);
   }
}
