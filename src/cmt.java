import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cmt extends cle {
   public static final String a = "effects";
   public static final int b = 160;

   public cmt(cle.a $$0) {
      super($$0);
   }

   public static void a(clj $$0, List<ddb.a> $$1) {
      rz $$2 = $$0.w();
      ddb.a.b.encodeStart(sn.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(clj $$0, List<ddb.a> $$1) {
      rz $$2 = $$0.w();
      List<ddb.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      ddb.a.b.encodeStart(sn.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(clj $$0, Consumer<ddb.a> $$1) {
      rz $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         ddb.a.b.parse(sn.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bkd> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cni.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public clj a(clj $$0, csa $$1, blg $$2) {
      clj $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cdu && ((cdu)$$2).fU().d ? $$3 : new clj(clm.pn);
   }
}
