import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.List;

public class fqi implements fql {
   private static final int a = 10;
   private static final int b = 2;
   private final List<ProfileResult> c;

   public fqi(fqi.a $$0) {
      this.c = $$0.a();
   }

   @Override
   public int a() {
      return this.c.size() * 12 + 2;
   }

   @Override
   public int a(fhv $$0) {
      int $$1 = 0;

      for (ProfileResult $$2 : this.c) {
         int $$3 = $$0.b($$2.profile().getName());
         if ($$3 > $$1) {
            $$1 = $$3;
         }
      }

      return $$1 + 10 + 6;
   }

   @Override
   public void a(fhv $$0, int $$1, int $$2, fhx $$3) {
      for (int $$4 = 0; $$4 < this.c.size(); $$4++) {
         ProfileResult $$5 = this.c.get($$4);
         int $$6 = $$2 + 2 + $$4 * 12;
         fjj.a($$3, fgm.Q().am().b($$5.profile()), $$1 + 2, $$6, 10);
         $$3.b($$0, $$5.profile().getName(), $$1 + 10 + 4, $$6 + 2, -1);
      }
   }

   public static record a(List<ProfileResult> a) implements csa {
   }
}
