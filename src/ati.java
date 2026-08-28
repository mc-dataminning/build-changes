import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class ati extends asz {
   private static final asv c = new asv(wu.c("dataPack.vanilla.description"), aa.b().a(asi.b), Optional.empty());
   private static final asc d = new asc(cox.g);
   private static final ary e = ary.a(asv.b, c, asc.a, d);
   private static final asf f = new asf("vanilla", wu.c("dataPack.vanilla.name"), atg.c, Optional.of(b));
   private static final ash g = new ash(false, atc.b.b, false);
   private static final ash h = new ash(false, atc.b.a, false);
   private static final akk i = new akk("minecraft", "datapacks");

   public ati(evp $$0) {
      super(asi.b, b(), i, $$0);
   }

   private static asf a(String $$0, wu $$1) {
      return new asf($$0, $$1, atg.d, Optional.of(atb.a($$0)));
   }

   @VisibleForTesting
   public static ask b() {
      return new asl().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected wu a(String $$0) {
      return wu.b($$0);
   }

   @Nullable
   @Override
   protected atc a(asg $$0) {
      return atc.a(f, b($$0), asi.b, g);
   }

   @Nullable
   @Override
   protected atc a(String $$0, atc.c $$1, wu $$2) {
      return atc.a(a($$0, $$2), $$1, asi.b, h);
   }

   public static atf a(Path $$0, evp $$1) {
      return new atf(new ati($$1), new ata($$0, asi.b, atg.e, $$1));
   }

   public static atf c() {
      return new atf(new ati(new evp($$0 -> true)));
   }

   public static atf a(eqc.c $$0) {
      return a($$0.a(eqa.j), $$0.d().e());
   }
}
