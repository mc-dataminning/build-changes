import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fdt implements fdo, fdp {
   private static final aex a = new aex("spectator/teleport_to_team");
   private static final tl b = tl.c("spectatorMenu.team_teleport");
   private static final tl c = tl.c("spectatorMenu.team_teleport.prompt");
   private final List<fdp> d;

   public fdt() {
      eqv $$0 = eqv.O();
      this.d = a($$0, $$0.r.I());
   }

   private static List<fdp> a(eqv $$0, eim $$1) {
      return $$1.g().stream().flatMap($$1x -> fdt.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fdp> a() {
      return this.d;
   }

   @Override
   public tl b() {
      return c;
   }

   @Override
   public void a(fdn $$0) {
      $$0.a(this);
   }

   @Override
   public tl aJ_() {
      return b;
   }

   @Override
   public void a(esf $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aK_() {
      return !this.d.isEmpty();
   }

   static class a implements fdp {
      private final eik a;
      private final Supplier<gae> b;
      private final List<fjf> c;

      private a(eik $$0, List<fjf> $$1, Supplier<gae> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fdp> a(eqv $$0, eik $$1) {
         List<fjf> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fjf $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != cps.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(asc.a().a($$2.size())).a();
            Supplier<gae> $$6 = $$0.al().a($$5);
            return Optional.of(new fdt.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fdn $$0) {
         $$0.a(new fds(this.c));
      }

      @Override
      public tl aJ_() {
         return this.a.c();
      }

      @Override
      public void a(esf $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, arx.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         etp.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aK_() {
         return true;
      }
   }
}
