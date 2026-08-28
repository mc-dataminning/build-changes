import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ftx implements fts, ftt {
   private static final akr a = akr.b("spectator/teleport_to_team");
   private static final wz b = wz.c("spectatorMenu.team_teleport");
   private static final wz c = wz.c("spectatorMenu.team_teleport.prompt");
   private final List<ftt> d;

   public ftx() {
      fgo $$0 = fgo.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<ftt> a(fgo $$0, eyg $$1) {
      return $$1.g().stream().flatMap($$1x -> ftx.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<ftt> a() {
      return this.d;
   }

   @Override
   public wz b() {
      return c;
   }

   @Override
   public void a(ftr $$0) {
      $$0.a(this);
   }

   @Override
   public wz aU_() {
      return b;
   }

   @Override
   public void a(fhz $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aV_() {
      return !this.d.isEmpty();
   }

   static class a implements ftt {
      private final eyb a;
      private final Supplier<grl> b;
      private final List<fzq> c;

      private a(eyb $$0, List<fzq> $$1, Supplier<grl> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<ftt> a(fgo $$0, eyb $$1) {
         List<fzq> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fzq $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dct.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ayw.a().a($$2.size())).a();
            Supplier<grl> $$6 = $$0.am().a($$5);
            return Optional.of(new ftx.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(ftr $$0) {
         $$0.a(new ftw(this.c));
      }

      @Override
      public wz aU_() {
         return this.a.c();
      }

      @Override
      public void a(fhz $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayo.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fjl.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }
}
