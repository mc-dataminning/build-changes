import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class apg extends aoy {
   private static final aou b = new aou(vb.c("dataPack.vanilla.description"), aa.b().a(aoh.b), Optional.empty());
   private static final aod c = new aod(chd.h);
   private static final aob d = aob.a(aou.b, b, aod.a, c);
   private static final vb e = vb.c("dataPack.vanilla.name");
   private static final agt f = new agt("minecraft", "datapacks");

   public apg(ekr $$0) {
      super(aoh.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aoj b() {
      return new aok().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vb a(String $$0) {
      return vb.b($$0);
   }

   @Nullable
   @Override
   protected apa a(aog $$0) {
      return apa.a("vanilla", e, false, b($$0), aoh.b, apa.b.b, ape.c);
   }

   @Nullable
   @Override
   protected apa a(String $$0, apa.c $$1, vb $$2) {
      return apa.a($$0, $$2, false, $$1, aoh.b, apa.b.a, ape.d);
   }

   public static apd a(Path $$0, ekr $$1) {
      return new apd(new apg($$1), new aoz($$0, aoh.b, ape.e, $$1));
   }

   public static apd c() {
      return new apd(new apg(new ekr($$0 -> true)));
   }

   public static apd a(efu.c $$0) {
      return a($$0.a(efs.j), $$0.b().e());
   }
}
