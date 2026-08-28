import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aus extends auj {
   private static final auf d = new auf(xa.c("dataPack.vanilla.description"), ac.b().a(att.b), Optional.empty());
   private static final atn e = new atn(cvj.h);
   private static final atj f = atj.a(auf.b, d, atn.a, e);
   private static final atq g = new atq("vanilla", xa.c("dataPack.vanilla.name"), auq.c, Optional.of(c));
   private static final ats h = new ats(false, aum.b.b, false);
   private static final ats i = new ats(false, aum.b.a, false);
   private static final ali j = ali.b("datapacks");

   public aus(ffg $$0) {
      super(att.b, b(), j, $$0);
   }

   private static atq a(String $$0, xa $$1) {
      return new atq($$0, $$1, auq.d, Optional.of(aul.a($$0)));
   }

   @VisibleForTesting
   public static atv b() {
      return new atw().a(f).a("minecraft").b().a().a(g);
   }

   @Override
   protected xa a(String $$0) {
      return xa.b($$0);
   }

   @Nullable
   @Override
   protected aum a(atr $$0) {
      return aum.a(g, b($$0), att.b, h);
   }

   @Nullable
   @Override
   protected aum a(String $$0, aum.c $$1, xa $$2) {
      return aum.a(a($$0, $$2), $$1, att.b, i);
   }

   public static aup a(Path $$0, ffg $$1) {
      return new aup(new aus($$1), new auk($$0, att.b, auq.e, $$1));
   }

   public static aup c() {
      return new aup(new aus(new ffg($$0 -> true)));
   }

   public static aup a(ezv.c $$0) {
      return a($$0.a(ezt.j), $$0.d().e());
   }
}
