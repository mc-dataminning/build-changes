import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ckh extends cis {
   public static final String a = "effects";
   public static final int b = 160;

   public ckh(cis.a $$0) {
      super($$0);
   }

   public static void a(cix $$0, List<dao.a> $$1) {
      qr $$2 = $$0.w();
      dao.a.b.encodeStart(rc.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cix $$0, List<dao.a> $$1) {
      qr $$2 = $$0.w();
      List<dao.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dao.a.b.encodeStart(rc.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cix $$0, Consumer<dao.a> $$1) {
      qr $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dao.a.b.parse(rc.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bhv> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         ckw.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cix a(cix $$0, cpl $$1, biy $$2) {
      cix $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cbm && ((cbm)$$2).fR().d ? $$3 : new cix(cja.oC);
   }
}
