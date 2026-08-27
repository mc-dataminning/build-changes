import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ckk extends civ {
   public static final String a = "effects";
   public static final int b = 160;

   public ckk(civ.a $$0) {
      super($$0);
   }

   public static void a(cja $$0, List<dat.a> $$1) {
      qu $$2 = $$0.w();
      dat.a.b.encodeStart(rf.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cja $$0, List<dat.a> $$1) {
      qu $$2 = $$0.w();
      List<dat.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dat.a.b.encodeStart(rf.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cja $$0, Consumer<dat.a> $$1) {
      qu $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dat.a.b.parse(rf.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bhy> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         ckz.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cja a(cja $$0, cpq $$1, bjb $$2) {
      cja $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cbp && ((cbp)$$2).fR().d ? $$3 : new cja(cjd.oC);
   }
}
