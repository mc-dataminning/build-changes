import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class ats extends atj {
   private static final atf c = new atf(wz.c("dataPack.vanilla.description"), ab.b().a(ass.b), Optional.empty());
   private static final asm d = new asm(cpn.g);
   private static final asi e = asi.a(atf.b, c, asm.a, d);
   private static final asp f = new asp("vanilla", wz.c("dataPack.vanilla.name"), atq.c, Optional.of(b));
   private static final asr g = new asr(false, atm.b.b, false);
   private static final asr h = new asr(false, atm.b.a, false);
   private static final akr i = akr.b("datapacks");

   public ats(ewq $$0) {
      super(ass.b, b(), i, $$0);
   }

   private static asp a(String $$0, wz $$1) {
      return new asp($$0, $$1, atq.d, Optional.of(atl.a($$0)));
   }

   @VisibleForTesting
   public static asu b() {
      return new asv().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wz a(String $$0) {
      return wz.b($$0);
   }

   @Nullable
   @Override
   protected atm a(asq $$0) {
      return atm.a(f, b($$0), ass.b, g);
   }

   @Nullable
   @Override
   protected atm a(String $$0, atm.c $$1, wz $$2) {
      return atm.a(a($$0, $$2), $$1, ass.b, h);
   }

   public static atp a(Path $$0, ewq $$1) {
      return new atp(new ats($$1), new atk($$0, ass.b, atq.e, $$1));
   }

   public static atp c() {
      return new atp(new ats(new ewq($$0 -> true)));
   }

   public static atp a(erd.c $$0) {
      return a($$0.a(erb.j), $$0.d().e());
   }
}
