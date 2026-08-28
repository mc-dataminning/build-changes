import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auh extends aty {
   private static final atu c = new atu(xd.c("dataPack.vanilla.description"), ab.b().a(ath.b), Optional.empty());
   private static final atb d = new atb(cqp.i);
   private static final asx e = asx.a(atu.b, c, atb.a, d);
   private static final ate f = new ate("vanilla", xd.c("dataPack.vanilla.name"), auf.c, Optional.of(b));
   private static final atg g = new atg(false, aub.b.b, false);
   private static final atg h = new atg(false, aub.b.a, false);
   private static final alc i = alc.b("datapacks");

   public auh(eyi $$0) {
      super(ath.b, b(), i, $$0);
   }

   private static ate a(String $$0, xd $$1) {
      return new ate($$0, $$1, auf.d, Optional.of(aua.a($$0)));
   }

   @VisibleForTesting
   public static atj b() {
      return new atk().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xd a(String $$0) {
      return xd.b($$0);
   }

   @Nullable
   @Override
   protected aub a(atf $$0) {
      return aub.a(f, b($$0), ath.b, g);
   }

   @Nullable
   @Override
   protected aub a(String $$0, aub.c $$1, xd $$2) {
      return aub.a(a($$0, $$2), $$1, ath.b, h);
   }

   public static aue a(Path $$0, eyi $$1) {
      return new aue(new auh($$1), new atz($$0, ath.b, auf.e, $$1));
   }

   public static aue c() {
      return new aue(new auh(new eyi($$0 -> true)));
   }

   public static aue a(esv.c $$0) {
      return a($$0.a(est.j), $$0.d().e());
   }
}
