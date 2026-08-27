import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class anh extends amz {
   private static final amv b = new amv(tl.c("dataPack.vanilla.description"), aa.b().a(ami.b), Optional.empty());
   private static final ame c = new ame(cee.g);
   private static final amc d = amc.a(amv.b, b, ame.a, c);
   private static final tl e = tl.c("dataPack.vanilla.name");
   private static final aew f = new aew("minecraft", "datapacks");

   public anh(ehd $$0) {
      super(ami.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static amk b() {
      return new aml().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected tl a(String $$0) {
      return tl.b($$0);
   }

   @Nullable
   @Override
   protected anb a(amh $$0) {
      return anb.a("vanilla", e, false, b($$0), ami.b, anb.b.b, anf.c);
   }

   @Nullable
   @Override
   protected anb a(String $$0, anb.c $$1, tl $$2) {
      return anb.a($$0, $$2, false, $$1, ami.b, anb.b.a, anf.d);
   }

   public static ane a(Path $$0, ehd $$1) {
      return new ane(new anh($$1), new ana($$0, ami.b, anf.e, $$1));
   }

   public static ane c() {
      return new ane(new anh(new ehd($$0 -> true)));
   }

   public static ane a(ecg.c $$0) {
      return a($$0.a(ece.j), $$0.a().e());
   }
}
