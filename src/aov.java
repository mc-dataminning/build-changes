import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import javax.annotation.Nullable;

public class aov extends aon {
   private static final aoj b = new aoj(ur.c("dataPack.vanilla.description"), aa.b().a(anw.b), Optional.empty());
   private static final ans c = new ans(cgf.h);
   private static final anq d = anq.a(aoj.b, b, ans.a, c);
   private static final ur e = ur.c("dataPack.vanilla.name");
   private static final agi f = new agi("minecraft", "datapacks");

   public aov(ejk $$0) {
      super(anw.b, b(), f, $$0);
   }

   @VisibleForTesting
   public static any b() {
      return new anz().a(d).a("minecraft").b().a().c();
   }

   @Override
   protected ur a(String $$0) {
      return ur.b($$0);
   }

   @Nullable
   @Override
   protected aop a(anv $$0) {
      return aop.a("vanilla", e, false, b($$0), anw.b, aop.b.b, aot.c);
   }

   @Nullable
   @Override
   protected aop a(String $$0, aop.c $$1, ur $$2) {
      return aop.a($$0, $$2, false, $$1, anw.b, aop.b.a, aot.d);
   }

   public static aos a(Path $$0, ejk $$1) {
      return new aos(new aov($$1), new aoo($$0, anw.b, aot.e, $$1));
   }

   public static aos c() {
      return new aos(new aov(new ejk($$0 -> true)));
   }

   public static aos a(een.c $$0) {
      return a($$0.a(eel.j), $$0.b().e());
   }
}
