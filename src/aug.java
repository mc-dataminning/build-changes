import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aug extends atx {
   private static final att c = new att(xd.c("dataPack.vanilla.description"), ab.b().a(atg.b), Optional.empty());
   private static final ata d = new ata(cqj.i);
   private static final asw e = asw.a(att.b, c, ata.a, d);
   private static final atd f = new atd("vanilla", xd.c("dataPack.vanilla.name"), aue.c, Optional.of(b));
   private static final atf g = new atf(false, aua.b.b, false);
   private static final atf h = new atf(false, aua.b.a, false);
   private static final alb i = alb.b("datapacks");

   public aug(exu $$0) {
      super(atg.b, b(), i, $$0);
   }

   private static atd a(String $$0, xd $$1) {
      return new atd($$0, $$1, aue.d, Optional.of(atz.a($$0)));
   }

   @VisibleForTesting
   public static ati b() {
      return new atj().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xd a(String $$0) {
      return xd.b($$0);
   }

   @Nullable
   @Override
   protected aua a(ate $$0) {
      return aua.a(f, b($$0), atg.b, g);
   }

   @Nullable
   @Override
   protected aua a(String $$0, aua.c $$1, xd $$2) {
      return aua.a(a($$0, $$2), $$1, atg.b, h);
   }

   public static aud a(Path $$0, exu $$1) {
      return new aud(new aug($$1), new aty($$0, atg.b, aue.e, $$1));
   }

   public static aud c() {
      return new aud(new aug(new exu($$0 -> true)));
   }

   public static aud a(esh.c $$0) {
      return a($$0.a(esf.j), $$0.d().e());
   }
}
