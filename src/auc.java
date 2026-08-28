import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auc extends att {
   private static final atp c = new atp(xo.c("dataPack.vanilla.description"), aa.b().a(atc.b), Optional.empty());
   private static final asw d = new asw(cpm.h);
   private static final ass e = ass.a(atp.b, c, asw.a, d);
   private static final asz f = new asz("vanilla", xo.c("dataPack.vanilla.name"), aua.c, Optional.of(b));
   private static final atb g = new atb(false, atw.b.b, false);
   private static final atb h = new atb(false, atw.b.a, false);
   private static final ale i = new ale("minecraft", "datapacks");

   public auc(evg $$0) {
      super(atc.b, b(), i, $$0);
   }

   private static asz a(String $$0, xo $$1) {
      return new asz($$0, $$1, aua.d, Optional.of(atv.a($$0)));
   }

   @VisibleForTesting
   public static ate b() {
      return new atf().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xo a(String $$0) {
      return xo.b($$0);
   }

   @Nullable
   @Override
   protected atw a(ata $$0) {
      return atw.a(f, b($$0), atc.b, g);
   }

   @Nullable
   @Override
   protected atw a(String $$0, atw.c $$1, xo $$2) {
      return atw.a(a($$0, $$2), $$1, atc.b, h);
   }

   public static atz a(Path $$0, evg $$1) {
      return new atz(new auc($$1), new atu($$0, atc.b, aua.e, $$1));
   }

   public static atz c() {
      return new atz(new auc(new evg($$0 -> true)));
   }

   public static atz a(epv.c $$0) {
      return a($$0.a(ept.j), $$0.d().e());
   }
}
