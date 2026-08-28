import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class auq extends auh {
   private static final aud c = new aud(xj.c("dataPack.vanilla.description"), ab.b().a(atq.b), Optional.empty());
   private static final atk d = new atk(crs.h);
   private static final atg e = atg.a(aud.b, c, atk.a, d);
   private static final atn f = new atn("vanilla", xj.c("dataPack.vanilla.name"), auo.c, Optional.of(b));
   private static final atp g = new atp(false, auk.b.b, false);
   private static final atp h = new atp(false, auk.b.a, false);
   private static final alj i = alj.b("datapacks");

   public auq(ezo $$0) {
      super(atq.b, b(), i, $$0);
   }

   private static atn a(String $$0, xj $$1) {
      return new atn($$0, $$1, auo.d, Optional.of(auj.a($$0)));
   }

   @VisibleForTesting
   public static ats b() {
      return new att().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xj a(String $$0) {
      return xj.b($$0);
   }

   @Nullable
   @Override
   protected auk a(ato $$0) {
      return auk.a(f, b($$0), atq.b, g);
   }

   @Nullable
   @Override
   protected auk a(String $$0, auk.c $$1, xj $$2) {
      return auk.a(a($$0, $$2), $$1, atq.b, h);
   }

   public static aun a(Path $$0, ezo $$1) {
      return new aun(new auq($$1), new aui($$0, atq.b, auo.e, $$1));
   }

   public static aun c() {
      return new aun(new auq(new ezo($$0 -> true)));
   }

   public static aun a(eub.c $$0) {
      return a($$0.a(etz.j), $$0.d().e());
   }
}
