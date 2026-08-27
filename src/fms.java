import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fms implements fmn, fmo {
   private static final ajh a = new ajh("spectator/teleport_to_team");
   private static final vu b = vu.c("spectatorMenu.team_teleport");
   private static final vu c = vu.c("spectatorMenu.team_teleport.prompt");
   private final List<fmo> d;

   public fms() {
      ezi $$0 = ezi.Q();
      this.d = a($$0, $$0.r.K());
   }

   private static List<fmo> a(ezi $$0, eqx $$1) {
      return $$1.g().stream().flatMap($$1x -> fms.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fmo> a() {
      return this.d;
   }

   @Override
   public vu b() {
      return c;
   }

   @Override
   public void a(fmm $$0) {
      $$0.a(this);
   }

   @Override
   public vu aP_() {
      return b;
   }

   @Override
   public void a(fav $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aQ_() {
      return !this.d.isEmpty();
   }

   static class a implements fmo {
      private final eqs a;
      private final Supplier<gkb> b;
      private final List<fsl> c;

      private a(eqs $$0, List<fsl> $$1, Supplier<gkb> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fmo> a(ezi $$0, eqs $$1) {
         List<fsl> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fsl $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != cwy.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(axd.a().a($$2.size())).a();
            Supplier<gkb> $$6 = $$0.an().a($$5);
            return Optional.of(new fms.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fmm $$0) {
         $$0.a(new fmr(this.c));
      }

      @Override
      public vu aP_() {
         return this.a.c();
      }

      @Override
      public void a(fav $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aww.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fch.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }
}
