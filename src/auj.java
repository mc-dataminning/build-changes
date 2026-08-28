import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auj extends aua {
   private static final atw c = new atw(xe.c("dataPack.vanilla.description"), ab.b().a(atj.b), Optional.empty());
   private static final atd d = new atd(cqs.i);
   private static final asz e = asz.a(atw.b, c, atd.a, d);
   private static final atg f = new atg("vanilla", xe.c("dataPack.vanilla.name"), auh.c, Optional.of(b));
   private static final ati g = new ati(false, aud.b.b, false);
   private static final ati h = new ati(false, aud.b.a, false);
   private static final ale i = ale.b("datapacks");

   public auj(eym $$0) {
      super(atj.b, b(), i, $$0);
   }

   private static atg a(String $$0, xe $$1) {
      return new atg($$0, $$1, auh.d, Optional.of(auc.a($$0)));
   }

   @VisibleForTesting
   public static atl b() {
      return new atm().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xe a(String $$0) {
      return xe.b($$0);
   }

   @Nullable
   @Override
   protected aud a(ath $$0) {
      return aud.a(f, b($$0), atj.b, g);
   }

   @Nullable
   @Override
   protected aud a(String $$0, aud.c $$1, xe $$2) {
      return aud.a(a($$0, $$2), $$1, atj.b, h);
   }

   public static aug a(Path $$0, eym $$1) {
      return new aug(new auj($$1), new aub($$0, atj.b, auh.e, $$1));
   }

   public static aug c() {
      return new aug(new auj(new eym($$0 -> true)));
   }

   public static aug a(esz.c $$0) {
      return a($$0.a(esx.j), $$0.d().e());
   }
}
