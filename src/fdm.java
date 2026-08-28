import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fdm implements fdq {
   private static final fdm b = new fdm();
   public static final MapCodec<fdm> a = MapCodec.unit(b);

   private fdm() {
   }

   @Override
   public fdr b() {
      return fds.l;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.j);
   }

   public boolean a(fah $$0) {
      Float $$1 = $$0.c(fdb.j);
      if ($$1 != null) {
         azx $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fdq.a c() {
      return () -> b;
   }
}
