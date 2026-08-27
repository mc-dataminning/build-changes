import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class amy extends amq {
   private static final amm b = new amm(te.c("dataPack.vanilla.description"), aa.b().a(alz.b), Optional.empty());
   private static final alv c = new alv(cdv.g);
   private static final alt d = alt.a(amm.b, b, alv.a, c);
   private static final te e = te.c("dataPack.vanilla.name");
   private static final aep f = new aep("minecraft", "datapacks");

   public amy(egv $$0) {
      super(alz.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static amb b() {
      return new amc().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected te a(String $$0) {
      return te.b($$0);
   }

   @Nullable
   @Override
   protected ams a(aly $$0) {
      return ams.a("vanilla", e, false, b($$0), alz.b, ams.b.b, amw.c);
   }

   @Nullable
   @Override
   protected ams a(String $$0, ams.c $$1, te $$2) {
      return ams.a($$0, $$2, false, $$1, alz.b, ams.b.a, amw.d);
   }

   public static amv a(Path $$0, egv $$1) {
      return new amv(new amy($$1), new amr($$0, alz.b, amw.e, $$1));
   }

   public static amv c() {
      return new amv(new amy(new egv($$0 -> true)));
   }

   public static amv a(ebv.c $$0) {
      return a($$0.a(ebt.j), $$0.a().e());
   }
}
