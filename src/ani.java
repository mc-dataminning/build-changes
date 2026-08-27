import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class ani extends ana {
   private static final amw b = new amw(tm.c("dataPack.vanilla.description"), aa.b().a(amj.b), Optional.empty());
   private static final amf c = new amf(cee.g);
   private static final amd d = amd.a(amw.b, b, amf.a, c);
   private static final tm e = tm.c("dataPack.vanilla.name");
   private static final aex f = new aex("minecraft", "datapacks");

   public ani(ehd $$0) {
      super(amj.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aml b() {
      return new amm().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected tm a(String $$0) {
      return tm.b($$0);
   }

   @Nullable
   @Override
   protected anc a(ami $$0) {
      return anc.a("vanilla", e, false, b($$0), amj.b, anc.b.b, ang.c);
   }

   @Nullable
   @Override
   protected anc a(String $$0, anc.c $$1, tm $$2) {
      return anc.a($$0, $$2, false, $$1, amj.b, anc.b.a, ang.d);
   }

   public static anf a(Path $$0, ehd $$1) {
      return new anf(new ani($$1), new anb($$0, amj.b, ang.e, $$1));
   }

   public static anf c() {
      return new anf(new ani(new ehd($$0 -> true)));
   }

   public static anf a(ecg.c $$0) {
      return a($$0.a(ece.j), $$0.a().e());
   }
}
