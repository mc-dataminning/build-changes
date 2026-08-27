import java.nio.file.Path;
import javax.annotation.Nullable;

public class akl extends ake {
   private static final ajz b = new ajz(sw.c("dataPack.vanilla.description"), aa.b().a(ajm.b));
   private static final ajj c = new ajj(cay.f);
   private static final aji d = aji.a(ajz.a, b, ajj.a, c);
   private static final sw e = sw.c("dataPack.vanilla.name");
   private static final acq f = new acq("minecraft", "datapacks");

   public akl() {
      super(ajm.b, b(), f);
   }

   private static ajo b() {
      return new ajp().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected sw a(String $$0) {
      return sw.b($$0);
   }

   @Nullable
   @Override
   protected akg a(ajl $$0) {
      return akg.a("vanilla", e, false, $$1 -> $$0, ajm.b, akg.b.b, akj.c);
   }

   @Nullable
   @Override
   protected akg a(String $$0, akg.c $$1, sw $$2) {
      return akg.a($$0, $$2, false, $$1, ajm.b, akg.b.a, akj.d);
   }

   public static aki a(Path $$0) {
      return new aki(new akl(), new akf($$0, ajm.b, akj.e));
   }

   public static aki a(dyy.c $$0) {
      return a($$0.a(dyw.j));
   }
}
