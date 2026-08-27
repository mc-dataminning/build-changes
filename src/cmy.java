import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cmy extends clj {
   public static final String a = "effects";
   public static final int b = 160;

   public cmy(clj.a $$0) {
      super($$0);
   }

   public static void a(clo $$0, List<ddg.a> $$1) {
      sd $$2 = $$0.w();
      ddg.a.b.encodeStart(sr.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(clo $$0, List<ddg.a> $$1) {
      sd $$2 = $$0.w();
      List<ddg.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      ddg.a.b.encodeStart(sr.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(clo $$0, Consumer<ddg.a> $$1) {
      sd $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         ddg.a.b.parse(sr.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bki> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cnn.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public clo a(clo $$0, csf $$1, bll $$2) {
      clo $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cdz && ((cdz)$$2).fU().d ? $$3 : new clo(clr.pn);
   }
}
