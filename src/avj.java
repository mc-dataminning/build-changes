import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class avj extends ava {
   private static final auv c = new auv(xv.c("dataPack.vanilla.description"), ab.b().a(aui.b), Optional.empty());
   private static final auc d = new auc(csq.i);
   private static final aty e = aty.a(auv.b, c, auc.a, d);
   private static final auf f = new auf("vanilla", xv.c("dataPack.vanilla.name"), avh.c, Optional.of(b));
   private static final auh g = new auh(false, avd.b.b, false);
   private static final auh h = new auh(false, avd.b.a, false);
   private static final alz i = alz.b("datapacks");

   public avj(fbi $$0) {
      super(aui.b, b(), i, $$0);
   }

   private static auf a(String $$0, xv $$1) {
      return new auf($$0, $$1, avh.d, Optional.of(avc.a($$0)));
   }

   @VisibleForTesting
   public static auk b() {
      return new aul().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xv a(String $$0) {
      return xv.b($$0);
   }

   @Nullable
   @Override
   protected avd a(aug $$0) {
      return avd.a(f, b($$0), aui.b, g);
   }

   @Nullable
   @Override
   protected avd a(String $$0, avd.c $$1, xv $$2) {
      return avd.a(a($$0, $$2), $$1, aui.b, h);
   }

   public static avg a(Path $$0, fbi $$1) {
      return new avg(new avj($$1), new avb($$0, aui.b, avh.e, $$1));
   }

   public static avg c() {
      return new avg(new avj(new fbi($$0 -> true)));
   }

   public static avg a(evv.c $$0) {
      return a($$0.a(evt.j), $$0.d().e());
   }
}
