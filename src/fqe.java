import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fqe implements fpz, fqa {
   private static final akf a = new akf("spectator/teleport_to_team");
   private static final ws b = ws.c("spectatorMenu.team_teleport");
   private static final ws c = ws.c("spectatorMenu.team_teleport.prompt");
   private final List<fqa> d;

   public fqe() {
      fcu $$0 = fcu.Q();
      this.d = a($$0, $$0.r.L());
   }

   private static List<fqa> a(fcu $$0, euj $$1) {
      return $$1.g().stream().flatMap($$1x -> fqe.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fqa> a() {
      return this.d;
   }

   @Override
   public ws b() {
      return c;
   }

   @Override
   public void a(fpy $$0) {
      $$0.a(this);
   }

   @Override
   public ws aN_() {
      return b;
   }

   @Override
   public void a(feh $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.d.isEmpty();
   }

   static class a implements fqa {
      private final eue a;
      private final Supplier<gnn> b;
      private final List<fvx> c;

      private a(eue $$0, List<fvx> $$1, Supplier<gnn> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fqa> a(fcu $$0, eue $$1) {
         List<fvx> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fvx $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != czr.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ayd.a().a($$2.size())).a();
            Supplier<gnn> $$6 = $$0.an().a($$5);
            return Optional.of(new fqe.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fpy $$0) {
         $$0.a(new fqd(this.c));
      }

      @Override
      public ws aN_() {
         return this.a.c();
      }

      @Override
      public void a(feh $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axw.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fft.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }
}
