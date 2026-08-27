import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class far extends gsq {
   private static final ws b = ws.c("mco.reset.world.seed");
   public static final ws a = ws.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fih C = new fih(this);
   private final Consumer<fbn> D;
   private ffd E;
   private fbh F = fbh.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final ws I;

   public far(Consumer<fbn> $$0, ws $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aM_() {
      this.E = new ffd(this.p, 210, 20, ws.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fil $$0 = this.C.c(fil.d()).a(10);
      $$0.a(fid.a(this.p, this.E, b));
      $$0.a(ffb.a(fbh::a).a(fbh.values()).a(this.F).a(0, 0, 210, 20, ws.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(ffb.b(this.G).a(0, 0, 210, 20, ws.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fil $$1 = this.C.b(fil.e().a(10));
      $$1.a(feu.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(feu.a(wr.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   private void a(fil $$0) {
      asz $$1 = atc.c();
      $$1.a();
      $$0.a(feu.a(ws.c("selectWorld.experiments"), $$1x -> this.m.a(new fpm(this, $$1, $$0xx -> {
            this.H.clear();

            for (asw $$1xx : $$0xx.f()) {
               if ($$1xx.l() == ata.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fbn C() {
      return new fbn(this.E.a(), this.F, this.G, this.H);
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.D.accept(null);
   }
}
