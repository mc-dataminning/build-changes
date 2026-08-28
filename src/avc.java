import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class avc extends aus {
   private static final auo d = new auo(xg.c("dataPack.vanilla.description"), ac.b().a(auc.b), Optional.empty());
   private static final atw e = new atw(cvu.h);
   private static final ats f = ats.a(auo.b, d, atw.a, e);
   private static final atz g = new atz("vanilla", xg.c("dataPack.vanilla.name"), ava.c, Optional.of(c));
   private static final aub h = new aub(false, auv.b.b, false);
   private static final aub i = new aub(false, auv.b.a, false);
   private static final alr j = alr.b("datapacks");

   public avc(ffs $$0) {
      super(auc.b, b(), j, $$0);
   }

   private static atz a(String $$0, xg $$1) {
      return new atz($$0, $$1, ava.d, Optional.of(auu.a($$0)));
   }

   @VisibleForTesting
   public static aue b() {
      return new auf().a(f).a("minecraft").b().a().a(g);
   }

   @Override
   protected xg a(String $$0) {
      return xg.b($$0);
   }

   @Nullable
   @Override
   protected auv a(aua $$0) {
      return auv.a(g, b($$0), auc.b, h);
   }

   @Nullable
   @Override
   protected auv a(String $$0, auv.c $$1, xg $$2) {
      return auv.a(a($$0, $$2), $$1, auc.b, i);
   }

   public static auz a(Path $$0, ffs $$1) {
      return new auz(new avc($$1), new aut($$0, auc.b, ava.e, $$1));
   }

   public static auz c() {
      return new auz(new avc(new ffs($$0 -> true)));
   }

   public static auz a(fah.c $$0) {
      return a($$0.a(faf.j), $$0.d().e());
   }
}
