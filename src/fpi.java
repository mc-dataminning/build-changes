import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fpi implements fpd, fpe {
   private static final ajv a = new ajv("spectator/teleport_to_team");
   private static final wi b = wi.c("spectatorMenu.team_teleport");
   private static final wi c = wi.c("spectatorMenu.team_teleport.prompt");
   private final List<fpe> d;

   public fpi() {
      fby $$0 = fby.Q();
      this.d = a($$0, $$0.r.L());
   }

   private static List<fpe> a(fby $$0, etn $$1) {
      return $$1.g().stream().flatMap($$1x -> fpi.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fpe> a() {
      return this.d;
   }

   @Override
   public wi b() {
      return c;
   }

   @Override
   public void a(fpc $$0) {
      $$0.a(this);
   }

   @Override
   public wi aN_() {
      return b;
   }

   @Override
   public void a(fdl $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.d.isEmpty();
   }

   static class a implements fpe {
      private final eti a;
      private final Supplier<gmr> b;
      private final List<fvb> c;

      private a(eti $$0, List<fvb> $$1, Supplier<gmr> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fpe> a(fby $$0, eti $$1) {
         List<fvb> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fvb $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != czd.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(axt.a().a($$2.size())).a();
            Supplier<gmr> $$6 = $$0.an().a($$5);
            return Optional.of(new fpi.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fpc $$0) {
         $$0.a(new fph(this.c));
      }

      @Override
      public wi aN_() {
         return this.a.c();
      }

      @Override
      public void a(fdl $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axm.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fex.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }
}
