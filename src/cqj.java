import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cqj extends cou {
   public static final String a = "effects";
   public static final int b = 160;

   public cqj(cou.a $$0) {
      super($$0);
   }

   public static void a(coz $$0, List<dgp.a> $$1) {
      sw $$2 = $$0.x();
      dgp.a.b.encodeStart(tk.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(coz $$0, List<dgp.a> $$1) {
      sw $$2 = $$0.x();
      List<dgp.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dgp.a.b.encodeStart(tk.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(coz $$0, Consumer<dgp.a> $$1) {
      sw $$2 = $$0.w();
      if ($$2 != null && $$2.b("effects", 9)) {
         dgp.a.b.parse(tk.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bnb> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cqx.a($$4, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public coz a(coz $$0, cvn $$1, bog $$2) {
      coz $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof chh && ((chh)$$2).fU().d ? $$3 : new coz(cpc.pp);
   }
}
