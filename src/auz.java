import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auz extends aup {
   private static final aul c = new aul(xk.c("dataPack.vanilla.description"), ab.b().a(aty.b), Optional.empty());
   private static final ats d = new ats(csm.h);
   private static final ato e = ato.a(aul.b, c, ats.a, d);
   private static final atv f = new atv("vanilla", xk.c("dataPack.vanilla.name"), auw.c, Optional.of(b));
   private static final atx g = new atx(false, aus.b.b, false);
   private static final atx h = new atx(false, aus.b.a, false);
   private static final alp i = alp.b("datapacks");

   public auz(fbh $$0) {
      super(aty.b, b(), i, $$0);
   }

   private static atv a(String $$0, xk $$1) {
      return new atv($$0, $$1, auw.d, Optional.of(aur.a($$0)));
   }

   @VisibleForTesting
   public static aua b() {
      return new aub().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xk a(String $$0) {
      return xk.b($$0);
   }

   @Nullable
   @Override
   protected aus a(atw $$0) {
      return aus.a(f, b($$0), aty.b, g);
   }

   @Nullable
   @Override
   protected aus a(String $$0, aus.c $$1, xk $$2) {
      return aus.a(a($$0, $$2), $$1, aty.b, h);
   }

   public static auv a(Path $$0, fbh $$1) {
      return new auv(new auz($$1), new auq($$0, aty.b, auw.e, $$1));
   }

   public static auv c() {
      return new auv(new auz(new fbh($$0 -> true)));
   }

   public static auv a(evw.c $$0) {
      return a($$0.a(evu.j), $$0.d().e());
   }
}
