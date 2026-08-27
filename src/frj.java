import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class frj implements fre, frf {
   private static final akn a = new akn("spectator/teleport_to_team");
   private static final wx b = wx.c("spectatorMenu.team_teleport");
   private static final wx c = wx.c("spectatorMenu.team_teleport.prompt");
   private final List<frf> d;

   public frj() {
      feb $$0 = feb.Q();
      this.d = a($$0, $$0.r.L());
   }

   private static List<frf> a(feb $$0, evq $$1) {
      return $$1.g().stream().flatMap($$1x -> frj.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<frf> a() {
      return this.d;
   }

   @Override
   public wx b() {
      return c;
   }

   @Override
   public void a(frd $$0) {
      $$0.a(this);
   }

   @Override
   public wx aO_() {
      return b;
   }

   @Override
   public void a(ffn $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements frf {
      private final evl a;
      private final Supplier<gov> b;
      private final List<fxc> c;

      private a(evl $$0, List<fxc> $$1, Supplier<gov> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<frf> a(feb $$0, evl $$1) {
         List<fxc> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fxc $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != daw.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(aym.a().a($$2.size())).a();
            Supplier<gov> $$6 = $$0.am().a($$5);
            return Optional.of(new frj.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(frd $$0) {
         $$0.a(new fri(this.c));
      }

      @Override
      public wx aO_() {
         return this.a.c();
      }

      @Override
      public void a(ffn $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayf.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fgz.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
