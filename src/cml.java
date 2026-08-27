import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cml extends ckw {
   public static final String a = "effects";
   public static final int b = 160;

   public cml(ckw.a $$0) {
      super($$0);
   }

   public static void a(clb $$0, List<dcu.a> $$1) {
      rz $$2 = $$0.w();
      dcu.a.b.encodeStart(sn.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(clb $$0, List<dcu.a> $$1) {
      rz $$2 = $$0.w();
      List<dcu.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dcu.a.b.encodeStart(sn.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(clb $$0, Consumer<dcu.a> $$1) {
      rz $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dcu.a.b.parse(sn.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bjv> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cna.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public clb a(clb $$0, crs $$1, bky $$2) {
      clb $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cdm && ((cdm)$$2).fT().d ? $$3 : new clb(cle.oC);
   }
}
