import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cef extends cet<buk> {
   private static final int a = 200;
   private static final int b = 599;

   public cef() {
      this(200);
   }

   public cef(int $$0) {
      super($$0);
   }

   @Override
   protected void a(arh $$0, buk $$1) {
      a($$1);
   }

   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.g);
   }

   public static void a(buk $$0) {
      Optional<List<buk>> $$1 = $$0.dX().c(cdn.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ao().equals(btv.af));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(buk $$0) {
      $$0.dX().a(cdn.F, true, 599L);
   }
}
