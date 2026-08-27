import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class arp extends arh {
   private static final ard b = new ard(vq.c("dataPack.vanilla.description"), aa.b().a(aqq.b), Optional.empty());
   private static final aqm c = new aqm(cjy.h);
   private static final aqi d = aqi.a(ard.b, b, aqm.a, c);
   private static final vq e = vq.c("dataPack.vanilla.name");
   private static final aiy f = new aiy("minecraft", "datapacks");

   public arp(enp $$0) {
      super(aqq.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aqs b() {
      return new aqt().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vq a(String $$0) {
      return vq.b($$0);
   }

   @Nullable
   @Override
   protected arj a(aqp $$0) {
      return arj.a("vanilla", e, false, b($$0), aqq.b, arj.b.b, arn.c);
   }

   @Nullable
   @Override
   protected arj a(String $$0, arj.c $$1, vq $$2) {
      return arj.a($$0, $$2, false, $$1, aqq.b, arj.b.a, arn.d);
   }

   public static arm a(Path $$0, enp $$1) {
      return new arm(new arp($$1), new ari($$0, aqq.b, arn.e, $$1));
   }

   public static arm c() {
      return new arm(new arp(new enp($$0 -> true)));
   }

   public static arm a(eis.c $$0) {
      return a($$0.a(eiq.j), $$0.b().e());
   }
}
