import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ewm {
   private static final atk a = atk.codepoint(32, vy.a);

   private static String a(String $$0) {
      return euk.N().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<atk> a(vg $$0, int $$1, evu $$2) {
      eua $$3 = new eua();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vg.a(a($$2x), $$1x));
         return Optional.empty();
      }, vy.a);
      List<atk> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, vy.a, ($$1x, $$2x) -> {
         atk $$3x = se.a().a($$1x);
         $$4.add($$2x ? atk.composite(a, $$3x) : $$3x);
      });
      return (List<atk>)($$4.isEmpty() ? Lists.newArrayList(new atk[]{atk.a}) : $$4);
   }
}
