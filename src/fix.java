import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fix implements fis, fit {
   private static final ahh a = new ahh("spectator/teleport_to_team");
   private static final vg b = vg.c("spectatorMenu.team_teleport");
   private static final vg c = vg.c("spectatorMenu.team_teleport.prompt");
   private final List<fit> d;

   public fix() {
      evr $$0 = evr.O();
      this.d = a($$0, $$0.r.K());
   }

   private static List<fit> a(evr $$0, eng $$1) {
      return $$1.g().stream().flatMap($$1x -> fix.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fit> a() {
      return this.d;
   }

   @Override
   public vg b() {
      return c;
   }

   @Override
   public void a(fir $$0) {
      $$0.a(this);
   }

   @Override
   public vg aQ_() {
      return b;
   }

   @Override
   public void a(exe $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.d.isEmpty();
   }

   static class a implements fit {
      private final enb a;
      private final Supplier<gga> b;
      private final List<fon> c;

      private a(enb $$0, List<fon> $$1, Supplier<gga> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fit> a(evr $$0, enb $$1) {
         List<fon> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fon $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != ctu.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(auw.a().a($$2.size())).a();
            Supplier<gga> $$6 = $$0.al().a($$5);
            return Optional.of(new fix.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fir $$0) {
         $$0.a(new fiw(this.c));
      }

      @Override
      public vg aQ_() {
         return this.a.c();
      }

      @Override
      public void a(exe $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aup.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         eyq.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }
}
