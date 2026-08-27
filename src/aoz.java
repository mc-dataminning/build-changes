import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aoz extends aor {
   private static final aon b = new aon(uv.c("dataPack.vanilla.description"), aa.b().a(aoa.b), Optional.empty());
   private static final anw c = new anw(cgk.h);
   private static final anu d = anu.a(aon.b, b, anw.a, c);
   private static final uv e = uv.c("dataPack.vanilla.name");
   private static final agm f = new agm("minecraft", "datapacks");

   public aoz(ejp $$0) {
      super(aoa.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aoc b() {
      return new aod().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected uv a(String $$0) {
      return uv.b($$0);
   }

   @Nullable
   @Override
   protected aot a(anz $$0) {
      return aot.a("vanilla", e, false, b($$0), aoa.b, aot.b.b, aox.c);
   }

   @Nullable
   @Override
   protected aot a(String $$0, aot.c $$1, uv $$2) {
      return aot.a($$0, $$2, false, $$1, aoa.b, aot.b.a, aox.d);
   }

   public static aow a(Path $$0, ejp $$1) {
      return new aow(new aoz($$1), new aos($$0, aoa.b, aox.e, $$1));
   }

   public static aow c() {
      return new aow(new aoz(new ejp($$0 -> true)));
   }

   public static aow a(ees.c $$0) {
      return a($$0.a(eeq.j), $$0.b().e());
   }
}
