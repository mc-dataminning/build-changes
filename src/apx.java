import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class apx extends app {
   private static final apl b = new apl(vg.c("dataPack.vanilla.description"), aa.b().a(aoy.b), Optional.empty());
   private static final aou c = new aou(cic.h);
   private static final aoq d = aoq.a(apl.b, b, aou.a, c);
   private static final vg e = vg.c("dataPack.vanilla.name");
   private static final ahh f = new ahh("minecraft", "datapacks");

   public apx(els $$0) {
      super(aoy.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static apa b() {
      return new apb().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vg a(String $$0) {
      return vg.b($$0);
   }

   @Nullable
   @Override
   protected apr a(aox $$0) {
      return apr.a("vanilla", e, false, b($$0), aoy.b, apr.b.b, apv.c);
   }

   @Nullable
   @Override
   protected apr a(String $$0, apr.c $$1, vg $$2) {
      return apr.a($$0, $$2, false, $$1, aoy.b, apr.b.a, apv.d);
   }

   public static apu a(Path $$0, els $$1) {
      return new apu(new apx($$1), new apq($$0, aoy.b, apv.e, $$1));
   }

   public static apu c() {
      return new apu(new apx(new els($$0 -> true)));
   }

   public static apu a(egv.c $$0) {
      return a($$0.a(egt.j), $$0.b().e());
   }
}
