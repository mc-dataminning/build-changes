import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fkp implements fkk, fkl {
   private static final aiy a = new aiy("spectator/teleport_to_team");
   private static final vq b = vq.c("spectatorMenu.team_teleport");
   private static final vq c = vq.c("spectatorMenu.team_teleport.prompt");
   private final List<fkl> d;

   public fkp() {
      exh $$0 = exh.O();
      this.d = a($$0, $$0.r.K());
   }

   private static List<fkl> a(exh $$0, eow $$1) {
      return $$1.g().stream().flatMap($$1x -> fkp.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fkl> a() {
      return this.d;
   }

   @Override
   public vq b() {
      return c;
   }

   @Override
   public void a(fkj $$0) {
      $$0.a(this);
   }

   @Override
   public vq aR_() {
      return b;
   }

   @Override
   public void a(eyu $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.d.isEmpty();
   }

   static class a implements fkl {
      private final eor a;
      private final Supplier<ght> b;
      private final List<fqg> c;

      private a(eor $$0, List<fqg> $$1, Supplier<ght> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fkl> a(exh $$0, eor $$1) {
         List<fqg> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fqg $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != cvk.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(awo.a().a($$2.size())).a();
            Supplier<ght> $$6 = $$0.al().a($$5);
            return Optional.of(new fkp.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fkj $$0) {
         $$0.a(new fko(this.c));
      }

      @Override
      public vq aR_() {
         return this.a.c();
      }

      @Override
      public void a(eyu $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, awh.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fag.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aS_() {
         return true;
      }
   }
}
