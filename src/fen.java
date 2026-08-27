import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fen implements fei, fej {
   private static final afw a = new afw("spectator/teleport_to_team");
   private static final ui b = ui.c("spectatorMenu.team_teleport");
   private static final ui c = ui.c("spectatorMenu.team_teleport.prompt");
   private final List<fej> d;

   public fen() {
      ero $$0 = ero.O();
      this.d = a($$0, $$0.r.I());
   }

   private static List<fej> a(ero $$0, eje $$1) {
      return $$1.g().stream().flatMap($$1x -> fen.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fej> a() {
      return this.d;
   }

   @Override
   public ui b() {
      return c;
   }

   @Override
   public void a(feh $$0) {
      $$0.a(this);
   }

   @Override
   public ui aN_() {
      return b;
   }

   @Override
   public void a(esy $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.d.isEmpty();
   }

   static class a implements fej {
      private final ejc a;
      private final Supplier<gba> b;
      private final List<fka> c;

      private a(ejc $$0, List<fka> $$1, Supplier<gba> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fej> a(ero $$0, ejc $$1) {
         List<fka> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fka $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != cqw.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ate.a().a($$2.size())).a();
            Supplier<gba> $$6 = $$0.al().a($$5);
            return Optional.of(new fen.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(feh $$0) {
         $$0.a(new fem(this.c));
      }

      @Override
      public ui aN_() {
         return this.a.c();
      }

      @Override
      public void a(esy $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, asy.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         eui.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }
}
