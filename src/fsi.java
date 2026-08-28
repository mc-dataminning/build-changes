import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fsi implements fsd, fse {
   private static final alb a = new alb("spectator/teleport_to_team");
   private static final xl b = xl.c("spectatorMenu.team_teleport");
   private static final xl c = xl.c("spectatorMenu.team_teleport.prompt");
   private final List<fse> d;

   public fsi() {
      ffa $$0 = ffa.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<fse> a(ffa $$0, ewq $$1) {
      return $$1.g().stream().flatMap($$1x -> fsi.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fse> a() {
      return this.d;
   }

   @Override
   public xl b() {
      return c;
   }

   @Override
   public void a(fsc $$0) {
      $$0.a(this);
   }

   @Override
   public xl aO_() {
      return b;
   }

   @Override
   public void a(fgm $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements fse {
      private final ewl a;
      private final Supplier<gpu> b;
      private final List<fyb> c;

      private a(ewl $$0, List<fyb> $$1, Supplier<gpu> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fse> a(ffa $$0, ewl $$1) {
         List<fyb> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fyb $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dbq.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azc.a().a($$2.size())).a();
            Supplier<gpu> $$6 = $$0.am().a($$5);
            return Optional.of(new fsi.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fsc $$0) {
         $$0.a(new fsh(this.c));
      }

      @Override
      public xl aO_() {
         return this.a.c();
      }

      @Override
      public void a(fgm $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayu.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fhy.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
