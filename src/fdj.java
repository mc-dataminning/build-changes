import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fdj implements fde, fdf {
   private static final aer a = new aer("spectator/teleport_to_team");
   private static final tf b = tf.c("spectatorMenu.team_teleport");
   private static final tf c = tf.c("spectatorMenu.team_teleport.prompt");
   private final List<fdf> d;

   public fdj() {
      eql $$0 = eql.O();
      this.d = a($$0, $$0.r.I());
   }

   private static List<fdf> a(eql $$0, eic $$1) {
      return $$1.g().stream().flatMap($$1x -> fdj.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fdf> a() {
      return this.d;
   }

   @Override
   public tf b() {
      return c;
   }

   @Override
   public void a(fdd $$0) {
      $$0.a(this);
   }

   @Override
   public tf aD_() {
      return b;
   }

   @Override
   public void a(erv $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aE_() {
      return !this.d.isEmpty();
   }

   static class a implements fdf {
      private final eia a;
      private final Supplier<fzu> b;
      private final List<fiv> c;

      private a(eia $$0, List<fiv> $$1, Supplier<fzu> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fdf> a(eql $$0, eia $$1) {
         List<fiv> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fiv $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != cpi.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(aru.a().a($$2.size())).a();
            Supplier<fzu> $$6 = $$0.al().a($$5);
            return Optional.of(new fdj.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fdd $$0) {
         $$0.a(new fdi(this.c));
      }

      @Override
      public tf aD_() {
         return this.a.c();
      }

      @Override
      public void a(erv $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, arp.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         etf.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aE_() {
         return true;
      }
   }
}
