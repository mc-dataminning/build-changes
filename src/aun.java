import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aun extends aue {
   private static final aua d = new aua(wv.c("dataPack.vanilla.description"), ab.b().a(ato.b), Optional.empty());
   private static final ati e = new ati(ctg.h);
   private static final ate f = ate.a(aua.b, d, ati.a, e);
   private static final atl g = new atl("vanilla", wv.c("dataPack.vanilla.name"), aul.c, Optional.of(c));
   private static final atn h = new atn(false, auh.b.b, false);
   private static final atn i = new atn(false, auh.b.a, false);
   private static final ald j = ald.b("datapacks");

   public aun(fck $$0) {
      super(ato.b, b(), j, $$0);
   }

   private static atl a(String $$0, wv $$1) {
      return new atl($$0, $$1, aul.d, Optional.of(aug.a($$0)));
   }

   @VisibleForTesting
   public static atq b() {
      return new atr().a(f).a("minecraft").b().a().a(g);
   }

   @Override
   protected wv a(String $$0) {
      return wv.b($$0);
   }

   @Nullable
   @Override
   protected auh a(atm $$0) {
      return auh.a(g, b($$0), ato.b, h);
   }

   @Nullable
   @Override
   protected auh a(String $$0, auh.c $$1, wv $$2) {
      return auh.a(a($$0, $$2), $$1, ato.b, i);
   }

   public static auk a(Path $$0, fck $$1) {
      return new auk(new aun($$1), new auf($$0, ato.b, aul.e, $$1));
   }

   public static auk c() {
      return new auk(new aun(new fck($$0 -> true)));
   }

   public static auk a(ewz.c $$0) {
      return a($$0.a(ewx.j), $$0.d().e());
   }
}
