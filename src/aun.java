import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aun extends aue {
   private static final aua c = new aua(xh.c("dataPack.vanilla.description"), ab.b().a(atn.b), Optional.empty());
   private static final ath d = new ath(crc.i);
   private static final atd e = atd.a(aua.b, c, ath.a, d);
   private static final atk f = new atk("vanilla", xh.c("dataPack.vanilla.name"), aul.c, Optional.of(b));
   private static final atm g = new atm(false, auh.b.b, false);
   private static final atm h = new atm(false, auh.b.a, false);
   private static final alh i = alh.b("datapacks");

   public aun(eyx $$0) {
      super(atn.b, b(), i, $$0);
   }

   private static atk a(String $$0, xh $$1) {
      return new atk($$0, $$1, aul.d, Optional.of(aug.a($$0)));
   }

   @VisibleForTesting
   public static atp b() {
      return new atq().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xh a(String $$0) {
      return xh.b($$0);
   }

   @Nullable
   @Override
   protected auh a(atl $$0) {
      return auh.a(f, b($$0), atn.b, g);
   }

   @Nullable
   @Override
   protected auh a(String $$0, auh.c $$1, xh $$2) {
      return auh.a(a($$0, $$2), $$1, atn.b, h);
   }

   public static auk a(Path $$0, eyx $$1) {
      return new auk(new aun($$1), new auf($$0, atn.b, aul.e, $$1));
   }

   public static auk c() {
      return new auk(new aun(new eyx($$0 -> true)));
   }

   public static auk a(etk.c $$0) {
      return a($$0.a(eti.j), $$0.d().e());
   }
}
