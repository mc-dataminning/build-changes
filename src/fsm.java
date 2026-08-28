import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fsm implements fsh, fsi {
   private static final ale a = new ale("spectator/teleport_to_team");
   private static final xo b = xo.c("spectatorMenu.team_teleport");
   private static final xo c = xo.c("spectatorMenu.team_teleport.prompt");
   private final List<fsi> d;

   public fsm() {
      ffe $$0 = ffe.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<fsi> a(ffe $$0, ewu $$1) {
      return $$1.g().stream().flatMap($$1x -> fsm.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fsi> a() {
      return this.d;
   }

   @Override
   public xo b() {
      return c;
   }

   @Override
   public void a(fsg $$0) {
      $$0.a(this);
   }

   @Override
   public xo aN_() {
      return b;
   }

   @Override
   public void a(fgq $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.d.isEmpty();
   }

   static class a implements fsi {
      private final ewp a;
      private final Supplier<gpy> b;
      private final List<fyf> c;

      private a(ewp $$0, List<fyf> $$1, Supplier<gpy> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fsi> a(ffe $$0, ewp $$1) {
         List<fyf> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fyf $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dbu.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azg.a().a($$2.size())).a();
            Supplier<gpy> $$6 = $$0.am().a($$5);
            return Optional.of(new fsm.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fsg $$0) {
         $$0.a(new fsl(this.c));
      }

      @Override
      public xo aN_() {
         return this.a.c();
      }

      @Override
      public void a(fgq $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayy.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fic.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }
}
