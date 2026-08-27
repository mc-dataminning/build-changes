import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aoh extends anz {
   private static final anv b = new anv(ui.c("dataPack.vanilla.description"), aa.b().a(ani.b), Optional.empty());
   private static final ane c = new ane(cfi.g);
   private static final anc d = anc.a(anv.b, b, ane.a, c);
   private static final ui e = ui.c("dataPack.vanilla.name");
   private static final afw f = new afw("minecraft", "datapacks");

   public aoh(ehv $$0) {
      super(ani.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static ank b() {
      return new anl().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected ui a(String $$0) {
      return ui.b($$0);
   }

   @Nullable
   @Override
   protected aob a(anh $$0) {
      return aob.a("vanilla", e, false, b($$0), ani.b, aob.b.b, aof.c);
   }

   @Nullable
   @Override
   protected aob a(String $$0, aob.c $$1, ui $$2) {
      return aob.a($$0, $$2, false, $$1, ani.b, aob.b.a, aof.d);
   }

   public static aoe a(Path $$0, ehv $$1) {
      return new aoe(new aoh($$1), new aoa($$0, ani.b, aof.e, $$1));
   }

   public static aoe c() {
      return new aoe(new aoh(new ehv($$0 -> true)));
   }

   public static aoe a(ecy.c $$0) {
      return a($$0.a(ecw.j), $$0.a().e());
   }
}
