import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class apv extends apn {
   private static final apj b = new apj(vf.c("dataPack.vanilla.description"), aa.b().a(aow.b), Optional.empty());
   private static final aos c = new aos(cht.h);
   private static final aop d = aop.a(apj.b, b, aos.a, c);
   private static final vf e = vf.c("dataPack.vanilla.name");
   private static final ahg f = new ahg("minecraft", "datapacks");

   public apv(eli $$0) {
      super(aow.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aoy b() {
      return new aoz().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vf a(String $$0) {
      return vf.b($$0);
   }

   @Nullable
   @Override
   protected app a(aov $$0) {
      return app.a("vanilla", e, false, b($$0), aow.b, app.b.b, apt.c);
   }

   @Nullable
   @Override
   protected app a(String $$0, app.c $$1, vf $$2) {
      return app.a($$0, $$2, false, $$1, aow.b, app.b.a, apt.d);
   }

   public static aps a(Path $$0, eli $$1) {
      return new aps(new apv($$1), new apo($$0, aow.b, apt.e, $$1));
   }

   public static aps c() {
      return new aps(new apv(new eli($$0 -> true)));
   }

   public static aps a(egl.c $$0) {
      return a($$0.a(egj.j), $$0.b().e());
   }
}
