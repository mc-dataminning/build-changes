import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fdv implements fdq, fdr {
   private static final aey a = new aey("spectator/teleport_to_team");
   private static final tn b = tn.c("spectatorMenu.team_teleport");
   private static final tn c = tn.c("spectatorMenu.team_teleport.prompt");
   private final List<fdr> d;

   public fdv() {
      eqx $$0 = eqx.O();
      this.d = a($$0, $$0.r.I());
   }

   private static List<fdr> a(eqx $$0, eio $$1) {
      return $$1.g().stream().flatMap($$1x -> fdv.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fdr> a() {
      return this.d;
   }

   @Override
   public tn b() {
      return c;
   }

   @Override
   public void a(fdp $$0) {
      $$0.a(this);
   }

   @Override
   public tn aI_() {
      return b;
   }

   @Override
   public void a(esh $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aJ_() {
      return !this.d.isEmpty();
   }

   static class a implements fdr {
      private final eim a;
      private final Supplier<gag> b;
      private final List<fjh> c;

      private a(eim $$0, List<fjh> $$1, Supplier<gag> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fdr> a(eqx $$0, eim $$1) {
         List<fjh> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fjh $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != cpu.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ase.a().a($$2.size())).a();
            Supplier<gag> $$6 = $$0.al().a($$5);
            return Optional.of(new fdv.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fdp $$0) {
         $$0.a(new fdu(this.c));
      }

      @Override
      public tn aI_() {
         return this.a.c();
      }

      @Override
      public void a(esh $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ary.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         etr.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aJ_() {
         return true;
      }
   }
}
