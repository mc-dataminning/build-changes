import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class and extends amv {
   private static final amr b = new amr(ti.c("dataPack.vanilla.description"), aa.b().a(ame.b), Optional.empty());
   private static final ama c = new ama(cdz.g);
   private static final aly d = aly.a(amr.b, b, ama.a, c);
   private static final ti e = ti.c("dataPack.vanilla.name");
   private static final aeu f = new aeu("minecraft", "datapacks");

   public and(egy $$0) {
      super(ame.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static amg b() {
      return new amh().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected ti a(String $$0) {
      return ti.b($$0);
   }

   @Nullable
   @Override
   protected amx a(amd $$0) {
      return amx.a("vanilla", e, false, b($$0), ame.b, amx.b.b, anb.c);
   }

   @Nullable
   @Override
   protected amx a(String $$0, amx.c $$1, ti $$2) {
      return amx.a($$0, $$2, false, $$1, ame.b, amx.b.a, anb.d);
   }

   public static ana a(Path $$0, egy $$1) {
      return new ana(new and($$1), new amw($$0, ame.b, anb.e, $$1));
   }

   public static ana c() {
      return new ana(new and(new egy($$0 -> true)));
   }

   public static ana a(ecb.c $$0) {
      return a($$0.a(ebz.j), $$0.a().e());
   }
}
