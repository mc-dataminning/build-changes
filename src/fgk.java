import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fgk implements fgf, fgg {
   private static final agm a = new agm("spectator/teleport_to_team");
   private static final uv b = uv.c("spectatorMenu.team_teleport");
   private static final uv c = uv.c("spectatorMenu.team_teleport.prompt");
   private final List<fgg> d;

   public fgk() {
      eti $$0 = eti.N();
      this.d = a($$0, $$0.r.J());
   }

   private static List<fgg> a(eti $$0, eky $$1) {
      return $$1.g().stream().flatMap($$1x -> fgk.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fgg> a() {
      return this.d;
   }

   @Override
   public uv b() {
      return c;
   }

   @Override
   public void a(fge $$0) {
      $$0.a(this);
   }

   @Override
   public uv aR_() {
      return b;
   }

   @Override
   public void a(eut $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.d.isEmpty();
   }

   static class a implements fgg {
      private final ekw a;
      private final Supplier<gcz> b;
      private final List<flx> c;

      private a(ekw $$0, List<flx> $$1, Supplier<gcz> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fgg> a(eti $$0, ekw $$1) {
         List<flx> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            flx $$4 = $$0.I().a($$3);
            if ($$4 != null && $$4.e() != csc.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(atw.a().a($$2.size())).a();
            Supplier<gcz> $$6 = $$0.ak().a($$5);
            return Optional.of(new fgk.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fge $$0) {
         $$0.a(new fgj(this.c));
      }

      @Override
      public uv aR_() {
         return this.a.c();
      }

      @Override
      public void a(eut $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, atq.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         ewd.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aS_() {
         return true;
      }
   }
}
