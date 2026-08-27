import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class apq extends api {
   private static final ape b = new ape(vd.c("dataPack.vanilla.description"), aa.b().a(aor.b), Optional.empty());
   private static final aon c = new aon(chn.h);
   private static final aol d = aol.a(ape.b, b, aon.a, c);
   private static final vd e = vd.c("dataPack.vanilla.name");
   private static final ahd f = new ahd("minecraft", "datapacks");

   public apq(elc $$0) {
      super(aor.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aot b() {
      return new aou().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vd a(String $$0) {
      return vd.b($$0);
   }

   @Nullable
   @Override
   protected apk a(aoq $$0) {
      return apk.a("vanilla", e, false, b($$0), aor.b, apk.b.b, apo.c);
   }

   @Nullable
   @Override
   protected apk a(String $$0, apk.c $$1, vd $$2) {
      return apk.a($$0, $$2, false, $$1, aor.b, apk.b.a, apo.d);
   }

   public static apn a(Path $$0, elc $$1) {
      return new apn(new apq($$1), new apj($$0, aor.b, apo.e, $$1));
   }

   public static apn c() {
      return new apn(new apq(new elc($$0 -> true)));
   }

   public static apn a(egf.c $$0) {
      return a($$0.a(egd.j), $$0.b().e());
   }
}
