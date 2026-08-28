import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auc extends att {
   private static final atp c = new atp(wo.c("dataPack.vanilla.description"), ab.b().a(atd.b), Optional.empty());
   private static final asx d = new asx(crt.h);
   private static final ast e = ast.a(atp.b, c, asx.a, d);
   private static final ata f = new ata("vanilla", wo.c("dataPack.vanilla.name"), aua.c, Optional.of(b));
   private static final atc g = new atc(false, atw.b.b, false);
   private static final atc h = new atc(false, atw.b.a, false);
   private static final aku i = aku.b("datapacks");

   public auc(fao $$0) {
      super(atd.b, b(), i, $$0);
   }

   private static ata a(String $$0, wo $$1) {
      return new ata($$0, $$1, aua.d, Optional.of(atv.a($$0)));
   }

   @VisibleForTesting
   public static atf b() {
      return new atg().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wo a(String $$0) {
      return wo.b($$0);
   }

   @Nullable
   @Override
   protected atw a(atb $$0) {
      return atw.a(f, b($$0), atd.b, g);
   }

   @Nullable
   @Override
   protected atw a(String $$0, atw.c $$1, wo $$2) {
      return atw.a(a($$0, $$2), $$1, atd.b, h);
   }

   public static atz a(Path $$0, fao $$1) {
      return new atz(new auc($$1), new atu($$0, atd.b, aua.e, $$1));
   }

   public static atz c() {
      return new atz(new auc(new fao($$0 -> true)));
   }

   public static atz a(evd.c $$0) {
      return a($$0.a(evb.j), $$0.d().e());
   }
}
