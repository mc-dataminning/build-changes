import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class foz implements fou, fov {
   private static final ajt a = new ajt("spectator/teleport_to_team");
   private static final wg b = wg.c("spectatorMenu.team_teleport");
   private static final wg c = wg.c("spectatorMenu.team_teleport.prompt");
   private final List<fov> d;

   public foz() {
      fbp $$0 = fbp.Q();
      this.d = a($$0, $$0.r.L());
   }

   private static List<fov> a(fbp $$0, ete $$1) {
      return $$1.g().stream().flatMap($$1x -> foz.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fov> a() {
      return this.d;
   }

   @Override
   public wg b() {
      return c;
   }

   @Override
   public void a(fot $$0) {
      $$0.a(this);
   }

   @Override
   public wg aO_() {
      return b;
   }

   @Override
   public void a(fdc $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements fov {
      private final esz a;
      private final Supplier<gmi> b;
      private final List<fus> c;

      private a(esz $$0, List<fus> $$1, Supplier<gmi> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fov> a(fbp $$0, esz $$1) {
         List<fus> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fus $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != cyu.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(axr.a().a($$2.size())).a();
            Supplier<gmi> $$6 = $$0.an().a($$5);
            return Optional.of(new foz.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fot $$0) {
         $$0.a(new foy(this.c));
      }

      @Override
      public wg aO_() {
         return this.a.c();
      }

      @Override
      public void a(fdc $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axk.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         feo.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
