import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fsl implements fsg, fsh {
   private static final ale a = new ale("spectator/teleport_to_team");
   private static final xo b = xo.c("spectatorMenu.team_teleport");
   private static final xo c = xo.c("spectatorMenu.team_teleport.prompt");
   private final List<fsh> d;

   public fsl() {
      ffd $$0 = ffd.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<fsh> a(ffd $$0, ewt $$1) {
      return $$1.g().stream().flatMap($$1x -> fsl.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fsh> a() {
      return this.d;
   }

   @Override
   public xo b() {
      return c;
   }

   @Override
   public void a(fsf $$0) {
      $$0.a(this);
   }

   @Override
   public xo aN_() {
      return b;
   }

   @Override
   public void a(fgp $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.d.isEmpty();
   }

   static class a implements fsh {
      private final ewo a;
      private final Supplier<gpx> b;
      private final List<fye> c;

      private a(ewo $$0, List<fye> $$1, Supplier<gpx> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fsh> a(ffd $$0, ewo $$1) {
         List<fye> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fye $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dbt.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azf.a().a($$2.size())).a();
            Supplier<gpx> $$6 = $$0.am().a($$5);
            return Optional.of(new fsl.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fsf $$0) {
         $$0.a(new fsk(this.c));
      }

      @Override
      public xo aN_() {
         return this.a.c();
      }

      @Override
      public void a(fgp $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayx.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fib.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }
}
