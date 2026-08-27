import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aor extends aoj {
   private static final aof b = new aof(ur.c("dataPack.vanilla.description"), aa.b().a(ans.b), Optional.empty());
   private static final ano c = new ano(cfx.h);
   private static final anm d = anm.a(aof.b, b, ano.a, c);
   private static final ur e = ur.c("dataPack.vanilla.name");
   private static final agg f = new agg("minecraft", "datapacks");

   public aor(eiy $$0) {
      super(ans.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static anu b() {
      return new anv().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected ur a(String $$0) {
      return ur.b($$0);
   }

   @Nullable
   @Override
   protected aol a(anr $$0) {
      return aol.a("vanilla", e, false, b($$0), ans.b, aol.b.b, aop.c);
   }

   @Nullable
   @Override
   protected aol a(String $$0, aol.c $$1, ur $$2) {
      return aol.a($$0, $$2, false, $$1, ans.b, aol.b.a, aop.d);
   }

   public static aoo a(Path $$0, eiy $$1) {
      return new aoo(new aor($$1), new aok($$0, ans.b, aop.e, $$1));
   }

   public static aoo c() {
      return new aoo(new aor(new eiy($$0 -> true)));
   }

   public static aoo a(eeb.c $$0) {
      return a($$0.a(edz.j), $$0.b().e());
   }
}
