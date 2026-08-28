import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aur extends aui {
   private static final aue c = new aue(xl.c("dataPack.vanilla.description"), ab.b().a(atr.b), Optional.empty());
   private static final atl d = new atl(crl.i);
   private static final ath e = ath.a(aue.b, c, atl.a, d);
   private static final ato f = new ato("vanilla", xl.c("dataPack.vanilla.name"), aup.c, Optional.of(b));
   private static final atq g = new atq(false, aul.b.b, false);
   private static final atq h = new atq(false, aul.b.a, false);
   private static final all i = all.b("datapacks");

   public aur(ezh $$0) {
      super(atr.b, b(), i, $$0);
   }

   private static ato a(String $$0, xl $$1) {
      return new ato($$0, $$1, aup.d, Optional.of(auk.a($$0)));
   }

   @VisibleForTesting
   public static att b() {
      return new atu().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xl a(String $$0) {
      return xl.b($$0);
   }

   @Nullable
   @Override
   protected aul a(atp $$0) {
      return aul.a(f, b($$0), atr.b, g);
   }

   @Nullable
   @Override
   protected aul a(String $$0, aul.c $$1, xl $$2) {
      return aul.a(a($$0, $$2), $$1, atr.b, h);
   }

   public static auo a(Path $$0, ezh $$1) {
      return new auo(new aur($$1), new auj($$0, atr.b, aup.e, $$1));
   }

   public static auo c() {
      return new auo(new aur(new ezh($$0 -> true)));
   }

   public static auo a(etu.c $$0) {
      return a($$0.a(ets.j), $$0.d().e());
   }
}
