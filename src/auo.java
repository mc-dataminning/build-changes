import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auo extends auf {
   private static final aub c = new aub(xi.c("dataPack.vanilla.description"), ab.b().a(ato.b), Optional.empty());
   private static final ati d = new ati(crh.i);
   private static final ate e = ate.a(aub.b, c, ati.a, d);
   private static final atl f = new atl("vanilla", xi.c("dataPack.vanilla.name"), aum.c, Optional.of(b));
   private static final atn g = new atn(false, aui.b.b, false);
   private static final atn h = new atn(false, aui.b.a, false);
   private static final ali i = ali.b("datapacks");

   public auo(ezd $$0) {
      super(ato.b, b(), i, $$0);
   }

   private static atl a(String $$0, xi $$1) {
      return new atl($$0, $$1, aum.d, Optional.of(auh.a($$0)));
   }

   @VisibleForTesting
   public static atq b() {
      return new atr().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xi a(String $$0) {
      return xi.b($$0);
   }

   @Nullable
   @Override
   protected aui a(atm $$0) {
      return aui.a(f, b($$0), ato.b, g);
   }

   @Nullable
   @Override
   protected aui a(String $$0, aui.c $$1, xi $$2) {
      return aui.a(a($$0, $$2), $$1, ato.b, h);
   }

   public static aul a(Path $$0, ezd $$1) {
      return new aul(new auo($$1), new aug($$0, ato.b, aum.e, $$1));
   }

   public static aul c() {
      return new aul(new auo(new ezd($$0 -> true)));
   }

   public static aul a(etq.c $$0) {
      return a($$0.a(eto.j), $$0.d().e());
   }
}
