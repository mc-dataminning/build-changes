import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ckr extends cjc {
   public static final String a = "effects";
   public static final int b = 160;

   public ckr(cjc.a $$0) {
      super($$0);
   }

   public static void a(cjh $$0, List<dba.a> $$1) {
      qy $$2 = $$0.w();
      dba.a.b.encodeStart(rk.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cjh $$0, List<dba.a> $$1) {
      qy $$2 = $$0.w();
      List<dba.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dba.a.b.encodeStart(rk.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cjh $$0, Consumer<dba.a> $$1) {
      qy $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dba.a.b.parse(rk.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bif> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         clg.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cjh a(cjh $$0, cpx $$1, bji $$2) {
      cjh $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cbw && ((cbw)$$2).fS().d ? $$3 : new cjh(cjk.oC);
   }
}
