import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ezm {
   private static final avt a = avt.codepoint(32, wn.a);

   private static String a(String $$0) {
      return exh.O().m.I().c() ? $$0 : n.a($$0);
   }

   public static List<avt> a(vv $$0, int $$1, eys $$2) {
      ewx $$3 = new ewx();
      $$0.a(($$1x, $$2x) -> {
         $$3.a(vv.a(a($$2x), $$1x));
         return Optional.empty();
      }, wn.a);
      List<avt> $$4 = Lists.newArrayList();
      $$2.b().a($$3.b(), $$1, wn.a, ($$1x, $$2x) -> {
         avt $$3x = sr.a().a($$1x);
         $$4.add($$2x ? avt.composite(a, $$3x) : $$3x);
      });
      return (List<avt>)($$4.isEmpty() ? Lists.newArrayList(new avt[]{avt.a}) : $$4);
   }
}
