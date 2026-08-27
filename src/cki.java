import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cki extends cit {
   public static final String a = "effects";
   public static final int b = 160;

   public cki(cit.a $$0) {
      super($$0);
   }

   public static void a(ciy $$0, List<dap.a> $$1) {
      qr $$2 = $$0.w();
      dap.a.b.encodeStart(rc.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(ciy $$0, List<dap.a> $$1) {
      qr $$2 = $$0.w();
      List<dap.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dap.a.b.encodeStart(rc.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(ciy $$0, Consumer<dap.a> $$1) {
      qr $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dap.a.b.parse(rc.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bhv> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         ckx.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public ciy a(ciy $$0, cpm $$1, biy $$2) {
      ciy $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cbn && ((cbn)$$2).fR().d ? $$3 : new ciy(cjb.oC);
   }
}
