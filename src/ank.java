import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class ank extends anc {
   private static final amy b = new amy(tl.c("dataPack.vanilla.description"), aa.b().a(aml.b), Optional.empty());
   private static final amh c = new amh(cek.g);
   private static final amf d = amf.a(amy.b, b, amh.a, c);
   private static final tl e = tl.c("dataPack.vanilla.name");
   private static final aez f = new aez("minecraft", "datapacks");

   public ank(egx $$0) {
      super(aml.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static amn b() {
      return new amo().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected tl a(String $$0) {
      return tl.b($$0);
   }

   @Nullable
   @Override
   protected ane a(amk $$0) {
      return ane.a("vanilla", e, false, b($$0), aml.b, ane.b.b, ani.c);
   }

   @Nullable
   @Override
   protected ane a(String $$0, ane.c $$1, tl $$2) {
      return ane.a($$0, $$2, false, $$1, aml.b, ane.b.a, ani.d);
   }

   public static anh a(Path $$0, egx $$1) {
      return new anh(new ank($$1), new and($$0, aml.b, ani.e, $$1));
   }

   public static anh c() {
      return new anh(new ank(new egx($$0 -> true)));
   }

   public static anh a(eca.c $$0) {
      return a($$0.a(eby.j), $$0.a().e());
   }
}
