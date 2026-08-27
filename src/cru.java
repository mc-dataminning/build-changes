import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cru extends cqf {
   public static final String a = "effects";
   public static final int b = 160;

   public cru(cqf.a $$0) {
      super($$0);
   }

   public static void a(cqk $$0, List<dib.a> $$1) {
      ta $$2 = $$0.x();
      dib.a.b.encodeStart(to.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cqk $$0, List<dib.a> $$1) {
      ta $$2 = $$0.x();
      List<dib.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dib.a.b.encodeStart(to.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cqk $$0, Consumer<dib.a> $$1) {
      ta $$2 = $$0.w();
      if ($$2 != null && $$2.b("effects", 9)) {
         dib.a.b.parse(to.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<boj> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         csj.a($$4, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cqk a(cqk $$0, cwz $$1, bpo $$2) {
      cqk $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2.fM() ? $$3 : new cqk(cqn.pp);
   }
}
