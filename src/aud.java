import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aud extends atu {
   private static final atq c = new atq(xp.c("dataPack.vanilla.description"), aa.b().a(atd.b), Optional.empty());
   private static final asx d = new asx(cpn.h);
   private static final ast e = ast.a(atq.b, c, asx.a, d);
   private static final ata f = new ata("vanilla", xp.c("dataPack.vanilla.name"), aub.c, Optional.of(b));
   private static final atc g = new atc(false, atx.b.b, false);
   private static final atc h = new atc(false, atx.b.a, false);
   private static final alf i = new alf("minecraft", "datapacks");

   public aud(evh $$0) {
      super(atd.b, b(), i, $$0);
   }

   private static ata a(String $$0, xp $$1) {
      return new ata($$0, $$1, aub.d, Optional.of(atw.a($$0)));
   }

   @VisibleForTesting
   public static atf b() {
      return new atg().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xp a(String $$0) {
      return xp.b($$0);
   }

   @Nullable
   @Override
   protected atx a(atb $$0) {
      return atx.a(f, b($$0), atd.b, g);
   }

   @Nullable
   @Override
   protected atx a(String $$0, atx.c $$1, xp $$2) {
      return atx.a(a($$0, $$2), $$1, atd.b, h);
   }

   public static aua a(Path $$0, evh $$1) {
      return new aua(new aud($$1), new atv($$0, atd.b, aub.e, $$1));
   }

   public static aua c() {
      return new aua(new aud(new evh($$0 -> true)));
   }

   public static aua a(epw.c $$0) {
      return a($$0.a(epu.j), $$0.d().e());
   }
}
