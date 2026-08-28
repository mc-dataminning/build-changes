import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class atz extends atq {
   private static final atm c = new atm(xl.c("dataPack.vanilla.description"), aa.b().a(asz.b), Optional.empty());
   private static final ast d = new ast(cpi.h);
   private static final asp e = asp.a(atm.b, c, ast.a, d);
   private static final asw f = new asw("vanilla", xl.c("dataPack.vanilla.name"), atx.c, Optional.of(b));
   private static final asy g = new asy(false, att.b.b, false);
   private static final asy h = new asy(false, att.b.a, false);
   private static final alb i = new alb("minecraft", "datapacks");

   public atz(evc $$0) {
      super(asz.b, b(), i, $$0);
   }

   private static asw a(String $$0, xl $$1) {
      return new asw($$0, $$1, atx.d, Optional.of(ats.a($$0)));
   }

   @VisibleForTesting
   public static atb b() {
      return new atc().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xl a(String $$0) {
      return xl.b($$0);
   }

   @Nullable
   @Override
   protected att a(asx $$0) {
      return att.a(f, b($$0), asz.b, g);
   }

   @Nullable
   @Override
   protected att a(String $$0, att.c $$1, xl $$2) {
      return att.a(a($$0, $$2), $$1, asz.b, h);
   }

   public static atw a(Path $$0, evc $$1) {
      return new atw(new atz($$1), new atr($$0, asz.b, atx.e, $$1));
   }

   public static atw c() {
      return new atw(new atz(new evc($$0 -> true)));
   }

   public static atw a(epr.c $$0) {
      return a($$0.a(epp.j), $$0.d().e());
   }
}
