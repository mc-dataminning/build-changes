import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class atf extends asw {
   private static final ass c = new ass(wu.c("dataPack.vanilla.description"), aa.b().a(asf.b), Optional.empty());
   private static final arz d = new arz(cnw.h);
   private static final arv e = arv.a(ass.b, c, arz.a, d);
   private static final asc f = new asc("vanilla", wu.c("dataPack.vanilla.name"), atd.c, Optional.of(b));
   private static final ase g = new ase(false, asz.b.b, false);
   private static final ase h = new ase(false, asz.b.a, false);
   private static final akh i = new akh("minecraft", "datapacks");

   public atf(etf $$0) {
      super(asf.b, b(), i, $$0);
   }

   private static asc a(String $$0, wu $$1) {
      return new asc($$0, $$1, atd.d, Optional.of(asy.a($$0)));
   }

   @VisibleForTesting
   public static ash b() {
      return new asi().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wu a(String $$0) {
      return wu.b($$0);
   }

   @Nullable
   @Override
   protected asz a(asd $$0) {
      return asz.a(f, b($$0), asf.b, g);
   }

   @Nullable
   @Override
   protected asz a(String $$0, asz.c $$1, wu $$2) {
      return asz.a(a($$0, $$2), $$1, asf.b, h);
   }

   public static atc a(Path $$0, etf $$1) {
      return new atc(new atf($$1), new asx($$0, asf.b, atd.e, $$1));
   }

   public static atc c() {
      return new atc(new atf(new etf($$0 -> true)));
   }

   public static atc a(eob.c $$0) {
      return a($$0.a(enz.j), $$0.d().e());
   }
}
