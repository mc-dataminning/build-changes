import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auq extends auh {
   private static final aud d = new aud(wy.c("dataPack.vanilla.description"), ac.b().a(atr.b), Optional.empty());
   private static final atl e = new atl(cuv.h);
   private static final ath f = ath.a(aud.b, d, atl.a, e);
   private static final ato g = new ato("vanilla", wy.c("dataPack.vanilla.name"), auo.c, Optional.of(c));
   private static final atq h = new atq(false, auk.b.b, false);
   private static final atq i = new atq(false, auk.b.a, false);
   private static final alg j = alg.b("datapacks");

   public auq(fen $$0) {
      super(atr.b, b(), j, $$0);
   }

   private static ato a(String $$0, wy $$1) {
      return new ato($$0, $$1, auo.d, Optional.of(auj.a($$0)));
   }

   @VisibleForTesting
   public static att b() {
      return new atu().a(f).a("minecraft").b().a().a(g);
   }

   @Override
   protected wy a(String $$0) {
      return wy.b($$0);
   }

   @Nullable
   @Override
   protected auk a(atp $$0) {
      return auk.a(g, b($$0), atr.b, h);
   }

   @Nullable
   @Override
   protected auk a(String $$0, auk.c $$1, wy $$2) {
      return auk.a(a($$0, $$2), $$1, atr.b, i);
   }

   public static aun a(Path $$0, fen $$1) {
      return new aun(new auq($$1), new aui($$0, atr.b, auo.e, $$1));
   }

   public static aun c() {
      return new aun(new auq(new fen($$0 -> true)));
   }

   public static aun a(ezc.c $$0) {
      return a($$0.a(eza.j), $$0.d().e());
   }
}
