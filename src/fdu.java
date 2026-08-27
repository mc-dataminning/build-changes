import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fdu {
   private static final aww a = aww.codepoint(32, xd.a);

   private static String a(String $$0) {
      return fbp.Q().m.K().c() ? $$0 : n.a($$0);
   }

   public static List<aww> a(wl $$0, int $$1, fda $$2) {
      fbf $$3 = new fbf();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(wl.a(a($$2x), $$1x));
         return Optional.empty();
      }, xd.a);
      List<aww> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, xd.a, ($$1x, $$2x) -> {
         aww $$3x = th.a().a($$1x);
         $$4.add($$2x ? aww.composite(a, $$3x) : $$3x);
      });
      return (List<aww>)($$4.isEmpty() ? Lists.newArrayList(new aww[]{aww.a}) : $$4);
   }
}
