import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cob extends cmm {
   public static final String a = "effects";
   public static final int b = 160;

   public cob(cmm.a $$0) {
      super($$0);
   }

   public static void a(cmr $$0, List<dek.a> $$1) {
      sl $$2 = $$0.w();
      dek.a.b.encodeStart(sz.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cmr $$0, List<dek.a> $$1) {
      sl $$2 = $$0.w();
      List<dek.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dek.a.b.encodeStart(sz.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cmr $$0, Consumer<dek.a> $$1) {
      sl $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dek.a.b.parse(sz.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<blc> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cor.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cmr a(cmr $$0, cti $$1, bmf $$2) {
      cmr $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cfb && ((cfb)$$2).fT().d ? $$3 : new cmr(cmu.pn);
   }
}
