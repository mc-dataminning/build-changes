import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aro extends arg {
   private static final arc b = new arc(vq.c("dataPack.vanilla.description"), aa.b().a(aqp.b), Optional.empty());
   private static final aql c = new aql(cju.h);
   private static final aqh d = aqh.a(arc.b, b, aql.a, c);
   private static final vq e = vq.c("dataPack.vanilla.name");
   private static final aiy f = new aiy("minecraft", "datapacks");

   public aro(eni $$0) {
      super(aqp.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static aqr b() {
      return new aqs().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected vq a(String $$0) {
      return vq.b($$0);
   }

   @Nullable
   @Override
   protected ari a(aqo $$0) {
      return ari.a("vanilla", e, false, b($$0), aqp.b, ari.b.b, arm.c);
   }

   @Nullable
   @Override
   protected ari a(String $$0, ari.c $$1, vq $$2) {
      return ari.a($$0, $$2, false, $$1, aqp.b, ari.b.a, arm.d);
   }

   public static arl a(Path $$0, eni $$1) {
      return new arl(new aro($$1), new arh($$0, aqp.b, arm.e, $$1));
   }

   public static arl c() {
      return new arl(new aro(new eni($$0 -> true)));
   }

   public static arl a(eil.c $$0) {
      return a($$0.a(eij.j), $$0.b().e());
   }
}
