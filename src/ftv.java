import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ftv implements ftq, ftr {
   private static final akr a = akr.b("spectator/teleport_to_team");
   private static final wz b = wz.c("spectatorMenu.team_teleport");
   private static final wz c = wz.c("spectatorMenu.team_teleport.prompt");
   private final List<ftr> d;

   public ftv() {
      fgm $$0 = fgm.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<ftr> a(fgm $$0, eye $$1) {
      return $$1.g().stream().flatMap($$1x -> ftv.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<ftr> a() {
      return this.d;
   }

   @Override
   public wz b() {
      return c;
   }

   @Override
   public void a(ftp $$0) {
      $$0.a(this);
   }

   @Override
   public wz aU_() {
      return b;
   }

   @Override
   public void a(fhx $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aV_() {
      return !this.d.isEmpty();
   }

   static class a implements ftr {
      private final exz a;
      private final Supplier<grj> b;
      private final List<fzo> c;

      private a(exz $$0, List<fzo> $$1, Supplier<grj> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<ftr> a(fgm $$0, exz $$1) {
         List<fzo> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fzo $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dct.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ayw.a().a($$2.size())).a();
            Supplier<grj> $$6 = $$0.am().a($$5);
            return Optional.of(new ftv.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(ftp $$0) {
         $$0.a(new ftu(this.c));
      }

      @Override
      public wz aU_() {
         return this.a.c();
      }

      @Override
      public void a(fhx $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayo.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fjj.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }
}
