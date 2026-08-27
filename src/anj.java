import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class anj extends anb {
   private static final amx b = new amx(tn.c("dataPack.vanilla.description"), aa.b().a(amk.b), Optional.empty());
   private static final amg c = new amg(ceg.g);
   private static final ame d = ame.a(amx.b, b, amg.a, c);
   private static final tn e = tn.c("dataPack.vanilla.name");
   private static final aey f = new aey("minecraft", "datapacks");

   public anj(ehf $$0) {
      super(amk.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static amm b() {
      return new amn().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected tn a(String $$0) {
      return tn.b($$0);
   }

   @Nullable
   @Override
   protected and a(amj $$0) {
      return and.a("vanilla", e, false, b($$0), amk.b, and.b.b, anh.c);
   }

   @Nullable
   @Override
   protected and a(String $$0, and.c $$1, tn $$2) {
      return and.a($$0, $$2, false, $$1, amk.b, and.b.a, anh.d);
   }

   public static ang a(Path $$0, ehf $$1) {
      return new ang(new anj($$1), new anc($$0, amk.b, anh.e, $$1));
   }

   public static ang c() {
      return new ang(new anj(new ehf($$0 -> true)));
   }

   public static ang a(eci.c $$0) {
      return a($$0.a(ecg.j), $$0.a().e());
   }
}
