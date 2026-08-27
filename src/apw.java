import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class apw extends apo {
   private static final apk b = new apk(vf.c("dataPack.vanilla.description"), aa.b().a(aox.b), Optional.empty());
   private static final aot c = new aot(chu.h);
   private static final aop d = aop.a(apk.b, b, aot.a, c);
   private static final vf e = vf.c("dataPack.vanilla.name");
   private static final ahg f = new ahg("minecraft", "datapacks");

   public apw(elj $$0) {
      super(aox.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aoz b() {
      return new apa().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vf a(String $$0) {
      return vf.b($$0);
   }

   @Nullable
   @Override
   protected apq a(aow $$0) {
      return apq.a("vanilla", e, false, b($$0), aox.b, apq.b.b, apu.c);
   }

   @Nullable
   @Override
   protected apq a(String $$0, apq.c $$1, vf $$2) {
      return apq.a($$0, $$2, false, $$1, aox.b, apq.b.a, apu.d);
   }

   public static apt a(Path $$0, elj $$1) {
      return new apt(new apw($$1), new app($$0, aox.b, apu.e, $$1));
   }

   public static apt c() {
      return new apt(new apw(new elj($$0 -> true)));
   }

   public static apt a(egm.c $$0) {
      return a($$0.a(egk.j), $$0.b().e());
   }
}
