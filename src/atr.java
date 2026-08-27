import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class atr extends ati {
   private static final ate c = new ate(xe.c("dataPack.vanilla.description"), ab.b().a(asr.b), Optional.empty());
   private static final asl d = new asl(cor.h);
   private static final ash e = ash.a(ate.b, c, asl.a, d);
   private static final aso f = new aso("vanilla", xe.c("dataPack.vanilla.name"), atp.c, Optional.of(b));
   private static final asq g = new asq(false, atl.b.b, false);
   private static final asq h = new asq(false, atl.b.a, false);
   private static final akt i = new akt("minecraft", "datapacks");

   public atr(ewk $$0) {
      super(asr.b, b(), i, $$0);
   }

   private static aso a(String $$0, xe $$1) {
      return new aso($$0, $$1, atp.d, Optional.of(atk.a($$0)));
   }

   @VisibleForTesting
   public static ast b() {
      return new asu().a(e).a("minecraft").b().a().a(f);
   }

   @Override
   protected xe a(String $$0) {
      return xe.b($$0);
   }

   @Nullable
   @Override
   protected atl a(asp $$0) {
      return atl.a(f, b($$0), asr.b, g);
   }

   @Nullable
   @Override
   protected atl a(String $$0, atl.c $$1, xe $$2) {
      return atl.a(a($$0, $$2), $$1, asr.b, h);
   }

   public static ato a(Path $$0, ewk $$1) {
      return new ato(new atr($$1), new atj($$0, asr.b, atp.e, $$1));
   }

   public static ato c() {
      return new ato(new atr(new ewk($$0 -> true)));
   }

   public static ato a(erf.c $$0) {
      return a($$0.a(erd.j), $$0.d().e());
   }
}
