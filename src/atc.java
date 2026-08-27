import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class atc extends ast {
   private static final asp c = new asp(ws.c("dataPack.vanilla.description"), aa.b().a(asc.b), Optional.empty());
   private static final arw d = new arw(cna.h);
   private static final ars e = ars.a(asp.b, c, arw.a, d);
   private static final arz f = new arz("vanilla", ws.c("dataPack.vanilla.name"), ata.c, Optional.of(b));
   private static final asb g = new asb(false, asw.b.b, false);
   private static final asb h = new asb(false, asw.b.a, false);
   private static final akf i = new akf("minecraft", "datapacks");

   public atc(esv $$0) {
      super(asc.b, b(), i, $$0);
   }

   private static arz a(String $$0, ws $$1) {
      return new arz($$0, $$1, ata.d, Optional.of(asv.a($$0)));
   }

   @VisibleForTesting
   public static ase b() {
      return new asf().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected ws a(String $$0) {
      return ws.b($$0);
   }

   @Nullable
   @Override
   protected asw a(asa $$0) {
      return asw.a(f, b($$0), asc.b, g);
   }

   @Nullable
   @Override
   protected asw a(String $$0, asw.c $$1, ws $$2) {
      return asw.a(a($$0, $$2), $$1, asc.b, h);
   }

   public static asz a(Path $$0, esv $$1) {
      return new asz(new atc($$1), new asu($$0, asc.b, ata.e, $$1));
   }

   public static asz c() {
      return new asz(new atc(new esv($$0 -> true)));
   }

   public static asz a(enq.c $$0) {
      return a($$0.a(eno.j), $$0.d().e());
   }
}
