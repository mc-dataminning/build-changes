import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auu extends aul {
   private static final auh d = new auh(xc.c("dataPack.vanilla.description"), ac.b().a(atv.b), Optional.empty());
   private static final atp e = new atp(cvl.h);
   private static final atl f = atl.a(auh.b, d, atp.a, e);
   private static final ats g = new ats("vanilla", xc.c("dataPack.vanilla.name"), aus.c, Optional.of(c));
   private static final atu h = new atu(false, auo.b.b, false);
   private static final atu i = new atu(false, auo.b.a, false);
   private static final alk j = alk.b("datapacks");

   public auu(ffi $$0) {
      super(atv.b, b(), j, $$0);
   }

   private static ats a(String $$0, xc $$1) {
      return new ats($$0, $$1, aus.d, Optional.of(aun.a($$0)));
   }

   @VisibleForTesting
   public static atx b() {
      return new aty().a(f).a("minecraft").b().a().a(g);
   }

   @Override
   protected xc a(String $$0) {
      return xc.b($$0);
   }

   @Nullable
   @Override
   protected auo a(att $$0) {
      return auo.a(g, b($$0), atv.b, h);
   }

   @Nullable
   @Override
   protected auo a(String $$0, auo.c $$1, xc $$2) {
      return auo.a(a($$0, $$2), $$1, atv.b, i);
   }

   public static aur a(Path $$0, ffi $$1) {
      return new aur(new auu($$1), new aum($$0, atv.b, aus.e, $$1));
   }

   public static aur c() {
      return new aur(new auu(new ffi($$0 -> true)));
   }

   public static aur a(ezx.c $$0) {
      return a($$0.a(ezv.j), $$0.d().e());
   }
}
