import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class art extends arl {
   private static final arh b = new arh(vs.c("dataPack.vanilla.description"), aa.b().a(aqu.b), Optional.empty());
   private static final aqq c = new aqq(ckn.h);
   private static final aqm d = aqm.a(arh.b, b, aqq.a, c);
   private static final vs e = vs.c("dataPack.vanilla.name");
   private static final ajc f = new ajc("minecraft", "datapacks");

   public art(eol $$0) {
      super(aqu.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aqw b() {
      return new aqx().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vs a(String $$0) {
      return vs.b($$0);
   }

   @Nullable
   @Override
   protected arn a(aqt $$0) {
      return arn.a("vanilla", e, false, b($$0), aqu.b, arn.b.b, arr.c);
   }

   @Nullable
   @Override
   protected arn a(String $$0, arn.c $$1, vs $$2) {
      return arn.a($$0, $$2, false, $$1, aqu.b, arn.b.a, arr.d);
   }

   public static arq a(Path $$0, eol $$1) {
      return new arq(new art($$1), new arm($$0, aqu.b, arr.e, $$1));
   }

   public static arq c() {
      return new arq(new art(new eol($$0 -> true)));
   }

   public static arq a(ejo.c $$0) {
      return a($$0.a(ejm.j), $$0.b().e());
   }
}
