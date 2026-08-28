import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aud extends atu {
   private static final atq c = new atq(wp.c("dataPack.vanilla.description"), ab.b().a(ate.b), Optional.empty());
   private static final asy d = new asy(crv.h);
   private static final asu e = asu.a(atq.b, c, asy.a, d);
   private static final atb f = new atb("vanilla", wp.c("dataPack.vanilla.name"), aub.c, Optional.of(b));
   private static final atd g = new atd(false, atx.b.b, false);
   private static final atd h = new atd(false, atx.b.a, false);
   private static final akv i = akv.b("datapacks");

   public aud(faq $$0) {
      super(ate.b, b(), i, $$0);
   }

   private static atb a(String $$0, wp $$1) {
      return new atb($$0, $$1, aub.d, Optional.of(atw.a($$0)));
   }

   @VisibleForTesting
   public static atg b() {
      return new ath().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wp a(String $$0) {
      return wp.b($$0);
   }

   @Nullable
   @Override
   protected atx a(atc $$0) {
      return atx.a(f, b($$0), ate.b, g);
   }

   @Nullable
   @Override
   protected atx a(String $$0, atx.c $$1, wp $$2) {
      return atx.a(a($$0, $$2), $$1, ate.b, h);
   }

   public static aua a(Path $$0, faq $$1) {
      return new aua(new aud($$1), new atv($$0, ate.b, aub.e, $$1));
   }

   public static aua c() {
      return new aua(new aud(new faq($$0 -> true)));
   }

   public static aua a(evf.c $$0) {
      return a($$0.a(evd.j), $$0.d().e());
   }
}
