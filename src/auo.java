import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auo extends auf {
   private static final aub d = new aub(ww.c("dataPack.vanilla.description"), ab.b().a(atp.b), Optional.empty());
   private static final atj e = new atj(cud.h);
   private static final atf f = atf.a(aub.b, d, atj.a, e);
   private static final atm g = new atm("vanilla", ww.c("dataPack.vanilla.name"), aum.c, Optional.of(c));
   private static final ato h = new ato(false, aui.b.b, false);
   private static final ato i = new ato(false, aui.b.a, false);
   private static final ale j = ale.b("datapacks");

   public auo(fdm $$0) {
      super(atp.b, b(), j, $$0);
   }

   private static atm a(String $$0, ww $$1) {
      return new atm($$0, $$1, aum.d, Optional.of(auh.a($$0)));
   }

   @VisibleForTesting
   public static atr b() {
      return new ats().a(f).a("minecraft").b().a().a(g);
   }

   @Override
   protected ww a(String $$0) {
      return ww.b($$0);
   }

   @Nullable
   @Override
   protected aui a(atn $$0) {
      return aui.a(g, b($$0), atp.b, h);
   }

   @Nullable
   @Override
   protected aui a(String $$0, aui.c $$1, ww $$2) {
      return aui.a(a($$0, $$2), $$1, atp.b, i);
   }

   public static aul a(Path $$0, fdm $$1) {
      return new aul(new auo($$1), new aug($$0, atp.b, aum.e, $$1));
   }

   public static aul c() {
      return new aul(new auo(new fdm($$0 -> true)));
   }

   public static aul a(eyb.c $$0) {
      return a($$0.a(exz.j), $$0.d().e());
   }
}
